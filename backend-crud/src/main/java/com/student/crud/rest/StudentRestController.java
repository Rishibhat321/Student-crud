package com.student.crud.rest;

import com.student.crud.entity.Student;
import com.student.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private StudentService studentService;

    // set up constructor injection
    @Autowired
    public StudentRestController(StudentService theStudentService) {
        this.studentService = theStudentService;
    }

    @GetMapping("/students")
    public List<Student> findAll() {

        List<Student> theStudent = studentService.findAll();

        return theStudent;
    }

    @GetMapping("/students/{studentId}")
    public Student findById(@PathVariable("studentId") int studentId) {

        Student theStudent = studentService.findById(studentId);

        return theStudent;
    }




}
