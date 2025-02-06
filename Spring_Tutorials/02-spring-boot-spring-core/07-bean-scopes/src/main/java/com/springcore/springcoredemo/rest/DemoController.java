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
    private Coach anotherCoach;

    // Autowired tells Spring to inject a dependency into the classes declared variables(if you only have 1 constructor, @Autowired on constructor is optional)
    @Autowired
    // Added qualifier "baseballCoach" to declare what class to use from the common package
    public DemoController(@Qualifier("cricketCoach")Coach coach, //these beans will be different because of @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) creating two different instances
                          @Qualifier("cricketCoach")Coach anotherCoach){
        System.out.println("In the constructor: " + getClass().getSimpleName());
        this.coach = coach;
        this.anotherCoach = anotherCoach;
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

    @GetMapping("/check")
    public String check(){
        return "Comparing beans: coach == anotherCoach, " + (coach == anotherCoach);
    }
}