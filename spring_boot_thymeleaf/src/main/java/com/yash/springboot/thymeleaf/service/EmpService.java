package com.yash.springboot.thymeleaf.service;

import java.util.ArrayList;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.yash.springboot.thymeleaf.model.Employee;
import com.yash.springboot.thymeleaf.repo.EmpRepo;


@Service
public class EmpService {
	
	@Autowired
	EmpRepo erObj;
	
	public int addEmp(Employee objE)
	{
	   Employee obj1 = erObj.save(objE);
	   return obj1.geteID();
	}
	public List<Employee> allEmpList() 
	{
	List<Employee> list = new ArrayList<Employee>();
	erObj.findAll().forEach(list::add);
	return list;
	}
}
