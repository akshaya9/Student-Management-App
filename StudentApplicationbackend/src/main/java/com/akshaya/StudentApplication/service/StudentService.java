package com.akshaya.StudentApplication.service;

import com.akshaya.StudentApplication.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}


