package com.yash.springboot.crud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.springboot.crud.model.User;
import com.yash.springboot.crud.service.userService;


@RestController
@RequestMapping("/userapi")
public class UserController {
	
	@Autowired
	userService objus;
	
	@PostMapping("/adduser")
	public void createUser(@RequestBody User objUser)
	{
		User objuser1 = objus.addUserService(objUser);
		System.out.println(objuser1.getUid());
	}
	
	@GetMapping("/getlist")
	public List<User> getUserList()
	{
		List<User> ulistdata = objus.getUserList();
		return ulistdata;
	}

	 @DeleteMapping("/deluser/{id}")
	  public void delUserById(@PathVariable String id)
	  {
		  objus.deleteUserbyID(Integer.parseInt(id));
	  }
	 
	  @PutMapping("/updateuser")
	  public String updateUserById(@RequestBody User objuser)
	  {
		  User objuser2 = objus.updateUser(objuser);
		  return "data is updated";
	  }
}
