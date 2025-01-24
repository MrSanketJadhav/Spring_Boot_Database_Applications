package com.tka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDatabaseBirdsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDatabaseBirdsApplication.class, args);
		System.out.println("Application Is started");
	}

}
