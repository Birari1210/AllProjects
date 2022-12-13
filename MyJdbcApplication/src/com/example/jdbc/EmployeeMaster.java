package com.example.jdbc;

public class EmployeeMaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(8, "nilesh patil", 2200, 16,"devloper","male");
		try {
			
			//EmployeeDao.insetEmployee(e);
		//	EmployeeDao.UpdateEmployee(e);
		   // EmployeeDao.getAllEmployee();
			//System.out.println(EmployeeDao.getAllEmployee());
			//System.out.println(EmployeeDao.getEmployeeById(1));
			
			//System.out.println(EmployeeDao.getEmployeeByName("nilesh"));
			//EmployeeDao.deleteEmp(7);
		//	EmployeeDao.getEmployeeByDepartment("manager").stream().forEach(System.out::println);
			
			//EmployeeDao.getEmployeeByDepartment("sales").stream().forEach(System.out::println);           // not done
			
			EmployeeDao.deleteEmployee(8);
			
		
		} catch (Exception e2) {
			
		}
		

	}
}
