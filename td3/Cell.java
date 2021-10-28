package fr.dauphine.javaavance.td3;

public class Cell<T> {

	private Object cellule;
	private Cell<T> next;
	
	public Cell(Object o, Cell<T> c) {
		this.cellule = o;
		this.next = c;
	}
	
	public void setCellule(String cellule) {
		this.cellule = cellule;
	}
	
	public Object getCellule() {
		return this.cellule;
	}
	
	public Cell<T> getNext() {
		return this.next;
	}
}
