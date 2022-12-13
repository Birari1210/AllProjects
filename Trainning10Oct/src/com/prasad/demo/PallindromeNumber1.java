package com.prasad.demo;

public class PallindromeNumber1 {
	
	
	
	public static void main (String[] args)
	{
	    int n = 121;
	    int temp = pali(n, 0);
	     
	    if (temp == n)
	        System.out.println("yes");
	    else
	        System.out.println("no" );
	}
	static int pali(int n, int temp)
	{
	   
	    if (n == 0)
	        return temp;
	 
	    // stores the reverse
	    // of a number
	    
	 //   rev=rev*10+num%10;
	//	return pali(num/10,temp);
//	    temp = (temp * 10) + (n % 10);
//	 
//	    return rev(n / 10, temp);
	}
	 
	// Driver Code
	

}
