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
	
