package com.yash.project.gym.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.project.gym.model.Acessory;
import com.yash.project.gym.model.Admin;
import com.yash.project.gym.repository.AcessoryRepo;

@Service
public class AcessoryService {
	
	@Autowired
	AcessoryRepo aRepoObj;

    //work hot ahe..... 
//    
//	public void saveAcessoryData(Acessory aceObj) {
//		
//		aRepoObj.save(aceObj);	
//	}
// show all data to admin
	
	 public List<Acessory> getAllAcessoryList() {
		
		 return  (List<Acessory>) aRepoObj.findAll();	 
	}
	 
	public void AddAccessory(Acessory acesoryObj) {
		aRepoObj.save(acesoryObj);
		
	}

	// edit operation
	public Acessory getAcessoryById(int id) {
	
		Optional<Acessory> optional = aRepoObj.findById(id);
		Acessory AcessoryObj = null;
	
		if(optional.isPresent())
		{
			AcessoryObj = optional.get();
		}
		else
		{
			throw new RuntimeException("Acessory Id not found "+ id);
		}
		return AcessoryObj;
	
	}
	
	public void removeAccessoryById(int id)
	{
		aRepoObj.deleteById(id);
	}


	
	
		
}

