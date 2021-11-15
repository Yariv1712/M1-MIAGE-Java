package fr.dauphine.javaavance.td4;

public class Bike extends Vehicule {

	private static long value = 100;
	
	public Bike(String b) {
		super(b);
	}
	
	public Bike(String b, Discount d) {
		super(b,d);
		value = dis.getValue();
	}
	
	@Override
	public long getValue() {
		return value;
	}
	
}
