package org.joseph.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/")
	public String home() {
		System.out.println("Log - Hello World");
		return "Hello World";
	}
	
}
