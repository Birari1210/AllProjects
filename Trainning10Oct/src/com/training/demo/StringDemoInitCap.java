package com.training.demo;

public class StringDemoInitCap {
	
	public static String intiCap(String s)
	{
		return s.substring(0,1).toUpperCase()+s.substring(1,s.length()).toLowerCase();
	}
	
	public static String shortName(String s)
	{
	
		return s.substring(0, 1).toUpperCase()+"."+StringDemoInitCap.intiCap(s.substring(s.indexOf(' ')+1,s.length()));
	}
	
	public static String shortNameTo(String s)
	{
	
		return s.substring(0, 1).toUpperCase()+"."+StringDemoInitCap.shortName(s.substring(s.indexOf(' ')+1,s.length()));
	}
	
	public static String rigthRoted(String s)
	{
		return s.charAt(s.length()-1)+s.substring(0, s.length()-1);
	}
	
	public static void rigthRoted2(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			s=StringDemoInitCap.rigthRoted(s);
			System.out.println(s);
		}
	}

	public static void main(String[] args) 
	{
		
	System.out.println(StringDemoInitCap.intiCap("prasad"));
	
	System.out.println(StringDemoInitCap.shortNameTo("prasad vinod birari"));
	
	System.out.println(StringDemoInitCap.rigthRoted("pry"));
	
	StringDemoInitCap.rigthRoted2("pdnf");

	}

}
