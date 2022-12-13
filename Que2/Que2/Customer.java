package Que2;

import java.sql.Date;


public class Customer {
int customerid;
String customername;
String email;
String add1;
Date dob;
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
String add2;
String pincode;
public int getCustomerid() {
	return customerid;
}
public void setCustomerid(int customerid) {
	this.customerid = customerid;
}
public String getCustomername() {
	return customername;
}
public void setCustomername(String customername) {
	this.customername = customername;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAdd1() {
	return add1;
}
public void setAdd1(String add1) {
	this.add1 = add1;
}
public String getAdd2() {
	return add2;
}
public void setAdd2(String add2) {
	this.add2 = add2;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Customer [customerid=" + customerid + ", customername=" + customername + ", email=" + email + ", add1="
			+ add1 + ", add2=" + add2 + ", pincode=" + pincode + "]";
}

}
