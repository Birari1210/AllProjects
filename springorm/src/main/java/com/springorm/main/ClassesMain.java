package com.springorm.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.ClassesDao;
import com.springorm.model.Classes;

public class ClassesMain {

	public static void main(String[] args) {

		  ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
		  ClassesDao cdaoObj =  (ClassesDao) ctx.getBean("calssBean");
		  
		  
		  Classes cobj = new Classes();
		  
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Enter class ID");
		  cobj.setClassId(sc.nextInt());
		  
		  System.out.println("Enter Class Name");
		  cobj.setClassName(sc.next());
		  
		  System.out.println("Enter Section Name");
		  cobj.setSection(sc.next());
		  
		  System.out.println("Student added in table count="+cdaoObj.addClassData(cobj));
	  
						  
	}
}
