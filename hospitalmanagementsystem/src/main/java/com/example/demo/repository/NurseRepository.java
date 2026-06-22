package com.example.demo.repository;

import com.example.demo.entity.Nurse;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class NurseRepository {
    HashMap<String , Nurse>nursedb=new HashMap<>();

    public String addNurse(Nurse nurse){
        if(!nursedb.containsKey(nurse.getId())){
            nursedb.put(nurse.getId(),nurse);
            return "Nurse Added Sucessfully..!";
        }
        return "This Nurse With id "+nurse.getId()+" is allready Present";
    }

    public Nurse getNurseByID(String id){
        return nursedb.get(id);
    }

    public String deleteNurse(String id){
        if(nursedb.containsKey(id)){
            nursedb.remove(id);
            return "Nurse Delete Successfully..!";
        }
        return "Nurse With this "+id+" id Not Present..!";
    }

    public ArrayList<Nurse>getAllNurse(){
        return new ArrayList<>(nursedb.values());
    }
}
