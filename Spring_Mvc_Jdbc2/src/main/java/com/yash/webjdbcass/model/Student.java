package com.yash.webjdbcass.model;

import javax.validation.constraints.Pattern;

public class Student {
	private int id;
	private int roll_no;
	@Pattern(regexp = "^[A-Z ]{1,20}$",message= "student name can not be blank OR Must be Capital")
	private String fristname;
	private String lastname;
	private String fathername;
	@Pattern(regexp = "^[a-zA-Z ]{1,20}$",message= "Mother name can not Blank, it is compulsory")
    private String mothername;
    private String classname;
    private String section;
    private String dob;
    private String date_of_admission;
    private String gender;
    private String add1;
    private String add2;
    private String city;
    @Pattern(regexp="^[6-9][0-9]{9}",message="phone no must have 10 digit, and can only start with 6,7,8 and 9.")
    private String student_phoneno;
    private String parent_phoneno;
    private String email_parent;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getFristname() {
		return fristname;
	}
	public void setFristname(String fristname) {
		this.fristname = fristname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDate_of_admission() {
		return date_of_admission;
	}
	public void setDate_of_admission(String date_of_admission) {
		this.date_of_admission = date_of_admission;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	public String getStudent_phoneno() {
		return student_phoneno;
	}
	public void setStudent_phoneno(String student_phoneno) {
		this.student_phoneno = student_phoneno;
	}
	public String getParent_phoneno() {
		return parent_phoneno;
	}
	public void setParent_phoneno(String parent_phoneno) {
		this.parent_phoneno = parent_phoneno;
	}
	public String getEmail_parent() {
		return email_parent;
	}
	public void setEmail_parent(String email_parent) {
		this.email_parent = email_parent;
	}
    
}