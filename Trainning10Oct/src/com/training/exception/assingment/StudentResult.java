package com.training.exception.assingment;

public class StudentResult {
	
	static int math;
	static int english;
	static int science;
	static int hindi;
	static int history;
	
	
	
	
	public StudentResult(int math, int english, int science, int hindi, int history) {
		super();
		this.math = math;
		this.english = english;
		this.science = science;
		this.hindi = hindi;
		this.history = history;
	}
	
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
		
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getHindi() {
		return hindi;
	}
	public void setHindi(int hindi) {
		this.hindi = hindi;
	}
	public int getHistory() {
		return history;
	}
	public void setHistory(int history) {
		this.history = history;
	}
	
	public static void result()
	{
		int total = math+science+hindi+english+history;
	}
	
	

}
