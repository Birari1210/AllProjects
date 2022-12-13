package com.yash.main;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.dao.StudentDao;
import com.yash.model.Student;

public class StudentMain {

	public static void main(String[] args) {

		 ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationcontext.xml");
         StudentDao sDaoObj = (StudentDao) objAC.getBean("StudBean");
         Student sObj = new Student();
         
//        sObj.setFname("Rahul");
//         sObj.setLname("Rajput");
//         sObj.setMarks(30);
//         sObj.setAddress("Amalaner");
//         sObj.setCity("Dhule");
//         
//   	     sDaoObj.insertStudent(sObj); 
//   	     
   	  sObj.setFname("raj");
      sObj.setLname("desle");
      sObj.setMarks(50);
      sObj.setAddress("parola");
      sObj.setCity("Dhule");
      sObj.setsId(2);
	  sDaoObj.updateStudent(sObj);

//	   sObj.setsId(3);
//	   sDaoObj.deleteStudent(sObj);
	}

}
