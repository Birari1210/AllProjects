package com.yash.project.gym.repository;

import org.springframework.data.repository.CrudRepository;

import com.yash.project.gym.model.User;

public interface UserRepo extends CrudRepository<User,Integer> {

}
