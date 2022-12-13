package com.training.exception.assingment;

public class Myclass {

	public static void main(String[] args) throws MyException
	{
		

//		int a = 10;
//		try 
//		{
//			if(a<100)
//			{
//				throw new MyException("akash");
//			}
//			else
//			{
//				System.out.println(a);
//			}
//		} 
//		catch (MyException c)
//		{
//			c.printStackTrace();
//		}
//		
		
		int age = 19;
		
		if(age<18) {
			throw new MyException();
		}else {
			System.out.println("You can vote now!");
		}

	}

}
