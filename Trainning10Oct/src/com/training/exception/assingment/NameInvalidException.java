package com.training.exception.assingment;

public class NameInvalidException extends Exception 
{
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public NameInvalidException(String message) {
		this.message = message;
	}
}
