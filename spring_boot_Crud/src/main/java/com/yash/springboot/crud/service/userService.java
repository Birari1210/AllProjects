package com.yash.springboot.crud.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yash.springboot.crud.model.User;
import com.yash.springboot.crud.repo.UserRepo;


@Component
public class userService {
	
	@Autowired
	UserRepo objUR;
	
	public User addUserService(User objuser)
	{
	objuser = objUR.save(objuser);
			return objuser;
	}
	
	public List<User> getUserList()
	
	{
		List<User> ul = new ArrayList<User>();
		
		objUR.findAll().forEach(ul::add);
		return ul;
	}
	
	public void deleteUserbyID(Integer uid)
	{
	      objUR.deleteById(uid); // inbuild method
	}
	
	public User updateUser(User objuser)
	{
		objuser = objUR.save(objuser);
		return objuser;
	}
}

