package com.yash.assingment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.assingment.model.Student_test_attempt;
import com.yash.assingment.repo.Student_test_attemptRepo;

@Service
public class StudenttestattemptService {

	@Autowired
	Student_test_attemptRepo starepo;

	public Student_test_attemptRepo getStarepo() {
		return starepo;
	}

	public void setStarepo(Student_test_attemptRepo starepo) {
		this.starepo = starepo;
	}
	
	
	public List<Student_test_attempt> getListOfTestAttemp() {
		return starepo.findAll();
	}
	
}
