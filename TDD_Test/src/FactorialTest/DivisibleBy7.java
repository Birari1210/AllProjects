package FactorialTest;

public class DivisibleBy7 {

	public static int Divisible()
	{
	    int start = 100;
	    int end = 200;
	    int sum = 0;
	     for( int i= start; i<=end; i++)
	     {
	    	 if(i%7==0)
	    		 sum= sum+i;
	     }
	    // System.out.println("Sum all "+sum);
	     return sum;
	}
}
