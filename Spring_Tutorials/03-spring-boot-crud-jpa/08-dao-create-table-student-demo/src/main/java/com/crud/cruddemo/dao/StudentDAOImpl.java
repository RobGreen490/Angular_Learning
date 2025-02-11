package com.crud.cruddemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crud.cruddemo.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class StudentDAOImpl implements StudentDAO{

    // define field for entity manager
    private EntityManager entityManager;

    // inject entity manager using constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // implement save method
    @Override
    @Transactional
    public void save(Student theStudent) {
        // this will save the Student to the database
        entityManager.persist(theStudent);
    }

    // implemented to find a student using their id
    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    // implemented to find all students in a database
    @Override
    public List<Student> findAll() {
        // create query
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student", Student.class);

        // return query results
        return theQuery.getResultList();
    }

    // implemented to find a student using their last name
    @Override
    public List<Student> findByLastName(String theLastName) {
        // create query (the :theData is a JPQL parameter, it pulls data from the setParameter in line 56)
        TypedQuery<Student> theQuery = entityManager.createQuery(
            "From Student WHERE lastName=:theData", Student.class);

        // set query parameters to be used on line 52
        theQuery.setParameter("theData", theLastName);

        // return query results
        return theQuery.getResultList();
    }

    // implemented to update MySQL database row
    @Override
    @Transactional
    public void update(Student theStudent) {
        // .merge checks if an entity exists in the database, and updates it if it does
        entityManager.merge(theStudent);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        // retrieve the student
        Student theStudent = entityManager.find(Student.class, id);

        // delete the student
        entityManager.remove(theStudent);
    }
}
