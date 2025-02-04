package com.myFirstSpringApp.myCoolApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyCoolAppApplication {

	// exposing '/' endpoint that returns "Hello World!"
	public static void main(String[] args) {
		SpringApplication.run(MyCoolAppApplication.class, args);
	}
}