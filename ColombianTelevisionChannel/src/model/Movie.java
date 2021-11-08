package model;


public class Movie extends Product {
	

	
	//private String tituloOriginal;
	private String producer;
	private int minimumAge;
	private String trailer;
	//private int category;


	private Category genero;
	private Date fechaEstreno;
	
	

	public Movie(String nameDirector,String producer,String synopsis,int day,int month,int year,String productName,int minimumAge,String trailer,int category){
		super(productName,nameDirector,synopsis);
		//this.tituloOriginal = tituloOriginal;
		this.producer = producer;
		this.minimumAge = minimumAge;
		this.trailer = trailer;
		//this.category=category;
		fechaEstreno = new Date(day, month, year);
		if(category==1){
			setGenero(Category.ROMANTIC);
		}
		if(category==2){
			setGenero(Category.ACTION);
		}
		if(category==3){
			setGenero(Category.SUSPENSE);
		}
		if(category==4){
			setGenero(Category.TERROR);
		}
		if(category==5){
			setGenero(Category.COMEDY);
		}
		
		
	}
	/*@Override
	public String exampleClase(int par){
		String mensaje="esta es una pelicula"+par;
		return mensaje;
	}*/
	
	/*public String getTituloOriginal() {
		return tituloOriginal;
	}

	public void setTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}*/

	public String getProductora() {
		return producer;
	}

	public void setProductora(String producer) {
		this.producer = producer;
	}

	public int getEdadMinima() {
		return minimumAge;
	}

	public void setEdadMinima(int minimumAge) {
		this.minimumAge = minimumAge;
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
	/*public int getCategoria(){
		return category;
		
	}
	public void setCategoria(int category){
		this.category=category;
		
	}*/
	
	public String toString(){
	
		
		return "\n"+"**** Movie data****"+
		"\n"+"------------------------------"+
		"\n"+"Fecha de estreno a nivel mundial: "+fechaEstreno.toString()+
		"\n"+"Titulo original: "+getProductName()+
		"\n"+"Nombre del director:  "+getNameDirector()+
		"\n"+"Productora: "+producer+
		"\n"+"Sinopsis: "+getSinopsis()+
		"\n"+"Edad minima recomendada : "+minimumAge+
		"\n"+"Genero:  "+genero+
		"\n"+"Trailer: "+trailer+"\n"
	
		+"--------------------------------------------------------------"+"\n";

	}

}
	