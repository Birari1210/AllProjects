package com.project.sma.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter; //*******
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.project.sma.service.UserService;



@EnableWebSecurity
@SuppressWarnings("deprecation")
public class SecurityConfiguration extends WebSecurityConfigurerAdapter // problem in configurationAdapter
{
	@Autowired
	UserService objUSS;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.userDetailsService(objUSS);
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
	  http.authorizeRequests().antMatchers("/index").hasRole("ADMIN").antMatchers("/home").hasAnyRole("ADMIN","USER").antMatchers("/").permitAll().and().formLogin();	
	}
	@Bean
	public PasswordEncoder getPassordEncoder()
	{
		return NoOpPasswordEncoder.getInstance();
	}
}

