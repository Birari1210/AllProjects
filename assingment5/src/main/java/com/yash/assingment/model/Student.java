package com.yash.assingment.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//Student :- sid, sname, email, password.

@Entity
public class Student {

	@Id
	int  sid;
	String sname;
	String email;
	String password;
	
	@OneToMany(mappedBy = "student")
	
	List<Student_test_attempt> attempts;
	
	
	
	public List<Student_test_attempt> getAttempts() {
		return attempts;
	}
	public void setAttempts(List<Student_test_attempt> attempts) {
		this.attempts = attempts;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
