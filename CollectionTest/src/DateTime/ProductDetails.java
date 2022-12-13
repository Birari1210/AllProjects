package DateTime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ProductDetails {

	public static void main(String[] args) {
																						                  //discount
		Product p1 = new Product(1, "Milk", 1000, LocalDate.of(2022, 05, 01), LocalDate.of(2022, 05, 16), 10);
		Product p2 = new Product(2, "Oil", 1500, LocalDate.of(2022, 04, 10), LocalDate.of(2022, 05, 15), 15);
		Product p3 = new Product(3, "Sugar", 3500, LocalDate.of(2022, 05, 01), LocalDate.of(2022, 05, 17), 20);
		Product p4 = new Product(3, "peanuts", 3500, LocalDate.of(2022, 05, 30), LocalDate.of(2022, 05, 15), 8);
		Product p5 = new Product(4, "cloth", 3500, LocalDate.of(2022, 04, 22), null, 30);
		Product p6 = new Product(3, "Shoues", 3500, LocalDate.of(2022, 04, 11), null, 12);

		List<Product> PList = new ArrayList();

		PList.add(p1);
		PList.add(p2);
		PList.add(p3);
		PList.add(p4);
		PList.add(p5);
		PList.add(p6);

		//1)Print all item list whose expiry date is in next 15 days.
		
		  List<String> dayOfExpiry = PList.stream().filter(e -> e.doE != null && ChronoUnit.DAYS.between(LocalDate.now(), e.doM) <= 15).map(i -> i.product_Name).collect(Collectors.toList());
		  System.out.println("Product expire in next 15 days : " + dayOfExpiry); 

		// List<String> s = PList.stream().filter(doE).map(e->e.product_Name).collect(Collectors.toList());
		                                          //ChronoUnit.DAYS. use?
		
		// 2)Print all item whose price is less than a given price
		int user;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Price for Searching less price product in list");
		user = sc.nextInt();

		List<Product> p = PList.stream().filter(e -> e.productPrice < user).collect(Collectors.toList());
		for (Product v : p)
			System.out.println("Product Name : " + v.product_Name + " Price : " + v.productPrice);

		// 3) Discount product in list
		List<String> d = PList.stream().filter(e -> e.totalDiscount <= 10).map(e -> e.product_Name).collect(Collectors.toList());
		System.out.println("Discount product less  than 10 " + d);

//		List<Product> pro=PList.stream().filter(ol->ol.doM.isBefore(null)).collect(Collectors.toList());
//		System.out.println(pro);                        // how to use chronoLocal Date ..?

		// 4)Print all item who are oldest in list.
		
		List<LocalDate> Pdates = PList.stream().map(Ol -> Ol.doM).toList();
		LocalDate Oldestdate = Pdates.stream().min(Comparator.comparing(LocalDate::toEpochDay)).get();
		System.out.println("oldest product date " +Oldestdate); 
		
		// 5) Product Dose not have Expiry Date
		List<String> exp = PList.stream().filter(ed -> ed.doE == null).map(ed -> ed.product_Name).collect(Collectors.toList());
		System.out.println("Product no any expiry date" + exp);
	}
}
