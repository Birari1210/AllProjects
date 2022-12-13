package string;

import java.util.Iterator;

public class SecondMax {

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
