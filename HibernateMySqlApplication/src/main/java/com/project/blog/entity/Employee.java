package com.project.blog.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	int eid;
	
	@Column(name="ename")
	String ename;
	@Column(name="age")
	int age;
	@Column(name="salary")
	int salary;
	@Column(name="designation")
	String designation;
	
	
	public Employee() {}
	
	public Employee(int eid, String ename, int age, int salary, String designation) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.age = age;
		this.salary = salary;
		this.designation = designation;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", age=" + age + ", salary=" + salary + ", designation="
				+ designation + "]";
	}
	
	
	
	
	

}
