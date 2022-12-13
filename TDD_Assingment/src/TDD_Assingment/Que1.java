
package TDD_Assingment;

import java.util.Scanner;

public class Que1 {
	public static int HCF()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number1 for hcf");
		int num1= sc.nextInt();
		System.out.println("Enter Number2 for hcf");
		int num2= sc.nextInt();

		      //int num1 =60;
		      //int num2=96;
		      int hcf =0;
		      for(int i = 1; i <= num1 || i <= num2; i++) 
		      {
		         if( num1%i == 0 && num2%i == 0 )
		          hcf = i;
		      }
		      System.out.println("HCF of two numbers is = "+hcf);
		      return hcf;
		   }
		
//		   public static void main(String args[]){
//			   Que1  obj = new Que1();
//			   System.out.println(obj.HCF());
//		   }
}

