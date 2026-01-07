package com.sam.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
	
	@GetMapping
	public String home()
	{
		return "Welcome home";
	}

}
