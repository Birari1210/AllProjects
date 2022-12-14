package com.yash.springboot.database.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@Autowired
	JdbcTemplate objJDBC;
	@RequestMapping("/")
	public String index()
	{
	int id;
	id= objJDBC.update("insert into user(uid,name,email,password,address) values(7,'rahul','rrr123@gmail.com','lok#Q@!','mumbai')");
	return ""+id;
     }
}







