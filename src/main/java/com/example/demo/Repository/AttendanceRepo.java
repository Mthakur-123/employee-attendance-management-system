package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Attendance;

@Repository
public interface AttendanceRepo extends JpaRepository<Attendance, Long> {

}
