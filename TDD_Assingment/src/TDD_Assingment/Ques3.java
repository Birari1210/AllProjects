package TDD_Assingment;

import java.util.Scanner;

public class Ques3 {
	
	public static boolean Data()
	{
		String email ="prasad@123";
		String password ="p!224";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter email");
		 String email1 = sc.nextLine();
		System.out.println("Enter Password");
		String pass = sc.nextLine();
		
		if(email.equals(email1) || password.equals(pass))
		{
			System.out.println("Email & password are matched");
			return true;
		}
		else
		{
			System.out.println("Email & password is not matched with database");		
			return false;
		}
	}
//	public static void main(String[] args) {
//		System.out.println(Que3.Data());
//	}
}

