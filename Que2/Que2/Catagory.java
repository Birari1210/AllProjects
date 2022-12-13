package Que2;

public class Catagory {
int catid;
String catname;

public int getCatid() {
	return catid;
}
public void setCatid(int catid) {
	this.catid = catid;
}
public String getCatname() {
	return catname;
}
public void setCatname(String catname) {
	this.catname = catname;
}
@Override
public String toString() {
	return "Catagory [catid=" + catid + ", catname=" + catname + "]";
}

}
