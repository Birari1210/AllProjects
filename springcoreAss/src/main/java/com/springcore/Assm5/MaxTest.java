package com.springcore.Assm5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MaxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx1 = new ClassPathXmlApplicationContext("applicationContext.xml");
		 Maximum obj = (Maximum) ctx1.getBean("maxbean");
		 obj.Max();
	}
}
