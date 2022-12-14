package com.yash.project.gym.Repository;



import org.springframework.data.repository.CrudRepository;

import com.yash.project.gym.model.Admin;

public interface AdminRepo extends CrudRepository<Admin,Integer> {

}
