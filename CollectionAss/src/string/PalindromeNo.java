package string;

public class PalindromeNo {

	public static void main(String[] args) 
	{
		int num=150;
		int temp= num;
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum = sum*10+rem;
			num=num/10;
		}

		if(sum==temp)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
