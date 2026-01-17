package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.OfficeLocation;
import com.example.demo.Repository.officelocationrepo;

import java.util.List;

@Service
public class LocationService {

    @Autowired
    private officelocationrepo officeLocationRepo;

    // Allowed distance in meters (15 meters)
    private static final double ALLOWED_DISTANCE = 15.0;

    // Save office location
    public OfficeLocation saveOfficeLocation(OfficeLocation location) {
        officeLocationRepo.deleteAll(); // ensure only one office location
        return officeLocationRepo.save(location);
    }

    // Get office location
    public OfficeLocation getOfficeLocation() {
        List<OfficeLocation> locations = officeLocationRepo.findAll();
        if (locations.isEmpty()) {
            throw new RuntimeException("Office location not set");
        }
        return locations.get(0);
    }

    // Check if employee is within office range
    public boolean isWithinOfficeRange(double empLatitude, double empLongitude) {
        OfficeLocation office = getOfficeLocation();

        double distance = calculateDistance(
                empLatitude,
                empLongitude,
                office.getLatitude(),
                office.getLongitude()
        );

        return distance <= ALLOWED_DISTANCE;
    }

    // Haversine formula (distance in meters)
    private double calculateDistance(
            double lat1, double lon1,
            double lat2, double lon2) {

        final int R = 6371000; // Earth radius in meters

        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
                + Math.cos(Math.toRadians(lat1))
                * Math.cos(Math.toRadians(lat2))
                * Math.sin(dLon / 2) * Math.sin(dLon / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return R * c;
    }
}
