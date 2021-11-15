package fr.dauphine.javaavance.td4;

import static org.junit.Assert.*;

import org.junit.Test;

public class GarageTest {
	
	Garage g = new Garage();
	Car a = new Car("Audi",10000);
	Car b = new Car("BMW",9000);
	Car c = new Car("BMW",9000);
	
	@Test
	public void valeur() {
		g.addCar(a);
		g.addCar(b);
		g.addCar(c);
		assertEquals(28000, g.valeur());
	}
	
	@Test
	public void nonNull() {
		assertThrows(NullPointerException.class, () ->g.addCar(null));
	}
	
	@Test
	public void marque() {
		g.addCar(a);
		assertEquals(a, g.firstCarByBrand("Audi"));
		assertEquals(null, g.firstCarByBrand("BMW"));
	}
	

}
