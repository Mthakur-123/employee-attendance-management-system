package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Attendance;
import com.example.demo.Model.Employee;
import com.example.demo.Repository.AttendanceRepo;
import com.example.demo.Repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
  private EmployeeRepo repo;
	
	@Autowired
	private AttendanceRepo attendanceRepo;

	 public Employee save(Employee employee) {
       
	        System.out.println(employee);
	        return  repo.save(employee);
	    }

	    public  Employee findById(Long id) {
	      
				return repo.findById(id).orElse(null);
	    }

	    public List<Attendance> getAllAttendance() {
	        return attendanceRepo.findAll();
	    }
	
	    
  
}
