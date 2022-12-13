package com.training.exception.assingment;

public class ItemPurchaseLimitExceed  extends Exception
{
     private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ItemPurchaseLimitExceed(String message) {
		super();
		this.message = message;
	}
	
     
     
  
  
}
