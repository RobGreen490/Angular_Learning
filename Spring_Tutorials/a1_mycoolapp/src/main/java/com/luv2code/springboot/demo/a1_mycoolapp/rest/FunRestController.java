package com.luv2code.springboot.demo.a1_mycoolapp.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class FunRestController {
    
    //expose "/" endpoint that returns "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "Hello world!";
    }

        //expose a new endpoint for "workout"
        @GetMapping("/workout")
        public String getDailyWorkout(){
            return "Run a hard 5k!";
        }

}

// go to: localhost:8080
