package model;


public abstract class Product {
	

	
	//private String nameElemento;
	private String nameDirector;
	private String sinopsis;

	
	public Product(String nameDirector, String sinopsis) {
		//this.nameElemento = nameElemento;
		this.nameDirector = nameDirector;
		this.sinopsis = sinopsis;
		
	}
/*
	public String getNameElemento() {
		return nameElemento;
	}

	public void setNameElemento(String nameElemento) {
		this.nameElemento = nameElemento;
	}
*/
	public String getNameDirector() {
		return nameDirector;
	}

	public void setNameDirector(String nameDirector) {
		this.nameDirector = nameDirector;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	

}