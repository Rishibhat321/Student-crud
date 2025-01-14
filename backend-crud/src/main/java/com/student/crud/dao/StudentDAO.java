package com.student.crud.dao;

import com.student.crud.entity.Student;

import java.util.List;

public interface StudentDAO {

    List<Student> findAll();
}
