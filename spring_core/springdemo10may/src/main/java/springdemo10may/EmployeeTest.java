package springdemo10may;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
 public static void main(String s[])
 {
	 ApplicationContext objCtx= new ClassPathXmlApplicationContext("applicationContext.xml");
	 
	 Employee emp = (Employee) objCtx.getBean("empbean");
	 emp.showEmpDetail();
 }
}
