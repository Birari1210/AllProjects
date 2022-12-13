package springproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	public static void main(String[] string) {
		ApplicationContext ctxobj = new ClassPathXmlApplicationContext("applicationContext.xml");

		Student s1 = ctxobj.getBean("studbean1",Student.class);
		s1.show();
		
		Student s2 = ctxobj.getBean("studbean2",Student.class);
		s2.show();
	
		Student s3 = ctxobj.getBean("studbean3",Student.class);
		s3.show();
	}
}
