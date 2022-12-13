package Assingment;

public class Fibbo {

	public static void main(String[] args) {

		int a=0;
		int b=1;
		System.out.println(a);
          fiboo(a, b, 0);		
	
	}
	public static void fiboo(int a, int b, int i)
	{
		if(i<10)
		{
			System.out.println(a+b);
			int c=a+b;
			 a=b;
			 b=c; 
			 fiboo(a, b, ++i);
		}
	}
}
