package springproject;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import springproject.*;

public class StudentListTest {

public static void main(String[] args) {
		
		ApplicationContext objAClist = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentList studList = (StudentList) objAClist.getBean("StudbeanList");
		studList.showDetails();
	
}
}
