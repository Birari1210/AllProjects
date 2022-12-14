package com.yash.project.gym.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.project.gym.model.Trainer;
import com.yash.project.gym.repository.TrainerRepo;

@Service
public class TrainerService {
	
	@Autowired 
	TrainerRepo trainerRepoObj;

	public void addTrainer(Trainer trainerObj) {
		// TODO Auto-generated method stub
		
		trainerRepoObj.save(trainerObj);
	
		
	}

	public Object getAllTrainerData() { // list pn ghevu shakto...
		
		return trainerRepoObj.findAll();
	}
	
// for update
	public Trainer getTrainerById(int id) {
		Optional<Trainer> optional = trainerRepoObj.findById(id);
		Trainer trainerOjb = optional.get();
		return trainerOjb;
		
	
	}

	public void save_Trainer(Trainer trainerOjb) {
		
		trainerRepoObj.save(trainerOjb);
		
	}
	
	

}
