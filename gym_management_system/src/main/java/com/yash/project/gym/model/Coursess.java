package com.yash.project.gym.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coursess {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int cid;
	String courseName;
	String trainerName;
	double monthlyFees;
	double yearlyFees;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public double getMonthlyFees() {
		return monthlyFees;
	}
	public void setMonthlyFees(double monthlyFees) {
		this.monthlyFees = monthlyFees;
	}
	public double getYearlyFees() {
		return yearlyFees;
	}
	public void setYearlyFees(double yearlyFees) {
		this.yearlyFees = yearlyFees;
	}
	
}
