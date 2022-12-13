package Practise;

public class PalindromeString {

	public static void main(String[] args) {

			String str = "prasardp";
			char ch[] = str.toCharArray();
			int i=0;
			int j=ch.length-1;
			
			while(i<j)
			{
				char c = ch[i];
				     ch[i]=ch[j];
				     ch[j]=c;
				     i++;
				     j--;
			}
			String s = new String(ch);
			System.out.println(s);
			if(s==str)
			{
				System.out.println("palin");
				
			}
			else
				System.out.println("not palin");
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
}


//String str="prasuarpo";
//char[] ch = str.toCharArray();		
//int i=0;
//int j=ch.length-1;
//
//while(i<j)
//{
//	char temp = ch[i];
//	ch[i]=ch[j];
//	ch[j]=temp;
//	i++;
//	j--;
//}
// String s1=new String(ch);
// System.out.println(s1);
//
//if(s1.equals(str))
//{
//	System.out.println("pali");
//}
//else 
//{
//	System.out.println("not pali");
//}
