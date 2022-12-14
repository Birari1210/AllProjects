package com.yash.springboot.thymeleaf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eID;
	private int fname;
	private int lname;
	private int address;
	private long mobNo;
	public int geteID() {
		return eID;
	}
	public void seteID(int eID) {
		this.eID = eID;
	}
	public int getFname() {
		return fname;
	}
	public void setFname(int fname) {
		this.fname = fname;
	}
	public int getLname() {
		return lname;
	}
	public void setLname(int lname) {
		this.lname = lname;
	}
	public int getAddress() {
		return address;
	}
	public void setAddress(int address) {
		this.address = address;
	}
	public long getMobNo() {
		return mobNo;
	}
	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}	
}
