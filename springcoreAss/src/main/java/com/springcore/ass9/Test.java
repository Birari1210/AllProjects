package com.springcore.ass9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        City obj = (City) ctx.getBean("Citybean");
        City obj1 = (City) ctx.getBean("Citybean1");
        obj.display();;
        obj1.display();
	}
}
