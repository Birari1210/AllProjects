package LambdaExpression;

public class RemoveVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    String s = "prasadehhgihho";
		
//		String s1 ="";
//		
//		for (int i = 0; i < s.length(); i++) 
//		{
//			char ch =s.charAt(i);
//			if(ch!='a' && ch!='e'&&ch!='i'&&ch!='o')
//			{
//				s1=s1+ch;
//			}
//		}
//		System.out.println(s1);
		
		
		 String s1="";
		    for (int i = 0; i < s.length(); i++) 
		    {
		    	
		    		
		    	if(s.charAt(i)!='a' && s.charAt(i)!='o' )
		    	{
		    	     s1=s1+s.charAt(i);
		    	}
		    }
		    	System.out.println(s1);
		  
			
	}

}
