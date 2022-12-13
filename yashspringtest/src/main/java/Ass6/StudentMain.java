package Ass6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ApplicationContext objAC= new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student1=(Student) objAC.getBean("studbean12");
		student1.show();

	}

}
