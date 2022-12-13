package com.training.exception.assingment;

public class Employee {

	int id;
	String name;
	int age;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) throws NameInvalidException {
		
		for (int i = 0; i <name.length(); i++)
			
		{	
		char ch = name.charAt(i);
		
		if(ch >='a' && ch<='z' || ch >='A' && ch<='Z'  )
		{
			
			 this.name = name;
		}
		else
		{
			throw new NameInvalidException("please Enter Alphabets  ");
		}
			
	}
		
		
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeInvalidException{
  
	  if(age<18)
	  {
		  throw new AgeInvalidException("employee age is must be above 18 years ");
	  }
	  else
		  this.age = age;
  }



	public static void main(String[] args) {
		
         Employee e = new Employee();
         e.setId(3);
         try {
         e.setName("666vinod");
         System.out.println(e.getName());
         }
         catch (NameInvalidException na) {
        	 System.out.println(na.getMessage());
		}
         try {
        	 
         e.setAge(20);
         System.out.println(e.getAge());
         }
         catch (AgeInvalidException ex ) {
        	 System.out.println(ex.getMessage());
		}
        
	
	}

	
}
