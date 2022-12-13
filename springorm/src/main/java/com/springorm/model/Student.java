package com.springorm.model;

import java.sql.Date;

//Student table :- sid, sname, father_name, mother_name, classid, add1, add2, pincode, 
//aadharno, dob, date_of_admission.

public class Student {
	
	int sid;
	String sname;
	String father_name;
	String mother_name;
	int classid;
    String address1;
    String address2;
    int pincode;
    long aadharno;
    Date dob;
    Date date_of_addmission;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public String getMother_name() {
		return mother_name;
	}
	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}
	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
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
	public long getAadharno() {
		return aadharno;
	}
	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getDate_of_addmission() {
		return date_of_addmission;
	}
	public void setDate_of_addmission(Date date_of_addmission) {
		this.date_of_addmission = date_of_addmission;
	}

     	
}
