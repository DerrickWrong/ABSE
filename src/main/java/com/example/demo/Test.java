package com.example.demo;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Test {

	@PostConstruct
	void init() {
		System.out.println("Test Here");
		
	}
	
}
