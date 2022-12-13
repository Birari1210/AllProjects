package java8Assingment;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

//10. WAP to create 10 objects of employee class, add all object to arraylist and from arraylist we 
//need to convert this to map and set using stream api
public class EmployeeAss10 {
	int empid;
	String empName;
	double salary;

	public EmployeeAss10(int empid, String empName, double salary) {
		this.empid = empid;
		this.empName = empName;
		this.salary = salary ;
	}
}
		class EmployeeAss10Main {
		public static void main(String[] args)
		{
		List<EmployeeAss10> list=new ArrayList<EmployeeAss10>();
		list.add(new EmployeeAss10(1,"Rahul" ,20000.0));
		list.add(new EmployeeAss10(2,"JAydeep" ,10000.0));
		list.add(new EmployeeAss10(3,"Ramesh" ,20000.0));
		list.add(new EmployeeAss10(4,"nilesh" ,10000.0));
		list.add(new EmployeeAss10(5,"jayesh" ,25000.0));
		list.add(new EmployeeAss10(6,"vinod" ,30000.0));
		list.add(new EmployeeAss10(7,"akash" ,21000.0));
		list.add(new EmployeeAss10(8,"jagdish" ,80000.0));
		list.add(new EmployeeAss10(9,"Ashish" ,9000.0));
		list.add(new EmployeeAss10(10,"nikhil" ,1000.0));
		
		//List to map
		Map<Integer,String> elist=list.stream().collect(Collectors.toMap(e->e.empid,e->e.empName));
		System.out.println(elist);
		
		System.out.println("-------------------------------------------");
		
		//List to set
		Set<String> listSet=list.stream().map(e->e.empName).collect(Collectors.toSet());
		System.out.println("employee Name:- "+listSet);
		}
}