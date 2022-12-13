package com.springorm.main;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.print.attribute.standard.Sides;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.ResultDao;
import com.springorm.dao.StudentDao;
import com.springorm.model.JoinClass;
import com.springorm.model.Result;
import com.springorm.model.Student;

public class ResultMain {
	
	public static void main(String[] args) {

	  ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
	  ResultDao rdaoObj = (ResultDao) ctx.getBean("resultBean");
	  StudentDao sobjdao = (StudentDao) ctx.getBean("studentBean");

	  
      Student st=new Student();	  
	  Result objR = new Result();	
/*	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Result ID");
	  objR.setRid(sc.nextInt());
	  System.out.println("Enter Math Marks ");
	  objR.setMaths(sc.nextInt());
	  System.out.println("Enter Hindi Marks ");
	  objR.setHindi(sc.nextInt());
	  System.out.println("Enter English Marks ");
	  objR.setEnglish(sc.nextInt());
	  System.out.println("Enter Science Marks ");
	  objR.setScience(sc.nextInt());
	  System.out.println("Enter Sanskrit Marks ");
	  objR.setSanskrit(sc.nextInt());
	  System.out.println("Enter Student ID");
	  objR.setSid(sc.nextInt());
	  System.out.println("Enter Date");
	  String s = sc.next();
	  Date date1 = Date.valueOf(s);
	  objR.setDatetime(date1);
  
	  System.out.println("Result added in table count="+rdaoObj.addResult(objR));
*/
	  
    List<Result> rlist=rdaoObj.getresultDetails();
    
    int cnt =0;
        for (Result r : rlist) 
        {
   	       
//        	System.out.println(r.getSid()+" "+r.getEnglish());
//        	System.out.println(" "+r.getMaths());
        	if(r.getMaths()==0)
        	{
        		cnt++;
        	}
        	if(r.getHindi()==0)
        	{
        		cnt++;
        	}
        	if(r.getEnglish()==0)
        	{
        		cnt++;
        	}
        	if(r.getScience()==0)
        	{
        		cnt++;	
        	}
        	if(r.getSanskrit()==0)
        	{
        		cnt++;
        	}

        	if( cnt == 1)
        	{
        		System.out.println(" Student absent in one subject");

        		int id = r.getSid();  
        		List<Student> slist = sobjdao.getId(id);
        	//	System.out.println("my id"+r.getSid());
        		for (Student ss : slist) 
        		{
        			System.out.println("Student Id-"+ss.getSid()+" Student Name "+ ss.getSname()+" Student father Name- "+ss.getFather_name()+"  adaress "+ss.getAddress1());		
				}
        	}
        
        	else {
            	System.out.println("Student are not  absent in one subject" );

			}	
        }
           
        System.out.println();
        System.out.println("-----2 number of students which are absent in more than two subject exams.------");
        
        for (Result r : rlist) 
        {
   	       int count1 =0;
        	if(r.getMaths()==0)
        	{
        		count1++;
        	}
        	if(r.getHindi()==0)
        	{
        		count1++;
        	}
        	if(r.getEnglish()==0)
        	{
        		count1++;
        	}
        	if(r.getScience()==0)
        	{
        		count1++;	
        	}
        	if(r.getSanskrit()==0)
        	{
        		count1++;
        	}

        	if( count1 ==2)
        	{
        		System.out.println(count1+" Student absent in two subject");

        		int id = r.getSid();  
        		List<Student> slist = sobjdao.getId(id);
        	//	System.out.println("my id"+r.getSid());
        		for (Student ss : slist) 
        		{
        			System.out.println("Student Id-"+ss.getSid()+" Student Name "+ ss.getSname()+" Student father Name- "+ss.getFather_name()+"  adaress "+ss.getAddress1());		
				}
        	}
        	//System.out.println("student are not absent in 2 sub");
   
        }
        
        
        
        
        
  //      3) Find out total number of students who score more than 75%. and print details of students
        
        System.out.println("");
        System.out.println("___________students who score more than 55%_________");
        for (Result r : rlist) 
        {
        	int id = r.getSid();  
        	
        	int total = r.getMaths()+r.getHindi()+r.getEnglish()+r.getScience()+r.getScience();
        	
        	double marks =(total*150)/500;
        //	System.out.println(marks);
        	if(marks>=55)
        	{
        		List<Student> mlist = sobjdao.getId(id);
        		
        		for (Student m: mlist) {
        			
        			System.out.println("Student Id-"+m.getSid()+" Student Name-"+ m.getSname()+" Student father Name- "+m.getFather_name());
        			System.out.println("marks is "+marks);
				}
        	}
			
		}
     //   4) Find out total number of students who fail to score passing marks ( passing marks 40%). And print details of students
        System.out.println("_________passing marks 40%_______________");
        System.out.println("");
        for (Result pm : rlist) 
        {
        	int id = pm.getSid();  
        	
        	int total = pm.getMaths()+pm.getHindi()+pm.getEnglish()+pm.getScience()+pm.getScience();
        	
        	double marks =(total*150)/500;
        //	System.out.println(marks);
        	if(marks<40)
        	{
        		List<Student> mlist = sobjdao.getId(id);
        		
        		for (Student m: mlist) {
        			
        			System.out.println("Student Id-"+m.getSid()+" Student Name-"+ m.getSname()+" Student father Name- "+m.getFather_name());
        			System.out.println("marks is "+marks);
				}
        	}
			
		}
       //5) Find out average marks of each class per section. 
 
        System.out.println("---------average marks of each class per section. --------------");
        List<JoinClass> jlist = rdaoObj.joinData();
        int total=0, total1=0, total2=0;
        int countfifth=0;
        int countnine=0;
        int countsix=0;
        
        for (JoinClass jo : jlist) {
        	
        	if(jo.getClassName().equals("fifth") && jo.getSectioname().equals("a"))
        	{
        		countfifth++;
        		total= total+jo.getMath()+jo.getHindi()+jo.getEnglish()+jo.getScience()+jo.getSanskrit();
        	}
        	
        	if(jo.getClassName().equals("nine") && jo.getSectioname().equals("c"))
        	{
        		countnine++;
        		total1 = total1+jo.getMath()+jo.getHindi()+jo.getEnglish()+jo.getScience()+jo.getSanskrit();
        	}
			
        	if(jo.getClassName().equals("sixth") && jo.getSectioname().equals("b"))
        	{
        		countsix++;
        		total2 = total2+jo.getMath()+jo.getHindi()+jo.getEnglish()+jo.getScience()+jo.getSanskrit();
        	}
        	
        }
        System.out.println("average marks of  section a - "+total/countfifth);
        System.out.println("average marks of  section b - "+total2/countsix);
        System.out.println("average marks of  section c - "+total1/countnine);
        
        
           
    //    6) Find out average marks of each class.
     System.out.println();
     System.out.println("-----6 Find out average marks of each class-----------------");
        
        List<JoinClass> list = rdaoObj.joinData();
        
        int total11=0;
        int total22=0;
        int count=0;
        int count1=0;
        
        
        for (JoinClass jo : list) {
        	
        	if(jo.getClassName().equals("fifth"))
        	{
        		count++;
        		total11= total11+jo.getMath()+jo.getHindi()+jo.getEnglish()+jo.getScience()+jo.getSanskrit();
        	}
        	
        	if(jo.getClassName().equals("nine"))
        	{
        		count1++;
        		total22 = total22+jo.getMath()+jo.getHindi()+jo.getEnglish()+jo.getScience()+jo.getSanskrit();
        	}
			
//        	if(jo.getClassName().equals("sixth"))
//        	{
//        		countsix++;
//        		total2 = total2+jo.getMath()+jo.getHindi()+jo.getEnglish()+jo.getScience()+jo.getSanskrit();
//        	}
//        	
        }
        System.out.println();
        System.out.println("Average MArks of  fifth class is -"+total11/count);
        System.out.println("Average Marks of  six class is -"+total22/count1);
        
   
        
	}
}

//  select class1.classid, class1.sectionname,student.sid,student.sname,result.math,result.hindi,result.english,result.science,result.Sanskrit from result JOIN student on student.sid=result.sid join class1 on student.classid=class1.classid;   

