package ArrayAndStringAssingment13oct;

import java.util.Arrays;

//5 Suppose that you are having an array of size N. now your task is to sort the half array 
//that is from 0 to N/2 in ascending order and N/2+1 to N in descending order.
public class DivideArrayAnAccendingOrder {

	public static void main(String[] args) 
	{
      int a[] = {120,314,56,78,98,2,4,6,90}; 
		int len1=0;
		int len2=0;
		
		
		if(a.length%2==0)
		{
			len1=a.length/2;
			len2=len1;
		}
		else
		{
			len1=a.length/2;
		    len2=len1+1;
	     }
		int a1[]= new int[len1];
	    int a2[]= new int[len2];
	    int index1=0;
	    int index2=0;
	    
	    for (int i = 0; i < a.length; i++)
	    {
			if(i<len1)
			{
				a1[index1++]=a[i];
			}
			else
			{
				a2[index2++]=a[i];	
			}
		}
	    
	    for (int i = 0; i < a1.length; i++)
	    {
			for (int j = i+1; j < a1.length; j++)
			{
				if(a1[i]>a1[j])
				{
					int temp=a1[i];
					a1[i]=a1[j];
					a1[j]=temp;
				}
			}
		}
	    
	    for (int i = 0; i < a2.length; i++)
	    {
			for (int j = i+1; j < a2.length; j++)
			{
				if(a2[i]>a2[j])
				{
					int temp=a2[i];
					a2[i]=a2[j];
					a2[j]=temp;
				}
			}
		}
	    int arr[] = new int[a.length];
	    int j=0;
	    
	    for (int i = 0; i < arr.length; i++)
	    {
	    	if(i<a1.length)
	    	{
	    		arr[i]=a1[i];
	    	}
	    	else
	    	{
	    		arr[i]=a2[j++];
	    	}
			
		}
	    System.out.println(Arrays.toString(arr));

		
	}

}
