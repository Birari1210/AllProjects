package com.example.jdbc;

public class Employee {
	
	int eid;
	String ename;
	int salary;
	int deptid;
	String designation;
	String gender;
	
	
	public Employee(int eid, String ename, int salary, int deptid, String designation, String gender) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.deptid = deptid;
		this.designation = designation;
		this.gender = gender;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", deptid=" + deptid
				+ ", designation=" + designation + ", gender=" + gender + "]";
	}
	
	
	
	
	
	

}

