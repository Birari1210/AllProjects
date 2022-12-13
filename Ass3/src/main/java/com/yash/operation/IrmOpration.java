package com.yash.operation;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.dao.IrmDao;
import com.yash.model.Irm;

public class IrmOpration {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	   IrmDao irmdao = (IrmDao) ctx.getBean("irmbeen"); 
	   Irm iobj = new Irm();
	   System.out.println("irmdemo");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter irmid");
		iobj .setIrmid(sc.nextInt());
		
		System.out.println("Enter IRM name");
		iobj.setIrmname(sc.next());
		irmdao.saveirm(iobj);
	}

}
