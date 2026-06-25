package com.example.demo.controller;

import com.example.demo.entity.Nurse;
import com.example.demo.entity.Patient;
import com.example.demo.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @PostMapping("/addPatient")
    public String addPatient(@RequestBody Patient patient){
        return patientService.addPatient(patient);
    }

    @GetMapping("/{patientId}")
    public Patient getPatient(@PathVariable String patientId){
        return patientService.getPatient(patientId);
    }

    @GetMapping("/allPatient")
    public List<Patient>getAllPatient(){
        return patientService.getAllPatient();
    }

}
