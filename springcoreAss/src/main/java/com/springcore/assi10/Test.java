package com.springcore.assi10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)
	{
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		Student obj= (Student) ctx.getBean("bean10");
		obj.show();
	}
}
