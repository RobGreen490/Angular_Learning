Step-06{
    File TrackCoach.java{
        Line 6: Removed @Primary annotation
    }
    
    File DemoController.java{
        Line 18: Added qualifier to make use of "cricketCoach"
    }

    File BaseballCoach, CricketCoach, TennisCoach, TrackCoach, DemoController .java{
        Added Constructors that print a message in the console when initialized
    }

    File TrackCoach.java{
        Line 7: Added @Lazy annotation to make the bean only generate when needed
    }

    File application.properties{
        Line 3: Applying @Lazy to all beans in the app
    }
}

Step-05{
    File DemoController.java{
        Line 18: Removed @Qualifier("cricketCoach")
    }

    File TrackCoach.java{
        Line 6: Marked TrackCoach as @Primary
    }
}

Step-04{
    File DemoController.java{
        Line 16: Changed setter back to constructor injector
    }
    Folder java\com\springcore\springcoredemo\common{
        Created classes "BaseballCoach", "CricketCoach", "TennisCoach", "TrackCoach"
    }
    
    File DemoController{
        Line 18: Added qualifier as only a single bean can be used when multiple are declared.
    }
    
}

Step-03{
    Moved "Coach.java" and "CricketCoach.java" back to the "common" package

    File SpringcoredemoApplication.java{
        Line 6-7: Commented out the scanBasePackages
        Line 8: Reassigned the generic @SpringBootApplication package
    }

    File DemoController.java{
        Line 16-17: deleted constructor injection to replace with a setter injection
        Line 16-17{
            Updated constructor to setter. When declaring the DemoController as
            an object we don't have to pass a parameter during its construction now.
        }
    }
}

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