package TDD_Assingment;

public class Que7 
{
	 public static boolean PalindromeNum(int n)
	 {  
		  
		   int r;
		   int sum=0;
		   int temp;    
		  // int n=12321; 

		  temp=n;    
		  while(n>0){    
		   r=n%10;   
		   sum=(sum*10)+r;    
		   n=n/10; 
		  }    
		  if(temp==sum)    
		   return true;    
		  else    
		   return false; //"not palindrome";   
		}  
		 
//	public static void main(String[] args) {
//		Que7 obj = new Que7();
//		System.out.println(obj.Palindrome());
//	} 
}
