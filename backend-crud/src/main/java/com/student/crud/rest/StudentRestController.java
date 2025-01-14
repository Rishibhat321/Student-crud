package com.student.crud.rest;

import com.student.crud.entity.Student;
import com.student.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Student findById(@PathVariable int studentId) {

        Student theStudent = studentService.findById(studentId);

        if(theStudent==null) {
            throw new RuntimeException("Student id - " + studentId + " not found");
        }

        return theStudent;
    }


    @PostMapping("/students")
    public Student addNewStudent(@RequestBody Student theStudent) {

        theStudent.setId(0);

        Student dbStudent = studentService.save(theStudent);

        return dbStudent;
    }


    @PutMapping("/students")
    public Student UpdateStudent(@RequestBody Student theStudent) {
        Student dbStudent = studentService.save(theStudent);

        return dbStudent;
    }

    @DeleteMapping("/students/{studentId}")
    public String deleteById(@PathVariable int studentId) {

        Student theStudent = studentService.findById(studentId);

        if(theStudent==null) {
            throw new RuntimeException("Student id - " + studentId + "does not exist");
        }

        studentService.deleteById(studentId);

        return "Deleted Student id - " + studentId;
    }


}
