package com.yash.model;

public class Customer {
private int custid;
private String fname;
private String lname;
private String address;
private String city;



public Customer() {
	 
}
public Customer(int custid, String fname, String lname, String address) {
	 
	this.custid = custid;
	this.fname = fname;
	this.lname = lname;
	this.address = address;
}
public int getCustid() {
	return custid;
}
public void setCustid(int custid) {
	this.custid = custid;
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
