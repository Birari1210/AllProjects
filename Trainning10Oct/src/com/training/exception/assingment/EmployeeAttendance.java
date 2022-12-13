package com.training.exception.assingment;

public class EmployeeAttendance {

	
	int presentDay;
	int leave;
	int absent;
	int noInfo;
	int salary;
	
	public EmployeeAttendance(int presentDay, int leave, int absent, int noInfo, int salary) {
		super();
		this.presentDay = presentDay;
		this.leave = leave;
		this.absent = absent;
		this.noInfo = noInfo;
		this.salary = salary;
	}
    
	public int calculateAttendance() throws EmployeeAbscondingException
	{
		if(noInfo>4)
		{
		
			throw new EmployeeAbscondingException("Employee no information days is greter than 4 days");
		}
		else if(leave>2)
		{
			throw new EmployeeAbscondingException("Employee can not absent more than two days");
		}
		else
		{
			int perday = salary/30;
			int pr=perday*presentDay;
			return pr;
		}
	}
	
	

	public static void main(String[] args) {
	
		EmployeeAttendance e = new EmployeeAttendance(30, 1, 5, 3,23500);
		
		try {
		int pr1=	e.calculateAttendance();
		System.out.println("Total Salary "+pr1);
		} catch (EmployeeAbscondingException e1) {
			System.out.println(e1.getMessage());
			e1.printStackTrace();
		}
	}

}
