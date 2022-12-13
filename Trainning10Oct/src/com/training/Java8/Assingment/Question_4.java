package com.training.Java8.Assingment;

public class Question_4 {
   
	    String obj_name;
	      
	    public Question_4(String obj_name) 
	    {
	        this.obj_name = obj_name;
	    }
	      
	    static void show()
	    {
	        Question_4 t1 = new Question_4("t1"); 
	        display();
	          
	    }
	    static void display()
	    {
	    	Question_4 t2 = new Question_4("t2"); 
	    }
	      
	    public static void main(String args[])
	    {
	        show();
	          
	        System.gc();
	    }
	      
	    @Override
	    protected void finalize() throws Throwable 
	    {
	        System.out.println(this.obj_name + " successfully garbage collected");
	    }
	
}
