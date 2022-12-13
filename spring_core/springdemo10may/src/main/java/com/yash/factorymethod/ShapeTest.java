package com.yash.factorymethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeTest {

	public static void main(String[] args) {
		 ApplicationContext objCTX = new ClassPathXmlApplicationContext("applicationContext.xml");
		 Shape objS = (Shape) objCTX.getBean("sfsobj");
		 objS.area(10);
	}

}
