package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Doctor {
    @Id
    private String doctorId;
    private String name;
    private int age;
    private String city;
    private String specialty;

    public Doctor() {
    }
    public Doctor(String id, String name, int age, String city, String specialty) {
        this.doctorId = id;
        this.name = name;
        this.age = age;
        this.city = city;
        this.specialty = specialty;
    }

    public String getdoctorId() {
        return doctorId;
    }

    public void setdoctorId(String id) {
        this.doctorId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
