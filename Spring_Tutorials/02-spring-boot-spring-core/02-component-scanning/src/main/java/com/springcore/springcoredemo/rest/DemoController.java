package com.springcore.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcore.util.Coach;

// RestController is used for handling web requests.
@RestController
public class DemoController {
    private Coach coach;

    // Autowired tells Spring to inject a dependency (if you only have 1 constructor, @Autowired on constructor is optional)
    @Autowired
    public DemoController(Coach coach){
        this.coach = coach;
    }

    // exposing end-point for "/"
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