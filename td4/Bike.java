package fr.dauphine.javaavance.td4;

public class Bike extends Vehicule {

	private static long value = 100;
	
	public Bike(String b) {
		super(b);
		if (super.dis != null) value = dis.getValue();
	}
	
	@Override
	public long getValue() {
		return value;
	}
	
}
