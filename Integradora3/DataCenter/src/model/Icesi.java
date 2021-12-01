package model;

public class Icesi extends Empresa {
	
	private int numeroRegistro;
	
	public Canal(int nit, String nombreEmpresa, int numeroRegistro) {
		this.nit = nit;
		this.nombreEmpresa = nombreEmpresa;
		this.numeroRegistro = numeroRegistro;
		
	}
	public int getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
}