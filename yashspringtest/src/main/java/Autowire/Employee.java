package Autowire;

//Ass4 -write down code to implement the autowiring, perform autowiring for bill class in which 
//item and customer detail will be injected. Use by type autowiring

public class Employee {

	String ename;
	int empid;
	EmpInfo EmpObj;

	public Employee(String ename, int empid, EmpInfo empObj) {
		super();
		this.ename = ename;
		this.empid = empid;
		EmpObj = empObj;
	}

	public void EmployeeDetails() {
		System.out.println("Employee name :- " + ename);
		System.out.println("Employee Id :- " + empid);
		System.out.println("Employee Department :- " + EmpObj.getDepdepartment());
		System.out.println("Salary :- " + EmpObj.getSalary());
		System.out.println("Employee Date Of Join :- " + EmpObj.getDoj());

	}

}
