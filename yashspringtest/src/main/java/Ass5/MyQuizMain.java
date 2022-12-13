package Ass5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyQuizMain {

	public static void main(String[] args) {

		ApplicationContext objAC =new  ClassPathXmlApplicationContext("applicationContext.xml");
		MyQuiz quiz= (MyQuiz) objAC.getBean("quizbean");
		quiz.showquizdetails();
		quiz.show_questionDetails();
		
		MyQuiz quiz1= (MyQuiz) objAC.getBean("quizbean1");
		quiz1.show_questionDetails();
		
		MyQuiz quiz2= (MyQuiz) objAC.getBean("quizbean2");
		quiz2.show_questionDetails();
		
		
		
	}

}
