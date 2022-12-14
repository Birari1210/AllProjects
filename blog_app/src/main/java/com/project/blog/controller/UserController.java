package com.project.blog.controller;


import java.security.PublicKey;

import java.util.List;
import java.util.Map;

import javax.print.DocFlavor.READER;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.blog.payroll.ApiResponse;
import com.project.blog.payroll.UserDto;
import com.project.blog.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping("/")
	public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto)
	{
		UserDto createUserDto = this.userService.createUser(userDto);
		
		return new ResponseEntity<>(createUserDto, HttpStatus.CREATED);
		
		
	}
	
	@PutMapping("{userId}")
	public ResponseEntity<UserDto> updateUser(@Valid @RequestBody UserDto userDto, @PathVariable("userId") Integer uId)
	{
		UserDto updateUser = this.userService.updateUser(userDto, uId);
		
		return ResponseEntity.ok(updateUser);
		
	}
	
	//regular way use void without return
	
//	@DeleteMapping("/{userId}")
//	public  ResponseEntity<?> deleteUser(@PathVariable("userId") Integer userId) //
//	{
//		this.userService.deleteUser(userId);
//		
//	return new ResponseEntity(Map.of("massage","User deleted sucsessfully"), HttpStatus.OK);
//	}
	
// new way 
	
	
	@DeleteMapping("/{userId}")
	public ResponseEntity<ApiResponse> deleteUser(@PathVariable("userId") Integer userId)
	{
		this.userService.deleteUser(userId);
		
		return new ResponseEntity<ApiResponse>(new ApiResponse("User Deleted Successfully", true), HttpStatus.OK);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<UserDto>> getAllUser()
	{
		
		return ResponseEntity.ok(this.userService.getAllUser());
		
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<UserDto> getSingleUser(@PathVariable Integer userId)
	{
		return ResponseEntity.ok(this.userService.getUserbyId(userId));
		
	}
}