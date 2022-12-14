package com.yash.assingment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.assingment.model.Teacher;
import com.yash.assingment.repo.TeacherRepo;

@Service
public class TeacherService {

	@Autowired
	TeacherRepo teacherrepo;

	public TeacherRepo getTeacherrepo() {
		return teacherrepo;
	}

	public void setTeacherrepo(TeacherRepo teacherrepo) {
		this.teacherrepo = teacherrepo;
	}

	

	public Teacher addteacher(Teacher objteach) {	
	 return teacherrepo.save(objteach);
	}

	public List<Teacher> getListOfTeacher() {
		
		return teacherrepo.findAll();
	}
	
	
	
}
