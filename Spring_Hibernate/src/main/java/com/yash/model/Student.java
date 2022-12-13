package com.yash.model;

public class Student {

	private int sId;
	private String fname;
	private String lname;
	private int marks;
	private String address;
	private String city;
	
	public Student() {

	}

	public Student(int sId, String fname, String lname, int marks, String address, String city) {
		this.sId = sId;
		this.fname = fname;
		this.lname = lname;
		this.marks = marks;
		this.address = address;
		this.city = city;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}	
}
