package Ass5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class QuequizTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationContext.xml");	
		Que objque = (Que) objAC.getBean("quebean");
		objque.showAnswer();

	}

}
