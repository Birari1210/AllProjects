package Practise;

public class CountWordInString {

	public static void main(String[] args) {
		
		
		String s="   prasad birari is write code   ";
		
		int count =0;
		
//		if(s.charAt(0)!=' ')
//		{
//			s=s+" ";
//		}
		for (int i = 0; i < s.length(); i++) {
			
			if((s.charAt(i)!=' ') && s.charAt(i+1)==' ')
			{
				count++;
			}
			
		}
		System.out.println(count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String str = "  Count word ppp in string  ";
//		
//		int count=0;
//		
//		if(str.charAt(0)!=' ')
//		{
//			str=str+ " ";
//		}
//		
//		for (int i = 0; i < str.toCharArray().length-1; i++) 
//		{
//	
//			if( (str.charAt(i)!=' ') && (str.charAt(i+1)==' '))
//			{
//				count++;
//			}
//			
//		}
//		System.out.println("word count is "+count);

	}

}
