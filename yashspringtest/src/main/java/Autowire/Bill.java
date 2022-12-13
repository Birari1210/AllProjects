package Autowire;

//Ass4
//write down code to implement the autowiring, perform autowiring for bill class in which 
//item and customer detail will be injected. Use by type autowiring

public class Bill {
	
	int totalBill;
	String category;
	Item itmObj;
	Costomer cosObj;
	
	
	public Bill() {
		super();
	}
	public int getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(int totalBill) {
		this.totalBill = totalBill;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Item getItmObj() {
		return itmObj;
	}
	public void setItmObj(Item itmObj) {
		this.itmObj = itmObj;
	}
	public Costomer getCosObj() {
		return cosObj;
	}
	public void setCosObj(Costomer cosObj) {
		this.cosObj = cosObj;
	}
	
	public Bill(int totalBill, String category, Item itmObj, Costomer cosObj) {
		super();
		this.totalBill = totalBill;
		this.category = category;
		this.itmObj = itmObj;
		this.cosObj = cosObj;
	}
	public void billDetails()
	{
		itmObj.itemShow();
	    System.out.println("Item category- "+category);
		cosObj.cDetails();
		System.out.println("Total Bill of costomer-"+totalBill);
		
		
	}
}
