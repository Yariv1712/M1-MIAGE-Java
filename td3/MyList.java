package fr.dauphine.javaavance.td3;

public class MyList<T> {
	
	private int taille = 0;
	private Cell<T> c = null;
	
	public void add(Object o) {
		Cell<T> c = new Cell<T>(o,this.c);
		taille++;
	}
	
	public int size() {
		return this.taille;
	}
	
	public String toString() {
		String res = "";
		for (int i =0; i< this.size();i++) {
			res += c.getCellule() + ",";
		}
		return res;
	}
	
	public void addLast(Object o) {
		for (int i = 0; i < this.taille; i++) {
			this.c = c.getNext();
		}
		Cell<T> c = new Cell<T>(o,this.c);
	}

	
	public String get(int index) {
		String res ="";
		if (index >= size() || index <0) throw new IllegalArgumentException("Out of bounds");
		for(int i=0;i<size();i++) {
			if(i ==index){
				res = (String)c.getCellule();
				this.c = c.getNext();
			}
		}
		return res;
	}
	
	public int sumLetters() {
		int cumul = 0;
		for (int i = 0 ; i < taille; i++) {
			if (this.c.getCellule() instanceof String) {
				String s = (String) this.c.getCellule();
				cumul += s.length();
			}
			this.c = this.c.getNext();
		}
		return cumul;
	}
	
	public boolean contains(Object o) {
		boolean contient = false;
		for (int i = 0; i < this.taille; i++) {
			if (o == this.c.getCellule().getClass()) contient = true;
			this.c = c.getNext();
		}
		return contient;
	}
	
	public static void main(String[] args) {
		MyList<Cell> ml = new MyList<Cell>();
		ml.addLast("tatu");
		ml.add("toto");
		ml.add("titi");
		ml.add(1);
	}
	
}
