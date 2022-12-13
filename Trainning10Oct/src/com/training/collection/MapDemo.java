package com.training.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo
{
	public static void maxFrequency(String s)
	{
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for (int i = 0; i <s.length(); i++) 
		{
			if(m.keySet().contains(s.charAt(i)))
			{
				m.put(s.charAt(i), m.get(s.charAt(i))+1);
				//m.put(s.charAt(i), s.charAt(i)+1); 
			}
			else
			{
				m.put(s.charAt(i),1);
			}
		}
		System.out.print(m);
		
	}
	public static void main(String[] args) {

		Map<String, Integer> m = new HashMap<String, Integer>();
		
		m.put("prasad",30);
		m.put("nilesh",22);
		m.put("jayDeep",21);
		m.put("akash",20);
		m.put("yash",35);
		m.put("jayDeep",21);
		
		System.out.println("size is "+m.size());
		System.out.println("age of jaydeep is "+m.get("jayDeep"));
		
		for (String s : m.keySet()) 
		{
	      System.out.println("the age "+s+" is"+m.get(s));
		}
		
		for (Entry<String, Integer> s1 : m.entrySet()) 
		{
			 String s = s1.getKey();
			 Integer i = s1.getValue();
			System.out.println("value= "+s+" key= "+i );
		}
		
		//String s  = "prasad";
		MapDemo.maxFrequency("prwwswwd");
		
		
	}

}
