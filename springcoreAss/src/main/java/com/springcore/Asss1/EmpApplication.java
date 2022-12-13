package com.springcore.Asss1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class EmpApplication {

	public static void main(String[] args) {

		 BeanFactory factory = new XmlBeanFactory(new FileSystemResource("applicationContext.xml"));
		 
		 Employee emp = (Employee) factory.getBean("employ");
		 emp.info();
	
	}

}
