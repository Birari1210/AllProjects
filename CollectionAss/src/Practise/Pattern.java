package Practise;

public class Pattern {

	public static void main(String[] args) {

		for (int i = 0; i<9; i++) 
		{
			for (int j = 0; j <9; j++) 
			{
				//if(i+j<=8 && i-j>=0)
				if(j-i>=0  && j+i<9 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
//		System.out.println();
		
		
		System.out.println("_______________________________________");
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<9;j++)
			{
				if(j+i>=4 && j-i<=4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("*****************************");
		
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				if(j-i>4)
				{
					System.out.print("*");
				}
				else
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

	public static char[] matches(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}

}
