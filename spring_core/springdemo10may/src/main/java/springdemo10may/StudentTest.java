package springdemo10may;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
  public static void main(String s[])
  {
	  ApplicationContext ctxobj = new ClassPathXmlApplicationContext("applicationContext.xml");
	  Student objSt = ctxobj.getBean("stubean",Student.class);
	  System.out.println("values when we have only set roll no as below");
	  objSt.show();
	  // now loading object with string parameter
	  Student objSt2 = ctxobj.getBean("stubean2",Student.class);
	  System.out.println("values when we have only set name as below");
	  objSt2.show();
	  // now loading object with two parameter constructor 
	  Student objSt3 = ctxobj.getBean("stubean3",Student.class);
	  System.out.println("values when we have only set roll no and name as below");
	  objSt3.show();
  }
}