package string;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class ReverseEveryWord {

	public static void main(String[] args) {
//		String str = "my name akash";// ym eman hsaka
//		String s3 = "";
//		String[] sa = str.split(" ");// sa[i]=my char = m y
//
//		for (int i = 0; i < sa.length; i++) 
//		{
//			char[] ca = sa[i].toCharArray();
//			int start = 0;
//			int end = ca.length - 1;
//			while (start < end) {
//				char temp = ca[start];
//				ca[start] = ca[end];
//				ca[end] = temp;
//
//				start++;
//				end--;
//			}
//
//			String s2 = new String(ca);
//			s3 = s3 + s2 + " ";
//		}
//
//		System.out.println(s3);
//	}
//	
//	String str = "my name prasad ";// ym eman hsaka
//	String[] s = str.split(" ");
//	
	
	
	
	String s = "this program is done";
	
	String s1="";
	
	String[] ch=s.split(" ");
	
	for(int i=0;i<ch.length;i++)
	{
		char[] c = ch[i].toCharArray();
		
		int start =0;
		int end = c.length-1;
		
		while(start<end)
		{
			char temp = c[start];
			  c[start] = c[end];
			  c[end] = temp;
			  
			  start++;
			  end--;
			
		}
		
		
		String s2= new String(c);
		s1+=s2+" ";
	}
	System.out.print(s1);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
}
