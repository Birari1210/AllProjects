package string;

public class ReverseeveryWordWithoutSplit 
{

	public static void main(String[] args) 
	{
		String str ="my name is akash";
		
		String[] s = str.split(" ");
		
		String s1="";
		
		for(int i=0;i<s.length;i++)
		{
			
			char[] ch =s[i].toCharArray();
			
			int start=0;
			int end=ch.length-1;
			
			while(start<end)
			{
				char temp = ch[start];
				ch[start] = ch[end];
				ch[end] = temp;
				start++;
				temp--;
			}
			
		
		String s2 = new String(ch);
		s1 =s1+s2+" ";
		}
		System.out.println(s1);

	}

}
