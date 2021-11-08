package model;


public class Serie extends Product {
	

	
	private String todosProtagonistas;
	private int censurada;
	private String motivo;

	private Season [] seasons;
	private Date primeraEmision;
	
	private int numSeasons;

	public Serie(String nameDirector,String sinopsis,String todosProtagonistas,int censurada,String motivo,int dia,int mes,int ano) {
		super(nameDirector,sinopsis);
		this.todosProtagonistas = todosProtagonistas;
		this.censurada = censurada;
		this.motivo = motivo;
		primeraEmision = new Date(dia, mes, ano);
		
		
	}

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
	
	public String toString(){
		String censuradaSIONO="NO";
		String motivoSI="";
		if(getCensurada()==1){
			censuradaSIONO="SI";
			motivoSI=" por el motivo "+motivo+" ";
		}
		return "\n"+"**** Serie data****"+
		"\n"+"------------------------------"+
		"\n"+"Fecha de estreno a nivel mundial: "+primeraEmision.toString()+
		"\n"+"PROTAGONISTAS: "+"\n"+getTodosProtagonistas()+"\n"+
		"\n"+"Nombre del director:  "+getNameDirector()+
		"\n"+"Sinopsis: "+getSinopsis()+
		"\n"+"La serie "+censuradaSIONO+" fue censurada"+motivoSI+"\n"
	
		+"--------------------------------------------------------------"+"\n";

	}
	
}