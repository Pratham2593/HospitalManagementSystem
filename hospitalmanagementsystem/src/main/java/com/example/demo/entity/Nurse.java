package com.example.demo.entity;

public class Nurse {
    private String id;
    private String name;
    private int age;
    private String city;
    private String department;

    public Nurse(String id, String name, int age, String city, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
