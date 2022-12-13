package com.training.exception.assingment;


public class ResultException extends Exception
 {

	private String failInOneSub;

	public String getFailInOneSub() {
		return failInOneSub;
	}

	public void setFailInOneSub(String failInOneSub) {
		this.failInOneSub = failInOneSub;
	}

	public ResultException(String failInOneSub) {
		this.failInOneSub = failInOneSub;
	}
	
	
	
	
	
	
	
	

}
