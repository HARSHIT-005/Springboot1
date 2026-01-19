package com.example.Day1.controller;

import java.util.ArrayList;
import java.util.List;
import com.example.Day1.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {
    @GetMapping("/")
    public List<StudentModel> getStudent(){
        List<StudentModel> students=new ArrayList<>();
        students.add(new StudentModel(1,"hc","hc1@gmail.com"));
        students.add(new StudentModel(2,"hc2","hc2@gmail.com"));
        students.add(new StudentModel(3,"hc3","hc3@gmail.com"));
        students.add(new StudentModel(4,"hc4","hc4@gmail.com"));
        students.add(new StudentModel(5,"hc5","hc5@gmail.com"));
        return students;
    }

}
