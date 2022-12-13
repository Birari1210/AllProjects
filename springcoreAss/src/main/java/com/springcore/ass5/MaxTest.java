package com.springcore.ass5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MaxTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Maximum mobj = (Maximum) ctx.getBean("maxBean");
		
		mobj.show();
		mobj.maxNumber();
		
	}

}
