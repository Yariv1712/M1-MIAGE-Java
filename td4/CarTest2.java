package fr.dauphine.javaavance.td4;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest2 {

	@Test
	public void equals() {
		Car a = new Car("Audi",10000);
		Car b = new Car("BMW",9000);
		Car c = new Car("BMW",9000);
		Car d = a;
		assertEquals(false, a.equals(b));
		assertEquals(true, b.equals(c));
		assertEquals(true, a.equals(d));
	}

}
