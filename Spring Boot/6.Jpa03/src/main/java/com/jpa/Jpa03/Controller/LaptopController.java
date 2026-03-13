package com.jpa.Jpa03.Controller;

import com.jpa.Jpa03.Entity.Laptop;
import com.jpa.Jpa03.Repo.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Laptop")
public class LaptopController {
    @Autowired
    private LaptopRepo lrepo;

    @GetMapping
    public List<Laptop> getAllLaptop(){
        return lrepo.findAll();
    }

    @PostMapping
    public Laptop addLaptop(@RequestBody Laptop laptop){
        return lrepo.save(laptop);
    }

}
