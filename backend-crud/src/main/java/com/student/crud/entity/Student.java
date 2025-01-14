package com.student.crud.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "s_id")
    private int id;

    @Column(name = "s_name")
    private String name;

    @Column(name = "s_email")
    private String email;

    @Column(name = "s_course")
    private String course;

    @Column(name = "age")
    private int age;

    @Column(name = "Enrollment_Date")
    private String enrollment_date;

    // define constructors
    public Student() {

    }

    public Student(String enrollment_date, int age, String course, String email, String name) {
        this.enrollment_date = enrollment_date;
        this.age = age;
        this.course = course;
        this.email = email;
        this.name = name;
    }

     // define getters/setters

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEnrollment_date() {
        return enrollment_date;
    }

    public void setEnrollment_date(String enrollment_date) {
        this.enrollment_date = enrollment_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // define toString method

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", course='" + course + '\'' +
                ", enrollment_date='" + enrollment_date + '\'' +
                '}';
    }

}
