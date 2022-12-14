package com.project.blog.service;

import java.util.List;


import com.project.blog.payroll.UserDto;

public interface UserService {

	UserDto createUser(UserDto user);
	
	UserDto updateUser(UserDto user, Integer userId);
	
	UserDto getUserbyId(Integer userId);
	
	List<UserDto> getAllUser();
	
	void deleteUser(Integer UserId);
	
}
