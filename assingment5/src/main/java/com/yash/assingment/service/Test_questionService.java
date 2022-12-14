package com.yash.assingment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.assingment.model.Test_question;
import com.yash.assingment.repo.Test_queRepo;

@Service
public class Test_questionService {
	
	@Autowired
	Test_queRepo tQueRepo;

	public Test_queRepo gettQueRepo() {
		return tQueRepo;
	}

	public void settQueRepo(Test_queRepo tQueRepo) {
		this.tQueRepo = tQueRepo;
	}

	public List<Test_question> getlistOfQuestion() {
		
		return tQueRepo.findAll();
	}
	
	public Optional<Test_question>  findByid(int qid)
	{
		return tQueRepo.findById(qid);
		
	}

	public Optional<Test_question> getQuestionById(int qid) {
		return tQueRepo.findById(qid);
	}

//	public List<Test_question> getListOfTestQuestion() {
//		// TODO Auto-generated method stub
//		return null;
//	}


}
