package com.myFirstSpringApp.myCoolApp.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class FunRestController {

    // exposing '/' endpoint that returns "Hello World!"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
    
}
