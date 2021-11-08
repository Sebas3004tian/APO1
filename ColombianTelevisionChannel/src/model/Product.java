package model;


public abstract class Product {
	/*Trabajar en el metodo añadir produccto ,que se necesita?*/

	
	//private String nameElemento;
	private String nameDirector;
	private String synopsis;
	
	private String productName;



	
	public Product(String productName,String nameDirector, String synopsis) {
		//this.nameElemento = nameElemento;
		this.productName = productName;
		this.nameDirector = nameDirector;
		this.synopsis = synopsis;
		
	}
	
	//public abstract String exampleClase(int par);

	public String getProductName() {
		return productName;
	}

	public void setNombreProducto(String productName) {
		this.productName = productName;
	}

	public String getNameDirector() {
		return nameDirector;
	}

	public void setNameDirector(String nameDirector) {
		this.nameDirector = nameDirector;
	}

	public String getSinopsis() {
		return synopsis;
	}

	public void setSinopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	

}