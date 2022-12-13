package com.yash.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//Employee :- empid , empname , eaddress , edob , edoj , edol(date of leaving) , salary, 
//deptid , designation, IRMId, projected, baselocationid
@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int empid;
	String empName;
	String eaddress;
	Date edob;
	Date edoj;
	Date edol;
	double salary;
	int deptid;
	String designation;
	int irmid;
	int projectid;
	String projected;
	int baselocationid;
	

	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public Date getEdob() {
		return edob;
	}
	public void setEdob(Date edob) {
		this.edob = edob;
	}
	public Date getEdoj() {
		return edoj;
	}
	public void setEdoj(Date edoj) {
		this.edoj = edoj;
	}
	public Date getEdol() {
		return edol;
	}
	public void setEdol(Date edol) {
		this.edol = edol;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
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
	public int getIrmid() {
		return irmid;
	}
	public void setIrmid(int irmid) {
		this.irmid = irmid;
	}
	
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	public String getProjected() {
		return projected;
	}
	public void setProjected(String projected) {
		this.projected = projected;
	}
	public int getBaselocationid() {
		return baselocationid;
	}
	public void setBaselocationid(int baselocationid) {
		this.baselocationid = baselocationid;
	}
	
	
	
	
	
	
	

}
