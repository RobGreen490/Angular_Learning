package com.springcore.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcore.springcoredemo.common.Coach;

// RestController is used for handling web requests.
@RestController
public class DemoController {
    private Coach coach;

    // Autowired tells Spring to inject a dependency into the classes declared variables(if you only have 1 constructor, @Autowired on constructor is optional)
    @Autowired
    // Added qualifier "baseballCoach" to declare what class to use from the common package
    public DemoController(@Qualifier("cricketCoach")Coach coach){
        this.coach = coach;
    }

    // exposing end-point for "/" landing page
    @GetMapping("/")
    public String getMethodName() {
        return "Home Page";
    }
    

    // exposing end-point for "dailyworkout, returning contents from coach.getDailyWorkout()"
    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return coach.getDailyWorkout();
    }   
}