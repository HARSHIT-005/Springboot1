package com.example.Day1;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Hello{
    @GetMapping("/")
    public String hello(){
        return "this is the first line";
    }

    @GetMapping("/home")
    public String home(){
        return "welcome to the home page";
    }

    @GetMapping("/contact")
    public String contact(){
        return "this is contact page";
    }
}