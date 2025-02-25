package com.example.springb.service;

import com.example.springb.entities.Student;

import java.util.List;

public interface StudentService {

    void createStudent(Student student);
    List<Student> getAllStudents();
}
