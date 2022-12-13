package com.prasad.demo;


public class SumOfDigits {

	
	public static int sumofdigits(int num)
	{
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		return sum;
	}
	
	public static int fibo(int n)
	{
		if(n==1 || n==2 )
			return 1;
		else
			return fibo(n-1)+ fibo(n-2);
		
     }
	
	public static boolean isPrime(int n)
	{
		boolean flag =true;
		
		for(int i=2;i<=n-1;i++)
		{
			if(i%n==0)
		   flag =false;
		    break;
	   }
		return flag;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//      int  num =12345;
//		int sum=0;
//		while(num>0)
//		{
//			sum=sum+num%10;
//			num=num/10;
//		}
//		System.out.println(sum);
//
//		System.out.println();
		
		SumOfDigits.sumofdigits(12345);
		//////////
		
		for(int i=1;i<=10;i++)
		System.out.println(SumOfDigits.fibo(i));
		
		System.out.println(SumOfDigits.isPrime(20));
	}

}
