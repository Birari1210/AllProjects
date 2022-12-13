package com.demotest.jdbc;

public class Student {
	
	int sid;
	String sname;
	int marks;
	int classId;
	String sub;
	String gender;
	
	
	
	public Student(int sid, String sname, int marks, int classId, String sub, String gender) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
		this.classId = classId;
		this.sub = sub;
		this.gender = gender;
	}
	
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	

}
