package FactorialTest;

public class SumOfDigits {

	public static int sum(int n)
	{
		int sum =0;
		while(n>0)
		{
			sum=sum+n%10;
			n=n/10;
		}
		return sum;
	}
	
//	public static void main(String[] args) {
//		
//		int p = sum(2+3+4);
//		System.out.println(p);
//	}
	

}
