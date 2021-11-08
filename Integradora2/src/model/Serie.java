package model;


public class Serie extends Product {
	

	
	private String nombresProtagonistas;
	private boolean censurada;
	
	private Season [] seasons;
	private Date primeraEmision;
	
	private int numSeasons;

	public Serie(String nombresProtagonistas, boolean censurada) {
		super();
		this.nombresProtagonistas = nombresProtagonistas;
		this.censurada = censurada;
		
		
	}