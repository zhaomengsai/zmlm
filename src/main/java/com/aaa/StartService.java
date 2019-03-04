package com.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartService {

	public static void main(String[] args) {
		
		System.out.println("starts");
		SpringApplication.run(StartService.class, args);

	}
}
