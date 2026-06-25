package com.example.demo.repository;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorServices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,String> {

    List<Doctor> findBySpecialty(String specialty);
}
