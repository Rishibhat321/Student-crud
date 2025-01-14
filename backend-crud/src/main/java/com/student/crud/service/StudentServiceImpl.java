package com.student.crud.service;

import com.student.crud.dao.StudentDAO;
import com.student.crud.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentDAO studentDAO;

    // set up constructor injection
    @Autowired
    public StudentServiceImpl(StudentDAO theStudentDAO) {
        this.studentDAO = theStudentDAO;
    }


    @Override
    public List<Student> findAll() {
        return studentDAO.findAll();
    }

    @Override
    public Student findById(int theId) {
        return studentDAO.findById(theId);
    }

}
