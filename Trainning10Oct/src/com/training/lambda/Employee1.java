package com.training.lambda;

public class Employee1 {
	
	    int id;
	    String name;
	    int age;
	    int salary;
	    String department;
	    
	    public Employee1() {}



	   public Employee1(int id, String name, int age, int salary, String department) {
	        super();
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.salary = salary;
	        this.department = department;
	    }



	   public int getId() {
	        return id;
	    }



	   public void setId(int id) {
	        this.id = id;
	    }



	   public String getName() {
	        return name;
	    }



	   public void setName(String name) {
	        this.name = name;
	    }



	   public int getAge() {
	        return age;
	    }



	   public void setAge(int age) {
	        this.age = age;
	    }



	   public int getSalary() {
	        return salary;
	    }



	   public void setSalary(int salary) {
	        this.salary = salary;
	    }



	   public String getDepartment() {
	        return department;
	    }



	   public void setDepartment(String department) {
	        this.department = department;
	    }



	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", department="
				+ department + "]";
	}



	   
}

