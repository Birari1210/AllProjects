package com.yash.web.model;

import javax.validation.constraints.*;

public class User {
@NotNull	
@Pattern(regexp="^[a-zA-Z$%@ ]{2,15}$",message="firstname can not empty")
private String fname;
@Size(min=4,message="lastname can not empty")
private String lname;
@Size(min=10,message="address line can not empty")
private String add1;
@Size(min=10,message="address line can not empty")
private String add2;
@Size(min=5,message="City can not empty")
private String city;
@Min(value=1,message="pincode at least have one length")
@Max(value=10000,message="pincode can not exceed the 10000")
private int pincode;

@Pattern(regexp="^[6-9][0-9]{9}",message="phone no must have 10 digit, and can only start with 6,7,8 and 9.")
private String phoneno;
 
public User() {}
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
public String getAdd1() {
	return add1;
}
public void setAdd1(String add1) {
	this.add1 = add1;
}
public String getAdd2() {
	return add2;
}
public void setAdd2(String add2) {
	this.add2 = add2;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public String getPhoneno() {
	return phoneno;
}
public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}
 
}
