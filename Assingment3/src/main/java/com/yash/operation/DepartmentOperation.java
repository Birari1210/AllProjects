package com.yash.operation;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.dao.DepartmentDao;
import com.yash.model.Department;

public class DepartmentOperation {
	
	public static void main(String[] args) {
		
	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	DepartmentDao dobjdao = (DepartmentDao) ctx.getBean("depbeandao");
	Department depobj = new Department();
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Department id ");
	depobj.setDeptid(sc.nextInt());
	
	System.out.println("Enter Department name");
	depobj.setDname(sc.next());
	
	dobjdao.saveDepartment(depobj);

}
}