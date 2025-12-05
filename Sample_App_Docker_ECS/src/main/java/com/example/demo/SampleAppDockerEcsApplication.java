package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleAppDockerEcsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleAppDockerEcsApplication.class, args);
		System.out.println("spring app started successfully");
	}

}
