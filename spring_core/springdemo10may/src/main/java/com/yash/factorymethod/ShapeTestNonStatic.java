package com.yash.factorymethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeTestNonStatic {
 public static void main(String args[])
 {
	 ApplicationContext objCTX = new ClassPathXmlApplicationContext("applicationContext.xml");
	 Shape objShapeNS = (Shape) objCTX.getBean("shape2");
	 objShapeNS.area(12);
 }
}
