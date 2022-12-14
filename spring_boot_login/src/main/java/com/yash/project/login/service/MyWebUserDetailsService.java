package com.yash.project.login.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.yash.project.login.model.MyWebUserDetails;
import com.yash.project.login.model.web_user;
import com.yash.project.login.repo.web_userRepo;

@Service
public class MyWebUserDetailsService implements UserDetailsService{
	   @Autowired
	   web_userRepo webUserRepo;

		@Override
		public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			 Optional<web_user> objuser = webUserRepo.findByUserName(username);
			 
			 objuser.orElseThrow(()-> new UsernameNotFoundException("Not found :- "+username));
			 
			return objuser.map(MyWebUserDetails::new).get();
		}	   
	}
