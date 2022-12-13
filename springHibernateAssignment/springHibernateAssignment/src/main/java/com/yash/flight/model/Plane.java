package com.yash.flight.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Plane {

	@Id
	@Column(name="plane_id")
	int planeid;
	String planename;
	int life;
	int yearofmanu;
	int yearofdeploy;
	
	public Plane() {
	}
	
	public int getPlaneid() {
		return planeid;
	}
	public void setPlaneid(int planeid) {
		this.planeid = planeid;
	}
	public String getPlanename() {
		return planename;
	}
	public void setPlanename(String planename) {
		this.planename = planename;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public int getYearofmanu() {
		return yearofmanu;
	}
	public void setYearofmanu(int yearofmanu) {
		this.yearofmanu = yearofmanu;
	}
	public int getYearofdeploy() {
		return yearofdeploy;
	}
	public void setYearofdeploy(int yearofdeploy) {
		this.yearofdeploy = yearofdeploy;
	}

	@Override
	public String toString() {
		return "Plane [planeid=" + planeid + ", planename=" + planename + ", life=" + life + ", yearofmanu="
				+ yearofmanu + ", yearofdeploy=" + yearofdeploy + "]";
	}
	
	
}
