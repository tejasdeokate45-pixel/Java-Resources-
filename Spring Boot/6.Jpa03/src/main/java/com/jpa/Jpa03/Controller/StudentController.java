package com.jpa.Jpa03.Controller;

import com.jpa.Jpa03.Entity.Student;
import com.jpa.Jpa03.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Student")
public class StudentController {

    @Autowired
    private StudentRepo srepo;

    @GetMapping
    public List<Student> getAll(){
        return srepo.findAll();
    }
    @PostMapping
    public Student save(@RequestBody Student student){
        return srepo.save(student);
    }

    @DeleteMapping("/{id}")
    public String deleteId(@PathVariable Long id){
        srepo.deleteById(id);
        return "Deleted Successfully";
    }
}

