package com.luv2code.springboot.demo.a1_mycoolapp.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class FunRestController {
    
    //expose "/" endpoint that returns "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "Hello world!";
    }
}

// go to: localhost:8080
