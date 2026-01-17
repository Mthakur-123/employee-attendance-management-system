package com.example.demo.Service;

import java.time.LocalDate;
import com.example.demo.Repository.EmployeeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Attendance;
import com.example.demo.Model.Employee;
import com.example.demo.Repository.AttendanceRepo;

@Service
public class AttendanceService {
    
     @Autowired
	private AttendanceRepo attendanceRepo;

	public void markAttendance(Employee employee) {
        Attendance attendance = new Attendance();
        attendance.setEmployee(employee);
        attendance.setDate(LocalDate.now());

        attendanceRepo.save(attendance);
    }
}
