package com.example.mgnt_sys.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name, region ;
    private int age, exprnce;

    public String setName() {
        return name;
    }

    public String setRegion() {
        return region;
    }

    public int setage() {
        return age;
    }

    public int setExperience() {
        return exprnce;
    }

     public void getExpereice(int exprnce) {
        this.exprnce = exprnce;
    }

    public void getName(String name) {
        this.name = name;
    }

    public void getRegion(String region) {
        this.region = region;
    }

    public void getage(String age) {
        this.name = age;
    }
}
