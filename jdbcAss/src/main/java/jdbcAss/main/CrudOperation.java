package jdbcAss.main;

import java.util.Scanner;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jdbcAss.Item;
import jdbcAss.Test.ItemDAO;

public class CrudOperation {
	
	public static void main(String args[])
	{
		ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationContext.xml");
		ItemDAO objItemDAO = (ItemDAO) objAC.getBean("itembeandao");	
		Scanner sc = new Scanner(System.in);
		int itemNo;
	    String iname;
		String category;
		String company;
		
		int ch; // switch case variable
		
		while(true)
		{
			System.out.println("1 for Insert in item table \n 2 for update item record  \n 3 for delete item record, \n 4 for list all item records \n 5 for exit");
			ch=sc.nextInt();
			sc.nextLine();
			switch(ch)
			{
				case 1:
//					System.out.println("enter item number");        
//       				itemNo=sc.nextInt();

					System.out.println("enter item name");
					iname=sc.nextLine();
					System.out.println("Enter item category");
					category=sc.nextLine();
					System.out.println("Enter item Company");
					company=sc.nextLine();
					
					Item item = new Item();
					
			//		item.setItemNo(itemNo);
					item.setIname(iname);
					item.setCategory(category);
					item.setCompany(company);
					System.out.println("Item details are insert - "+objItemDAO.insertItemByPS(item));
					break;
					
				case 2:
					System.out.println("enter item number");
					itemNo=sc.nextInt();
					System.out.println("enter item name");
					iname=sc.nextLine();
					System.out.println("Enter item category");
					category=sc.nextLine();
					System.out.println("Enter item Company");
					company=sc.nextLine();
					
					Item itemUp = new Item();
					
					itemUp.setItemNo(itemNo);
					itemUp.setIname(iname);
					itemUp.setCategory(category);
					itemUp.setCompany(company);
					System.out.println("Item details are Update"+objItemDAO.updateItemPS(itemUp));
					break;
					
				case 3:
					break;
				case 4:
					break;
		
			}
	
		}
	}
}