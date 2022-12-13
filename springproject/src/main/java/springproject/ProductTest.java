package springproject;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductTest {

	public static void main(String[] args) {
    
		ApplicationContext objCnt = new ClassPathXmlApplicationContext("applicationContext.xml");
		Product p = (Product) objCnt.getBean("productbean");
		p.display();
	}
}
