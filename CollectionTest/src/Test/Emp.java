package Test;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

import CollectionAss.City;

public class Emp {

	public static void main(String[] args) {
		  
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1,"Raj", 20000));
		list.add(new Employee(2,"jay",25000));
		list.add(new Employee(3,"nikhil", 30000));
		
		List<Employee> Empl = list.stream().filter((Employee epl) ->{
			return epl.salary()<20000;
		}).collect(Collectors.toList());
		
		System.out.println(Empl);
	
//		List<Employee> Empl = list.stream().filter(e->e.salary<=25000).collect(Collectors.toList());
//		
//		System.out.println(Empl);
	}
}
