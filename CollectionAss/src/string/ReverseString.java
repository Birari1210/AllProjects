package string;

public class ReverseString 
{
  public static void main(String[] args)
  {
	  String s= "aba";
	  char[] ch = s.toCharArray();
	  
	  int i =0;
	  int j =ch.length-1;
	  
	  while(i<j)
	  {
		  char temp =ch[i];
		  ch[i]=ch[j];
		  ch[j]= temp;
		  i++;
		  j--;
		  
	  }
	  
	  
	  String s1=new String(ch);
	  System.out.println(s1);
	  
	  if(s.equals(s1))
	  {
		  System.out.println("palin");
	  }
	  else
		  System.out.println("not");
	  
	  
  }
}
