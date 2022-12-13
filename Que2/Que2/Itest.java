package Que2;

import java.sql.Date;
import java.util.List;
import java.util.Map;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Itest {
	public static void main(String[] args) {
		ApplicationContext objq = new ClassPathXmlApplicationContext("Que2.xml");
		IteamDao i1 = (IteamDao) objq.getBean("iteamdao");
		List<Iteam> elist = i1.getDataByResultSetExtractor();

		if (!elist.isEmpty()) {

			for (Iteam e : elist) {
				System.out.println(e.toString());

			}
		}
		System.out.println("================1) - total number of item in each subcategory==========================");
		Map<String, Integer> slist1 = i1.getDataByResultSetExtractor1();
		System.out.println("Total number of iteam in subcatagory = " + slist1);

		System.out.println("==============2) Find out total number of item in each category=====================");

		Map<String, Integer> slist2 = i1.getDataByResultSetExtractor1();
		System.out.println("Total number of iteam in catagory = " + slist2);

		System.out.println("===========================3) Find out total number of item which are out of stock======");

		List<Integer> slist3 = i1.que3();
		System.out.println("Total number of Iteam which are out of stock = " + slist3);

		System.out.println("=======================4) items from each category which are out of stock=============================");
		Map<String, Integer> slist4 = i1.que4();
		System.out.println("Total number of iteam in catagory = " + slist4);

		
		System.out.println("==================================5) items which are out of stock====================");

		List<Iteam> elist5 = i1.que5();

		if (!elist5.isEmpty()) {

			for (Iteam e1 : elist5) {
				System.out.println(e1.toString());

			}

		}
		System.out.println("------------------------6) iteams which are having price greater than average marks---------------------------");

		List<Iteam> elist6 = i1.que6();
		if (!elist5.isEmpty()) {
			for (Iteam e1 : elist6) {
				System.out.println(e1.toString());

			}

		}
		System.out.println(
				"==========================7) item which are having highest discount================================");
		List<Float> elist7 = i1.que7();
		System.out.println("Iteam which are having highest discount = " + elist7);

		System.out
				.println("===================8)  items which are having lowest selling.==============================");
		Map<String, Integer> elist8 = i1.que8();
		System.out.println("Iteam which are having lowest selling = " + elist8);
		System.out.println(
				"=============================9) items which are having highest selling======================");
		Map<String, Integer> elist9 = i1.que9();
		System.out.println("Iteam which are having highest discount = " + elist9);
		System.out.println(
				"=====================10) details of customer which buy item often===============================");
		Map<String, Integer> elist10 = i1.que10();
		System.out.println("Iteam which are having highest discount = " + elist10);

		System.out.println(
				"================================11) details of customer which buy item very less. ===============================================");
		Map<String, Integer> elist11 = i1.que11();
		System.out.println("Iteam which are having highest discount = " + elist11);

		System.out.println("===============12)f those customer whose billing is more than average billing\r\n"
				+ " ================================");
		List<Customer> elist12 = i1.que12();
		System.out.println("Avg price =  46666.6667");
		if (!elist12.isEmpty()) {

			for (Customer e5 : elist12) {
				System.out.println(e5.toString());

			}

		}
		System.out.println(
				"===========================13) items which are purchased in given date range.================");
		List<Iteam> elist13 = i1.que13();
		if (!elist13.isEmpty()) {
			for (Iteam e1 : elist13) {
				System.out.println(e1.toString());

			}
			System.out.println(
					"=======================14) total selling of each day.========================================");
			Map<Date, Integer> elist14 = i1.que14();
			System.out.println(elist14);
       System.out.println("========================15)average selling of each day.===========================================================");		}
		Map<Date, Float> elist15 = i1.que15();
		System.out.println(elist15);
	
	}

}
