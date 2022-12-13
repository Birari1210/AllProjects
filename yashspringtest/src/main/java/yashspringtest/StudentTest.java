package yashspringtest;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
//1-Write down code in whic you will inject marks of student from other class and print the result in student class

public class StudentTest {

	public static void main(String[] args) {
		
		ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student stud = (Student) objAC.getBean("Studbean");
		stud.showDetails();
	}
}
