

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