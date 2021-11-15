package fr.dauphine.javaavance.td4;

import static org.junit.Assert.*;

import org.junit.Test;

public class GarageTest4 {

	Garage g = new Garage();
	Car a = new Car("Audi",10000);
	Garage g1 = new Garage();
	Car a1 = new Car("Audi",10000);

	
	@Test
	public void egaliteGarage() {
		g.addCar(a);
		g1.addCar(a1);
		assertEquals(g,g1);
	}

}
