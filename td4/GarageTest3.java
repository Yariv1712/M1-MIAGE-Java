package fr.dauphine.javaavance.td4;

import static org.junit.Assert.*;

import org.junit.Test;

public class GarageTest3 {
	
	Garage g = new Garage();
	Car a = new Car("Audi",10000);
	Car b = new Car("BMW",9000);
	Car c = new Car("BMW",9000);
	
	
	@Test
	public void protectionism() {
		g.addCar(a);
		g.protectionism(a.getBrand());
		assertEquals(0, g.valeur());
	}
}
