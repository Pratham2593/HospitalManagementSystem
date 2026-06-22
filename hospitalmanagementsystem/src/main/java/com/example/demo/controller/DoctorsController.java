package com.example.demo.controller;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorServices;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/doctors")
public class DoctorsController {
    DoctorServices doctorServices=new DoctorServices();
    @GetMapping("/{id}")
    public Doctor getDoctor(@PathVariable String id){
        return doctorServices.getDoctor(id);
    }

    @PostMapping("/add")
    public String  saveDoctor(@RequestBody Doctor  doctor){
        return doctorServices.addDoctor(doctor);
    }

    @GetMapping("/specialty/{specialty}")
    public ArrayList<String>getDoctorByspecialty(@PathVariable String specialty){
        return doctorServices.getDoctorByspecialty(specialty);
    }

    @DeleteMapping("/{id}")
    public String deleteDoctor(@PathVariable String id){
        return doctorServices.deleteDoctor(id);
    }

    @GetMapping("/getAllDoctors")
    public ArrayList<Doctor>getAllDoctors(){
        return doctorServices.getAllDoctors();
    }
}


