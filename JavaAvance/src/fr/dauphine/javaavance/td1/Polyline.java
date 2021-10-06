package fr.dauphine.javaavance.td1;

import java.util.*;

public class Polyline {

	private LinkedList<Point> lesPoints = new LinkedList<Point>() ;
	
	public Polyline(LinkedList<Point> lesP) {
		this.lesPoints = lesP;
	}
	
	public void add(Point p) {
		for (int i = 0; i < lesPoints.size();i++) {
			if (this.lesPoints.get(i).equals(null)) {
				this.lesPoints.add(p);
			}
		}
	}
	
	public int pointCapactiy() {
		return this.lesPoints.size();
	}
	
	public int nbPoints() {
		int cumul = 0;
		for (int i = 0; i < lesPoints.size();i++) {
			if (!this.lesPoints.get(i).equals(null)) {
				cumul ++;
			}
		}
		return cumul;
	}
	
	public boolean contains(Point p) {
		boolean trouve = false;
		for (Point p1 : this.lesPoints) {
			if (p1.isSameAs(p)) trouve = true;
		}
		return trouve;
	}
}
