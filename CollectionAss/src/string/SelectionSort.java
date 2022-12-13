package string;

public class SelectionSort {

	public static void main(String[] args)
	{
		
       int a[] = {10,59,46,21,20,30,3,4,9};
       
       int index=0;
       
       for(int i=0;i<a.length;i++)
       {
    	    index=i;
    	   for(int j=i+1;j<a.length;j++)
    	   {
    		   if(a[index]>a[j])
    		   {
    			   index=j;
    		   }
    	   }
    	   int temp = a[index];
    	   a[index] = a[i];
    	   a[i]=temp;   
       }
       
       for (int i = 0; i < a.length; i++) {
    	   System.out.println(a[i]);
		
	}
      
		
		
	}
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//int index=0;
//		
//		for (int i = 0; i < a.length; i++) 
//		{
//			index=i;
//			for (int j = i+1; j < a.length; j++)
//			{
//				if(a[index]>a[j])
//				{
//					index=j;
//				}
//			}
//			int temp=a[index];
//			a[index]=a[i];
//			a[i]=temp;
//		}
//		for (int i = 0; i < a.length; i++) 
//		{
//			System.out.println(a[i]);
//		}
//}
