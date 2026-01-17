package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.OfficeLocation;

@Repository
public interface officelocationrepo extends JpaRepository<OfficeLocation, Long> {

}
