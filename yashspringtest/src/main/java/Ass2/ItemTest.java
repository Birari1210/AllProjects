package Ass2;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//2-Write down code to implement dependency injection, create class item, category and company,
//category and company class will be injected in item class then print all detail of item, like name, price,
//category , company , discount, also print the price after discount

public class ItemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationContext.xml");
		Item itemobj = (Item) objAC.getBean("MyItembean");
		itemobj.Details();
	}
	
}
