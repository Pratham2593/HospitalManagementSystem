package com.example.demo.service;

import com.example.demo.entity.Doctor;
import com.example.demo.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class DoctorServices {
    @Autowired
    private DoctorRepository doctorRepository;

    public String addDoctor(Doctor doctor){
        doctorRepository.save(doctor);
        return "Doctor Added Successfully..!";
    }

    public Doctor getDoctor(String doctorId){
        Optional<Doctor> doctor = doctorRepository.findById(doctorId);
        if(doctor.isPresent()) return doctor.get();
        return null;
    }

    public List<Doctor>getAllDoctors(){
        return doctorRepository.findAll();
    }

    public String deleteDoctor(String doctorId){
        Optional<Doctor>doctor=doctorRepository.findById(doctorId);
        if(doctor.isPresent()){
            doctorRepository.deleteById(doctorId);
            return "Doctor Deleted SuccessFully..!";
        }
        return "Doctor is not Present";
    }

    public List<Doctor>getDoctorByspecialty(String specialty){
        return doctorRepository.findBySpecialty(specialty);
    }



}
