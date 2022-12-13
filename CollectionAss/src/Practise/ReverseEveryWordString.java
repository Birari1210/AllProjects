package Practise;

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
		

	}
}
