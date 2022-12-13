package com.yash.operation;

import java.sql.Date;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.dao.Employeedao;
import com.yash.model.Employee;

public class EmployeeOperation {

	public static void main(String[] args) {
	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employeedao empdao = (Employeedao) ctx.getBean("empDaobean");
		Employee emp = new Employee();
		System.out.println("hello");
		
	
		
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Employee ID");
		  emp.setEmpid(sc.nextInt());
		  
		  System.out.println("Enter Employee Name ");
		  emp.setEmpName(sc.next());
		  System.out.println("Enter Employee Address ");
		  emp.setEaddress(sc.next());
		  
		  System.out.println("Enter employee date of birth");
		  String s = sc.next();
		  Date date1 = Date.valueOf(s);
		  emp.setEdob(date1);
		  
		  System.out.println("Enter date of joining");
		  String s1 = sc.next();
		  Date dt = Date.valueOf(s1);
		  emp.setEdoj(dt);
		  
		  System.out.println("Enter date of leaving");
		  String s2 = sc.next();
		  Date date = Date.valueOf(s2);
		  emp.setEdol(date);
		  
		  
		  System.out.println("Enter Employee salary");
		  emp.setSalary(sc.nextDouble());
		  
		  System.out.println("Enter department id");
		  emp.setDeptid(sc.nextInt());
		
		  System.out.println("Enter Designation");
		  emp.setDesignation(sc.next());
		  
		  System.out.println("Enter irmid");
		  emp.setIrmid(sc.nextInt());
		  
		  System.out.println("Enter Project id");
		  emp.setProjectid(sc.nextInt());
		  
		  System.out.println("Enter projected name");
		  emp.setProjected(sc.next());
		  
		  System.out.println("Enter base location id ");
		  emp.setBaselocationid(sc.nextInt());
		  
		  empdao.saveEmp(emp);
	}

}
