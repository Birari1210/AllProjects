package com.springcore.ass12;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp1 = (Employee) ctx.getBean("employee1");
		Employee emp2 = (Employee) ctx.getBean("employee2");
		Employee emp3 = (Employee) ctx.getBean("employee3");
		Employee emp4 = (Employee) ctx.getBean("employee4");

		List<Employee> elist = new ArrayList<Employee>();
		elist.add(emp1);
		elist.add(emp2);
		elist.add(emp3);
		elist.add(emp4);

		System.out.println("maximum salary in  department");

		System.out.println("enter a dept");
		
		Scanner sc = new Scanner(System.in);
		String dept = sc.next();
		Employee emp = elist.stream().filter(s -> s.dept.deptName.equals(dept))
				.max((e1, e2) -> e1.salary > e2.salary ? 1 : -1).get();

		System.out.println(emp.empName + "  " + emp.salary);

		System.out.println("-------------------------------");

		Employee max = elist.stream().max((a, b) -> a.salary > b.salary ? 1 : -1).get();
		System.out.println("Higest salary of employee Name is " + max.empName + " and salary is " + max.salary);

		System.out.println("-------------------------------");

		double aveSalary = elist.stream().collect(Collectors.averagingDouble(i -> i.salary));
		System.out.println("Average salary : " + aveSalary);
		System.out.println("name of the emp havaing salary less than average salary");

		List<Employee> ave = elist.stream().filter(i -> i.salary < aveSalary).collect(Collectors.toList());

		for (Employee e : ave) {
			System.out.println(e.empName + "  " + e.salary);
		}

		System.out.println("-------------------------------");

		System.out.println("average salary of each dept");

		List<String> dept11 = elist.stream().map(i -> i.dept.deptName).distinct().collect(Collectors.toList());

		for (String d : dept11) {
			Double avg1 = elist.stream().filter(e -> e.dept.deptName.equals(d))
					.collect(Collectors.averagingDouble(e -> e.salary));

			System.out.println("dept name : " + dept11.get(0) + "  Average Salary : " + avg1);
			System.out.println("dept name : " + dept11.get(1) + "  Average Salary : " + avg1);
		}

	}

}
