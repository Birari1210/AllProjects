package Ques_15;

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

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(int costPrice) {
		this.costPrice = costPrice;
	}

	public int getCellPrice() {
		return cellPrice;
	}

	public void setCellPrice(int cellPrice) {
		this.cellPrice = cellPrice;
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

	public void setDoE(LocalDate doE) {
		DoE = doE;
	}

	public static String items()
	{
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter to string");

		  String str = sc.nextLine();
		  if(str.matches("[a-zA-Z]+"))
				  {
		 // boolean result = str.matches("[a-zA-Z]+");
		  System.out.println("please enter only alphabates");
				  }
		  return str;
	}
	
	
	public static void main(String[] args) {
//		 Scanner sc = new Scanner(System.in);
//		  String str = sc.nextLine();
	      //  boolean result = str.matches("[a-zA-Z]+");
	       // System.out.println("Original String : " + str);
	      //  System.out.println("Does string contain only Alphabets? : " + result);

		System.out.println(Item.items());
	
	}
}


