package com.student.crud.dao;

import com.student.crud.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{

    private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager theEntityManager) {
        this.entityManager = theEntityManager;
    }


    @Override
    public List<Student> findAll() {

        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student", Student.class);

        List<Student> theStudents = theQuery.getResultList();

        return theStudents;
    }

    @Override
    public Student findById(int theId) {

        Student theStudent = entityManager.find(Student.class, theId);

        return theStudent;
    }

    @Override
    public Student save(Student theStudent) {

        return entityManager.merge(theStudent);
    }

    @Override
    public void deleteById(int theId) {

        Student theStudent = entityManager.find(Student.class, theId);

        entityManager.remove(theStudent);
    }


}
