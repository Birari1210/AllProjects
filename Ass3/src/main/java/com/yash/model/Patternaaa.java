package com.yash.model;

import java.util.regex.Pattern;

public class Patternaaa {

  
		public static void main(String args[]){  
		System.out.println(Pattern.matches(".s", "as")); //line 4  
		System.out.println(Pattern.matches(".s", "mk")); //line 5   
		System.out.println(Pattern.matches(".s", "mst")); //line 6  
		System.out.println(Pattern.matches("...s", "amms")); //line 7  
		System.out.println(Pattern.matches("..s", "mas")); //line 8 
		
		}
}
