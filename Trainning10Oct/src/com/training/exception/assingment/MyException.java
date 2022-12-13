package com.training.exception.assingment;

public class MyException  extends Exception{
	
//	String s;
//
//	public String getS() {
//		return s;
//	}
//
//	public void setS(String s) {
//		this.s = s;
//	}
//
//	public MyException(String s) {
//		super();
//		this.s = s;
//	}
	
	public MyException() {
		super("are you under age !");
	}
	
	MyException(String message){
		super(message);
	}
	
}
