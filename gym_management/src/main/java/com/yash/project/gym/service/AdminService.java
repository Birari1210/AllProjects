package com.yash.project.gym.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.project.gym.Repository.AdminRepo;
import com.yash.project.gym.model.Admin;

@Service
public class AdminService {

	@Autowired
	AdminRepo adminrepoObj;
	
	public int addAdmin(Admin adminObj)
	{
		Admin objA = adminrepoObj.save(adminObj);
		return objA.getId();
	}
	public List<Admin> allAdminList() 
	{
	List<Admin> list = new ArrayList<Admin>();
	adminrepoObj.findAll().forEach(list::add);
	return list;
	}
}
