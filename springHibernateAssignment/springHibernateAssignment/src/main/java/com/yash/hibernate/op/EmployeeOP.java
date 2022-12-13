package com.yash.hibernate.op;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.hibernate.dao.EmployeeDAO;
import com.yash.hibernate.model.BaseLocation;
import com.yash.hibernate.model.Department;
import com.yash.hibernate.model.Employee;
import com.yash.hibernate.model.Irm;
import com.yash.hibernate.model.Project;

public class EmployeeOP {

	public static void main(String[] args) {
		
		ApplicationContext objCTX =
				new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		EmployeeDAO edao =(EmployeeDAO)objCTX.getBean("empDao");
		
		
		
		Irm iobj = new Irm();
		iobj.setIrmid(201);
		iobj.setIrmname("Vaibhav singh");
		
		Irm iobj2 = new Irm();
		iobj2.setIrmid(202);
		iobj2.setIrmname("Rajesh Shinde");
		
		Irm iobj3 = new Irm();
		iobj3.setIrmid(203);
		iobj3.setIrmname("Rushikesh madke");
		
		
		
		Department dobj = new Department();
		dobj.setDeptid(301);
		dobj.setDeptname("Testing");
 
		Department dobj2 = new Department();
		dobj2.setDeptid(302);
		dobj2.setDeptname("Devlopment");

		Department dobj3 = new Department();
		dobj3.setDeptid(303);
		dobj3.setDeptname("marketing");

		
		Project pobj = new Project();
		pobj.setProjectid(401);
		pobj.setProjectname("testcode");
		
		Project pobj2 = new Project();
		pobj2.setProjectid(402);
		pobj2.setProjectname("devlopment of code");
		
		Project pobj3 = new Project();
		pobj3.setProjectid(403);
		pobj3.setProjectname("Socail media marketing");
	
		
		BaseLocation blobj = new BaseLocation();
		blobj.setBlocid(1);
		blobj.setBlocname("Pune- wagoli");
		
		BaseLocation blobj2 = new BaseLocation();
		blobj2.setBlocid(2);
		blobj2.setBlocname("Pune- Hinjewadi-3");
		
		BaseLocation blobj3 = new BaseLocation();
		blobj3.setBlocid(3);
		blobj3.setBlocname("indor");
		
		Employee eobj = new Employee();
		eobj.setEmpid(1018);
		eobj.setEmpname("Akash Pawar");
		eobj.setAddress(" Hidrabad ");
		eobj.setEdob("29-09-1991");
		eobj.setEdoj("20-02-2012");
		eobj.setEdol("15-07-2020");
		eobj.setSalary(25000);
		eobj.setDesignation("Devloper");
		eobj.setDepartment(dobj2);
		eobj.setIrm(iobj2);
		eobj.setProject(pobj2);
		eobj.setBaselocation(blobj2);
		
		Employee eobj2 = new Employee();
		eobj2.setEmpid(1017);
		eobj2.setEmpname("Sakshi pawar");
		eobj2.setAddress(" Karnatak ");
		eobj2.setEdob("22-10-1994");
		eobj2.setEdoj("21-06-2015");
		eobj2.setEdol(null);
		eobj2.setSalary(55000);
		eobj2.setDesignation("Devloper");
		eobj2.setDepartment(dobj2);
		eobj2.setIrm(iobj2);
		eobj2.setProject(pobj2);
		eobj2.setBaselocation(blobj2);
		
		Employee eobj3 = new Employee();
		eobj3.setEmpid(1016);
		eobj3.setEmpname("Ganesh Kale");
		eobj3.setAddress(" Bidkin Wagholi");
		eobj3.setEdob("12-02-2001");
		eobj3.setEdoj("25-03-2021");
		eobj3.setEdol(null);
		eobj3.setSalary(35000);
		eobj3.setDesignation("Devloper");
		eobj3.setDepartment(dobj2);
		eobj3.setIrm(iobj2);
		eobj3.setProject(pobj2);
		eobj3.setBaselocation(blobj2);
		
		
		edao.save(eobj, iobj2, dobj2, pobj2, blobj2);
		
	
	}
	
	        
	
}
