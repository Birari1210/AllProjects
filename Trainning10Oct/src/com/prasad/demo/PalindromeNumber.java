package com.prasad.demo;

public class PalindromeNumber {
	
	
	public static int palin(int num, int original,int rev)
	{
		
//		int original=num;
//		int rev=0;
		
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		return num;
	}
	
	
	
	public static void main(String[] args) {
		
	int num = 121;
//	
	int original=num;
	int rev=0;
////	
//	while(num>0)
//	{
//		rev=rev*10+num%10;
//		num=num/10;
//	}
	if(original == rev)
	{
		System.out.println("pali");
	}
	else
	{
		System.out.println("None");
	}
	
	PalindromeNumber.palin(num, original, rev);
   }
}
