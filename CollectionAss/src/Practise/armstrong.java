package Practise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.training.collection.LinkedList;
import com.training.collection.Node;
import com.training.demo.Dog;
import com.training.demo.ExceptionPropogation;
import com.training.demo.labroder;
import com.training.demo.pumerian;

import Assingment.DecimalToBinary1;
import Assingment11.ComplexNumberAdd;
import Assingment11.Employee;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 5;
		int mul = 0;
		int sum = 0;
		for (int i = 1; i <= num1; i++) {

			mul =  i * i * i;
			sum = sum + mul;
		}
		
		
		System.out.println("armstrong " + sum);
		
///main method
		int num = 371, originalNum, remainder, result = 0;
		originalNum = num;
		while (originalNum != 0) {
			remainder = originalNum % 10;
			result += Math.pow(remainder, 3);
			originalNum = originalNum / 10;
		}
		if (result == num)
			System.out.println(num + " is an Armstrong number.");
		else
			System.out.println(num + " is not an Armstrong number.");

	}

}

public class ArraySort {

	public static void main(String[] args) {

		int a[] = { 10, 20, 50, 40, 30 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}

public class AdditionOfStringNumber {

	public static void main(String[] args) {

		String s = "123453";
		int sum = 0;
		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (ch >= '0' && ch <= '9') {
				sum = sum + ch - 48;
				count++;
			}
		}
		if (count != 0) {
			System.out.println(sum);

		} else
			System.out.println("0");
	}
}














public class BinarySearch {

	public static void main(String[] args) {

		int a[] = { 10, 20, 40, 50, 60 };

		int start = 0;
		int end = a.length - 1;

		int num = 30;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (a[mid] == num) {
				System.out.println("found");
			} else if (a[mid] > num) {
				start = mid + 1;
			} else {
				// a[mid]= mid-1;
				end = mid - 1;
			}

		}
		if (start > end)// mid
		{
			System.out.println("not found ");
		}

	}

}

public class BubbleSort {

	public static void main(String[] args) 
	{
		int a[]= {8,9,6,3,10};
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length-1; j++)
			{

				if(a[j]<a[j+1])
				{
					int temp= a[j];
					a[j]= a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);	
		}

	}
	

public class CountWordInString {

	public static void main(String[] args) {

		String s = "   prasad birari is write code   ";

		int count = 0;

		if (s.charAt(0) != ' ') {
			s = s + " ";
		}
		for (int i = 0; i < s.length(); i++) {

			if ((s.charAt(i) != ' ') && s.charAt(i + 1) == ' ') {
				count++;
			}

		}
		System.out.println(count);

	}

}



package string;
public class CountOccurance
{
	public static void main(String[] args)
	{
		String s="abbccdefggkkk";
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
			if(count==0)
			{
				s1 = s1 + s.charAt(i);
			}	
		}
	    System.out.println("unique string is "+s1);
	
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

public class DictionaryAtoZ { //Smallest

	public static void main(String[] args) {

		String s = "we done this code";
		String[] sa = s.split(" ");
		
		for (int i = 0; i < sa.length; i++) {
			
			for (int j = i+1; j < sa.length; j++) {
				
				if(sa[i].compareTo(sa[j])>0)
						{
					       String temp = sa[i];
					       sa[i]=sa[j];
					       sa[j]=temp;
						}
			}
			
		}
		for (int i = 0; i < sa.length; i++) {
			System.out.println(sa[i]);	
		}
	}
}
public class febonacii {

	public static void main(String[] args) {

		int num=10;
		int a=0;
		int b=1;
		
		int count=0;
		
		while(count<num)
		{
			System.out.println(a+b);
			int c=a+b;
			 a=b;
			 b=c;
			 count++;
			 
		}
		
	}

}
public class fact {
	
	public static void main(String[] args) {
		
	int num =5;
	
	int fact=1;
	
	for (int i = 1; i <=num; i++) {
		
		fact = fact*i;	
	}
	System.out.println(fact);
	}
}




public class LargestSmallestWordInString {

	public static void main(String[] args) {
		
		String str = "prasad is write code";
		
		String[] s = str.split(" ");
		
		for (int i = 0; i < s.length; i++) {
			
			for (int j = i+1; j < s.length; j++) {
				
				if(s[i].length() > s[j].length())
				{
					String temp = s[i];
					       s[i]=s[j];
					       s[j]=temp;
				}
				
			}
			
		}
		System.out.println("small word "+s[0]);
		System.out.println("large word "+ s[s.length-1]);
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
			
		}
	}

}
//Second  max array 
public static void main(String[] args) {
	
int a[]= {10,20,30,40,40,50,60,70,70, 80,80,90};
int b = a.length;

int max=Integer.MIN_VALUE;
int min=Integer.MAX_VALUE;
int temp=0;

for (int i = 0; i < a.length; i++)
{
	if(a[i]>max )
	{
		temp=max;
		max=a[i];
	}
}
System.out.println("MAX"+temp);

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
		
	}}
public class SecondMaxInString{

		public static void main(String[] args)
		{
			String str= "aaabbbbccd";//3 2 2 2 2
			String s="";
			for (int i = 0; i < str.length(); i++)
			{
				int cnt=0;
				for (int j = i+1; j < str.length(); j++)
				{
					if(str.charAt(i)== str.charAt(j))
					{
						cnt++;
					}
				}
				if(cnt==0)
				{
					s= s + str.charAt(i);
				}
			}
			
			char[] c = s.toCharArray();
			int [] a=new int [c.length];
			
			for (int i = 0; i < c.length; i++)//abcdg
			{
				int count=0;
				for (int j=0;j <str.length();j++)//aabbbccddgg
				{
					if(c[i]==str.charAt(j))
					{
						count++;
					}
				}
				a[i]=count;
			}
			//correct
			System.out.println("before");
			for (int i = 0; i < a.length; i++) 
			{
				System.out.println(a[i]+" "+c[i]);
			}
			System.out.println("after");
			for (int i = 0; i < c.length; i++)
			{			
				for (int j = i+1; j < a.length; j++) 
				{
					if(a[i]<a[j])//int
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					
						char ch=c[i];
						c[i]=c[j];
						c[j]=ch;
					}
				}
			}
			
			System.out.println(c[0]+"  "+a[0]);//2
		}

	}
	}}


public class Pallindrome {
	public static void main(String[] args) {
		int num = 121;
		int original=num;
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(original == rev)
		{
			System.out.println("pali");
		}
		else
		{
			System.out.println("None");
		}	
	}
}

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
		
public class Prime {
			public static void main(String[] args) {

				int n = 6;
				int count = 0;

				for (int i = 2; i < n; i++) {
					if (n % i == 0) {

						count++;
					}
				}
				if (count == 0) {
					System.out.println("pr");
				}

				else {
					System.out.println("no");
				}

			}

				public class PrimeNo {
					
					public static void main(String[] args)
					{
						int num=7;
						int count=0;
						int i=2;
					int a=primeNumber(i,count,num);
					if(a==0)
					{
						System.out.println("prime Number");
					}
					else
					{
						System.out.println("Not Prime");
					}
				   }
	
					private static int  primeNumber(int i, int count, int num)
					{
						if(i<num)
						{
							if(num%i==0)
							{
								count++;
							}
						return	primeNumber(++i, count, num);
						}
						return count;
						
					}
				}
				
public class ReverseString And Panildrome String {

	public static void main(String[] args) {

			String str = "prasad ";
		  //String sa[] =str.split(" ");
			char ch[] = str.toCharArray();
			int i=0;
			int j=ch.length-1;
				while(i<j)
				{
					char temp = ch[i];
				    ch[i]=ch[j]; 
				    ch[j]=temp;
					i++;
					j--;
				}
								
				String	 str1 = new String(ch);
		    	 str1 = str1+str;
				 System.out.println(str1+"");
				  if(str.equals(str1))
				        	{
				        		System.out.println("pali");
				        	}
				        	else
				        	{
				        		System.out.println("not pali");
				        	}
				        	 
					}
}}

public class PallindromeInArray {

	public static void main(String[] args)
	{
		int a[] = { 234, 454, 343, 677 };
		
		
		for(int j=0;j<a.length;j++)
		{
			int num =a[j];
			int temp=num;
			int sum = 0;
			
			for(int i=0;i<num;i++)
			{
				int rem =num%10;
				sum = sum*10+rem;
				num = num/10;
			}
		
		if(temp == sum)
		{
			System.out.println(a[j]);
		}
	}
public class ReverseEveryWordString {
	
	public static void main(String[] args) {
	
		String s="prasad birari";
		String[] sa = s.split(" ");
		
		String s1="";
		
		for (int i = 0; i < sa.length; i++) 
		{
			char[] ch = sa[i].toCharArray();
			
			int start=0;
			int end=ch.length-1;
			
			while(start<end)
			{
				char temp=ch[start];
				ch[start]= ch[end];
				ch[end]=temp;
				start++;
				end--;
				
			}
			String s2= new String(ch);
			s1=s1+s2+" ";
		}
		System.out.println(s1);
	}}

public class RemoveDuplicateInString {

	public static void main(String[] args) {

		String str="prasadsra";
		
		String s="";
		
	    for (int i = 0; i < str.length(); i++) 
	    {
	    	int count=0;
	    	for (int j = i+1; j < str.length(); j++) 
	    	{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
				}
			}
	    	
			if(count==0)
			{
				s=s+str.charAt(i);
			}
		}  
	    System.out.println(s);
	}

}

public class RemoveDuplicateArray 
{
	public static void main(String[] args) {
	int a[] = { 1, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8 };

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
		}
		System.out.println(count);

		int b[] = new int[a.length - count];
		int index = 0;

		for (int i = 0; i < a.length; i++) {
			int cnt = 0;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j])
					cnt++;
			}
			if (cnt == 0) {
				b[index++] = a[i];
			}
		}
		for (int j = 0; j < b.length; j++) {

			System.out.println(b[j] + " ");
		}}
}

public class SelectionSort {

		public static void main(String[] args)
		{
			int a[]= {10,50,80,100,90,0};
			int index=0;
			
			for (int i = 0; i < a.length; i++) 
			{
				index=i;
				for (int j = i+1; j < a.length; j++)
				{
					if(a[index]>a[j])
					{
						index=j;
					}
				}
				int temp=a[index];
				a[index]=a[i];
				a[i]=temp;
			}
			for (int i = 0; i < a.length; i++) 
			{
				System.out.println(a[i]);
			}
		}
	}}
	
	public class SumOfNumber {

		public static void main(String[] args) {
			
			int num =12345;
			
			int sum=0;
			
			while(num>0)
			{
				sum=sum+num%10;
				num=num/10;
			}
			System.out.println(sum);
			
		}
	
	
public class VowelInString {

	public static void main(String[] args) {

         String str= "prasad birari";
         int count=0;
         for (int i = 0; i <str.length(); i++) {
        	
        	 if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
        			 {
        		       count++;
        		        System.out.println(str.charAt(i)+"Index no "+i); 
        		      
        			 }
			
		}
         System.out.println("total count of vowel is"+ count);
	}

}



public class PythogorasTemplate {

	public static void main(String[] args) {

     	int arr[] = {25,24, 7, 6, 5,3,4};
     	
     	for (int i = 0; i <arr.length; i++) {
     		
            for (int j = i + 1; j < arr.length; j++) 
            {
                for (int k = j + 1; k < arr.length; k++) 
                {
                	
                	if(arr[i]*arr[i]==(arr[j]*arr[j]+arr[k]*arr[k]))
                    {
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k] +" Is pythagoras");
                       
                    }
              }
            }
            
/7 WAP to demonstrate exception chaining

            public class ExceptionChaining {

            	public void CheckExeptionChaining() 
            	{
            		Scanner sc = new Scanner(System.in);
            		int[] arr = { 10, 20, 30, 2, 0, 8 };
            		System.out.println("Array: " + Arrays.toString(arr));
            		
            		System.out.println("Choose numerator and denominator(not 0) from this array (enter positions 0 to 5)");
            		int a = sc.nextInt();
            		int b = sc.nextInt();
            		
            		try {
            			int result = (arr[a]) / (arr[b]);
            			
            			System.out.println("Result of " + arr[a] + "/" + arr[b] + ": " + result);
            		}
            		catch (ArrayIndexOutOfBoundsException e) 
            		{
            			throw new IndexOutOfBoundsException();
            			
            		}
            		catch (ArithmeticException ae) {
            			throw ae;
            		}
            	}

            	public static void main(String[] args) {
            		new ExceptionChaining().CheckExeptionChaining();
            	}

            }  
}}
	
	public class ExceptionPropogation {

		public static int divide(int a, int b)
		{
			return a/b;
		}
		
		public static void main(String[] args) {
	    try
	    {
	    	System.out.println(ExceptionPropogation.divide(10, 0));
	    }
	    catch (Exception e) {
	    	System.out.println(e.getMessage());
		}
			
}
	
	
	public class ComplexNumberAddition {
		
		public int[] Addition(int real1, int real2, int image1, int image2)
		{
			int arr[] = new int[2];
			arr[0]=real1+real2;
			arr[1]=image1+image2;
			return arr;		
		}
		
		public static void main(String[] args) {

			ComplexNumberAdd cn = new ComplexNumberAdd(); 
			
			int[] arr = cn.Addition(10, 15, 5, 10);
			int[] arr1 = cn.Addition(1, 5, 5, 10);

			System.out.println("Addition is "+arr1[0]+" + "+arr1[1]+"i");

			System.out.println(arr[0]+" + "+arr[1]+"i");
		}

	}
	
	public class Employee Gross Salary{
		
		private int employeeId;
		private String empName;
		private int Basic;
		int DA, IT, NetSalary,GrossSalary;
		//consrtuctor getter setter
		public void calculateSalary()
		{
			System.out.println("Employee Number - "+employeeId);
			System.out.println("Employee Name - "+empName);
			DA=((52*Basic)/100);
			System.out.println("Da in salary - "+DA);
			GrossSalary=Basic+DA;
			System.out.println("GrossSalary of Emp - "+GrossSalary);
			IT=((30*GrossSalary)/100);
			System.out.println("IT = "+IT);
			NetSalary=GrossSalary-IT;
			System.out.println("Net Salary of Employee - "+NetSalary);
		}

	public static void main(String[] args) {
		
		
		Employee e = new Employee(11,"prasad",18000);

		e.calculateSalary();
		//System.out.println(e);
	}	
	
public class BinaryToDecimal {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Binary number");
			
			int num = sc.nextInt();
			
			int decimal = convertBinaryToDecimal(num);
			System.out.println("Binary to Decimal");
			System.out.println(num +" = "+ decimal);
		}
		
		public static int convertBinaryToDecimal(int num)
		{
			int N=0;//decimal
			int i=0;
			int r;
			
			while(num!=0)
			{
				r= num%10;
				num=num/10;
				N +=r*Math.pow(2, i);
				++i;
			}
			return N;
		}

	}	
public class DecimalToBinary1 {

	int index=0;
    int arr[] = new int[10];
    int num=10;
	public void decimaltobinary()
	{
		// num=10;
		while(num>0)
		{
			int res=num%2;
			arr[index++]=res;
			num= num/2;	
		}
		
		for (int i =index-1; i >=0; i--) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {

		DecimalToBinary1 decimalToBinary1 = new DecimalToBinary1();
		decimalToBinary1.decimaltobinary();
		
	}

}

public class SumOfBinaryNumber {

	static int index = 0;
	static int ind = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the First number");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second number");
		int num2 = sc.nextInt();

		int decimal = convertBinaryToDecimal(num1);
		int decimal1 = BinaryToDecimal(num2);

		int sum = decimal + decimal1;
		int arr[] = new int[10];

		decimalToBinary(sum, arr);
}
	public static void decimalToBinary(int sum, int arr[]) {
		{
			while (sum > 0) {
				arr[index++] = sum % 2;
				sum = sum / 2;
				// decimaltobinary(num);
			}
			for (int i = index - 1; i >= 0; i--) {
				System.out.println(arr[i]);
			}
		}
	}
	public static int convertBinaryToDecimal(int num) {
		int N = 0;
		int i = 0;
		int r = 0;

		while (num != 0) {
			r = num % 10;
			num = num / 10;
			N += r * Math.pow(2, i);
			++i;
		}
		return N;
	}
	public static int BinaryToDecimal(int num) {
		int N = 0;
		int i = 0;
		int r = 0;

		while (num != 0) {
			r = num % 10;
			num = num / 10;
			N += r * Math.pow(2, i);
			++i;
		}
		return N;}
}

public class SetDemo {

	public static void main(String[] args) {

		Set<Integer> s = new HashSet<Integer>();
		s.add(10);
		s.add(30);
		s.add(40);
		s.add(80);

		Set<Integer> s2 = new HashSet<Integer>();
		s2.add(30);
		s2.add(40);
		s2.add(50);
		s2.add(60);

		Set<Integer> union = new HashSet<Integer>();
		union.addAll(s);
		union.addAll(s2);

		Set<Integer> intersection = new HashSet<Integer>();
		intersection.addAll(s);
		intersection.retainAll(s2);

		System.out.println("union of set ");
		for (Integer in : union) {
			System.out.print(in + " ");
		}

		System.out.println("\nintersection of set ");

		for (Integer n : intersection) {
			System.out.print(n + " ");
		}
}}

// Linked List example
class Node<T> {

	T data;
	Node next;

	public Node(T data) {
		this.data = data;
		next = null;
	}
}

class LinkedList {
	Node head = null;

	public void insertAtBeging(int a) {
		Node n1 = new Node(a);
		if (head == null) {
			head = n1;
		} else {
			n1.next = head;
			head = n1;
		}
	}

	void display() {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + "==>");
			start = start.next;
		}
	}
}

public class LinkedListMaster {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.insertAtBeging(10);
		l.insertAtBeging(20);
		l.insertAtBeging(30);
		l.insertAtBeging(40);

//		    l.insertAtEnd(10);
//		    l.insertAtEnd(20);
//		    l.insertAtEnd(40);
//		    l.insertAtEnd(50);

		l.display();
	}
}


package com.training.demo;

public interface Dog {
	
	public  void bark();
	
	public void eat();
	
	default void  sleep() {
		System.out.println("done");
	}

}

public class InterfaceMaster {

	public static void main(String[] args) {
		Dog d1[] = { new labroder(), new pumerian() };

		for (Dog g : d1)
			// g.bark();
			g.eat();

		Dog d = new Dog() {

			@Override
			public void eat() {
				System.out.println("ppppp");
			}

			@Override
			public void bark() {
				// TODO Auto-generated method stub
				System.out.println("btttttd");

			}
		};
		d.bark();
		d.eat();

		Runnable r1 = new Runnable() {

			@Override
			public void run() {

				try {
					for (int i = 1; i <= 10; i++) {
						System.out.println(i);
						Thread.sleep(1000);

					}
				} catch (InterruptedException e) {

				}
			}
		};

		new Thread(r1).start();
	}

}

// Recursion

public class SumOfDigits {

	
	public static int sumofdigits(int num)
	{
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		return sum;
	}
	
	public static int fibo(int n)
	{
		if(n==1 || n==2 )
			return 1;
		else
			return fibo(n-1)+ fibo(n-2);
		
     }
	
	public static boolean isPrime(int n)
	{
		boolean flag =true;
		
		for(int i=2;i<=n-1;i++)
		{
			if(i%n==0)
		   flag =false;
		    break;
	   }
		return flag;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//      int  num =12345;
//		int sum=0;
//		while(num>0)
//		{
//			sum=sum+num%10;
//			num=num/10;
//		}
//		System.out.println(sum);
//
//		System.out.println();

	