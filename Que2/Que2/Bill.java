package Que2;

import java.sql.Date;

public class Bill {
int billid;
int customerid;
Date dobill;
public int getBillid() {
	return billid;
}
public void setBillid(int billid) {
	this.billid = billid;
}
public int getCustomerid() {
	return customerid;
}
public void setCustomerid(int customerid) {
	this.customerid = customerid;
}
public Date getDobill() {
	return dobill;
}
public void setDobill(Date dobill) {
	this.dobill = dobill;
}

}
