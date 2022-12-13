package com.yash.jdbcdemo;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.jdbcdemo.dao.EmpDAO;
import com.yash.jdbcdemo.model.Emp;

public class EmpOperation {
	
  public static void main(String arg[])
  {
	  ApplicationContext objCTX = new ClassPathXmlApplicationContext("applicationcontext.xml");
	  
	  EmpDAO objedao = (EmpDAO) objCTX.getBean("empdao");
	  Emp objE = new Emp();
	 /* //below code is for insertion 
	  objE.setEname("Prasad Birari");
	  objE.setSal(45000);
	  objE.setDob("1996-01-09"); // YYYY-MM-DD
	  
	  System.out.println("employee added count="+objedao.saveEmp(objE));
	  */
	  //below is the code of update record 
//	  objE.setEid(2);
//	  objE.setEname("nilesh Patil");
//	  objE.setSal(22000);
//	  objE.setDob("1999-12-10");
//	  System.out.println("employee data update:- count"+objedao.updateEmp(objE));
	  
	  System.out.println("record deleted count :- "+objedao.delEmp(2));
	  
  }
}
