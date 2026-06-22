package com.example.demo.controller;

import com.example.demo.entity.Nurse;
import com.example.demo.service.NurseServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/nurse")
public class NurseController {

    NurseServices nurseServices=new NurseServices();

    @PostMapping("/addNurse")
    public String addNurse(@RequestBody Nurse nurse){
        return nurseServices.addNurse(nurse);
    }

    @GetMapping("/{id}")
    public Nurse getNurseByID(@PathVariable String id){
        return nurseServices.getNurseByID(id);
    }

    @DeleteMapping("/{id}")
    public String deleteNurse(@PathVariable String id){
        return nurseServices.deleteNurse(id);
    }

    @GetMapping("/getAllNurse")
    public ArrayList<Nurse>getAllNurse(){
        return nurseServices.getAllNurse();
    }
}
