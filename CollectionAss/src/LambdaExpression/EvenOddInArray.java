package LambdaExpression;

import java.util.Iterator;

public class EvenOddInArray {

	public static void main(String[] args) {

		int a[] = {10,12,13,14,20,55,24};
		
		
		int evencount=0;
		int oddcount=0;
		for(int i=0;i<a.length;i++)
		{
			
				
				if(a[i]%2==0)
				{
				  evencount++;
				}
				else
					oddcount++;
			
		}
		
		System.out.println(evencount);
		System.out.println(oddcount);
		int evenarray[] = new int[evencount];
		int evenIndex=0;
		int oddarray[] = new int[oddcount];
		int oddIndex=0;
		
		for(int i=0;i<a.length;i++)
		{
			
				if(a[i]%2==0)
				{
					evenarray[evenIndex++] = a[i];
					
				}
				else
					oddarray[oddIndex++] = a[i];
				
		}
		System.out.println("even");
		for (int i = 0; i < evenarray.length; i++) {
			System.out.println("even "+evenarray[i]);
			
		}
		
		System.out.println("odd");
		for (int i = 0; i < oddarray.length; i++) {
			System.out.println(oddarray[i]);
		}
		
		
		
	}

}
