package LambdaExpression;

public class PallindromeInArray {

	public static void main(String[] args)
	{
		int a[] = { 234, 454, 343, 677 };
		
		
		for(int j=0;j<a.length;j++)
		{
			int num =a[j];
			int temp=num;
			int sum = 0;
			
			for(int i=0;i<num;i++)
			{
				int rem =num%10;
				sum = sum*10+rem;
				num = num/10;
			}
		
		if(temp == sum)
		{
			System.out.println(a[j]);
		}
	}
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
//		for (int j = 0; j < a.length; j++) 
//		{
//			int n = a[j];
//			int temp = n;
//			int sum = 0;
//			for (int i = 0; i <= n; i++) 
//			{
//				int reminder = n % 10;
//				sum = (sum * 10) + reminder;
//				n = n / 10;
//
//			}
//			if (temp == sum)
//				System.out.println(a[j]);
//
//		}
	}

}
