package com.springboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeProgram {
    
    @GetMapping("test")
    public String Welcome(){
       return "Hello tejas   ";
    }
}
