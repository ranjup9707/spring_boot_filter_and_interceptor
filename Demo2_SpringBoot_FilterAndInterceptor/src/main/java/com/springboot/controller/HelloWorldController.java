package com.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController 
{
	
	private Logger log = LoggerFactory.getLogger(HelloWorldController.class);
	
	@GetMapping
	public String sayHelloWorld() {
		log.info("Hello World called.....");
		return "Hello World";
	}
}
