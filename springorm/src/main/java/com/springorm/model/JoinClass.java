package com.springorm.model;


// classid | sectionname | sid | sname   | math | hindi | english | science | Sanskrit
public class JoinClass {
	
	int classid;
	String sectioname;
	String className;
	int sid;
	String name;
	int math;
	int hindi;
	int english;
	int science;
	int Sanskrit;
	
	
//	select result.sid,student.classid,result.math,result.english ,result.hindi,result.science,result.Sanskrit,class1.sectionName ,class1.className from result JOIN student on student.sid=result.sid join class1 on class1.classid=student.classid;
	
	
	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}
	public String getSectioname() {
		return sectioname;
	}
	public void setSectioname(String sectioname) {
		this.sectioname = sectioname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
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
		return Sanskrit;
	}
	public void setSanskrit(int sanskrit) {
		Sanskrit = sanskrit;
	}
	
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
}
