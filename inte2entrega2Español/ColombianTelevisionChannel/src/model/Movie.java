package model;


public class Movie extends Product {
	

	
	//private String tituloOriginal;
	private String productora;
	private int edadMinima;
	private String trailer;
	//private int categoria;


	private Category genero;
	private Date fechaEstreno;
	
	

	public Movie(String nameDirector,String productora,String sinopsis,int day,int month,int year,String nombreProducto,int edadMinima,String trailer,int categoria){
		super(nombreProducto,nameDirector,sinopsis);
		//this.tituloOriginal = tituloOriginal;
		this.productora = productora;
		this.edadMinima = edadMinima;
		this.trailer = trailer;
		//this.categoria=categoria;
		fechaEstreno = new Date(day, month, year);
		if(categoria==1){
			setGenero(Category.ROMANTICA);
		}
		if(categoria==2){
			setGenero(Category.ACCION);
		}
		if(categoria==3){
			setGenero(Category.SUSPENSO);
		}
		if(categoria==4){
			setGenero(Category.TERROR);
		}
		if(categoria==5){
			setGenero(Category.COMEDIA);
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
	/*public int getCategoria(){
		return categoria;
		
	}
	public void setCategoria(int categoria){
		this.categoria=categoria;
		
	}*/
	
	public String toString(){
	
		
		return "\n"+"**** Movie data****"+
		"\n"+"------------------------------"+
		"\n"+"Fecha de estreno a nivel mundial: "+fechaEstreno.toString()+
		"\n"+"Titulo original: "+getNombreProducto()+
		"\n"+"Nombre del director:  "+getNameDirector()+
		"\n"+"Productora: "+productora+
		"\n"+"Sinopsis: "+getSinopsis()+
		"\n"+"Edad minima recomendada : "+edadMinima+
		"\n"+"Genero:  "+genero+
		"\n"+"Trailer: "+trailer+"\n"
	
		+"--------------------------------------------------------------"+"\n";

	}

}
	