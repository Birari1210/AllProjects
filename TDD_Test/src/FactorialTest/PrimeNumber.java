package FactorialTest;

public class PrimeNumber {
	
	public boolean primeNo(int x)
	{
		boolean count = true;
		
		for(int i=2;i<=x/2;i++)
		{
			if(x%i ==0) {
				count=false;
			
				break;
			}
		}
		return count;
	}

}
