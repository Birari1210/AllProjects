package Ass5;

import java.util.Iterator;

import java.util.Scanner;

public class MyQuiz {
	
	String quizSubject;
	Questions questions;

	public String getQuizSubject() {
		return quizSubject;
	}
	public void setQuizSubject(String quizSubject) {
		this.quizSubject = quizSubject;
	}
	public Questions getQuestion() {
		return questions;
	}
	public void setQuestion(Questions questions) {
		this.questions = questions;
	}	
	void show_questionDetails() {
		int i = 1;
		System.out.println (questions.question);// print Que
		Iterator<String> itr = questions.answer.iterator();
		while (itr.hasNext()) {
			System.out.print(i+"."+itr.next()+"  ");
			i++;
		}
		System.out.println("\n enter answer");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if (str.equals(questions.getWriteAnswer())) {
			System.out.println("your answer is correct ");
		}
		else
			System.out.println("your answer is wrong");
		
	}
	void showquizdetails() {
		
		System.out.println("quiz subject is: " +quizSubject);
	}
	
}
