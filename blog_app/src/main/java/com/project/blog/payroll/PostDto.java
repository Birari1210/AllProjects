package com.project.blog.payroll;


import java.util.Date;

import com.project.blog.entity.Category;
import com.project.blog.entity.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
public class PostDto {

	//private Integer Id;
    private String title;
    
	private String content;
	private String imageName;
	private Date dateOfAdd;
	
	private CategoryDto category;
	
	private UserDto user;
}
