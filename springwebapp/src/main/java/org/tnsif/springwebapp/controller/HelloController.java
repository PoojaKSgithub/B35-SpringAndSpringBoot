package org.tnsif.springwebapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/message")
	public String message()
	{
		return "Welcome to B35";
	}

}
