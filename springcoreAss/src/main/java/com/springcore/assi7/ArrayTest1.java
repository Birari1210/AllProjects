package com.springcore.assi7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArrayTest1 {
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
   
	Array1 aobj = (Array1) ctx.getBean("arrayBean");

	
}
