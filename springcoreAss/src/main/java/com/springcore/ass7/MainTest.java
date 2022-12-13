package com.springcore.ass7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) 
	{
			ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
			Class1 obj= (Class1) ctx.getBean("beanmerge1");
			obj.merge();
	}

}
//public static void main(String[] args)
//{
//	ApplicationContext objctx= new ClassPathXmlApplicationContext("applicationContext.xml");
//	Class1 obj= (Class1) objctx.getBean("class1bean");
//	obj.merge_array();
//}