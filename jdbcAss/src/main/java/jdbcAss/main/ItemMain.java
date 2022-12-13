package jdbcAss.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jdbcAss.Item;
import jdbcAss.Test.ItemDAO;


//add item, edit item and delete item along with add/edit and delete of company

public class ItemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext objAC = new ClassPathXmlApplicationContext("applicationcontext.xml");
		  
		  ItemDAO objidao = (ItemDAO) objAC.getBean("itembeandao");
		  Item itemobj = new Item();
//		  
//		  itemobj.setItemNo(128);
//		  itemobj.setIname("smartTV");
//		  itemobj.setCategory("Tv");
//		  itemobj.setCompany("Onida");
		  
		  System.out.println("Item table Row are inseted  ="+objidao.addItem(itemobj));

		  itemobj.setItemNo(113);
		  itemobj.setIname("Boat HeadPhone");
		  itemobj.setCategory("Headphone");
		  itemobj.setCompany("Boat");
		  
		  System.out.println("Item  data is update : "+objidao.updateItem(itemobj));
		  
	//	  System.out.println("record deleted count :- "+objidao.DeleteItem(113));

	}
}
