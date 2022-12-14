package com.project.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.blog.entity.User;
import com.project.blog.payroll.UserDto;

public interface UserRepo extends JpaRepository<User, Integer>{

	void save(UserDto user);
	
	

	
}
