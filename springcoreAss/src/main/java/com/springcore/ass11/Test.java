package com.springcore.ass11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student1 = (Student) ctx.getBean("student1");
		Student student2 = (Student) ctx.getBean("student2");
		Student student3 = (Student) ctx.getBean("student3");
		Student student4 = (Student) ctx.getBean("student4");

		List<Student> slist = new ArrayList<Student>();

		slist.add(student1);
		slist.add(student2);
		slist.add(student3);
		slist.add(student4);

		for (Student s : slist) {
			System.out.println(s.studentName + " " + s.result.total);
		}

		List<Student> sortstudlist = slist.stream().sorted((s1, s2) -> Float.compare(s1.result.total, s2.result.total))
				.collect(Collectors.toList());

		System.out.println("sorted list of student basis of total marks");

		for (Student s : sortstudlist) {
			System.out.println(s.studentName + " " + s.result.total);
		}

	}

}
