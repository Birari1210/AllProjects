package com.springcore.Ass4;

//4. WAP to perform demonstrate autowire. Use Two classes, first class Employee, second 
//department now store all employee and department details. Print employee details in order 
//by employee salary 
public class Department {
	
	String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {

	}

	public Department(String departmentName) {
		super();
		this.departmentName = departmentName;
	}


}
