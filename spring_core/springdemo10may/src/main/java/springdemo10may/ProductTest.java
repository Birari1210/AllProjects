package springdemo10may;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductTest {
 public static void main(String arg[])
 {
	 ApplicationContext objCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
	 Product pobj = (Product)objCtx.getBean("prodbean");
	 
	 System.out.println(pobj.getPid());
	 System.out.println(pobj.getPname());
	 System.out.println(pobj.getPrice());
	 pobj.printCategory();
 }
}
