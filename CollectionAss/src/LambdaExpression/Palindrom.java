package LambdaExpression;

public class Palindrom {
	
	public static void main(String[] args) {
		

	String str ="abap";
	
	
	char[] s= str.toCharArray();
	
	int i=0;
	int j=s.length-1;
	
			while(i>j)
			{
				char ch = s[i];
				s[i] = s[j];
				s[j] = ch;
				i++;
				j--;
			
			}
		
		String s2 = new String(s);
	
	System.out.println(s2);
	
	if(s2.equals(str))
	{
		System.out.println("pali");
	}
	else {
		System.out.println("not");
	}
	
	}

}
