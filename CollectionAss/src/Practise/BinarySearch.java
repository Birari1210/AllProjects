package Practise;

public class BinarySearch {

	public static void main(String[] args) {
		
		int a[] = {10,20,40,50,60};
		
		
		int start=0;
		int end =a.length-1;
		
		int num =0;
		
		while(start<=end)
		{
			int mid = (start+end)/2;
			
			if(a[mid]==num)
			{
				System.out.println("found");
				break;
			}
			else if(a[mid]<num)
			{
				start = mid+1;
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int start=0;
//		int end =a.length-1;
//		
//		int num=30;
//		
//		while(start<=end)
//		{
//			int mid = (start+end)/2;
//			
//			if(a[mid]== num)
//			{
//				System.out.println("found");
//			}
//			else if(a[mid]>num)
//			{
//				start=mid+1;
//			}
//			else
//			{
//				//a[mid]= mid-1;
//				end = mid-1;
//			}
//				
//		}
//		   if(start>end)// mid
//			{
//				System.out.println("not found ");
//			}
		
	}

}
