package string;

public class BubbleSort {

	public static void main(String[] args) 
	{
		int a[]= {8,9,6,3,10};
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length-1; j++)
			{

				if(a[j]>a[j+1])
				{
					int temp= a[j];
					a[j]= a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);	
		}

	}

}
