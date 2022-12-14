package com.yash.project.gym.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.yash.project.gym.model.Admin;
import com.yash.project.gym.repository.AdminRepo;


@Service
public class AdminService {
	
	@Autowired
	AdminRepo repoObj;

	public void saveAdminData(Admin objAdmin) {

		repoObj.save(objAdmin);
	}	
}


