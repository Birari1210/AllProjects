package com.yash.project.gym.model;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class DietPlan {
	
	@Id
	int days;
	String breakfast;
	String lunch;
	String lateEvening;
	String dinner;
	
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public String getBreakfast() {
		return breakfast;
	}
	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}
	public String getLunch() {
		return lunch;
	}
	public void setLunch(String lunch) {
		this.lunch = lunch;
	}
	public String getLateEvening() {
		return lateEvening;
	}
	public void setLateEvening(String lateEvening) {
		this.lateEvening = lateEvening;
	}
	public String getDinner() {
		return dinner;
	}
	public void setDinner(String dinner) {
		this.dinner = dinner;
	}	
}
