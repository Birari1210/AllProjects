package springdemo10may;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestItem {
public static void main(String s[])
	{
	ApplicationContext objCtx = new ClassPathXmlApplicationContext("applicationContext.xml");	
	Item objI = (Item) objCtx.getBean("itembean");
	
	objI.show();
	}
}