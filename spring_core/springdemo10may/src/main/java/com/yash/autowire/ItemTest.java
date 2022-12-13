package com.yash.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemTest {
 public static void main(String areg[])
 {
	 ApplicationContext objCtx= new ClassPathXmlApplicationContext("applicationContext.xml");
	 Item objItem = (Item) objCtx.getBean("i2");
	 objItem.printItem();
 }
}
