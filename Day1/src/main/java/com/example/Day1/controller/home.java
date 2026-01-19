package com.example.Day1.controller;


import com.example.Day1.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {
    @GetMapping("/")
    public StudentModel getStudent(){
        StudentModel student=new StudentModel(1,"hc","hc@gmail.com");
        return student;
    }

}
