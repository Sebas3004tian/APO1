package model;

public class Rack {
	private int numServidores;
	
	public Rack(int numServidores) {
		this.numServidores = numServidores;
		
	}
	public int getNumServidores() {
		return numServidores;
	}

	public void setNumServidores(int numServidores) {
		this.numServidores = numServidores;
	}
}