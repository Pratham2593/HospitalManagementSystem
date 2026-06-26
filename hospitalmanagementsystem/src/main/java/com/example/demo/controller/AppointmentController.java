package com.example.demo.controller;

import com.example.demo.entity.Appointment;
import com.example.demo.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;

    @PostMapping("/book")
    public String bookAppointment(@RequestBody Appointment appointment){
        return appointmentService.bookAppointment(appointment);
    }

    @GetMapping("/{appointmentId}")
    public Appointment getAppointmentById(@PathVariable String appointmentId){
        return appointmentService.getAppointmentById(appointmentId);
    }

    @GetMapping("/allAppointment")
    public List<Appointment> getAllAppointment(){
        return appointmentService.getAllAppointment();
    }

    @DeleteMapping("/{appointmentId}")
    public String deleteAppointment(@PathVariable String appointmentId){
        return appointmentService.deleteAppointment(appointmentId);
    }
}
