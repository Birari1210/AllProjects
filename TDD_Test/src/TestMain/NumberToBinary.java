package TestMain;

public class NumberToBinary 
{
	public static int Binary(int n)
	{
		int[] binaryArray = new int[1000];
		
		int i=0;
		
		while(n>0)
		{
			binaryArray[i] =n%2;
			n= n/2;
			i++;
		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.println(binaryArray[j]);
		}
		 return i;
		
	}
}

