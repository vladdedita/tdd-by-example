package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {
	@Test
	void testMultiplicationDollar() {
		Dollar five =  new Dollar(5);
		Dollar product = five.times(2);
		assertEquals(new Dollar(10), product);
		product = five.times(3);
		assertEquals(new Dollar(15),product);
	}
	@Test
	void testEqualityDollar() {
		assertEquals(new Dollar(5), new Dollar(5));
		assertNotEquals(new Dollar(5), new Dollar(8));
		assertNotEquals(new Dollar(5), new Franc(5));
	}
	
	@Test
	void testMultiplicationFranc() {
		Franc five =  new Franc(5);
		Franc product = five.times(2);
		assertEquals(new Franc(10), product);
		product = five.times(3);
		assertEquals(new Franc(15),product);
	}
	@Test
	void testEqualityFranc() {
		assertEquals(new Franc(5), new Franc(5));
		assertNotEquals(new Franc(5), new Franc(8));
	}
	
	@Test
	void testLongEquality() {
		Long l1 = 127L;
		Long l2 = 127L;
		assertTrue(l1 .equals( l2));
		
		
		Long l3 = 128L;
		Long l4 = 128L;
		assertTrue(l3 .equals( l4));
	}
}
