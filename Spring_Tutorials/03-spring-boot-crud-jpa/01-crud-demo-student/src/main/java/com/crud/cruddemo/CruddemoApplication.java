package com.crud.cruddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	// declaring a new bean for command line runner: for creating a command line application.
	public CommandLineRunner commandLineRunner(String[] args){
		// Implementing a lambda expression. Our code will happen here.
		return runner -> {
			System.out.println("Hello world!");
		};
	}

}
