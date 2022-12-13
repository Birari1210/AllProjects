package Practise;

public class RemoveCharecter {

	public static void main(String[] args) {

		String s = "prasad";
		
		String s1 ="";
		
		for (int i = 0; i < s.length(); i++) 
		{
			char ch =s.charAt(i);
			if(ch!='s')
			{
				s1=s1+ch;
			}
		}
		System.out.println(s1);
		
//2nd way
		
		String Str = "prasad";
		
		String[] s2 = Str.split("s");
		String s3="";
		
		for (int i = 0; i < s2.length; i++) {
			
			s3=s3+s2[i];
		}
		System.out.println(s3);
		
	}
	
}
