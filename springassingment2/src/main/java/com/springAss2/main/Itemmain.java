package com.springAss2.main;

import java.sql.Date;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springAss2.dao.ItemDao;
import com.springAss2.model.Customer;
import com.springAss2.model.Item;

// Item :- itemid, iname, subcatid, price, dom (not null), date_of_expiry(null allowed), instock, discount

public class Itemmain {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
		ItemDao iObjdao = (ItemDao) ctx.getBean("itembean");
		Item iobj = new Item();
		
//		Scanner sc = new Scanner(System.in);
//		
//		  System.out.println("Enter ItemId -");
//		  iobj.setItemid(sc.nextInt());
//		  System.out.println("Enter Item name -");
//		  iobj.setItemName(sc.next());
//		  System.out.println("Enter Item subCategory Id -");
//          iobj.setSubcatid(sc.nextInt());
//          System.out.println("Enter Item price -");
//          iobj.setPrice(sc.nextDouble());
//          System.out.println("Enter item date of manifactuare-");
//          String s = sc.next();
//          Date date1 = Date.valueOf(s);
//          iobj.setDom(date1);
//          System.out.println("Enter date of expiry-");
//          String s1 =  sc.next();
//          Date date2 = Date.valueOf(s1);
//          iobj.setDoe(date2);
//          System.out.println("Enter in stock item");
//          iobj.setInstock(sc.nextInt());
//          System.out.println("Enter item discount value");
//          iobj.setDiscount(sc.nextInt());
//          
//    	  System.out.println("Result added in table count="+iObjdao.addItem(iobj));

		

		
		System.out.println("---------total number of item in each subcategory---------");
		
		Map<String, Integer> slist1 = iObjdao.ass1();
		System.out.println("Total number of iteam in subcatagory = " + slist1);

		System.out.println();
		
		System.out.println("--------------2) Find out total number of item in each category----------");
		Map<String, Integer> slist2 = iObjdao.ass2();
		System.out.println("Total number of iteam in catagory = " + slist2);
		

		System.out.println("------------3) Find out total number of item which are out of stock------");

		List<Integer> slist3 = iObjdao.que3();
		System.out.println("Total number item  out of stock = " + slist3);
		
		
		
		System.out.println("--------------------4) items from each category which are out of stock------------");
		Map<String, Integer> slist4 = iObjdao.ass4();
		System.out.println("Total number of item are out of stock in each catagory = " + slist4);
		
		
		
		System.out.println("----------------5) items which are out of stock-----------------");

		List<Item> ilist5 = iObjdao.ass5();

		if (!ilist5.isEmpty()) {

			for (Item i1 : ilist5) {
				System.out.println(i1.toString());

			}
	}
		
		System.out.println("---------6) items which are having price greater than average marks---------");

		List<Item> ilist6 = iObjdao.ass6();
		if (!ilist6.isEmpty()) {
			for (Item e1 : ilist6) {
				System.out.println(e1.toString());
				

			}

		}
		
		System.out.println("------------------7) item which are having highest discount --------------------");
		List<Integer> elist7 = iObjdao.ass7();
		System.out.println("Item which are having highest discount = " + elist7.toString());

//		List<Item> elist71 = iObjdao.ass71();
//		if (!elist71.isEmpty()) {
//			for (Item e1 : elist71) {
//				System.out.println(e1.toString());
//						
//			}
//   }
	
		System.out.println("-------8) items which are having lowest selling.---------");
		Map<String, Integer> elist8 = iObjdao.Ass8();
		System.out.println("Iteam which are having lowest selling = " + elist8);
		System.out.println();
		System.out.println("--------9) items which are having highest selling-------------");
		Map<String, Integer> elist9 = iObjdao.ass9();
		System.out.println("Item which are having highest discount = " + elist9);
		System.out.println();
		
		System.out.println("----------10) details of customer which buy item often--------------");
		Map<String, Integer> elist10 = iObjdao.ass10();
		System.out.println("customer details which buy item often = " + elist10);
		System.out.println();
		
		System.out.println(	"--------11) details of customer which buy item very less.---------------");
		Map<String, Integer> elist11 = iObjdao.ass11();
		System.out.println("Iteam which are having highest discount = " + elist11);
		
		
		System.out.println("-----------12) Print details of those customer whose billing is more than average billing---");
		List<Customer> elist12 = iObjdao.ass12();
		System.out.println("Avg price = 20000 ");
		if (!elist12.isEmpty()) {
		
			for (Customer e5 : elist12) {
				System.out.println(e5.toString());
		
			}
		
		}
		System.out.println("------------13) items which are purchased in given date range.------------");
		List<Item> elist13 = iObjdao.ass13();
		if (!elist13.isEmpty()) {
			for (Item e1 : elist13) {
				System.out.println(e1.toString());
		
			}
			
			System.out.println("------------14) total selling of each day.---------------------");
			Map<Date, Integer> elist14 = iObjdao.ass14();
			System.out.println("selling date - "+elist14);
			
		}
			
		System.out.println("----------------------15)average selling of each day.----------");		
		Map<Date, Integer> elist15 = iObjdao.ass15();
		System.out.println(elist15);



		}



}
