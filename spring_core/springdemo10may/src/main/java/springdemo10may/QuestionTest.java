package springdemo10may;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuestionTest {

	 
		public static void main(String s[])
		{
		ApplicationContext objCtx = new ClassPathXmlApplicationContext("applicationContext.xml");	
		Question objI = (Question) objCtx.getBean("quebean");
		
		objI.showQueAnswer();
		}
}
