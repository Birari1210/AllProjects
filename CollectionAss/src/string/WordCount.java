package string;

public class WordCount 
{
	public static void main(String[] args)
	{
		String str= "prasad akash vinod santosh";
		
		//using split
		String[] sa = str.split(" ");
		//System.out.println(sa.length);
		//using to char array
		char[] c = str.toCharArray();
		int cnt=0;
		for (int i = 0; i < c.length; i++)
		{
			if(c[i]==' ' && i != c.length-1)
			{
				cnt++;
			}
		}
		int count=cnt + 1;
		System.out.println("no of word are "+count);
	}
}
