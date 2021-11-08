package model;


public class Movie extends Product {
	

	
	private String tituloOriginal;
	private String productora;
	private int edadMinima;
	private String trailer;


	private Category genero;
	private Date fechaEstreno;
	
	

	public Movie(String nameDirector,String productora,String sinopsis,int day,int month,int year,String tituloOriginal,int edadMinima,int categoria,String trailer){
		super(nameDirector,sinopsis);
		this.tituloOriginal = tituloOriginal;
		this.productora = productora;
		this.edadMinima = edadMinima;
		this.trailer = trailer;
		fechaEstreno = new Date(day, month, year);
		
		
	}

	public String getTituloOriginal() {
		return tituloOriginal;
	}

	public void setTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}

	public String getProductora() {
		return productora;
	}

	public void setProductora(String productora) {
		this.productora = productora;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}
	public Category getGenero(){
		return genero;
		
	}
	public void setGenero(Category genero){
		this.genero=genero;
		
	}
	
	public String toString(){
	
		
		return "\n"+"**** Movie data****"+
		"\n"+"------------------------------"+
		"\n"+"Fecha de estreno a nivel mundial: "+fechaEstreno.toString()+
		"\n"+"Titulo original: "+tituloOriginal+
		"\n"+"Nombre del director:  "+getNameDirector()+
		"\n"+"Productora: "+productora+
		"\n"+"Sinopsis: "+getSinopsis()+
		"\n"+"Edad minima recomendada : "+edadMinima+
		"\n"+"Genero:  "+genero+
		"\n"+"Trailer: "+trailer
	
		+"--------------------------------------------------------------"+"\n";

	}

}
	