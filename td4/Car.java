package fr.dauphine.javaavance.td4;

import java.util.ArrayList;
import java.util.HashSet;

public class Car extends Vehicule {

	private final long value;
	private int vetuste;
	
	public Car(String b, long va) {
		super(b);
		if (va < 0) throw new IllegalArgumentException("Valeure ne doit pas être négative");
		this.value = va;
	}
	
	public Car(String b, long va, int ve) {
		super(b);
		if (va < 0) throw new IllegalArgumentException("Valeure ne doit pas être négative");
		this.vetuste = ve;
		for (int i = 0; i < ve ; i++) {
			if(va>=1000) va -= 1000;
			else va =0;
		}
		this.value = va;
	}
	
	@Override
	public long getValue() {
		return value;
	}
	
	public String toString() {
		return ("La marque de la voiture est " + this.brand + " , et elle vaut " + this.value);
	}
	
	@Override
	public boolean equals(Object o) {
		if(!( o instanceof Car)){
			return false;
		}
		Car c = (Car) o;
		return c.getBrand().equals(this.getBrand()) && c.getValue()==this.getValue();
	}
	
	@Override
	public int hashCode() {
		return (int) this.getValue();
	}
	
	public static void main(String[] args) {
		Car a = new Car("Audi",10000);
		Car b = new Car("BMW",9000);
		Car c = new Car("BMW",9000);
		Car d = a;
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(a==d);
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
		System.out.println(a.equals(d));
		ArrayList<Car> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		System.out.println(list.indexOf(a));
		System.out.println(list.indexOf(b));
		System.out.println(list.indexOf(c));
		System.out.println(b.equals(c));
		HashSet<Car> set = new HashSet<Car>();
		set.add(b);
		System.out.println(set.contains(c));
	}
	
}
