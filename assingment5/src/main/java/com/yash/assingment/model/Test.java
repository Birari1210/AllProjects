package com.yash.assingment.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;

//Test : testid, testname, 
@Entity
public class Test {
	@Id
	int testid;
	String testname;
	int teacherid;
	
	@ManyToOne
	Teacher teacher;
	
	@OneToMany(mappedBy = "test")
	List<Test_question> tq;
	

	public List<Test_question> getTq() {
		return tq;
	}
	public void setTq(List<Test_question> tq) {
		this.tq = tq;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public int getTestid() {
		return testid;
	}
	public void setTestid(int testid) {
		this.testid = testid;
	}
	public String getTestname() {
		return testname;
	}
	public void setTestname(String testname) {
		this.testname = testname;
	}
	public int getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}
	
   
}
