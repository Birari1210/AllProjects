package Practise;

public class Swaping {

	public static void main(String[] args) {
		
		int a[] = {20,10,30,40,50};
		int i=0;
		int j=a.length-1;
		
	/*			while(i<j)
				{
					int temp =a[i];
					    a[i]=a[j];
					    a[j]=temp;
					    i++;
					    j--;
				}
		for (int j2 = 0; j2 < a.length; j2++) {
			
		
		System.out.println(a[j2]);
		}*/

	while(i<j)
	{
		a[i]=a[i]+a[j];
		a[j]=a[i]-a[j];
		a[i]=a[i]-a[j];
		i++;
		j--;			
	}
	
	for (int j2 = 0; j2 < a.length; j2++) {
		System.out.println(a[j2]);
	 }
   }
}
