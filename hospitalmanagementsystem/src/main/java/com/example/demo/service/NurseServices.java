package com.example.demo.service;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Nurse;
import com.example.demo.repository.NurseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class NurseServices {

    @Autowired
    private NurseRepository nurseRepository;
    public String addNurse(Nurse nurse){
        if(!nurseRepository.existsById(nurse.getId())){
            nurseRepository.save(nurse);
            return "Nurse Added Suceesfully..!";
        }
        return "Nurse Allready Present ";
    }
    public Nurse getNurseByID(String id){
        Optional<Nurse> nurse=nurseRepository.findById(id);
        if(nurse.isPresent()){
            return nurse.get();
        }
        return null;
    }
    public String deleteNurse(String id){
        Optional<Nurse> nurse=nurseRepository.findById(id);
        if(nurse.isPresent()){
            nurseRepository.deleteById(id);
            return "Nurse Deleted Suucesfully...!";
        }
        return "Nurse with "+id+" id Not Present";
    }
    public List<Nurse> getAllNurse(){
        return nurseRepository.findAll();
    }


}
