package com.yash.assingment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.assingment.model.Student;
import com.yash.assingment.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo strepo;

	public StudentRepo getStrepo() {
		return strepo;
	}

	public void setStrepo(StudentRepo strepo) {
		this.strepo = strepo;
	}

	public Student addStud(Student stud) {
		
		return strepo.save(stud);
	}

	public List<Student> getListOfStudent() {
		
		return strepo.findAll();
	}
	
	
}
