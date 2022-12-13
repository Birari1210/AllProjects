package com.springcore.Ass3;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmiTest {

	public static void main(String[] args) {

      ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
      Emi eobj = (Emi) ctx.getBean("emiBean");
      
      System.out.println("Interest rate is "+eobj.rate +"%");
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter amount ");
      float amount = sc.nextFloat();
      
      System.out.println("Enter validity in years");
      int validity = sc.nextInt();
      
      int validityinmonths = validity*12;
      
      double TPA = amount+((amount*eobj.rate)/100)* validity;
     System.out.println("total payable amount "+TPA);
     
      double emi = TPA/validityinmonths;
      System.out.println("EMI for total amount "+emi);
      
		
	}
}
