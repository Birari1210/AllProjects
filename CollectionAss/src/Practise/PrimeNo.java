package Practise;

public class PrimeNo {
	
	public static void main(String[] args)
	{
		int num=7;
		int count=0;
		int i=2;
	int a=primeNumber(i,count,num);
	if(a==0)
	{
		System.out.println("prime Number");
	}
	else
	{
		System.out.println("Not Prime");
	}
   }

	private static int  primeNumber(int i, int count, int num)
	{
		if(i<num)
		{
			if(num%i==0)
			{
				count++;
			}
		return	primeNumber(++i, count, num);
		}
		return count;
		
	}
}