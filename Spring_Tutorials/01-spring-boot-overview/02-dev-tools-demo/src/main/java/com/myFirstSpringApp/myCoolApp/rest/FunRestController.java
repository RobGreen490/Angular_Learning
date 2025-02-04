package com.myFirstSpringApp.myCoolApp.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class FunRestController {

    // exposing end-point for "/"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
    
    // exposing end-point for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k!";
    }

    // exposing end-point for "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day!";
    }
}
