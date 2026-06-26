package com.example.demo.service;

import com.example.demo.entity.Appointment;
import com.example.demo.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public String bookAppointment(Appointment appointment) {
        if(!appointmentRepository.existsById(appointment.getAppointmentId())){
            if(appointmentRepository.existsByAppointmentDate(appointment.getAppointmentDate())){
                if(appointmentRepository.existsByAppointmentTime(appointment.getAppointmentTime())){
                    return "On this "+appointment.getAppointmentDate()+" Day this "+appointment.getAppointmentTime()+" time is not availabel..!";
                }
            }
            appointmentRepository.save(appointment);
            return "Appointment Book Succesfull..!";

        }
        return "With this "+appointment.getAppointmentId()+" id Appointment allready Book..!";
    }

    public Appointment getAppointmentById(String appointmentId) {
        Optional<Appointment>appointment=appointmentRepository.findById(appointmentId);
        if(appointment.isPresent())return appointment.get();
        return null;
    }

    public List<Appointment> getAllAppointment() {
        return appointmentRepository.findAll();
    }

    public String deleteAppointment(String appointmentId) {
        Optional<Appointment>appointment=appointmentRepository.findById(appointmentId);
        if(appointment.isPresent()){
            appointmentRepository.deleteById(appointmentId);
            return "Appointment Deleted Succesfully..!";
        }
        return "Appointment with "+appointmentId+" id not Book..!";
    }
}
