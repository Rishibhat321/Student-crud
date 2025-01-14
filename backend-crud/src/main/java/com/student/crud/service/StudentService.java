package com.student.crud.service;

import com.student.crud.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();

    Student findById(int theId);

}
