package com.yash.project.gym.model;

import java.time.LocalDate;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Attendance {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	int ano;
	int tId;
	String name;
	String date;
	String MarkAttendace;
	String approve;
	
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getMarkAttendace() {
		return MarkAttendace;
	}
	public void setMarkAttendace(String markAttendace) {
		MarkAttendace = markAttendace;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public LocalDate getDate() {
//		return date;
//	}
//	public void setDate(LocalDate date) {
//		this.date = date;
//	}
//	public boolean isMarkAttendace() {
//		return MarkAttendace;
//	}
//	public void setMarkAttendace(boolean markAttendace) {
//		MarkAttendace = markAttendace;
//	}
	
	public String getApprove() {
		return approve;
	}
	public void setApprove(String approve) {
		this.approve = approve;
	}
	
	
}
