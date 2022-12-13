package com.springcore.ass8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Item obj = (Item) ctx.getBean("itembean8");
		obj.showItem();
		obj.decendingOrder();
		obj.removeDuplicateItem();
	}
}
