package model;


public abstract class Product {

	private String nameDirector;
	private String synopsis;
	
	private String productName;



	
	public Product(String productName,String nameDirector, String synopsis) {
		this.productName = productName;
		this.nameDirector = nameDirector;
		this.synopsis = synopsis;
		
	}
	

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