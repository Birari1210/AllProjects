package com.springcore.Asss1;

public class Employee {
	
	String empName;
	//String Address;
	
	 public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

//    public String getAddress() {
//		return Address;
//	}
//
//	public void setAddress(String address) {
//		Address = address;
//	}

	public  void  info() {
		 
		 System.out.println("Employee Name is "+empName);
		// System.out.println("Employee Address "+Address);
		
	}
}
