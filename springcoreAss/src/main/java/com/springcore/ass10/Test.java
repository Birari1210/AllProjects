package com.springcore.ass10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student stObj = (Student) ctx.getBean("bean10");

		stObj.getStud();

	}

}
