package fr.dauphine.javaavance.td4;

public abstract class Vehicule {
	
	protected final String brand;
	protected Discount dis = null;
	
	public Vehicule(String b) {
		this.brand = b;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public abstract long getValue();
	
}
