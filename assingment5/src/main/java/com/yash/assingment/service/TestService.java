package com.yash.assingment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.assingment.model.Test;
import com.yash.assingment.repo.TestRepo;

@Service
public class TestService {

	@Autowired
	TestRepo testrepoobj;

	public TestRepo getTestrepoobj() {
		return testrepoobj;
	}

	public void setTestrepoobj(TestRepo testrepoobj) {
		this.testrepoobj = testrepoobj;
	}

	public Test addtest(Test objtest) {
		
		return testrepoobj.save(objtest);	
		 
	}

	public List<Test> getListtestService() {

		return testrepoobj.findAll();
	}
	
		
	
	
	
}
