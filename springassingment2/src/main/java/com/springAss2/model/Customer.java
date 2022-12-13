package com.springAss2.model;

import java.sql.Date;

//Customer :- customerid, customername, email, dateofbirth, add1, add2, pincode, 
public class Customer {
	
	int customerid;
	String customerName;
	String email;
	Date dob;
	String address1;
	String address2;
	int pincode;
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customerName=" + customerName + ", email=" + email + ", dob="
				+ dob + ", address1=" + address1 + ", address2=" + address2 + ", pincode=" + pincode + "]";
	}
	
	
}
