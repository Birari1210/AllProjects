package Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Ass 4-write down code to implement the autowiring, perform autowiring for bill class in which 
//item and customer detail will be injected. Use by type autowiring

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext objAC =new  ClassPathXmlApplicationContext("applicationContext.xml");
		Employee empObj = (Employee) objAC.getBean("EmpBean");
		empObj.EmployeeDetails();
	}
}
