package TDD_Assingment;

import java.time.LocalDate;
import java.util.Scanner;

public class Item {
	
	int itemId;
	String itemName;
	int costPrice;
	int cellPrice;
	LocalDate DoM;
	LocalDate DoE;
	
	
	public int getItemId() {
		return itemId;
	}
	public boolean setItemId(int itemId) {
		//this.itemId = itemId;
		int count =0;
		int temp = itemId;
		while(itemId>0)
		{
			itemId=itemId/10;
			count++;
		}
		if(count<=3)
		{
			this.itemId=itemId;
			System.out.println("correct id");
			return true;
		}
		else {
			System.out.println("Enter only three digit");
		}
		return false;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public boolean setItemName(String itemName) {
		
		//this.itemName = itemName;
		int count =0;
		
		for (int i = 0; i < itemName.length(); i++) {
	
			char ch =itemName.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
			{
				count++;
			}
		}
		if(count == itemName.length())
		{
			this.itemName = itemName;
			System.out.println("Item Name is done");
           return true;
           
		}
		else
		{
			System.out.println("Enter Only alphabates");
		}
		return false;
		
	}
	public int getCostPrice() {
		return costPrice;
	}
	public boolean setCostPrice(int costPrice) {
		
		if(costPrice>0)
		{
		this.costPrice = costPrice;
		return true;
		}
		else {
			System.out.println("Enter price greter then zero");
		}
		return false;
		
	}
	public int getCellPrice() {
		return cellPrice;
	}
	public boolean setCellPrice(int cellPrice) {
		//this.cellPrice = cellPrice;
		
		if(costPrice != cellPrice)
		{
			this.cellPrice = cellPrice;
          return true;
		}
		else
		{
			System.out.println("Sell And cost Price can not be same");
		}
		return false;
			
	}
	public LocalDate getDoM() {
		return DoM;
	}
	public void setDoM(LocalDate doM) {
		DoM = doM;
	}
	public LocalDate getDoE() {
		return DoE;
	}
	public boolean setDoE(LocalDate doE) {
		if(doE.compareTo(LocalDate.now())!=0)
		{
		this.DoE = doE;
		return true;
		}
		else
		{
			System.out.println("not enter todays date");
		}
		return false;
		
	}
	

	public static void main(String[] args) {
		
		Item obj = new Item();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		obj.setItemId(sc.nextInt()); 		
		
		System.out.println("Enter Item name");
		obj.setItemName(sc.next());
	//	System.out.println(i);
	}

}
