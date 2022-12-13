package com.training.Java8.Assingment;

interface Sequence
{
	void serise();
}


public class Question_5 {
	
	public static void main(String[] args)
	{
		Sequence obj=()->{
		
		int a[]= {1,2,3,4,6,7,8,11,13,14,15,19,20,21};//14 13
		int start=0;//1
		int end=0;
		int temp;
		for(int i=0;i<a.length-1;i++)//zero index
		{
			if(i==0)	
			{
				start=a[0];
				for(int k=i;k<a.length-1;k++)
				{
					if(a[k+1]-1 != a[k])
					{
						end=a[k];
						break;
					}
				}
			 System.out.println(start+"-"+end);
			}
			else if(a[i+1]-a[i]>=2)	
			 {				
				start=a[i+1];
				for(int k=i+1;k<a.length-1;k++)
				{
					if(a[k+1]-1 != a[k])
					{
						end=a[k];
						break;
					}
					if(k==(a.length-2)) //out of index 
					{
						end=a[a.length-1];
					}
				}				
				System.out.println(start+"-"+end);
			 }
				
		}
		};
		obj.serise();
	}

}
