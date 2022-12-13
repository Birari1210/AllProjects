package Practise;

public class RemoveDuplicateInString {

	public static void main(String[] args) {

		String str="prasadsra";
		
		String s="";
		
	    for (int i = 0; i < str.length(); i++) 
	    {
	    	int count=0;
	    	for (int j = i+1; j < str.length(); j++) 
	    	{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
				}
			}
	    	
			if(count==0)
			{
				s=s+str.charAt(i);
			}
		}  
	    System.out.println(s);
	}

}
