package com.jpa.Jpa03.Controller;

import com.jpa.Jpa03.Entity.Teacher;
import com.jpa.Jpa03.Repo.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Teacher")
public class TeacherController {

    @Autowired
    private TeacherRepo teacherRepo;

    @GetMapping
    public List<Teacher> getAllTeacher(){
        return teacherRepo.findAll();
    }

    @PostMapping
    public Teacher setTeacher(@RequestBody Teacher teacher){
        return teacherRepo.save(teacher);
    }
}
