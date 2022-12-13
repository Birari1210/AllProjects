package com.training.collection;

import java.util.HashSet;
import java.util.Set;

//In company ram, sham & amitabh work on java. sachin, sham, abhitab & jatin work on react, Ramesh, Suresh,Karan.
//find the number of emp in orgnization,
//find the number of emp java & react;
//work on java but not in react
//find number of employee in bench;

class Employee1
{
	int id;
	String name;
	String tech;	
}


public class FindEmployee {

	public static void main(String[] args) {

		Set<String> all = new HashSet<String>();
		all.add("Ram");
		all.add("Sham");
		all.add("Amithabh");
		all.add("Sachin");
        all.add("Sham");
        all.add("Amithabh");
        all.add("jatin");
        all.add("Karan");
        all.add("ramesh");
        all.add("suresh");

        
		
		Set<String> java=new HashSet<String>();
        java.add("Ram");
        java.add("Sham");
        java.add("Amithabh");
        
        Set<String> react=new HashSet<String>();
        react.add("Sachin");
        react.add("Sham");
        react.add("Amithabh");
        react.add("jatin");
        
		
		
		

	}
	

}
