package com.springcore.ass12;

public  class Department {
	
	int deptId;
	String deptName;
	
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
	public void showDept()
	{
		System.out.println("Dept Id : "+deptId);
		System.out.println("Dept Name : "+deptName);
	}

}