package Practise;

import java.util.stream.Stream;

import string.WordCount;

import java.util.stream.Collectors;

public class ReverseStr1 {

//	public static void main(String[] args) {
//
//		String s ="Prasad vinod";
//		String sa[]=s.split(" ");
//		String s1="";
//		
//		for (int i = sa.length-1;i>=0;i--) {
//			s1=s1+sa[i]+" ";
//		}
//			System.out.println(s1);
//		}
	
	 

    public static void main(String[] args) 
    {
    	StringBuilder s = new StringBuilder("reverse method");
    	s.reverse();
    	System.out.println(s);
    	System.out.println(reveseMethod("hijkl"));
    	
    }
    
    public static String reveseMethod(String str)
    {
    	return Stream.of(str).map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining());
    }
    
} 


   