package string;

public class PalindromeString 
{
	public static void main(String[] args) {
		
	
	String str="bakab";
	
	System.out.println("Given String "+str);
	 char[] c = str.toCharArray();
	 
	 int i=0;
	 int j=c.length-1;
	 while(i<j)
	 {
		 char temp=c[i];
		 c[i]=c[j];
		 c[j]=temp;
		 i++;
		 j--;
	 }
	  String s=new String(c);
	  System.out.println(s);
	  
	if(s.equals(str))
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}
 }
}
