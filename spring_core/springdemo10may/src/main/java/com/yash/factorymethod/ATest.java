package com.yash.factorymethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ATest {

	public static void main(String[] args) {
		 ApplicationContext objCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
		A obj=(A) objCtx.getBean("obja");
		obj.show();

	}

}
