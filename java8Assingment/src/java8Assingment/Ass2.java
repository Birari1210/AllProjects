package java8Assingment;

import java.security.PublicKey;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//2. User will enter employee detail like emp name, date of birth , date of joining, date of resign, 
//work location, department, salary. Now we will check following details.
public class Ass2 {
	
	String empName;
	String workLocation;
	String department;
	LocalDate Dob;
	LocalDate Doj;
	LocalDate Dor;
	int salary;
	
	public Ass2(String empName, String workLocation, String department, LocalDate dob, LocalDate doj, LocalDate dor,
			int salary) {
		super();
		this.empName = empName;
		this.workLocation = workLocation;
		this.department = department;
		Dob = dob;
		Doj = doj;
		Dor = dor;
		this.salary = salary;
	}
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getWorkLocation() {
		return workLocation;
	}
	public void setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
	}
	public LocalDate getDob() {
		return Dob;
	}
	public void setDob(LocalDate dob) {
		Dob = dob;
	}
	public LocalDate getDoj() {
		return Doj;
	}
	public void setDoj(LocalDate doj) {
		Doj = doj;
	}
	public LocalDate getDor() {
		return Dor;
	}
	public void setDor(LocalDate dor) {
		Dor = dor;
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
		return "Ass2 [empName=" + empName + ", workLocation=" + workLocation + ", department=" + department + ", Dob="
				+ Dob + ", Doj=" + Doj + ", Dor=" + Dor + ", salary=" + salary + "]";
	}


	public static void main(String[] args) {
		List<Ass2> emplist = new ArrayList<>();
		emplist.add(new Ass2("Prasad","Jalgaon","Hr",LocalDate.of(1999, 05,22),LocalDate.of(2022,07,23),LocalDate.of(2030,03,04), 30000));
		emplist.add(new Ass2("Nilesh","Nashik","Trainee",LocalDate.of(1997, 07,15),LocalDate.of(2021,05,22),LocalDate.of(2030,04,04), 36000));
		emplist.add(new Ass2("Jaydeep","Dhule","Trainee",LocalDate.of(1996, 10,02),LocalDate.of(2022,06,07),LocalDate.of(2025,05,30), 22000));
		emplist.add(new Ass2("akash","Pune","Hr",LocalDate.of(1999, 05,22),LocalDate.of(2022,07,9),LocalDate.of(2026,03,04), 40000));
		emplist.add(new Ass2("om","pune","Hr",LocalDate.of(1996, 07,22),LocalDate.of(2022,06,20),LocalDate.of(2028,03,04), 30000));

		System.out.println(emplist);
		
// Average  Salary by department;
		
	   Double totalavgByDep1 = emplist.stream().filter(department->"Hr" == department.getDepartment()).collect(Collectors.averagingDouble(Ass2::getSalary));
	   Double totalavgByDep2 = emplist.stream().filter(department->"Trainee" == department.getDepartment()).collect(Collectors.averagingDouble(Ass2::getSalary));

	   System.out.println("Total salary of Employee department is :" +totalavgByDep1);
	   System.out.println("Total salary of Employee department is :" +totalavgByDep2);

//c. Highest and lowest salary of each department. 
	   
	   int maxSalary = emplist.stream().filter(deptm->"Hr" == deptm.getDepartment()).map(Ass2::getSalary).max(Integer::compare).get();
	   int minSalary = emplist.stream().filter(deptm->"Hr" == deptm.getDepartment()).map(Ass2::getSalary).min(Integer::compare).get();

	   System.out.println("Highest salary by Department-" +maxSalary);
	   System.out.println("Lowest salary by Department-" +minSalary);

// d. Department with highest no of employee and lowest no of employee. 
 
	   String dept1= emplist.stream().map(Ass2::getDepartment).max(String::compareTo).get();
	   String dept2= emplist.stream().map(Ass2::getDepartment).max(String::compareTo).get();
	   
	   System.out.println("Department with highest no of employee:-"+dept1);
	   System.out.println("Department with lowest no of employee:-"+dept2);   
	   
	}
}