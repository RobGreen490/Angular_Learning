package com.springcore.springcoredemo.common;

import org.springframework.stereotype.Component;

// Component marks the class as a Spring Bean, making it available for dependency injection
@Component  // @Scope here makes it so that a new object is created for each injection.
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In the constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Practice fast bowling for 15 minutes.";
    }
}