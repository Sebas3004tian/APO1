package model;


public class Serie extends Product {
	

	
	private String nombresProtagonistas;
	private boolean censurada;

	private Season [] seasons;
	private Date primeraEmision;
	
	private int numSeasons;

	public Serie(String nameDirector, String sinopsis,String nombresProtagonistas, boolean censurada, int day, int month, int year) {
		super(nameDirector,sinopsis);
		this.nombresProtagonistas = nombresProtagonistas;
		this.censurada = censurada;
		primeraEmision = new Date(day, month, year);
		
		
	}

	public String getNombresProtagonistas() {
		return nombresProtagonistas;
	}

	public void setNombresProtagonistas(String nombresProtagonistas) {
		this.nombresProtagonistas = nombresProtagonistas;
	}

	public boolean isCensurada() {
		return censurada;
	}

	public void setCensurada(boolean censurada) {
		this.censurada = censurada;
	};
	
}