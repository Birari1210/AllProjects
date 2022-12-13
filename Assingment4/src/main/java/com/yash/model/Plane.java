package com.yash.model;

import javax.persistence.Entity;
import javax.persistence.Id;

//Plane_name:- pid, plane_name, year_of_manufacturing, total_life, 

@Entity
public class Plane {

	@Id
    int pid;
	String planename;
	int yearofmfg;
	int totallife;
	int dateOfDeploy;
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPlanename() {
		return planename;
	}
	public void setPlanename(String planename) {
		this.planename = planename;
	}
	public int getYearofmfg() {
		return yearofmfg;
	}
	public void setYearofmfg(int yearofmfg) {
		this.yearofmfg = yearofmfg;
	}
	public int getTotallife() {
		return totallife;
	}
	public void setTotallife(int totallife) {
		this.totallife = totallife;
	}
	
	public int getDateOfDeploy() {
		return dateOfDeploy;
	}
	public void setDateOfDeploy(int dateOfDeploy) {
		this.dateOfDeploy = dateOfDeploy;
	}
	
	
}
