package com.example.demo.repository;

import com.example.demo.entity.Doctor;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorRepository {
    HashMap<String, Doctor>doctordb=new HashMap<>();
    public String addDoctor(Doctor doctor){
        String id=doctor.getId();
        if(doctordb.containsKey(id))return "Doctor with id"+id+ "alredy exists";
        else{
            doctordb.put(id,doctor);
            return "Doctor added successfully";
        }
    }
    public Doctor getDoctor(String id){
            return doctordb.get(id);
    }
    public ArrayList<String> getDoctorByspecialty(String specialty){
        ArrayList<String>doctors=new ArrayList<>();
        for(String id:doctordb.keySet()){
            if(doctordb.get(id).getSpecialty().equals(specialty)){
                doctors.add(doctordb.get(id).getName());
            }
        }
        return doctors;
    }
    public String deleteDoctor(String id){
        if(doctordb.containsKey(id)){
            doctordb.remove(id);
            return "Doctors Delete Successfull";
        }else{
            return "Doctors is not Present";
        }
    }
    public ArrayList<Doctor>getAllDoctors(){
        return new ArrayList<>(doctordb.values());
    }

}
