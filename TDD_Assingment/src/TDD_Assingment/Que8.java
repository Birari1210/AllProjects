package TDD_Assingment;

public class Que8 {
	
	public static long  Count(long n)
	   {
	       int evenCount =0;
	       int oddCount=0;
		   
		   while(n!=0)
		   {
			   long rem = n%10;
			   if(rem % 2 == 0)
			   {
			      evenCount++;
			   }
			   else
			   {
			      oddCount++;
			   }
			   n= n/10;
			   
		   }
		   System.out.println("Even Count of digit is "+evenCount);
		   System.out.println("odd Count of digits is "+oddCount);
		   
		   if(evenCount % 2 == 0 && oddCount %2 !=0)
			   return 1;
		   else
			   return 0;
	}
}
