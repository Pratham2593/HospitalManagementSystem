package com.example.demo.controller;

import com.example.demo.entity.Nurse;
import com.example.demo.service.NurseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/nurse")
public class NurseController {

    @Autowired
    private NurseServices nurseServices;

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
    public List<Nurse> getAllNurse(){
        return nurseServices.getAllNurse();
    }
}
