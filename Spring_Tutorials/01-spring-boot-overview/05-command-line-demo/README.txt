step-05{
    File pom.xml{
        Line 45-48: commented out actuator dependency
        Line 51-54: commented out security dependency
    }

    INSTRUCTIONS TO RUN FROM COMMAND LINE{
        1. open the command line and cd into the project
        2. type "mvnw package" and let the command prompt package the file
        3. a snapshot will be created, type the following into the command line:
            java -jar target\mycoolapp-0.0.1-SNAPSHOT.jar
        4. You can also run it at this point using:
            mvnw spring-boot:run
    }
}

step-04{
    File pom.xml{
        Line 51-54: Added spring security dependency 
    }

    File application.properties{
        Line 5: Added exclusion to the end-points "health" and "info".
    }
}

Step-03{
    File pom.xml{
        Line 45-48: Added actuator which gives us end-points with resource monitoring
    }

    File application.properties{
        Line 2: exposing all resource monitoring end-points with "*"
        Line 3: enabled info environment
        Line 8: added app name to display within the info environment
        Line 9: added description to display within the info environment
        line 10: added version to display within the info environment
    }
}

Step-02{
    File pom.xml{
        Lines 39-42: Added devtools to enable hot reload of website after changing code.
    }

    File FunRestController.java{
        lines 17-20: Added another end-point accessor for "/workout".
        lines 23-26: Added another end-point accessor for "/fortune".
    }
}

Step-01{
    Folder java\com\myFirstSpringApp\myCoolApp: Created java package "rest"
    Folder java\com\myFirstSpringApp\myCoolApp\rest: Created file "FunRestController.java"

    File FunRestController.java{
        Line 7: Added RestController
        Line 11: Added GetMapping for exposing "/" end-point.
        Line 12-13: Declared function to return String "Hello World!"
    }
}