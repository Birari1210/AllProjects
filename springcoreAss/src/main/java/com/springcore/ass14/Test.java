package com.springcore.ass14;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Shape obj1 = (Shape)ctx.getBean("circleBean");
		Shape obj2 = (Shape)ctx.getBean("squreBean");
		Shape obj3 = (Shape)ctx.getBean("rectBean");
		
		System.out.println("Circle-----");
        System.out.println("Area of Circle :-"+obj1.Area());
		System.out.println("Side of Circle :-"+obj1.Sides());
		
		System.out.println("For Squre-----");
        System.out.println("Area of Squre :-"+obj2.Area());
		
		System.out.println("Rectangle-----");
        System.out.println("Area of Rectangle :-"+obj3.Area());
		System.out.println("Side of Rectangle :-"+obj3.Sides());
	}

}
