package ArrayAndStringAssingment13oct;

import java.util.Iterator;

public class PythogorasTemplate {

	public static void main(String[] args) {

     	int arr[] = {25,24, 7, 6, 5,3,4};
     	
     	for(int i=0;i<arr.length;i++)
     	{
     		for(int j=i+1;j<arr.length;j++)
     		{
     			for(int k=j+1;k<arr.length;k++)
     			{
     				if(arr[i]*arr[i]==(arr[j]*arr[j]+arr[k]*arr[k]))
     				{
     				       System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);	
     				}
     			}
     		}
     	}

     	

     	
     	     		
     	
  }
}
