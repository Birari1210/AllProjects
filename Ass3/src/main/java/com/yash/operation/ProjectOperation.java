package com.yash.operation;

import java.util.List;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.dao.ProjectDao;
import com.yash.model.Employee;
import com.yash.model.Irm;
import com.yash.model.Project;

public class ProjectOperation {
	
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ProjectDao pdaoobj = (ProjectDao) ctx.getBean("projectbeen");
		Project pobj = new Project();
		//System.out.println("hello project");
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter project id");
//		pobj.setProjectid(sc.nextInt());
//		
//		System.out.println("Enter project name");
//		pobj.setProjectName(sc.next());
//		
//		System.out.println("Enter employee id");
//		pobj.setEmpid(sc.nextInt());
//		
//		System.out.println("Enter project manager id");
//	   pobj.setPmid(sc.nextInt());	
	   
	   //pdaoobj.saveProject(pobj);
		
		//pdaoobj.getDepartmentWithAvgSalary();
		
	  // pdaoobj.getProjectNameWithEmployee();
	  // pdaoobj.MaxSalaryWithbaselocation();
		
		

//		System.out.println("----3--Irm Details----------");
//		List<Irm> irmlist =  pdaoobj.getdAllIrm(); 
//		for(Irm i:irmlist) {
//			
//			System.out.println(i.getIrmid()+ "\t" +i.getIrmname());
//			
//		}
//		
		
	//	--------
	
//		pdaoobj.MaxSalarywithProject();
//		pdaoobj.MinSalarywithProject();

		
//		pdaoobj.MinSalarywithbaselocation();
		

		System.out.println("----------11--Project Datails With Employee name------------");
		List<Employee> emplist1 = pdaoobj.getEmployeeAndIrmName();
		for(Employee e:emplist1) {

		System.out.println("Employee Name - "+e.getEmpName()+"  "+"Project Id"+e.getProject().getProjectid()+"  "+"Project Name -"+e.getProject().getProjectName());
		}
		
		List<Employee> emplist = pdaoobj.getEmployeeAndIrmName();
		for(Employee e:emplist) {
			System.out.println("---12---Employee name with Irm name------------------");

			System.out.println("Employee Name :-"+e.getEmpName()+" : "+"IrmId :- "+e.getIrmid());

		}
	
   }
}
