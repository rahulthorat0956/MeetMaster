package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testing {
	
	@GetMapping("/test")
	public void testing() {
		System.out.println("Hello world");
	}
	

}
