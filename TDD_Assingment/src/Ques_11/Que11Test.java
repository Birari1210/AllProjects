package Ques_11;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Que11Test {

	@Test
	public void singletoneTest() {
		
		SingletonOrNot instance1 = SingletonOrNot.I;
		SingletonOrNot instance2 = SingletonOrNot.getInstance();
		System.out.println("cheack Singleton Object equality");
		assertEquals(true, instance1==instance2);
	}
}
