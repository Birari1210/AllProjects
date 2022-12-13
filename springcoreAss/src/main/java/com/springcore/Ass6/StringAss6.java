package com.springcore.Ass6;

public class StringAss6 {

	String arr[] = new String [5];
	
	public StringAss6(String[] arr) {
		super();
		this.arr = arr;
	}

	public void vowels()
	{
		for (int i = 0; i < arr.length; i++)
		{
			String str = arr[i];
			int count =0;
			char ch[]=str.toCharArray();
			
			for (int j = 0; j < ch.length; j++)
			{
				if(ch[j]!='a' && ch[j]!='e' && ch[j]!='i' && ch[j]!='o' && ch[j]!='u')
				{
					count++;
				}
			}
			if(count == ch.length)
			{
				String s = new String(ch);
				System.out.println(s);
			}
		}
	}
}
