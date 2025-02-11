package com.crud.cruddemo.dao;

import java.util.List;

import com.crud.cruddemo.entity.Student;

public interface StudentDAO {
    // Abstract method for saving a student to the MySQL database
    void save(Student theStudent);

    // Abstract method for retrieving a student by its ID
    Student findById(Integer id);

    // Abstract method for retrieving all students from the database
    List<Student> findAll();

    // Abstract method for retrieving all students from the database WHERE lastName matches
    List<Student> findByLastName(String lastName);

    // Abstract method for updating MySQL Database
    void update(Student theStudent);
}
