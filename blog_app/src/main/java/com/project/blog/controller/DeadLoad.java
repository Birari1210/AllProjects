package com.project.blog.controller;

public class DeadLoad
{
public static void main(String[] args) 
{
	Thread1 t1= new Thread1();
	Thread2 t2= new Thread2();
	
	t1.start();
	t2.start();
}
}

class Class1//t1
{
	public synchronized static void class1m1()
	{
		System.out.println("class1 m1");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		Class2.class2m2();
	}//lock done
	public synchronized  static void class1m2()//
	{
		System.out.println(5+12);
	}
}
class Class2//t2
{
	public synchronized static void class2m1()
	{
		System.out.println("class2");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e)
		{
			
			e.printStackTrace();
		}
		Class1.class1m2();
	}
	public  synchronized  static void class2m2()
	{
		System.out.println("synchro");
	}	
}
class Thread1 extends Thread
{
	@Override
	public void run()
	{
		Class1.class1m1();
	}
}
class Thread2 extends Thread
{
	@Override
	public void run()
	{
		Class2.class2m1();
	}
}