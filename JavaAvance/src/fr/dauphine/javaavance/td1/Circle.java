package fr.dauphine.javaavance.td1;

public class Circle {

	private int radius;
	private Point centre;
	
	public Circle(int r, Point c) {
		this.radius = r;
		this.centre = new Point(c);
	}
	
	public Point getCentre() {
		return new Point(centre);
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	@Override
	public String toString(){
		return "Le rayon du cercle est " + this.radius + " et " + this.centre + " et son aire est de " + this.area(); 
	}
	
	public void translate(int dx, int dy) {
		this.centre.translate(dx, dy);
	}
	
	public double area() {
		return (Math.PI *  Math.pow(radius, radius));
	}
	
	public boolean contains(Point p)
	{
		boolean bool=false;
		if(Math.sqrt(Math.pow(p.getX()-this.centre.getX(),2) + Math.pow(p.getY()-this.centre.getY(),2))< this.radius)
		{
			bool=true;
		}
		
		return bool;
	}
	
	public static void main(String[] args) {
		Circle c=new Circle(2,new Point(1,2));
		c.getCentre().translate(1,1);
		System.out.println(c);
		System.out.println(c.contains(new Point(2,0)));

	}

}
