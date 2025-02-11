Step-5{
    INFO{
        We implement a read function for reading from the MySQL database using WHERE clauses.
        Should be noted that our query uses the Classes instances(variables) instead of MySQL naming scheme
    }


    06:
    File CruddemoApplication.java{
        Line 28: Commented out queryForStudents(studentDAO) in preparing to create a new query get method
        Line 29: Initiating the method queryForStudentByLastName(studentDAO) to get all students with a WHERE clause for lastName
        Line 85: Declared queryForStudentByLastName()
        Line 87: Grabbing every instance of the class Student where the last name "Doe" is present
        Line 90-91: Displaying that list of students we've pulled from the database

    }


    05:
    File StudentDAOImpl.java{
        Line 52-53: Declared query to be utilized for finding all Students with a WHERE clause
        Line 56: Declaring query parameters to be used with the query
        Line 59: Returning query results from the database
    }


    04:
    File StudentDAO.java{
        Line 17: Created abstract method for retrieving all students WHERE a name exists
    }


    03:
    File CruddemoApplication.java{
        Line 27: Commented out readStudent(studentDAO) in preparation to create a new query get method
        Line 28: Initiating the method queryForStudents(studentDAO) to get all students from MySQL
        Line 76: Declared method for getting all students
        Line 78: grabbing the list of students using newly declared findAll()
        line 81-82: displaying that list of students we've pulled from the database
    }


    02:
    File StudentDAOImpl.java{
        Line 43: Declared query to find all(*) Students
        Line 46: Returning query results from the database
    }


    01:
    File StudentDAO.java{
        Line 15: Created abstract method for retrieving all students from the database
    }
}



Step-4{
    INFO{
        We implement a read function for reading from the MySQL database using a primary key Integer (id)
    }


    03:
    File CruddemoApplication.java{
        Line 24: Commented out createMultipleStudents(studentDAO) in preparation to create a new get method
        Line 25: Initiating the method readStudent(studentDAO) to get an row of data returned as a class Student.
        Line 61: Declaring the method to get a student
        Line 63: Declaring theId with a value to search for in the database
        Line 66-67: Storing the row of data where that id key was found in the MySQL database
        Line 70: Displaying that student information
    }


    02:
    File StudentDAOImpl.java{
        Line 32-35: Implemented findById(Integer) method to return the object(row) from a table where the id is found.
    }


    01:
    File StudentDAO.java{
        Line 12: Created abstract method for finding a student using their id
    }
}




Step-3{
    INFO{
        DAO: Data Access Object communicates with the database and helps perform CRUD operations (Create, Read, Update, Delete).
    }


    05:
    File CruddemoApplication.java{
        Line 23: Commented out createStudent(studentDAO) in preparation to create a method for storing multiple students.
        Line 24: Initiating the method createMultipleStudents(studentDAO) to create multiple students and push that data to the database(create the students and insert their data into the associated columns)
        Line 35-37: Created three student objects
        Line 40-43: Saving those three student objects to the database (Crud)
    }


    04:
    File CruddemoApplication.java{
        Line 20: Injecting our studentDAO into the commandLineRunner
        Line 23: Initiating the method createStudent(studentDAO) to create a single student and push that data to the database(create the student and insert their data into the associated columns)
        Line 47: Declaring the method to create a single student while passing in the student data access object
        Line 48-50: Creating a single Student object.
        Line 52-54: Saving that student object to the database.
        Line 57: console logging the generated student id MySQL generated.
    }


    03:
    File StudentDAOImpl.java{
        Line 10: annotated with repository to support component scanning and translate JDBC exceptions
        Line 18-21: Implemented constructor for injecting entityManager
        Line 24-29: Implemented save method for saving the student to the database
    }


    02:
    File StudentDAO.java{
        Line 9: Created abstract method for saving a Student object to a database
    }


    01:
    {
        Created package "dao"
        Created interface "StudentDAO"
        Created Class "StudentDAOImpl"
    }
}




Step-2{
    INFO{
        We've created our Student class and mapped it to the database table.
        we also mapped the fields to the appropriate database columns.
    }

    03:
    File Student.java{
        Line 7-9: Declared a Student class @entity to be mapped to the @table "student" in MySQL
        Line 16: Declaring the field "id" to be the primary key for the table
        Line 17: Specifying how the value is generated (.IDENTITY says to let MySQL handle the autoincrement process)
        Line 21- 28: Declaring fields for "firstName", "lastName", and "email" mapping them to the appropriate MySQL column names 
    }


    02:
    {
        Created Package "Entity"
        Created Class "Student"
    }


    01:
    File application.properties{
        Line 7: Disabled the spring banner in the console
        Line 9: Enabled only warning logs to show in the console
    }
}




Step-1{
    INFO{
        This app will now connect to MySQL, you'll see a line stating:
            : HikariPool-1 - Added connection com.mysql.cj.jdbc.ConnectionImpl@52f57666
            : HikariPool-1 - Start completed.
        This means that you've successfully connected to the database.
    }


    02:
    File application.properties{
        Line 2-4: Added JDBC database connection info (database name, username, password)
    }


    01:
    File CruddemoApplication.java{
        Line 17: Declared a CommandLineRunner to make our app function like a command line application.
        Line 19: Implemented a lambda expression, our code will happen within this box.
    }
}