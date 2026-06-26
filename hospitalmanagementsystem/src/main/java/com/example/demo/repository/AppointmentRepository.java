package com.example.demo.repository;

import com.example.demo.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalTime;

public interface AppointmentRepository extends JpaRepository<Appointment,String> {

    boolean existsByAppointmentDate(LocalDate appointmentDate);

    boolean existsByAppointmentTime(LocalTime appointmentTime);
}
