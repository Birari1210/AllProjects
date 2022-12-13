package com.springcore.ass2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class AvgTest {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	    Average obj = (Average) ctx.getBean("avgBean");
	    obj.avgNumber();
	    
	}

}
