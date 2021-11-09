package model;


public class Season{
	

	
	private int numeroIdentificacion;
	private int cantEpiProgramados;
	private int cantEpiPublicados;
	private String trailer;
	
	
	private Date fechaEstrenoTemporada;

	public Season(int x,int numScheduledEpi,int numEpiPub,int day,int month,int year,String trailer) {
		
		this.numeroIdentificacion = x;
		this.cantEpiProgramados = numScheduledEpi;
		this.cantEpiPublicados = numEpiPub;
		fechaEstrenoTemporada = new Date(day,month,year);
		this.trailer = trailer;
		
		
	}

	public int getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(int numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public int getCantEpiProgramados() {
		return cantEpiProgramados;
	}

	public void setCantEpiProgramados(int cantEpiProgramados) {
		this.cantEpiProgramados = cantEpiProgramados;
	}

	public int getCantEpiPublicados() {
		return cantEpiPublicados;
	}

	public void setCantEpiPublicados(int cantEpiPublicados) {
		this.cantEpiPublicados = cantEpiPublicados;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}
	public String toString(){
		
		return "\n"+"**** season data****"+
		"\n"+"------------------------------"+
		"\n"+"Numero de la Temporada: "+(getNumeroIdentificacion()+1)+
		"\n"+"Cantidad de episodios programados: "+getCantEpiProgramados()+
		"\n"+"Cantidad de episodios publicados: "+getCantEpiPublicados()+
		"\n"+"Fecha de estreno de la temporada: "+fechaEstrenoTemporada.toString()+
		"\n"+"Trailer de la temporada: "+getTrailer()+"\n"
		
	
		+"--------------------------------------------------------------"+"\n";

	}
	
	
	

	
}