package model;


public abstract class Product {
	/*Trabajar en el metodo añadir produccto ,que se necesita?*/

	
	//private String nameElemento;
	private String nameDirector;
	private String sinopsis;
	
	private String nombreProducto;



	
	public Product(String nombreProducto,String nameDirector, String sinopsis) {
		//this.nameElemento = nameElemento;
		this.nombreProducto = nombreProducto;
		this.nameDirector = nameDirector;
		this.sinopsis = sinopsis;
		
	}
	
	//public abstract String exampleClase(int par);

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

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