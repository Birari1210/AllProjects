package com.training.exception.assingment;

public class EmployeeAbscondingException  extends Exception{
	
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public EmployeeAbscondingException(String message) {
		this.message = message;
	}
	
	
	
	
	
	

}
