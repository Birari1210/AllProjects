package com.yash.springboot.thymeleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.yash.springboot.thymeleaf.service.EmpService;

@Controller
public class EmpController {
	
	@Autowired
	EmpService objEServe;
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/addEmp")
	public String addEmp()
	{
		return "empregister";
	}
	
	@RequestMapping("/listofemloyee")
	public String empList()
	{
		return "emplist";
	}

}
