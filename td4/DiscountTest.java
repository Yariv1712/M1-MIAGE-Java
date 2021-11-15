package fr.dauphine.javaavance.td4;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiscountTest {

	@Test
	public void test() {	
	Discount d = new Discount(50);
	Bike b = new Bike("VTT",d);
	assertEquals(50, b.getValue());
	}

}
