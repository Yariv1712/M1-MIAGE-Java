package fr.dauphine.javaavance.td2;

public class Value implements Expr {
	
	private double val;

	public Value(double val) {
		this.val = val;
	}
	
	@Override
	public double eval() {
		return this.val;
	}
	
	@Override
	public double getVal() {
		return val;
	}
	
}
