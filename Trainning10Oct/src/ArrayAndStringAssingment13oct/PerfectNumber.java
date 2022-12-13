package ArrayAndStringAssingment13oct;

public class PerfectNumber {

	public static void main(String[] args)
	{
		
		int num=28;
		int a[] = {2,3,4,5,6,7,9,28,496,10};
		int sum=0;
		
		int count=0;
		
		for(int i=1;i<a.length;i++)
		{
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
			//temp=0;
			sum=0;
		}
		System.out.println("count "+count);
		
	}

}
