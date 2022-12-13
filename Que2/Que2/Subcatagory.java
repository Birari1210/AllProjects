package Que2;

public class Subcatagory {
public int subcatid;
public int catid;
public String subcatname;
public Catagory cat;
public Catagory getCat() {
	return cat;
}
public void setCat(Catagory cat) {
	this.cat = cat;
}
public int getSubcatid() {
	return subcatid;
}
public void setSubcatid(int subcatid) {
	this.subcatid = subcatid;
}
public int getCatid() {
	return catid;
}
public void setCatid(int catid) {
	this.catid = catid;
}
public String getSubcatname() {
	return subcatname;
}
public void setSubcatname(String subcatname) {
	this.subcatname = subcatname;
}
@Override
public String toString() {
	return "Subcatagory [subcatid=" + subcatid + ", catid=" + catid + ", subcatname=" + subcatname + ", cat=" + cat
			+ "]";
}


}
