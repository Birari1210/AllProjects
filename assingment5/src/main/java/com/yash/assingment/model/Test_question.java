package com.yash.assingment.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;

//ok done
//Test_questions : qid, testid, question, answer1, answer2, answer3, answer4, correctanswer,
@Entity
public class Test_question {
	@Id
	int qid;
	int testid;
	String question;
	String answer1;
	String answer2;
	String answer3;
	String answer4;
	String correctanswer;
	
	@ManyToOne
	Test test;
	
	@OneToMany(mappedBy = "test_question")
	
	List<Student_test_attempt> staaAttempts;
	
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
	
//	public Test getTest() {
//		return test;
//	}
//	public void setTest(Test test) {
//		this.test = test;
//	}
	
	
	public List<Student_test_attempt> getStaaAttempts() {
		return staaAttempts;
	}
	
	public void setStaaAttempts(List<Student_test_attempt> staaAttempts) {
		this.staaAttempts = staaAttempts;
	}
	
	
	
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public int getTestid() {
		return testid;
	}
	public void setTestid(int testid) {
		this.testid = testid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer1() {
		return answer1;
	}
	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}
	public String getAnswer2() {
		return answer2;
	}
	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}
	public String getAnswer3() {
		return answer3;
	}
	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}
	public String getAnswer4() {
		return answer4;
	}
	public void setAnswer4(String answer4) {
		this.answer4 = answer4;
	}
	public String getCorrectanswer() {
		return correctanswer;
	}
	public void setCorrectanswer(String correctanswer) {
		this.correctanswer = correctanswer;
	}
	
	
}
