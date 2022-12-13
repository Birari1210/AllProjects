package com.yash.operation;

import java.util.Scanner;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.dao.PlaneDao;
import com.yash.model.Plane;

public class PlaneOpe {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		PlaneDao pdao = (PlaneDao) ctx.getBean("planeBean");
		Plane p = new Plane();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter plane id");
		p.setPid(sc.nextInt());
		System.out.println("Enter Plane name ");
		p.setPlanename(sc.next());
		
		System.out.println("Enter Plane year of manifacturing");
		p.setYearofmfg(sc.nextInt());
		System.out.println("Enter Plane Total life");
		p.setTotallife(sc.nextInt());
		
		System.out.println("Enter Plane Deploy date");
		p.setDateOfDeploy(sc.nextInt());
		
		pdao.addPlane(p);
		
	}

}
