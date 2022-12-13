package com.training.exception.assingment;

public class AgeInvalidException  extends Exception{

	private String message;
	
	public AgeInvalidException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
   
	
	
	
}
