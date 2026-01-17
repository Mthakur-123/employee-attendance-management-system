package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.locationRequest;
import com.example.demo.Service.LocationService;

@RestController
@RequestMapping("/location")
public class locationController {
	
    @Autowired
	private LocationService locationService;
	
    @PostMapping("/validate")
    public boolean validateLocation(
            @RequestBody locationRequest request) {
        return locationService.isWithinOfficeRange(
                request.getLatitude(),
                request.getLongitude());
    }
    
}
