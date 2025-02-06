package com.springcore.springcoredemo.common;

import org.springframework.stereotype.Component;


// Component marks the class as a Spring Bean, making it available for dependency injection
@Component
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In the constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Practice fast bowling for 15 minutes.";
    }
}