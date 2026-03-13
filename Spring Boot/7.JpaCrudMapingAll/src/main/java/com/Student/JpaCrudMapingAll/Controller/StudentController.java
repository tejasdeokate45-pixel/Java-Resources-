package com.Student.JpaCrudMapingAll.Controller;

import com.Student.JpaCrudMapingAll.Entity.Student;
import com.Student.JpaCrudMapingAll.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Student")
public class StudentController {

    private StudentRepo studentRepo;

    @Autowired
    public StudentController(StudentRepo studentRepo){
        this.studentRepo = studentRepo;
    }

    @GetMapping
    public List<Student> getAllStudent(){
        return studentRepo.findAll();
    }

    @PostMapping
    public Student addStudent(@RequestParam Long id,@RequestBody Student student){
        return studentRepo.save(student);
    }


}
