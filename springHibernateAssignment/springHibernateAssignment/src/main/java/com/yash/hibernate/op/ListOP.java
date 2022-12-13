package com.yash.hibernate.op;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.hibernate.dao.EmployeeDAO;
import com.yash.hibernate.model.Employee;
import com.yash.hibernate.model.Irm;
import com.yash.hibernate.model.Project;

public class ListOP {

	public static void main(String[] args) {
		
		ApplicationContext objCTX =
				new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		EmployeeDAO edao =(EmployeeDAO)objCTX.getBean("empDao");
		
		System.out.println("====Irm Details====");
		List<Irm> irmlist =  edao.getdAllIrm(); 
		for(Irm i:irmlist) {
			
			System.out.println(i.getIrmid()+ "\t" +i.getIrmname());
			//System.out.println(i.getIrmname());
			//System.out.println(i.getObjEmp().get(1111));
		}
		
		System.out.println("====Employee name with Irm name====");
		List<Employee> emplist = edao.getEmployeeAndIrmName();
		for(Employee e:emplist) {
			System.out.println(e.getEmpname()+" : "+e.getIrm().getIrmname());

			System.out.println("====Project Datails With Employee name====");

			System.out.println(e.getEmpname()+" : "+e.getProject().getProjectid()+" : "+e.getProject().getProjectname() );
		}
		
		
//		System.out.println("====PROJECT DETAILS with EMPLOYEE name====");
//		List<Project> prolist = edao.getProjrctDetailWithEmployee();
//		for(Project p:prolist){
//			System.out.println(p.getProjectid()+" "+p.getProjectname()+" "+p.getEmployee());
//		}
	}
}
