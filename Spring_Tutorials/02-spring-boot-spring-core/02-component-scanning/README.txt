Step-02{
    Folder java\com\springcore\springcoredemo: Created java package "rest"
    Folder java\com\springcore\springcoredemo: Created java package "common"
    
    Moved "DemoController.java" into "rest" package
    Moved "Coach" into "common" package
    Moved "CricketCoach" into "common" package

    Created Package "util" OUTSIDE of the scope of springcoredemo
    Moved "Coach.java" and "CricketCoach.java" to the "util" package

    File SpringcoredemoApplication.java{
        Line 6: explicitly listed the base package "com.springcore.springcoredemo"
        Line 7: explicitly listed package util "com.springcore.util"
    }
}

Step-01{
    Folder java\com\springcore\springcoredemo: Created java interface "Coach"
    Folder java\com\springcore\springcoredemo: Created java class "CricketCoach"
    Folder java\com\springcore\springcoredemo: Created java class "DemoController"

    File Coach.java{
        Line 3-5: initiated Coach interface
    }

    File CricketCoach.java{
        Line 7-13: Initialized the class component CricketCoach to return a string
    }

    File DemoController.java{
        Line 8: initialized RestController for handling web requests
        Line 9: initialized class DemoController
        Line 10: Declared a Coach object "coach"
        Line 13-16: Injecting this.coach value with coach
        Line 19-22: Exposing "/" endpoint for a landing page
        Line 26-29: Exposed end-point "dailyworkout" that returns the contents of coach.getDailyWorkout()
    }
}

http://localhost:8080