package com.example.demo.repository;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Nurse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public interface NurseRepository extends JpaRepository<Nurse,String> {


}
