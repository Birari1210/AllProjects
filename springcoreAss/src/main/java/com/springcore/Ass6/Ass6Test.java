package com.springcore.Ass6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//6. WAP to inject multiple names to a beans and break the names in to array of string and find
//out the string which is having no vowel in it
public class Ass6Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		StringAss6 obj = (StringAss6) ctx.getBean("beanass6");
		obj.vowels();
	}
}
