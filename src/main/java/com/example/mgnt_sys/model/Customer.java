package com.example.mgnt_sys.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name, style;
    private int age;

    public String setName() {
        return name;
    }

    public String setStyle() {
        return style;
    }

    public int setage() {
        return age;
    }


    public void getName(String name) {
        this.name = name;
    }

    public void getstyle(String style) {
        this.style = style;
    }

    public void getage(String age) {
        this.name = age;
    }
}
