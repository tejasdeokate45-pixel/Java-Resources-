package com.Student.JpaCrudMapingAll.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String courseName;

    @JsonIgnore
    @ManyToMany(mappedBy = "coursesList")
    private List<Student> listStudent = new ArrayList<>();

    public Courses(List<Student> listStudent, String courseName) {
        this.listStudent = listStudent;
        this.courseName = courseName;
    }
    public Courses(){

    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(List<Student> listStudent) {
        this.listStudent = listStudent;
    }
}
