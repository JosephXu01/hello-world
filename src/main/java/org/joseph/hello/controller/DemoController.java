package org.joseph.hello.controller;

import org.joseph.hello.exception.HelloBadRequestEcxeption;
import org.joseph.hello.model.Greeting;
import org.joseph.hello.util.JsonUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javassist.expr.NewArray;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class DemoController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/")
	public String home() {
		System.out.println("Log - Hello World");
		return "Hello World";
	}

	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(),
				String.format(template, name));
	}
	
	@PostMapping("/greet")
	public void greetings(@RequestBody Greeting greeting) {
		System.out.println(greeting.getContent());
	}

	@GetMapping("/hello/{code}")
	public String hello(@PathVariable String code) {
		System.out.println("Log - Hello World");
		if("a".equalsIgnoreCase(code)) {
			throw new HelloBadRequestEcxeption("code wrong");
		}
		return "Hello World";
	}
	
	@GetMapping(value = "/json", produces = "application/json")
	public String json() {
		return JsonUtil.toJson(new Greeting(1, "hello"));
	}
	
}
