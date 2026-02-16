package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.AttendanceRequest;
import com.example.demo.Model.Employee;
import com.example.demo.Service.AttendanceService;
import com.example.demo.Service.EmployeeService;
import com.example.demo.Service.LocationService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@Autowired
	private LocationService locationservice;
	
	@Autowired
	private AttendanceService attendanceService;
	
	  @GetMapping("/test")
	    public String test() {
	        return "Employee controller working";
	    }
	
	@PostMapping("/markAttendance")
	public String markAttendance(@RequestBody AttendanceRequest request) {

	    System.out.println("mark attendance API called");

	    Employee  employee = service.findById(
	                request.getEmployeeId());
	    if (employee == null) {
	      
	        return "Invalid employee";
	    
	    }
	    boolean withinRange = locationservice.isWithinOfficeRange(
	            request.getLatitude(),
	            request.getLongitude());

	    System.out.println("Within office range: " + withinRange);

	    if (!withinRange) {
	        return "You are not within office range";
	    }

	    attendanceService.markAttendance(employee);
	    System.out.println("attendance saved");

	    return "Attendance marked successfully";
	
	    }
	}


	
	

