package com.example.demo.service;

import com.example.demo.entity.Nurse;
import com.example.demo.entity.Patient;
import com.example.demo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;
    public String addPatient(Patient patient){
        if(!patientRepository.existsById(patient.getPatientId())){
            patientRepository.save(patient);
            return "Patient with "+patient.getPatientId()+" id Added Suceesfully..!";
        }
        return "Patient with "+patient.getPatientId()+" id Allredy Present..!";
    }

    public Patient getPatient(String patientId) {
        Optional<Patient>patient=patientRepository.findById(patientId);
        if(patient.isPresent()){
            return patient.get();
        }
        return null;
    }

    public List<Patient> getAllPatient() {
        return patientRepository.findAll();
    }
}
