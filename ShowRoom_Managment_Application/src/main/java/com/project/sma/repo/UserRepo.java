package com.project.sma.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.project.sma.model.User;

@Repository
public interface  UserRepo extends CrudRepository<User, Integer> {
	
	Optional<User> findByUserName(String userName);

}
