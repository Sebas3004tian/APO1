package model;


public class Season{
	

	
	private int numeroIdentificacion;
	private int cantEpiProgramados;
	private int cantEpiPublicados;
	private String trailer;

	public Season(int numeroIdentificacion, int cantEpiProgramados, int cantEpiPublicados, String trailer) {
		
		this.numeroIdentificacion = numeroIdentificacion;
		this.cantEpiProgramados = cantEpiProgramados;
		this.cantEpiPublicados = cantEpiPublicados;
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
	
	
	
	

	
}