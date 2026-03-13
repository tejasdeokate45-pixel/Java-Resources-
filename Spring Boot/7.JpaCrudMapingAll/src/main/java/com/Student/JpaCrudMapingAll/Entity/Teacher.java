package com.Student.JpaCrudMapingAll.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String teacherName;

    @OneToMany(mappedBy = "teacher")
    private List<Student> studentList = new ArrayList<>();

    public Teacher(Long id, String teacherName, List<Student> studentList) {
        this.id = id;
        this.teacherName = teacherName;
        this.studentList = studentList;
    }

    public Teacher(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
