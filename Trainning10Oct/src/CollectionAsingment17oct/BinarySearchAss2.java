package CollectionAsingment17oct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchAss2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		
		
		System.out.println("Size "+l.size());
		
	    int binarySearch = Collections.binarySearch(l, 40);
	   
        System.out.println(binarySearch); 
  
        
        binarySearch = Collections.binarySearch(l, 70); 
        System.out.println(binarySearch); 
		

  /*      
  // core binary search.....
		int start=0;
		int end =a.length-1;
		
		int num=30;
		
		while(start<=end)
		{
			int mid = (start+end)/2;
			
			if(a[mid]== num)
			{
				System.out.println("found");
			}
			else if(a[mid]>num)
			{
				start=mid+1;
			}
			else
			{
				//a[mid]= mid-1;
				end = mid-1;
			}
				
		}
		   if(start>end)// mid
			{
				System.out.println("not found ");
			}
		
*/
	}
	

}
