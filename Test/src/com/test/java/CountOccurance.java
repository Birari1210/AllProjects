package com.test.java;


public class CountOccurance {
	public static void main(String[] args) {
	     
		{
			String s="abccaabd";
			String s1="";
				
		    for (int i = 0; i < s.length(); i++)
		    {
		    	int count=0;
				for (int j = i+1; j < s.length(); j++) 
				{
					if(s.charAt(i)==s.charAt(j)) 
					{
						count++;	
					}
				}
				if(count>=1)
				{
					s1 = s1 + s.charAt(i);
				}	
			}
		    
		    char[] c = s1.toCharArray();
		    for (int i = 0; i < c.length; i++) 
		    {
		    	
		    	int count=0;
				for (int j = 0; j < s.length(); j++) 
			
				{
					if(c[i]==s.charAt(j))
					{
						count++;
					}
				}
				
				System.out.println(c[i]+"  "+count);
			}

		}
	}
		
}
