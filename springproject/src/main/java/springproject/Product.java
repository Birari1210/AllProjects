package springproject;

public class Product {

	String Pname;

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}
	
	public void display()
	{
		System.out.println("Product Name is :-"+Pname);
	}

	

}
