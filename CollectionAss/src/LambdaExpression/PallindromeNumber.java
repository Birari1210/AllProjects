package LambdaExpression;

public class PallindromeNumber {
	
	public static void main(String[] args) 
	{
		int num= 21211;
		int sum=0;
		int temp=num;
		
		while(num>0)
		{
			int rem =num%10;
			sum=sum*10+rem;
			num=num/10;
			
		}
		if(sum==temp)
		{
			System.out.println("palin");
		}
		else
			System.out.println("not");
}
}
	
	
