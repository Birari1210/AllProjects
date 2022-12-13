package Assingment11OctObjectClass;

import java.util.Scanner;

public class Employee {
	
	private int employeeId;
	private String empName;
	private int Basic;
	int DA, IT, NetSalary,GrossSalary;
	
	
	public Employee(int employeeId, String empName, int basic) {
		super();
		this.employeeId = employeeId;
		this.empName = empName;
		this.Basic = basic;
		
	}
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getBasic() {
		return Basic;
	}
	public void setBasic(int basic) {
		Basic = basic;
	}
	public int getDA() {
		return DA;
	}
	public void setDA(int dA) {
		DA = dA;
	}
	public int getIT() {
		return IT; // ((30*GrossSalary)/100);

	}
	public void setIT(int iT)  {
		
		IT = iT;
	}
	public int getNetSalary() {
		return NetSalary= GrossSalary-IT ;
	}
	public void setNetSalary(int netSalary) {
		
		NetSalary = netSalary;
	}
	
	public int getGrossSalary() {
		return GrossSalary;
	}


	public void setGrossSalary(int grossSalary) {
		GrossSalary = grossSalary;
	}


	public void calculateSalary()
	{
		System.out.println("Employee Number - "+employeeId);
		System.out.println("Employee Name - "+empName);
		DA=((52*Basic)/100);
		System.out.println("Da in salary - "+DA);
		GrossSalary=Basic+DA;
		System.out.println("GrossSalary of Emp - "+GrossSalary);
		IT=((30*GrossSalary)/100);
		System.out.println("IT = "+IT);
		NetSalary=GrossSalary-IT;
		System.out.println("Net Salary of Employee - "+NetSalary);
	}

public static void main(String[] args) {
	
	
	Employee e = new Employee(11,"prasad",18000);

	e.calculateSalary();
	//System.out.println(e);
}

}
