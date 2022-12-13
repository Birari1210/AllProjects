package springdemo10may;

public class Customer {
int custid;
String custname;
Address objAdd;

public Customer(int custid, String custname ) { 
	this.custid = custid;
	this.custname = custname;	 
}
public Customer(int custid, String custname, Address objAdd) {
	super();
	this.custid = custid;
	this.custname = custname;
	this.objAdd = objAdd;
}

public void showDetail()
{
 System.out.println("cust id:-"+custid);	
System.out.println("customer name:- "+custname);
objAdd.showAddress();
}
	
}
