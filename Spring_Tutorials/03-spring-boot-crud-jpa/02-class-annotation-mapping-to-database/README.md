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