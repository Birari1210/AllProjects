package com.yash.operation;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.dao.ProjectDao;
import com.yash.model.Project;

public class ProjectOperation {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ProjectDao pdaoobj = (ProjectDao) ctx.getBean("projectbeen");
		Project pobj = new Project();
		//System.out.println("hello project");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter project id");
		pobj.setProjectid(sc.nextInt());
		
		System.out.println("Enter project name");
		pobj.setProjectName(sc.next());
		
		System.out.println("Enter employee id");
		pobj.setEmpid(sc.nextInt());
		
		System.out.println("Enter project manager id");
	   pobj.setPmid(sc.nextInt());	
	   
	   pdaoobj.saveProject(pobj);
	}
}
