package com.training.exception.assingment;
//bank assingment
public class InvalidBalanceException extends Exception{
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public InvalidBalanceException(String message) {
		this.message = message;
	}
	
	
	

}
