package com.example.mgnt_sys.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "electronics")
public class Electronics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name, category, usage;
    private boolean stock;

    public String setName() {
        return name;
    }

    public String setCategory() {
        return category;
    }

    public String setUsage() {
        return usage;
    }

    public boolean setstocked() {
        return stock;
    }

    public void getName(String name) {
        this.name = name;
    }

    public void getCategory(String category) {
        this.category = category;
    }

    public void getUsage(String usage) {
        this.name = usage;
    }
}
