package java8Assingment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//6. WAP to create list of item price whose price is less than avg price of all item.
//Assingment 6
public class ItemAss6 {

	int itemId;
	String itemName;
	int itemPrice;
	
	public ItemAss6(int itemId, String itemName, int itemPrice) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}

	class ItemMain
	{
		public static void main(String[] args) {
			List<ItemAss6> ilist=new ArrayList<ItemAss6>();
			ilist.add(new ItemAss6(1,"biskit",20));
			ilist.add(new ItemAss6(2,"dairymilk",40));
			ilist.add(new ItemAss6(3,"Chips",55));
			ilist.add(new ItemAss6(4,"KinderJoy",50));
		
			double avgprice = ilist.stream().collect(Collectors.averagingDouble(avg->avg.itemPrice));
			System.out.println("avrage price :-" +avgprice);
			
			List<Integer> itemlist = ilist.stream().filter(b->b.itemPrice>=avgprice).map(b->b.itemPrice).collect(Collectors.toList());
			System.out.println(itemlist);
			
		}	
	}
}	
	
	
	


