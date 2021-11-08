package model;


public abstract class Product {
	

	
	private String nameElemento;
	private String nameDirector;
	private String sinopsis;
	

	public Product(String nombre, String nameDirector, String sinopsis) {
		this.nameElemento = nameElemento;
		this.nameDirector = nameDirector;
		this.sinopsis = sinopsis;
		
	}