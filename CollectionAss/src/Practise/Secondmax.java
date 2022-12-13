package Practise;

public class Secondmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,30,40,40,50,60,70,70, 80,80,90};
	    int b = a.length;
	    
	    int max=Integer.MIN_VALUE;
	    int min=Integer.MAX_VALUE;
	    int temp=0;
	    
	    for (int i = 0; i < a.length; i++)
	    {
			if(a[i]>max )
			{
				temp=max;
				max=a[i];
				
			}
		}

	    System.out.println("MAX"+temp);
	  //  System.out.println("temp "+max);
//	    System.out.println(min);
//	    
//	    for(int i=0;i<b;i++)
//	    {
//	    	for(int j=i+1;j<b;j++)
//	    	{
//	    		if(a[i]>a[j])
//	    		{
//	    			int temp = a[i];
//	    			a[i]=a[j];
//	    			a[j]=temp;	
//	    		}
//	    	}
//	    }
//	    System.out.println(a[b-2]);
			
			
	
	}

}
