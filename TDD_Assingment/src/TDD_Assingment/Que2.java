package TDD_Assingment;

public class Que2 {
	public static boolean palindrome()
	{
		String s1 = "xyz";
		String s2 = "zyx";
		String s3 ="";
       //int i=s1.length()-1;
		for (int i=s1.length()-1;i>=0;i--) {
			s3=s3+s2.charAt(i);
		}
		if(s1.equals(s3))
		{
			return true;
		}
		return false;
	}
	
public static void main(String[] args) 
{
	Que2 obj = new Que2();
	System.out.println(obj.palindrome());
 }
}
	
	
//	public static void main(String[] args) {
//		
//		String s1 = "PrasrP";
//		String s2 = "";
//		for (int i=s1.length()-1;i>=0;i--) {
//			s2=s2+s1.charAt(i);
//		}
//		if(s1.equals(s2))
//		{
//			System.out.println("palindrome");
//		}
//		else
//			System.out.println("Not");
//		
//	}
	
//char[] ch=s1.toCharArray();
//int j=ch.length-1;
//char temp = (char) i;
//i = j;
//j = temp;
//
//  char ch = new 




