package fr.dauphine.javaavance.td1;

public class Ring extends Circle{

	
	private int radius_inner;
	
	public Ring(int r, Point c, int ri) {
		super(r, c);
		this.radius_inner = ri;

	}
	
	public int getRadius_inner() {
		return radius_inner;
	}
	
	@Override
	public boolean equals(Object obj) {
		Ring r = (Ring) obj;
		return r.getRadius_inner() == this.getRadius_inner() && r.getRadius()==this.getRadius() && r.getCentre().equals(this.getCentre());
	}
	
	@Override
	public String toString(){
		return "Cet anneau a un centre de " + this.getCentre() + " avec un rayon de " + this.getRadius() + " et un rayon intérieur de " + this.getRadius_inner(); 
	}
	
	public static void main(String[] args) {
		Ring r = new Ring(4, new Point(1,2), 2);
		System.out.println(r);
		System.out.println(r.contains(new Point(45,2)));
	}

	public boolean contains(Point p)
	{
		boolean bool=false;
		if(Math.sqrt(Math.pow(p.getX()-this.getCentre().getX(),2) + Math.pow(p.getY()-this.getCentre().getY(),2))< this.getRadius())
		{
			bool=true;
		}
		
		return bool;
	}

}
