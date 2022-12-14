package com.yash.assingment.controller;

import java.util.ArrayList;


import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.assingment.model.Student;
import com.yash.assingment.model.Student_test_attempt;
import com.yash.assingment.model.Teacher;
import com.yash.assingment.model.Test;
import com.yash.assingment.model.Test_question;
import com.yash.assingment.repo.TestRepo;
import com.yash.assingment.service.StudentService;
import com.yash.assingment.service.StudenttestattemptService;
import com.yash.assingment.service.TeacherService;
import com.yash.assingment.service.TestService;
import com.yash.assingment.service.Test_questionService;

@RestController
@RequestMapping("/root")
public class Controller 
{
//	@Autowired
//	TestService Tservice;
//	
	@Autowired 
	TeacherService TSobj;	
	@Autowired
	StudentService studentServiceobj;
	
	@Autowired
	TestService testService;
	
	@Autowired 
	Test_questionService testqueService;

	@Autowired
	StudenttestattemptService staService;
	
	
	@RequestMapping("/demo")
	public void m1()
	{
		System.out.println("m1");
	}
	
//	@RequestMapping("/addtest")
//	public void addtest(@RequestBody Test objtest)
//	{
//		Test objuser1 = Tservice.addtest(objtest);
//		System.out.println(objuser1.getTestid());
//	}
	
	@RequestMapping("/addteacher")
	public void addteacher(@RequestBody Teacher objteach)
	{
		Teacher objteach1 = TSobj.addteacher(objteach);
		System.out.println(objteach1.getTeacherid());
	}
	
	@RequestMapping("/addStudent")
	public void addStud(@RequestBody Student stud)
	{
		Student objstud1 = studentServiceobj.addStud(stud);
		System.out.println(objstud1.getSid());
	}
	
	//print total number of questions given by each teachers
/*	@RequestMapping("/ass1")
	public void Ass1()
	{
		List<Teacher> tealist =TSobj.getListOfTeacher();//all teacher
		
		for (Teacher test1 : tealist) 
		{
			int count=0;
			System.out.println(test1.getTeachername()+" "+test1.getTeacherid());
			
			List<Test> test = test1.getTest();
			for (Test t : test) {
				//int count=0;

				count =count+t.getTq().size();
				count ++;
				System.out.println("total number of Quetion given by each teacher is "+count);
			}
		}
		*/
		
//		List<Test_question> tqlist =  testqueService.getlistOfQuestion();
//		for (Test_question tq : tqlist) {
//			
//			System.out.println(tq.getQid()+" "+tq.getQuestion()+" "+tq.getTestid());
//		}

//********************************************************************************************		
		
	//2---Write query to print teacher name total number of test created.
		
		@RequestMapping("/ass2")	
		public void  Ass2()
		{
			System.out.println("-------------------------print teacher name total number of test created--------------------------------------------");
			List<Test> tea = testService.getListtestService();
			
			
			int count =0;

			for (Test tst : tea) {
				
				count++;
				System.out.println("testName - "+tst.getTestname()+"  "+"teacher NAme- "+tst.getTeacher().getTeachername());
				

			}
			System.out.println("total test created  "+count);
		}
	/*************************************************************************/
//		3 )Write query to print student total marks obtained for each test for given student name
		
		   @RequestMapping("/ass3")
	        public void get_marks()
	        {
	            List<Student> slist = studentServiceobj.getListOfStudent();
	            for (Student s : slist)
	            {
	                int marks = 0;
	                int sum=0;
	                System.out.println("Student Name- "+s.getSname());
	                List<Student_test_attempt> attemptlist = s.getAttempts();
	                for (Student_test_attempt sta : attemptlist)
	                {
	                    Optional<Test_question> tq = testqueService.getQuestionById(sta.getTest_question().getQid());
	                    String ans = tq.get().getCorrectanswer();
	                    marks=0;
	                    if (sta.getMarked_answer().equals(ans))
	                    {
	                        marks++;
	                        sum=sum+marks;//done
	                        System.out.println("TestName :"+sta.getTest_question().getTest().getTestname()+"   "+marks);                  
	                    }              
	                }
	                System.out.println("  Total  marks  " + sum);
	            }
	        }
		
/*******************************************************************************/
//4Write query to print result of students for teacher by teacher name

		
@RequestMapping("/ass4")
public void ass4()
{
	System.out.println("-------------------print result of students for teacher by teacher name--------------------");
	List<Teacher> teacher = TSobj.getListOfTeacher();
	for (Teacher teacher1 : teacher) {
		
		System.out.println("teacher name ="+teacher1.getTeachername());
		List<Test> test = teacher1.getTest();
		
		for(Test test3 : test)
		{
			List<Test_question> tque = test3.getTq();
			for (Test_question test2 : tque) {
				
				List<Student_test_attempt> sta = test2.getStaaAttempts();
				for (Student_test_attempt sta1 : sta) {
					
					int marks=1;
					System.out.println("  Student name " + sta1.getStudent().getSname());
					sta1.getTest_question().getStaaAttempts();
					String correctanswers = test2.getCorrectanswer();
					
					if(sta1.getMarked_answer().equals(correctanswers))
					{
						marks++;
					}
					if(marks>0)
					{
						System.out.println(" student marks :"+marks);
					}
					else {
						System.out.println(  sta1.getStudent().getSname()+" is fail in test");
					}
					
		
				}
				
			}
			
		}
	}
	}
/*********************************************************************************************************/
	
	//5 Count how many test is given by a student
	// Student_test_attempt madhum compare karayache ahe student_sid qid barobar
	@RequestMapping("/ass5")
	public void  Ass5()
	{
		 List<Student> stlist=studentServiceobj.getListOfStudent();
		 System.out.println("---------------------Count how many test is given by a student---------------------------------");
		// int count=0;
		 for (Student student : stlist) {
			 
			 int count =0;
			 int temp=0;
			 System.out.println("Student name "+student.getSname());
			 String s1 = student.getSname();
			 List<Student_test_attempt> sta = staService.getListOfTestAttemp();
			 
			 for (Student_test_attempt student2 : sta) {
			//	int count =0;	
				 int qid = student2.getTest_question().getQid();
				 int testid = student2.getTest_question().getTestid();
				 Optional<Test_question> ques = testqueService.findByid(qid);
				 
				 int testid2 = ques.get().getTest().getTestid();
	             if(testid==testid2 && temp!=testid)
				 {
					 temp=testid2;
					count++;
					// System.out.println("temp if meadhe"+temp);

				 }
			}
			 System.out.println(" test count"+count);
//			 System.out.println(temp+"temp");
		 }
		 
	}
	
/*******************************************************************************************/	
	
// Calculate average wrong questions attempt by students.
// Calculate average correct questions attempt by students.
		
	@RequestMapping("/ass6")
	public void ass6()
	{
		List<Test_question> allque = testqueService.getlistOfQuestion();
		int correct =0;
		int wrong =0;
		for (Test_question test_que : allque) {
			
			List<Student_test_attempt> sta = test_que.getStaaAttempts();
			for (Student_test_attempt sta1 : sta) {
				
				String markedAns =  sta1.getMarked_answer();
				String correctAns = test_que.getCorrectanswer();
				
				if(markedAns.equals(correctAns))
				{
					correct++;
					
				}
				else
				{
					wrong++;
				}
				
			}
		}
			double avg=wrong*100/(wrong+correct);
	        System.out.println("Wrong quetions attempt average  "+avg);

	        double avg1=correct*100/(wrong+correct);
	        System.out.println("correct quetions attempt average  "+avg1);

		}

	/************************************************************************************/
// Print details of students who score highest marks in test.

	@RequestMapping("/ass8")
	public void ass8()
	{
	   // int max=Integer.MIN_VALUE;
	   int max =0;
	   String name="";
	   List<Student> allStud = studentServiceobj.getListOfStudent();
	 for (Student student : allStud) {
		 
		   int marks=0;

		 List<Student_test_attempt> sta = student.getAttempts();
		 
		 for (Student_test_attempt sta1 : sta)
		        {  
		            String correctanswer = sta1.getTest_question().getCorrectanswer();
		            String marked_answer = sta1.getMarked_answer();
		            if(correctanswer.equals(marked_answer))
		            {
		                marks++;
		            }          
		        }
		        if(max<marks)
		        {
		        	max=marks;
		            name=student.getSname();
		        }
		    }
		    System.out.print(" Student Name : "+name);
		    System.out.println("   highest marks in test : "+max);
		}
		
	
/*****************************************************************************************************/
	// Print details of students who score lowest marks in test. 
	
	 @RequestMapping("/ass9")
   public void Ass9()
   {
       int min=Integer.MAX_VALUE;
       String name="";
       List<Student> allStudent = studentServiceobj.getListOfStudent();
       for (Student student : allStudent)
       {
           int marks=0;
           List<Student_test_attempt> sta = student.getAttempts();
           for (Student_test_attempt sta1 : sta)
           {  
               String correctanswer = sta1.getTest_question().getCorrectanswer();
               String marked_answer = sta1.getMarked_answer();
               if(correctanswer.equals(marked_answer))
               {
                   marks++;
                  // System.out.println(student.getSname()+"stud name");
               }
           }
               if(min>marks)
               {
            	   min=marks;
                   name=student.getSname();
               }              
       }
       System.out.print(" Student Name : "+name);
       System.out.println(" lowest mark in Test : "+min);
   }
	
	
	
	
	
	
}
	
		


	


