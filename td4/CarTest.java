package fr.dauphine.javaavance.td4;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {

	@Test
	public void Vetuste() {
		Car a = new Car("Audi",10000,1);
		Car b = new Car("Audi",10000,2);
		Car c = new Car("Audi",100,1);
		assertEquals(9000, a.getValue());
		assertEquals(8000, b.getValue());
		assertEquals(0, c.getValue());
	}
	

}
