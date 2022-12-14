package com.yash.project.gym.repository;

import org.springframework.data.repository.CrudRepository;


import com.yash.project.gym.model.Trainer;

public interface TrainerRepo extends CrudRepository<Trainer,Integer>{

	
}
