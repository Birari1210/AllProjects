package com.training.exception.assingment;

public class Student {
	
	int rollno;
	String name;
	String address;
	StudentResult srobj;
	
	public int getRollno() 
	{
		return rollno;
	}
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public String getSname() {
		return name;
	}
	
	public void setSname(String name) {
		this.name = name;
	}
	
	
	public String getSaddress() {
		return address;
	}
	
	public void setSaddress(String address) {
		this.address = address;
	}
	
	public StudentResult getSrobj() {
		return srobj;
		
	}
	
	public void setSrobj(StudentResult srobj) throws ResultException {
		
		
		this.srobj = srobj;
		
		
	}
	
	

}
