package com.hello_world.hello_world.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/helloworld")
public class Hello_WorldController {
	
	@GetMapping
	public String hello_world() {
		return "Hello World!";
	}

	
}
