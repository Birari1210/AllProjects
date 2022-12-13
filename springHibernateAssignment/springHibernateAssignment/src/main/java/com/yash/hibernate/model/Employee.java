package com.yash.hibernate.model;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
public class Employee {


    @Id
	private int empid;
	private String empname;
	private String address;
	private String edob;
	private String edoj;
	private String edol;
	private float salary;
	private String  designation;

    @ManyToOne(cascade = CascadeType.ALL)  
    @JoinColumn(name = "dept_id")
    private Department department;
    
    @ManyToOne(cascade = CascadeType.ALL)  
    @JoinColumn(name = "irm_id")
	private Irm irm;
    
    @ManyToOne(cascade = CascadeType.ALL) 
    @JoinColumn(name = "pro_id")
	private Project project;
    
    @ManyToOne(cascade = CascadeType.ALL) 
    @JoinColumn(name = "base_id")
	private BaseLocation baselocation;
    
	
	
	public Employee() {
	
	}



	public int getEmpid() {
		return empid;
	}



	public void setEmpid(int empid) {
		this.empid = empid;
	}



	public String getEmpname() {
		return empname;
	}



	public void setEmpname(String empname) {
		this.empname = empname;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getEdob() {
		return edob;
	}



	public void setEdob(String edob) {
		this.edob = edob;
	}



	public String getEdoj() {
		return edoj;
	}



	public void setEdoj(String edoj) {
		this.edoj = edoj;
	}



	public String getEdol() {
		return edol;
	}



	public void setEdol(String edol) {
		this.edol = edol;
	}



	public float getSalary() {
		return salary;
	}



	public void setSalary(float salary) {
		this.salary = salary;
	}



	public String getDesignation() {
		return designation;
	}



	public void setDesignation(String designation) {
		this.designation = designation;
	}



	public Department getDepartment() {
		return department;
	}



	public void setDepartment(Department department) {
		this.department = department;
	}



	public Irm getIrm() {
		return irm;
	}



	public void setIrm(Irm irm) {
		this.irm = irm;
	}



	public Project getProject() {
		return project;
	}



	public void setProject(Project project) {
		this.project = project;
	}



	public BaseLocation getBaselocation() {
		return baselocation;
	}



	public void setBaselocation(BaseLocation baselocation) {
		this.baselocation = baselocation;
	}



	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", address=" + address + ", edob=" + edob
				+ ", edoj=" + edoj + ", edol=" + edol + ", salary=" + salary + ", designation=" + designation + "]";
	}



     
	
}
