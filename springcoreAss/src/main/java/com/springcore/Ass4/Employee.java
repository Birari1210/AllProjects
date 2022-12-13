package com.springcore.Ass4;

//WAP to perform demonstrate autowire. Use Two classes, first class Employee, 
//second department now store all employee and department details. 
//Print employee details in order by employee salary .

public class Employee {
	int eID;
	String eName;
	int salary;
	String address;
	Department department;
	

//	
//	public Employee(int eID, String eName, int salary, String address, Department department) {
//		super();
//		this.eID = eID;
//		this.eName = eName;
//		this.salary = salary;
//		this.address = address;
//		this.department = department;
//	}

	public void Empdeteils()
	{
		System.out.println("Employee Id "+eID);
		System.out.println("Employee Name "+eName);
		System.out.println("Employee Salary "+salary);
		System.out.println("Employee Address "+address);
		System.out.println("Employee department "+department);
	}
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	public int geteID() {
		return eID;
	}


	public void seteID(int eID) {
		this.eID = eID;
	}


	public String geteName() {
		return eName;
	}


	public void seteName(String eName) {
		this.eName = eName;
	}


	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
}
