package springdemo10may;

public class Product {
int pid;
String pname;
float price;
Category objCat;

public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public Category getObjCat() {
	return objCat;
}
public void setObjCat(Category objCat) {
	this.objCat = objCat;
}
void printCategory()
{
 System.out.println("catid :-" +objCat.getCatid());
 System.out.println("cat Name :-" +objCat.getCatname());
}

}
