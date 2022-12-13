package Autowire;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BillTest {

	public static void main(String[] args) {

		ApplicationContext objAC= new ClassPathXmlApplicationContext("applicationContext.xml");
		 Bill objB = (Bill) objAC.getBean("billBean");
		 objB.billDetails();
	}

}
      