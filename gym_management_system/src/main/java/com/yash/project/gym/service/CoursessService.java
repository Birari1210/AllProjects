package com.yash.project.gym.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.project.gym.model.Coursess;
import com.yash.project.gym.repository.CoursessRepo;

@Service
public class CoursessService {
	
	@Autowired 
	CoursessRepo CourcessRepoObj;


	public void SaveCoursess(Coursess coursessObj) {
		CourcessRepoObj.save(coursessObj);
		
	}
// all details for trainer
	public Object getAllCoursessDetails() {
		
		return CourcessRepoObj.findAll();
	}

// get all courses for user
	public Object getAllCoursesDetails() {
		
		return CourcessRepoObj.findAll();
	}
	
//Update Coursess
	public Coursess getCoursessById(int id) {
		
		Optional<Coursess> optional = CourcessRepoObj.findById(id);
		Coursess coursesObj = optional.get();
		return coursesObj;
	}

	public void saveCoursesUpdate(Coursess coursesObj) {

	 	CourcessRepoObj.save(coursesObj);	
	}

// delete Course
	public void deleteCourseById(int id) {
       
		CourcessRepoObj.deleteById(id);
	}


		
}
