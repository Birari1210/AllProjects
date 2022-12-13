package DateTime;

import java.time.LocalDate;
import java.util.Date;

public class Product {

	int no;
	String product_Name;
	int productPrice;
	LocalDate doM;
	LocalDate doE;
	int totalDiscount;
	public Product(int no, String product_Name, int productPrice,LocalDate doM,LocalDate doE , int totalDiscount) {
		super();
		this.no = no;
		this.product_Name = product_Name;
		this.productPrice = productPrice;
		this.doM =  doM;
		this.doE = doE;
		this.totalDiscount = totalDiscount;
	}
	
}
