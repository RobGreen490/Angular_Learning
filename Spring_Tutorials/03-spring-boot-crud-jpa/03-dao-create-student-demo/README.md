Step-3{
    INFO{
        DAO: Data Access Object communicates with the database and helps perform CRUD operations (Create, Read, Update, Delete).
    }


    05:
    File CruddemoApplication.java{
        Line 23: Commented out createStudent(studentDAO) in preparation to create a method for storing multiple students.
        Line 24: Initiating the method createMultipleStudents(studentDAO) to create multiple students and push that data to the database(create the students and insert their data into the associated columns)
        Line 31-33: Created three student objects
        Line 36-39: Saving those three student objects to the database (Crud)
    }


    04:
    File CruddemoApplication.java{
        Line 20: Injecting our studentDAO into the commandLineRunner
        Line 21: Initiating the method createStudent(studentDAO) to create a single student and push that data to the database(create the student and insert their data into the associated columns)
        Line 43: Declaring the method to create a single student while passing in the student data access object
        Line 44-46: Creating a single Student object.
        Line 48-50: Saving that student object to the database.
        Line 53: console logging the generated student id MySQL generated.
    }


    03:
    File StudentDAOImpl.java{
        Line 10: annotated with repository to support component scanning and translate JDBC exceptions
        Line 18-21: Implemented constructor for injecting entityManager
        Line 24-29: Implemented save method for saving the student to the database
    }


    02:
    File StudentDAO.java{
        Line 6: Created abstract method for saving a Student object to a database
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