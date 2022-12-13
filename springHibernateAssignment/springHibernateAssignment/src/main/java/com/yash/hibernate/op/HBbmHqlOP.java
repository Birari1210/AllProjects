package com.yash.hibernate.op;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.hibernate.dao.HbmHqlDAO;
import com.yash.hibernate.model.Employee;

public class HBbmHqlOP {
	
	public static void main(String[] args) {
		
		ApplicationContext objCTX = new 
				ClassPathXmlApplicationContext("applicationcontext.xml");
		
		HbmHqlDAO objhql = (HbmHqlDAO) objCTX.getBean("hqlDao");
//		Employee objemp = new Employee();
//		
//		System.out.println(objemp.getPbjBLoc().getBlocname());
		objhql.MaxSalaryWithbaselocation();
		
		objhql.MinSalarywithbaselocation();
		
		objhql.MinSalarywithProject();
		
		objhql.MaxSalarywithProject();
		
//		objhql.getDeprtmentWithAvg();
		
		objhql.getDepartmentWithAvgSalary();
	
		objhql.getProjectNameWithEmployee();
	}

}
