package com.yash.project.login.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.project.login.model.web_user;

public interface web_userRepo extends JpaRepository<web_user, Integer>{
	

	Optional<web_user> findByUserName(String userName);

}
