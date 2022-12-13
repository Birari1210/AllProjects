package com.training.Java8.Assingment;

interface Calculate
{
	void calculateEmi();
}
public class Question_7 {

	public static void main(String[] args) {

      Calculate  obj = () -> {		
		 double principal =12000 ;      
		    
	        double rate =10 ;
	              
	        double time =1 ;
	      
	        rate=rate/(12*100); 
	 
	        time=time*18; 
	            
	        double emi= (principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
	      
	        System.out.print(" EMI is = "+emi);
	        
      };
      obj.calculateEmi();
      
	}

}
