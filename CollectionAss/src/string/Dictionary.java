package string;

public class Dictionary {

	//sort base on length
	public static void main(String[] args)
	{
		String s="welcome to yash";
		String[] sa = s.split(" ");
		for (int i = 0; i < sa.length; i++)
		{
			for (int j = i+1; j < sa.length; j++)
			{
				if(sa[i].length()>sa[j].length())
				{
					String temp = sa[i];
					sa[i]=sa[j];
					sa[j]=temp;
				}
			}
		}
		System.out.println("sort base on length");
		for (int i = 0; i < sa.length; i++)
		{
			System.out.println(sa[i]);
		}
	//--------------------------------------------------------------------------------------
		String str="my name is akash";
		String[] s2 = str.split(" ");
		System.out.println(" Dictionary  ....A to z");
		for (int i = 0; i < s2.length; i++) 
		{
			for (int j = i+1; j < s2.length; j++)
			{
				if(s2[i].compareTo(s2[j])>0)
				{
					String temp = s2[i];
					s2[i]=s2[j];
					s2[j]=temp;
				}
			}
		}
		for (int i = 0; i < s2.length; i++)
		{
			System.out.println(s2[i]);
		}
	}

}
