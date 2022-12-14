package com.project.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.blog.config.SpringConfiguration;
import com.project.blog.entity.Dog;
import com.project.blog.repository.EmployeeRepository;

@SpringBootApplication
public class HibernateMySqlApplication implements CommandLineRunner {

	
	@Autowired
	EmployeeRepository employeeRepository;
	public static void main(String[] args) {
		SpringApplication.run(HibernateMySqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//System.out.println("my Spring boot application ");
//		
//		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//		Dog d1 =contex.getBean(Dog.class);
//		d1.bark();
		//employeeRepository.insertEmployee();
		//employeeRepository.updateEmployee();
		//System.out.println( employeeRepository.getEmployeeById(1));
		//employeeRepository.deleteEmployee(3);
		
		//System.out.println( employeeRepository.getAllEmployee());.stream().forEach(System.out.print);
		
		//employeeRepository.getAllEmployees().stream().forEach(System.out::print);
		
		employeeRepository.getEmployeesAge().stream().forEach(System.out::print);
		
		
	//	employeeRepository.getEmployeesNames().stream().forEach(System.out::println);
	//	employeeRepository.getEmployeesNameAndAge().stream().forEach(e->e.System.out.println([0]+" "+[1]));
		//employeeRepository.getEmployeesNameAndAgecheck(20).stream().forEach(e->System.out.println(e[0]+" "+e[1]));
		
		
    // 	System.out.println(employeeRepository.getEmployeeNumber());
	//	System.out.println("avg salary - "+employeeRepository.getEmployeeAverageSalary());

		//employeeRepository.getDesignationSalary().stream().forEach(e->System.out.println(e[0]+" "+e[1]));



	}

}
