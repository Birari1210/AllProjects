package Practise;

public class TrimMethod {

	public static void main(String[] args) {
       String str = "  code is done   ";
       String s="";
       
       int i=1;
       int j=str.length()-1;
       
       while(str.charAt(i)==' ')
       {
    	   i++;   
       }
       while(str.charAt(j)==' ')
       {
    	   j--;
       }
       
       for (int p = i; p <=j; p++) 
       {
    	   s=s+str.charAt(p);
       }
       System.out.println(s);
	
	}

}
