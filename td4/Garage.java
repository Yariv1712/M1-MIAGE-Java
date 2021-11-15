package fr.dauphine.javaavance.td4;

import java.util.ArrayList;
import java.util.Objects;

public class Garage {
	
	private ArrayList<Vehicule> theVehicules = new ArrayList<Vehicule>();
	
	public void addCar(Vehicule v) {
		this.theVehicules.add(Objects.requireNonNull(v));
	}
	
	public String toString() {
		StringBuilder res = new StringBuilder();
		for (Vehicule v : theVehicules) {
			res.append(v.toString());
		}
		return res.toString();
	}
	
	public int valeur() {
		int cumul = 0;
		for (Vehicule v : theVehicules) {
			cumul += v.getValue();
		}
		return cumul;
	}
	
	public Vehicule firstCarByBrand(String brand) {
		boolean trouve = false;
		Vehicule v = null;
		for (int i = 0; i < theVehicules.size() && trouve == false; i++) {
			v = theVehicules.get(i);
			if (v.getBrand().equals(brand)) trouve = true;
			else v = null;
		}
		return v;
	}
	
	public void Remove(Car c) {
		this.theVehicules.remove(c);
	}
	
	public void protectionism(String brand) {
		for (Vehicule v : theVehicules) {
			if(v.getBrand().equals(brand)) {
				if(theVehicules.remove(v))System.out.println("Bien supprimé");
				}
		}
	}
	
}
