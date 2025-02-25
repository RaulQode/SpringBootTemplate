package com.example.springb.service.impl;

import com.example.springb.entities.Student;
import com.example.springb.repository.StudentRepository;
import com.example.springb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void createStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        System.out.println("getAllStudents");
        return List.of();
    }
}
