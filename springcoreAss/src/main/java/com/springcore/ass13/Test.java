package com.springcore.ass13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	Collect obj=(Collect) ctx.getBean("ticketBean13");
	obj.show();
}
}