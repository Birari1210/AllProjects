package com.yash.operation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.dao.IrmDao;

public class IrmOpration {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	   IrmDao irmdao = (IrmDao) ctx.getBean("irmbeen"); 
	   System.out.println("irmdemo");
		
	}

}
