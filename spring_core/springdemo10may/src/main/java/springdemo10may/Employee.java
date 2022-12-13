package springdemo10may;

public class Employee {
int empid;
String ename;
Address objAddress;

public Employee(int empid, String ename, Address objAddress) {
	 
	this.empid = empid;
	this.ename = ename;
	this.objAddress = objAddress;
}
public void showEmpDetail()
{
   System.out.println("empid:- "+empid);
   System.out.println("employee name :- "+ename);
   objAddress.showAddress();
}
}
