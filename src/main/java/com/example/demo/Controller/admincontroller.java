package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Attendance;
import com.example.demo.Model.Employee;
import com.example.demo.Model.OfficeLocation;
import com.example.demo.Repository.EmployeeRepo;
import com.example.demo.Service.EmployeeService;
import com.example.demo.Service.LocationService;

@RestController
@RequestMapping("/admin")
public class admincontroller {

	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private LocationService locationService;
	
	@PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee) {
	

       return employeeService.save(employee);
       
    }

	 @PostMapping("/setOfficeLocation")
	    public OfficeLocation setOfficeLocation(
	            @RequestBody OfficeLocation location) {
	       return locationService.saveOfficeLocation(location);
	       
	    }
	 
	 @GetMapping("/attendanceReport")
	    public List<Attendance> attendanceReport() {
	        return employeeService.getAllAttendance();
	    }
	
}
