package model;


public class Movie extends Product {
	

	
	private String tituloOriginal;
	private String productora;
	private int edadMinima;
	private String trailer;
	
	private Category genero;
	private Date fechaEstreno;
	
	

	public Serie(String tituloOriginal, String productora, int edadMinima, String trailer) {
		
		this.tituloOriginal = tituloOriginal;
		this.productora = productora;
		this.edadMinima = edadMinima;
		this.trailer = trailer;
		
		
	}