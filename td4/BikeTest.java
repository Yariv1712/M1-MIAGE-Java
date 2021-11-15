package fr.dauphine.javaavance.td4;

import static org.junit.Assert.*;

import org.junit.Test;

public class BikeTest {

	Bike b = new Bike("VTT");
	Garage g = new Garage();
	
	@Test
	public void add() {
		g.addCar(b);
		Bike b2 = (Bike) g.firstCarByBrand(b.getBrand());
		assertEquals(b, b2);
	}

}
