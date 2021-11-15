package fr.dauphine.javaavance.td4;

import static org.junit.Assert.*;

import org.junit.Test;

public class GarageTest2 {

	@Test
	public void remove() {
		Garage g = new Garage();
		Car a = new Car("Audi",10000);
		g.Remove(a);
		assertEquals(0,g.valeur());
	}

	
}
