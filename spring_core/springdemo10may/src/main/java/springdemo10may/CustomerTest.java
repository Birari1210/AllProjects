package springdemo10may;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {
 public static void main(String s[])
 {
	 ApplicationContext objCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
	 Customer custobj =(Customer)objCtx.getBean("cust2");
	 custobj.showDetail();
 }
	
	
}
