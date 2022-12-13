package com.yash.factorymethod;

public class A {
 private A()
 {
	 System.out.println("constructor of A is called");
 }
 public static A getObjA()
 {	 
	 return new A();
 }
 public void show()
 {
	 System.out.println("hello from show method");	 		
 }
}