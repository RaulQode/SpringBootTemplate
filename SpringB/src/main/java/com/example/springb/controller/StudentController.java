package com.example.springb.controller;


import com.example.springb.entities.Student;
import com.example.springb.service.StudentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
public class StudentController {
    private StudentService studentService;

    public StudentController(@Qualifier ("studentServiceImpl") StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/all")
    @ResponseBody
    public String student() {
        return "student";
    }

    @PostMapping("/create")
    @ResponseBody
    public String create(@RequestBody Student student) {
        return "create" + student.getName();
    }
}
