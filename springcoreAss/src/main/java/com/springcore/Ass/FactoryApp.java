package com.springcore.Ass;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryApp {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("aplicationContext.xml");
  
		Student stud = context.getBean("Student",Student.class);
		
		stud.printStudentInfo("prasad");
	
		context.close();
	}

}
