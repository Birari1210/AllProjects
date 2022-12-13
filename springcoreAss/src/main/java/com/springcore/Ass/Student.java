package com.springcore.Ass;

public class Student {
	
	private  Details  detail;

	public Details getDetail() {
		return detail;
	}

	public void setDetail(Details detail) {
		this.detail = detail;
	}
	
	public void printStudentInfo(String name)
	{
		
		getDetail().printStudentInfo(name);
	}

}
