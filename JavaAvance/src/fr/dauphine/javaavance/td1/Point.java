package fr.dauphine.javaavance.td1;

import java.util.ArrayList;

public class Point {

	private int x;
	private int y;
	

	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(Point p2) {
		this.x = p2.x;
		this.y = p2.y;	
	}
	
	public void afficher() {
		int x = 0;
		int y = 0;
		Point p = new Point(x,y);
		System.out.println(p.x + p.getY());
	}
	
	@Override
	public String toString(){
		return "Les coordonnées du point sont " + this.x + " et " + this.getY();
	}
	
	@Override
	public boolean equals(Object obj) {
		Point p = (Point) obj;
		return p.x == this.x && p.getY()==this.getY();
	}
	
	public boolean isSameAs(Point p) {
		return p.x == this.x && p.getY()==this.getY();
	}
	
	public static void main(String[] args) {
		int x = 2;
		int y = 1;
		Point point = new Point(x,y);
		System.out.println(point);
		Point p1=new Point(1,2);
		Point p2=p1;
		Point p3=new Point(1,2);
		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
		
	}
	
	public void translate(int dx, int dy) {
		this.x = dx;
		this.y = dy;
	}

	public int getY() {
		return y;
	}

	public int getX() {
		return this.x;
	}
}
