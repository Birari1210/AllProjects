package com.springorm.model;

import java.sql.Date;

//Result:- rid, Maths, Hindi,English, science, Sanskrit, sid, datetime

public class Result {

	int rid;
	int maths;
	int hindi;
	int english;
	int science;
	int sanskrit;
	int sid;
	Date  datetime;
	
	
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getHindi() {
		return hindi;
	}
	public void setHindi(int hindi) {
		this.hindi = hindi;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getSanskrit() {
		return sanskrit;
	}
	public void setSanskrit(int sanskrit) {
		this.sanskrit = sanskrit;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	
	

}
