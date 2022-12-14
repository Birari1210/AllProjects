package com.yash.assingment.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

//Student_test_attempt:- staid, studentid, qid, marked_answer. 

@Entity
public class Student_test_attempt {

	@Id
	int staid;
	int studentid;
	int qid;
	String marked_answer;
	
	@ManyToOne
	Student student; // studnt map che paha //done
	
	@ManyToOne
	Test_question test_question; //object
	


	
    public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Test_question getTest_question() {
		return test_question;
	}
	public void setTest_question(Test_question test_question) {
		this.test_question = test_question;
	}
	
   int getStaid() {
		return staid;
	}
	public void setStaid(int staid) {
		this.staid = staid;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getMarked_answer() {
		return marked_answer;
	}
	public void setMarked_answer(String marked_answer) {
		this.marked_answer = marked_answer;
	}
	
	
//	public List<Student_test_attempt> getListOfTestAttemp() {
//		return st;
//	}
	
	
	
	
	
	
}
