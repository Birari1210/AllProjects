package com.yash.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
  public static void main(String arg[])
  {
	 ApplicationContext objCtx = new ClassPathXmlApplicationContext("applicationContext.xml"); 
	 Student objSt = (Student) objCtx.getBean("stobj");
	 objSt.studentDetail();
  }
}
