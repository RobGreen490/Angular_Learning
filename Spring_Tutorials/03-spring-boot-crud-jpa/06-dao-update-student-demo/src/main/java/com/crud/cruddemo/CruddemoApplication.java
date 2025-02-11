package com.crud.cruddemo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.crud.cruddemo.dao.StudentDAO;
import com.crud.cruddemo.entity.Student;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	// declaring a new bean for command line runner: for creating a command line application.
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		// Implementing a lambda expression. Our code will happen here.
		return runner -> {
			// createStudent(studentDAO);
			// createMultipleStudents(studentDAO);
			// readStudent(studentDAO);
			// queryForStudents(studentDAO);
			// queryForStudentByLastName(studentDAO);
			updateStudent(studentDAO);
		};
	}

	// This method can be used to create multiple students and store those students into the database
	private void createMultipleStudents(StudentDAO studentDAO) {
		//create multiple students
		Student tempStudent1 = new Student("Paul", "Doe", "paul@luv2code.com");
		Student tempStudent2 = new Student("Mary", "Public", "mary@luv2code.com");
		Student tempStudent3 = new Student("Bonita", "Applebum", "bonita@luv2code.com");

		// save the student objects
		System.out.println("Saving the students ...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
	}

	// This method can be used to create a single student and store that student into the database
	private void createStudent(StudentDAO studentDAO) {
		// create the student object
		System.out.println("Creating new student object ...");
		Student tempStudent = new Student("John", "Doe", "john@luv2code.com");

		// save the student object
		System.out.println("Saving the student ...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		System.out.println("Saved student. Generated id: " + tempStudent.getId());
	}

	// This method can be used to get Students from MySQL
	private void readStudent(StudentDAO studentDAO) {
		// declare the id of the student we want to find in the database
		int theId = 1;

		// retrieve student based on the id: primary key
		System.out.println("Retrieving student with id: " + theId);
		Student myStudent = studentDAO.findById(theId);

		// display student
		System.out.println("Found the student: " + myStudent);
	}

	// This method can be used to get all students from MySQL
	private void queryForStudents(StudentDAO studentDAO) {
		// get a list of students
		List<Student> theStudents = studentDAO.findAll();

		// display list of students
		for(Student tempStudent : theStudents)
			System.out.println(tempStudent);
	}

	// This method can be used to get all students WHERE the lastName exist in the database
	private void queryForStudentByLastName(StudentDAO studentDAO) {
		// get a list of students
		List<Student> thStudents = studentDAO.findByLastName("Doe");

		// display list of students
		for(Student tempStudent : thStudents)
			System.out.println(tempStudent);
	}

	// This method can be used to update values within the database
	private void updateStudent(StudentDAO studentDAO) {
		// retrieve student based on the id: primary key
		int studentId = 1;
		System.out.println("Getting student with id: " + studentId + " ...");
		Student myStudent = studentDAO.findById(studentId);

		// change first name to "Bob"
		System.out.println("Updating student ...");
		myStudent.setFirstName("John");

		// update the student
		studentDAO.update(myStudent);

		// display the updated student
		System.out.println("Updated student: " + myStudent);
	}
}