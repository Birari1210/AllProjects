package string;

public class BinarySerach {

	public static void main(String[] args) 
	{
		int a[]= {10,20,30,45,55,67,89,110};//sorted
		int num=55;
		int start=0;
		int end=a.length-1;
		
		while(start<=end)
			{		
				int mid = (start + end)/2;
				if(a[mid]==num)
				{
					System.out.println("found at index "+mid);
					break;
				}
				else if(num>a[mid])
				{
					start=mid+1;
					
				}
				else
				{
					end=mid-1;
				}	
			}
		
		if(start>end)
		{
			System.out.println("not found");
		}

	}
	

}
