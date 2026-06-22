package com.example.demo.service;

import com.example.demo.entity.Doctor;
import com.example.demo.repository.DoctorRepository;

import java.util.ArrayList;

public class DoctorServices {
    DoctorRepository doctorRepository=new DoctorRepository();
    public String addDoctor(Doctor doctor){
        return doctorRepository.addDoctor(doctor);
    }

    public Doctor getDoctor(String id){
        return doctorRepository.getDoctor(id);
    }
    public ArrayList<String>getDoctorByspecialty(String specialty){
        return doctorRepository.getDoctorByspecialty(specialty);
    }
    public String deleteDoctor(String id){
        return doctorRepository.deleteDoctor(id);
    }
    public ArrayList<Doctor>getAllDoctors(){
        return  doctorRepository.getAllDoctors();
    }
}
