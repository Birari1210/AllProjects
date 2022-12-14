package com.yash.springboot.thymeleaf.repo;

import org.springframework.data.repository.CrudRepository;

import com.yash.springboot.thymeleaf.model.Employee;


public interface EmpRepo extends CrudRepository<Employee,Integer>{
	

}
