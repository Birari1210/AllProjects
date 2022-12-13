package com.springcore.ass1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClassTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Myclass obj = (Myclass) ctx.getBean("Assbean");
		obj.display();
	}
}
