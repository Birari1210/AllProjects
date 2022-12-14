package com.project.blog.payroll;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	private int id;
	@NotNull @NotEmpty
	@Size(min= 4, max=10, message="Minimum is 4 and max is 10")
	private String name;
    @NotNull @NotEmpty 
    @Size(min=3, max=8,message="Minimum is 4 and max is 10")  //@Pattern use
	private String password;
    
    @Email(message="Email is not valid !!!!...")
	private String email;
    @NotNull
	private String about;
	
	
}
