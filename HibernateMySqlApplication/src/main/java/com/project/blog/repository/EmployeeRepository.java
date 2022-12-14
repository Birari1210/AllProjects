package com.project.blog.repository;

import org.springframework.stereotype.Repository;
import com.project.blog.entity.Employee;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
@Repository
@Transactional
public class EmployeeRepository {
	
	@PersistenceContext
	EntityManager entityManager;
	public void insertEmployee() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter employee id ");
		int eid=Integer.parseInt(sc.nextLine());
		System.out.println("Please enter employee age ");
       	int age=Integer.parseInt(sc.nextLine());
		System.out.println("Please enter employee Salary ");
		int salary=Integer.parseInt(sc.nextLine());
		System.out.println("Please enter employee designation ");
		String designation=sc.nextLine();
		System.out.println("Please enter employee name ");
		String ename=sc.nextLine();
		
		Employee emp = new Employee(eid,ename, age, salary,designation);
		entityManager.persist(emp);
	}
	
////	@PersistenceContext
////	EntityManager entityManager1;
//     public void updateEmployee() {
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter employee id ");
//		int eid=Integer.parseInt(sc.nextLine());
//		System.out.println("Please enter employee age ");
//       	int age=Integer.parseInt(sc.nextLine());
//		System.out.println("Please enter employee Salary ");
//		int salary=Integer.parseInt(sc.nextLine());
//		System.out.println("Please enter employee designation ");
//		String designation=sc.nextLine();
//		System.out.println("Please enter employee name ");
//		String ename=sc.nextLine();
//		
//		Employee emp = new Employee(eid,ename, age, salary,designation);
//		entityManager1.merge(emp);
//		
//     }
	
     public Employee getEmployeeById(int id)
     {
    	 Employee e2 = entityManager.find(Employee.class, id);
    	 return e2;
     }
     
     public void deleteEmployee(int id)
     {
    	 Employee e2 = entityManager.find(Employee.class, id);
    	 if(e2==null)
    	 {
    		 System.out.println("the employee does not exists");
    	 }
    	 else
    	 {
    		 System.out.println("the employee deleted ");

    	 }
     }
     
     public List<Employee> getAllEmployees()
     {
    	 String query ="select e from Employee e";
    	 return entityManager.createQuery(query, Employee.class).getResultList();
     }
     
     public List<Employee> getEmployeesAge()
     {
    	 String query ="select e from Employee e where e.age>20";
    	 
    	 return entityManager.createQuery(query, Employee.class).getResultList();
     }
     
     
     public List<String> getEmployeesNames()
     {
    	 String query ="select e.ename from Employee e ";
    	 
    	 return (List<String>)entityManager.createQuery(query).getResultList();
     }
     
     public List<Object[]> getEmployeesNameAndAge()
     {
    	 String query ="select e.ename, e.age from Employee e ";
    	 
    	 return (List<Object[]>)entityManager.createQuery(query).getResultList();
     }
     
     public List<Object[]> getEmployeesNameAndAgecheck(int id)
     {
    	 String query ="select UPPER(e.ename), e.age from Employee e where e.age=?1";
    	 
    	 Query  q = entityManager.createQuery(query);
    	 q.setParameter(1, id);
    	 return (List<Object[]>)q.getResultList();
     }
     
     public long getEmployeeNumber()
     {
    	 String query ="select COUNT(*) from Employee e";
    	 return (long) entityManager.createQuery(query).getSingleResult();

     }
     public double getEmployeeAverageSalary()
     {
    	 String query ="select AVG(e.salary) from Employee e";
    	 return (double) entityManager.createQuery(query).getSingleResult();
     }
     
     public List<Object[]> getDesignationSalary()
     {
    	 String query ="select SUM(e.salary) , e.designation from Employee e GROUP BY e.designation";
    	 Query  q = entityManager.createQuery(query);
    	 return (List<Object[]>)q.getResultList();
     }
     
}
