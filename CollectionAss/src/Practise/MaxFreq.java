package Practise;

import java.util.Iterator;

public class MaxFreq {

	public static void main(String[] args) {
		String s ="prrrrrrrrrrrrrrrrasaddddddddd";
		
		int result[] = new int[5];
		int max=0;
		
		for(int i=0;i<s.length();i++)
		{
			max=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i) == s.charAt(j))
				{
					max++;
				}
			}
			if(max>result[0])
			{
				result[0]=max;
				result[1]=i;
			}
		}
		System.out.println(result[0]+" "+ s.charAt( result[1]));
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String s1="";
//		
//		for(int i=0;i<s.length();i++)
//		{
//			int cnt=0;
//			for(int j=i+1;j<s.length();j++)
//			{
//				if(s.charAt(i)==s.charAt(j))
//				{
//					cnt++;
//				}
//			}
//		
//		if(cnt==0)
//		{
//			s1=s1+s.charAt(i);
//		}
//		}
//		System.out.println(s1);
		
		
		
//int max=0;
//		
//		int result[]= new int[2];
//		
//		for (int i = 0; i < s.length(); i++) {
//			
//			max=0;
//			for (int j = 0; j < s.length(); j++) 
//			{
//				if(s.charAt(i)==s.charAt(j))
//				{
//					max++;	
//			   }	
//		}			 
//		if(max>result[0])
//		{
//			result[0]=max;
//			result[1]=i;
//			
//		}
//		}
//		System.out.println(result[0]+" "+s.charAt(result[1]));
	}

}
