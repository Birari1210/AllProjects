package TDD_Assingment;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import org.junit.jupiter.api.Test;

class Qu15Test {
	
	Item obj = new Item();
	Scanner sc = new Scanner(System.in);

	@Test
	void testID() {
		
		System.out.println("Enter item Id");
		int id = sc.nextInt();
		assertEquals(true, obj.setItemId(id));	
	}
	
	@Test
	void testItemName() {
		System.out.println("Enter item name");
		String name = sc.next();
		assertEquals(true, obj.setItemName(name));
	}

	@Test 
	void checkItemPrice()
	{
		System.out.println("Enter item price");
		int price = sc.nextInt();
		assertEquals(true, obj.setCostPrice(price));
	}
	@Test
	void testSalePrice()
	{
		System.out.println("Enter item Sale price");
		int sell = sc.nextInt();
		assertEquals(true, obj.setCellPrice(sell));

	}
	
	@Test
	void dateOfExp()
	{
		System.out.println("Enter date of Expiry");
		String Date_Format ="yyyy-mm-dd";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(Date_Format);
		String line = sc.nextLine();
		LocalDate mdate = LocalDate.parse(line,formatter);
		assertEquals(true, obj.setDoE(mdate));
		
		
	}

	
}
