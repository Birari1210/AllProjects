package com.yash.webmvc.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringWebClass {
	@RequestMapping
	public String m1()
	{
		return "index";
	}
	
}
