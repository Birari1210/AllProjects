package com.training.lambda;


import java.util.Arrays;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;

 class Employee implements Comparable<Employee> {

    private String empId;
    private String empName;
    private Integer salary;
    private String empRole;
    
    public Employee(String empId, String empName, Integer salary, String empRole) {
        this.empId=empId;
        this.empName=empName;
        this.salary=salary;
        this.empRole=empRole;
    }
    
    public String getEmpId() {
        return empId;
    }
    public void setEmpId(String empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public Integer getSalary() {
        return salary;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    public String getEmpRole() {
        return empRole;
    }
    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }
    
    
    
    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", empRole=" + empRole
                + "]";
    }


   @Override
    public int compareTo(Employee object) {
        /**
         * compareTo() compares two string values lexicographically
         * and returns either 1, 0 or -1.
         * 0 if both the strings are same.
         * 1 if str1>str2 (in str1.compareTo(str2))
         * -1 if str1<str2 (in str1.compareTo(str2))
         */
        return this.empName.compareTo(object.empName);
    }
    
}

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> empList = Arrays.asList(new Employee("T1001","Arnold",50000,"Manager"),
                new Employee("T1002","Zarvis",35000,"Consultant"),
                new Employee("T1003","Mathew",65000,"Manager"),
                new Employee("T1004","Santana",40000,"Associate"));
        Collections.sort(empList);
        //get consume only value not return any value
        
        
        Consumer<Employee> empDisplay=(emp)->{System.out.println(emp.getEmpName()+" has salary "+emp.getSalary()+" role is "+emp.getEmpRole());};
       
        Function<Employee, Integer> empSal =(emp)->{return emp.getEmpRole().equals("Manager")?emp.getSalary()+5000:emp.getSalary();}; 
        
        Predicate<Employee> checkJob =(emp)->emp.getEmpRole().equals("Consultant"); // return true or false
        
        for(Employee e :empList) {
            //Displaying Salary of all Employees before Increment using "Consumer":
            empDisplay.accept(e);
            System.out.println(empSal.apply(e));
            
            //list of all consultant using predicates
            System.out.println(checkJob.test(e)?e:"");
            
	  }
	}
}

	  