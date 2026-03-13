package com.Student.JpaCrudMapingAll.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.apache.juli.logging.Log;

@Entity
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String compName;

    @JsonIgnore
    @OneToOne(mappedBy = "laptop")
    private Student student;

    public Laptop() {
    }

    public Laptop(Student student, String compName) {
        this.student = student;
        this.compName = compName;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
