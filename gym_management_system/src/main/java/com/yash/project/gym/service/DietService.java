package com.yash.project.gym.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.project.gym.model.DietPlan;
import com.yash.project.gym.repository.DietPlanRepo;

@Service
public class DietService {
	
	@Autowired
	DietPlanRepo dietRepoObj;

	public void SaveDiet(DietPlan dpObjct) {
		
		dietRepoObj.save(dpObjct);
		
	}

	public Object getDietPlanDetails() {
		
		return dietRepoObj.findAll();
	}

	public DietPlan getAllDietById(int id) {
		
		Optional<DietPlan> optional = dietRepoObj.findById(id);
		DietPlan dpObj = optional.get();
		return dpObj;
		
	}

	public void saveDietChartUpdate(DietPlan dpObj) {
		// TODO Auto-generated method stub
		
		dietRepoObj.save(dpObj);
		
	}

	public void deleteDietChartById(int id) {
		
		dietRepoObj.deleteById(id);
		
	}
	
	
	public List<DietPlan> getDietChart()
	{
		List<DietPlan> dlist = new ArrayList<DietPlan>();
		dietRepoObj.findAll().forEach(dlist::add);
		return dlist;
	}
	

//	public Object getDietChart() {
//		
//		return dietRepoObj.findAll();
//	}
	

}
