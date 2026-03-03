package com.student.JpaP01.controller;

import com.student.JpaP01.Entity.Student;
import com.student.JpaP01.Repo.StudentRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Student")
public class StudentController {
    private StudentRepo studentRepo;

    public StudentController(StudentRepo repo){
        this.studentRepo=repo;
    }

    @GetMapping
    public List<Student> getAllStudent(){
        return studentRepo.findAll();
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentRepo.save(student);
    }
}
