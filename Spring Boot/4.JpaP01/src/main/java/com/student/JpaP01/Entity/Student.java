package com.student.JpaP01.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String clas;

    // 1. ADD THIS! MANDATORY for JPA/Hibernate
    public Student() {
    }

    // 2. You can keep your existing constructor if you want
    public Student(String name, String clas) {
        this.name = name;
        this.clas = clas;
    }

    // 3. Ensure your Getters and Setters are standard
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getClas() { return clas; }
    public void setClas(String clas) { this.clas = clas; }
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
}