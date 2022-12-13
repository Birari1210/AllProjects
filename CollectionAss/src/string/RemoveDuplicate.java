package string;

public class RemoveDuplicate {

	public static void main(String[] args)
	{
//		String s="aabbaabccdee";
//		String s1="";
//		
//		for (int i = 0; i < s.length(); i++)
//		{
//			int count=0;
//			
//			for (int j = i+1; j < s.length(); j++)
//			{
//				if(s.charAt(i)==s.charAt(j))
//				{
//					count++;
//				}
//			}
//			if(count==0)
//			{
//				s1 = s1 + s.charAt(i);
//			}
//		}
//		System.out.println("s1 is-> "+s1);
		
		
	String s = "prrasdasasad";
	String ch = "";
 	
	int count=0;
	for (int i = 0; i < s.length(); i++) 
	{
		for (int j = i+1; j < s.length(); j++) {
			
			if(s.charAt(i)==s.charAt(j))
			{
				count++;
			}
		}
		if(count ==0)
		{
			ch +=s.charAt(i);
		}
		
	}
	System.out.println(ch);
		
		
		
		
		
		
		
		
		
		
//		
//	int a[] = {10,30,20,40,20,30,90,10,50,40};
//	int count =0;
//	
//	
//	for(int i=0;i<a.length;i++)
//	{
//		for (int j = i+1; j < a.length; j++)
//		{
//			
//			if(a[i]==a[j])
//			{
//				count++;
//			}
//			
//		}
//	}
//	System.out.println("dup"+count);
//	
//	
//	int b[] = new int[a.length-count];
//	int bindex=0;
//	
//	for (int i = 0; i < a.length; i++) 
//	{
//		int cnt=0;
//
//		for (int j = 0; j< i; j++) 
//		{
//			if(a[i]==a[j])
//			{
//				cnt++;
//			}
//		}
//		if(cnt==0)
//		{
//			b[bindex++] = a[i];
//		}
//		
//	}
//	for (int i = 0; i < b.length; i++) {
//		
//    System.out.print(b[i]+" ");		
//	}
//		
	}
}
