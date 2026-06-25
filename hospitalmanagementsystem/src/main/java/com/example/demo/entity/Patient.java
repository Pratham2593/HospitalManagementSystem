package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Patient {
    @Id
    private String patientId;
    private String patientName;
    private int patientAge;
    private String Adrres;

    Patient(){}

    public Patient(String patientId, String patientName, int patientAge, String adrres) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientAge = patientAge;
        Adrres = adrres;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public String getAdrres() {
        return Adrres;
    }

    public void setAdrres(String adrres) {
        Adrres = adrres;
    }
}
