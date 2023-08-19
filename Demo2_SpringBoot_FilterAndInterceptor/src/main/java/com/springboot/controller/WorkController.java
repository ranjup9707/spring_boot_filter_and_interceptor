package com.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/work")
public class WorkController 
{
	
	private Logger log = LoggerFactory.getLogger(WorkController.class);
	
	@GetMapping
	public String startWork() {
		log.info("Let start the work....");
		return "Let start the work";
	}
}
