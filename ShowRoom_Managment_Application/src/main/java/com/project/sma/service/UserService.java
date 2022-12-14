package com.project.sma.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.project.sma.model.MyUserDetails;
import com.project.sma.model.User;
import com.project.sma.repo.UserRepo;

@Service
public class UserService implements UserDetailsService{

	@Autowired
	UserRepo objURepo;
	
	public void saveUser(User objuser) {
		// TODO Auto-generated method stub
		
		objURepo.save(objuser);
	}

	public List<User> showAllUser() 
	{
		// TODO Auto-generated method stub
		List<User> ulist= new ArrayList<User>();
		objURepo.findAll().forEach(ulist::add);
		return ulist;
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {                // security methods vimal sir..
				Optional<User> objuser = objURepo.findByUserName(username);
		 
		 objuser.orElseThrow(()-> new UsernameNotFoundException("Not found :- "+username));
		 return objuser.map(MyUserDetails::new).get();
		
	}
}
