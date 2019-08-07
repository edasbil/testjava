package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyResource {

	@GetMapping("/name")
	public String getName() {
		
		return "Hello World!";
	}
	
	
}
