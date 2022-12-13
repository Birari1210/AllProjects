package com.training.Java8.Assingment;

public class Question_8 {
	
	 public static void main(String s[]) 
	  {
	    Runnable r1= new Runnable(){
		   public void run(){
			for(int i=1;i<50;i+=2)
		    System.out.print("-"+i);
		   }
		};
		
		Thread t1= new Thread(r1);
		t1.start();
		Runnable r2 =()->{
			   for(int i=3;i<=50;i+=2)
				    System.out.println("-"+i);
		};
		
		Thread t2= new Thread(r2);
		
		//t2.sleep(70000);
		t2.start();
		
	  }


}
