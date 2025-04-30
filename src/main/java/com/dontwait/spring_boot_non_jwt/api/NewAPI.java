package com.dontwait.spring_boot_non_jwt.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewAPI {
	@GetMapping("/test")
	public String testAPI() {
		return "Hello world";
	}
	
}