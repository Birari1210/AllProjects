package Practise;

public class febonacii {

	public static void main(String[] args) {

		int num=10;
		int a=0;
		int b=1;
		
		int count=0;
		
		while(count<num)
		{
			System.out.println(a+b);
			int c=a+b;
			 a=b;
			 b=c;
			 count++;
			 
		}
		
	}

}
