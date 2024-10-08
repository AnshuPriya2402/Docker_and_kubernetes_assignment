package com.nagarro.dockerAssignment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {

	@GetMapping("/home")
	public String home() {
		return "Hi,This is Docker Assignment";		
	}
}
