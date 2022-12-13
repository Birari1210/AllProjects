package com.springcore.ass15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	   Customer cobj = (Customer) ctx.getBean("costem");
	   
	   cobj.display();
	}

}
