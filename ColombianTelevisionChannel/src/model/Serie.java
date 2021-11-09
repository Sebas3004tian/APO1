package model;



/**
* It is the subclass of the Series object 
*/
public class Serie extends Product {
	

	private String allProtagonists;
	private int censored;
	private String reason;


	private Season [] seasons;
	private Date primeraEmision;
	
	private int numSeasons;

	public Serie(String productName,String nameDirector,String synopsis,String allProtagonists,int censored,String reason,int day,int month,int year,int numScheduledEpi,int numEpiPub,String trailer){
		super(productName,nameDirector,synopsis);
		this.allProtagonists = allProtagonists;
		this.censored = censored;
		this.reason = reason;
		primeraEmision = new Date(day, month, year);
		seasons = new Season [200];
		for(int x=0;x<200;x++){
			if(seasons[x]==null){
				seasons[x] = new Season(x,numScheduledEpi,numEpiPub,day,month,year,trailer);
				x=200;
			}
		}
		
		
	}
	/**
    * This method adds a season to an already created serial object.
    * @param numScheduledEpi int
	* @param numEpiPub int
	* @param day int
	* @param month int
	* @param year int
	* @param trailer String
    */
	public void addSeason(int numScheduledEpi,int numEpiPub,int day,int month,int year,String trailer){
		for(int x=0;x<200;x++){
			if(seasons[x]==null){
				seasons[x] = new Season(x,numScheduledEpi,numEpiPub,day,month,year,trailer);
				x=200;
			}
			
		}
		
	}

	public String getTodosProtagonistas() {
		return allProtagonists;
	}

	public void setTodosProtagonistas(String allProtagonists) {
		this.allProtagonists = allProtagonists;
	}

	public int getCensurada() {
		return censored;
	}
	public void setCensurada(int censored) {
		this.censored = censored;
	}
	
	public String getMotivo() {
		return reason;
	}
	public void setMotivo(String reason) {
		this.reason = reason;
	}
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
	public String seriesLastSeason(){
		String censuradaSIONO="NO";
		String motivoSI="";
		if(getCensurada()==1){
			censuradaSIONO="SI";
			motivoSI=" por el reason "+reason+" ";
		}
		return "\n"+"**** Serie data****"+
		"\n"+"------------------------------"+
		"\n"+"El nombre de la serie es: "+getProductName()+
		"\n"+"Fecha de estreno a nivel mundial: "+primeraEmision.toString()+
		"\n"+"PROTAGONISTAS: "+"\n"+getTodosProtagonistas()+"\n"+
		"\n"+"Nombre del director:  "+getNameDirector()+
		"\n"+"Sinopsis: "+getSinopsis()+
		"\n"+"La serie "+censuradaSIONO+" fue censored"+motivoSI+
		"\n"+"\n"+ultimaTemporada()+"\n"
	
		+"--------------------------------------------------------------"+"\n";

	}
	public String toString(){
		String censuradaSIONO="NO";
		String motivoSI="";
		if(getCensurada()==1){
			censuradaSIONO="SI";
			motivoSI=" por el reason "+reason+" ";
		}
		return "\n"+"**** Serie data****"+
		"\n"+"------------------------------"+
		"\n"+"El nombre de la serie es: "+getProductName()+
		"\n"+"Fecha de estreno a nivel mundial: "+primeraEmision.toString()+
		"\n"+"PROTAGONISTAS: "+"\n"+getTodosProtagonistas()+"\n"+
		"\n"+"Nombre del director:  "+getNameDirector()+
		"\n"+"Sinopsis: "+getSinopsis()+
		"\n"+"La serie "+censuradaSIONO+" fue censored"+motivoSI+
		"\n"+todasTemporadas()+"\n"
	
		+"--------------------------------------------------------------"+"\n";

	}
	
}