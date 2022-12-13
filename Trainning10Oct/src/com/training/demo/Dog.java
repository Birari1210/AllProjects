package com.training.demo;

public interface Dog {
	
	public  void bark();
	
	public void eat();
	
	default void  sleep() {
		System.out.println("done");
	}

}
