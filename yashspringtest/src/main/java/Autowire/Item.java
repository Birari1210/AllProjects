package Autowire;
// Ass3
//write down code to implement the autowiring, perform autowiring for bill class in which 
//item and customer detail will be injected. Use by type autowiring

public class Item {

	String name; 
	int price;
	
	public Item() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public void itemShow()
	{
		System.out.println("Item Name:- "+name);
		System.out.println("Item Price:- "+price);
	}
}
