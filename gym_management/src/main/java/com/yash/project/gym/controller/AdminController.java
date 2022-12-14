package com.yash.project.gym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yash.project.gym.service.AdminService;

@Controller
public class AdminController {

	@Autowired
	AdminService adminServiceObj;
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/Logher")
	public String addAdmin()
	{
		return "adminLogin";
	}
	
	@RequestMapping("/Register")
	public String adminForm()
	{
		return "register";
	}
}
