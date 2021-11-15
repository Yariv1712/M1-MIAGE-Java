package fr.dauphine.javaavance.td4;

public abstract class Vehicule {
	
	protected final String brand;
	protected Discount dis = null;
	
	public Vehicule(String b) {
		this.brand = b;
	}
	
	public Vehicule(String b, Discount d) {
		this.brand = b;
		this.dis = d;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public abstract long getValue();
	
}
