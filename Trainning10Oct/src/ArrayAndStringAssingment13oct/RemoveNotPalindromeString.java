package ArrayAndStringAssingment13oct;

//9 WAP to remove the String which is not palindrome string from the array of String.
public class RemoveNotPalindromeString{

	public static void main(String[] args) 
	{
		
		String s[]= {"mam","nil","akash","aba"};
		String sa[]= new String[s.length];
		String temp="";
		int index=0;
		
		for (int i = 0; i < s.length; i++) 
		{
			String s1=s[i];
			
			for (int j = s1.length()-1;j>=0; j--)
			{
				temp=temp + s1.charAt(j);
			}
			if(s1.equals(temp)==true)
			{	
				sa[index++]=temp;
			}
			
			temp="";
			s1="";
			
		}
		for (int i = 0; i < index; i++)
		{
			System.out.print(sa[i]+" ");
		}
	}

}
