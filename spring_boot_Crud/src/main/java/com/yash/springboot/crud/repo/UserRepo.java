package com.yash.springboot.crud.repo;

import org.springframework.data.repository.CrudRepository;
import com.yash.springboot.crud.model.User;

public interface UserRepo extends CrudRepository<User,Integer>
{
	

}
