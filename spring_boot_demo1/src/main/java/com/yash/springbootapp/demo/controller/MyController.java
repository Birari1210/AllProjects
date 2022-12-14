package com.yash.springbootapp.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping("/")
	public String demo()
	{
		return "Success";
	}
	

}
