package com.training.demo;


class A{
	int i=10;
	void m1() {
		System.out.println("m1 method belong to A class ");
	}
}

class B extends A{
	int i=20;
	void m1() {
		System.out.println("m1 method belong to B class ");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		A a1= new B();
		System.out.println("print a class variable "+a1.i);
		a1.m1();
	}	
}
