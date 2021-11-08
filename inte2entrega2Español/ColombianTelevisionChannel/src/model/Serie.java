package model;


public class Serie extends Product {
	

	//private String nombreSerie;
	private String todosProtagonistas;
	private int censurada;
	private String motivo;
	//private int numTemporadasSerie;


	private Season [] seasons;
	private Date primeraEmision;
	
	private int numSeasons;

	public Serie(String nombreProducto,String nameDirector,String sinopsis,String todosProtagonistas,int censurada,String motivo,int dia,int mes,int ano,int cantEpiPro,int cantEpiPub,String trailer){
		super(nombreProducto,nameDirector,sinopsis);
		//this.nombreSerie=nombreSerie;
		this.todosProtagonistas = todosProtagonistas;
		this.censurada = censurada;
		this.motivo = motivo;
		primeraEmision = new Date(dia, mes, ano);
		//this.numTemporadasSerie=numTemporadasSerie;
		seasons = new Season [200];
		//int contador=0;
		for(int x=0;x<200;x++){
			if(seasons[x]==null){
				seasons[x] = new Season(x,cantEpiPro,cantEpiPub,dia,mes,ano,trailer);
				x=200;
			}
		}
		
		
	}
	public void addTemporada(int cantEpiPro,int cantEpiPub,int dia,int mes,int ano,String trailer){
		for(int x=0;x<200;x++){
			if(seasons[x]==null){
				seasons[x] = new Season(x,cantEpiPro,cantEpiPub,dia,mes,ano,trailer);
				x=200;
			}
			
		}
		
	}
	/*
	public Serie(String nombreProducto,String nameDirector,String sinopsis,int cantEpiPro,int cantEpiPub,int dia,int mes,int ano,String trailer){
		super(nombreProducto,nameDirector,sinopsis);
		primeraEmision = new Date(dia, mes, ano);
		this.numTemporadasSerie=numTemporadasSerie;
		seasons = new Season [200];
		int contador=0;
		for(int x=0;x<200;x++){
			if(seasons[x]==null){
				seasons[x] = new Season(x,cantEpiPro,cantEpiPub,dia,mes,ano,trailer);
				contador++;
			}
			if(contador==1){
				x=200;		
			}
		}
		
		
	}*/
	/*public String getNombreSerie() {
		return nombreSerie;
	}

	public void setNombreSerie(String nombreSerie) {
		this.nombreSerie = nombreSerie;
	}*/

	public String getTodosProtagonistas() {
		return todosProtagonistas;
	}

	public void setTodosProtagonistas(String todosProtagonistas) {
		this.todosProtagonistas = todosProtagonistas;
	}

	public int getCensurada() {
		return censurada;
	}
	public void setCensurada(int censurada) {
		this.censurada = censurada;
	}
	
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	/*public int getNumTemporadasSerie() {
		return numTemporadasSerie;
	}
	public void setNumTemporadasSerie(int numTemporadasSerie) {
		this.numTemporadasSerie = numTemporadasSerie;
	}*/
	public String todasTemporadas(){
		String allSeasons="";
		for(int x=0;x<200;x++){
			if(seasons[x]!=null){
				allSeasons=allSeasons+"\n"+seasons[x].toString();
			}
		}
		return allSeasons;
		
	}
	public String ultimaTemporada(){
		String ultimaTemporada="";
		ultimaTemporada=ultimaTemporada+" ULTIMA TEMPORADA : ";
		
		for(int x=199;x>=0;x--){
			if(seasons[x]!=null){
				ultimaTemporada="\n"+seasons[x].toString()+"\n";
				x=0;
			}
		}
		
		return ultimaTemporada;
	}
	public String serieUltimaTemporada(){
		String censuradaSIONO="NO";
		String motivoSI="";
		if(getCensurada()==1){
			censuradaSIONO="SI";
			motivoSI=" por el motivo "+motivo+" ";
		}
		return "\n"+"**** Serie data****"+
		"\n"+"------------------------------"+
		"\n"+"El nombre de la serie es: "+getNombreProducto()+
		"\n"+"Fecha de estreno a nivel mundial: "+primeraEmision.toString()+
		"\n"+"PROTAGONISTAS: "+"\n"+getTodosProtagonistas()+"\n"+
		"\n"+"Nombre del director:  "+getNameDirector()+
		"\n"+"Sinopsis: "+getSinopsis()+
		"\n"+"La serie "+censuradaSIONO+" fue censurada"+motivoSI+
		"\n"+"\n"+ultimaTemporada()+"\n"
	
		+"--------------------------------------------------------------"+"\n";

	}
	public String toString(){
		String censuradaSIONO="NO";
		String motivoSI="";
		if(getCensurada()==1){
			censuradaSIONO="SI";
			motivoSI=" por el motivo "+motivo+" ";
		}
		return "\n"+"**** Serie data****"+
		"\n"+"------------------------------"+
		"\n"+"El nombre de la serie es: "+getNombreProducto()+
		"\n"+"Fecha de estreno a nivel mundial: "+primeraEmision.toString()+
		"\n"+"PROTAGONISTAS: "+"\n"+getTodosProtagonistas()+"\n"+
		"\n"+"Nombre del director:  "+getNameDirector()+
		"\n"+"Sinopsis: "+getSinopsis()+
		"\n"+"La serie "+censuradaSIONO+" fue censurada"+motivoSI+
		"\n"+todasTemporadas()+"\n"
	
		+"--------------------------------------------------------------"+"\n";

	}
	
}