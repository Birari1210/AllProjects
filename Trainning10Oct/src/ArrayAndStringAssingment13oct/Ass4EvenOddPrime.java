package ArrayAndStringAssingment13oct;

public class Ass4EvenOddPrime {

	public static void main(String[] args) {

		int a[] = {2,3,4,5,6,7,9,10,28};
		int even=0;
		int odd =0;
		int prime=0;

		int count =0;

		for (int i = 1; i < a.length; i++) {

			if(a[i]%2==0)
			{
				even++;
			}
			if(a[i]%2!=0)
			{
				odd++;
			}

			if(a[i]%i ==0)
			{
				prime++;
			}
	
		int sum=0;
		int temp=a[i];
		
		for(int j=1;j<temp;j++)
		{
			if(temp%j==0)
			{
				sum = sum +j;
			}
		}
		if(sum==temp)
		{
			count++;
		}

	
	System.out.println("perfect number count "+count);

	System.out.println("Even number count "+even);
	System.out.println("odd  number count "+odd);
	System.out.println("prime number count "+prime);
}
}
}


