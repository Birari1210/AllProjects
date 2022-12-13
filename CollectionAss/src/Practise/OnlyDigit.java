package Practise;

import java.util.Iterator;

public class OnlyDigit {

	public static void main(String[] args) {

		String str = "111111";
		
		int count =0;
//		
//		for (int i = 0; i < str.length(); i++) {
//		
//			if(str.charAt(i)>='0' && str.charAt(i)>='9')
//			{
//				count++;
//			}	
//		}
		
		//2nd way.....
		for (int i = 0; i <str.length(); i++)
		{
			char ch = str.charAt(i);
			
			if(ch>'0' && ch<'9')
			{
				count++;
			}
		}
		if(count==0)
			System.out.println("only Digit");
		else
			System.out.println("not");
		
	}

}
