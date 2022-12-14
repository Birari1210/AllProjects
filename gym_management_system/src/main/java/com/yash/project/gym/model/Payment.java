package com.yash.project.gym.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    int pid;
	String courseName;
	int courseId;
	double courseFees;
	String feesType;
	//String fname;
	String userName;
	String dateOfPayment;   
    int courseDuration;                // changes kele ahet
    
	
//	public String getFname() {
//		return fname;
//	}
//	public void setFname(String fname) {
//		this.fname = fname;
//	}
    
    
	public int getCourseDuration() {
		return courseDuration;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public double getCourseFees() {
		return courseFees;
	}
	public void setCourseFees(double courseFees) {
		this.courseFees = courseFees;
	}
	public String getFeesType() {
		return feesType;
	}
	public void setFeesType(String feesType) {
		this.feesType = feesType;
	}
	
	public String getDateOfPayment() {
		return dateOfPayment;
	}
	public void setDateOfPayment(String dateOfPayment) {
		this.dateOfPayment = dateOfPayment;
	}
	
}
