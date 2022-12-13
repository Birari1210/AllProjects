package com.springorm.main;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.RowMapper;

import com.springorm.dao.StudentDao;
import com.springorm.model.Student;


public class StudentMain {

	public static void main(String[] args) {

		  ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");

		  StudentDao sobjdao = (StudentDao) ctx.getBean("studentBean");
		  Student sobj = new Student();

		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Enter Student id");
		  sobj.setSid(sc.nextInt());
		  System.out.println("Enter Student name");
		  sobj.setSname(sc.next());
		  System.out.println("Enter father name");
		  sobj.setFather_name(sc.next());
		  System.out.println("Enter mother name");
		  sobj.setMother_name(sc.next());
		  System.out.println("Enter class  ID");
		  sobj.setClassid(sc.nextInt());
		  System.out.println("Enter Address");
		  sobj.setAddress1(sc.next());
		  System.out.println("Enter address2");
		 // sobj.setAddress2("Pune");
		  sobj.setAddress2(sc.next());
		  System.out.println("Enter Pincode");
		  sobj.setPincode(sc.nextInt());
		  System.out.println("Enter Adhar number");
		  sobj.setAadharno(sc.nextLong());
		  System.out.println("Enter date of birth");
		  String s=sc.next();
		  Date date=Date.valueOf(s);
		  sobj.setDob(date);
		  
		  System.out.println("Enter date of Admission");
		  String s1= sc.next();
		  Date date1 = Date.valueOf(s1);
		  sobj.setDate_of_addmission(date1);
		  
		  System.out.println("Student added in table count="+sobjdao.saveStudent(sobj));
  	  	}

}
