package com.example.demo.service;

import com.example.demo.entity.Nurse;
import com.example.demo.repository.NurseRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class NurseServices {

    NurseRepository nurseRepository=new NurseRepository();

    public String addNurse(Nurse nurse){
        return nurseRepository.addNurse(nurse);
    }
    public Nurse getNurseByID(String id){
        return nurseRepository.getNurseByID(id);
    }

    public String deleteNurse(String id){
        return nurseRepository.deleteNurse(id);
    }

    public ArrayList<Nurse>getAllNurse(){
        return nurseRepository.getAllNurse();
    }
}
