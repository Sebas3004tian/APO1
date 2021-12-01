package model;

public class Empresa {
	private int nit;
	private String nombreEmpresa;
	
	public Canal(int nit, String nombreEmpresa) {
		this.nit = nit;
		this.nombreEmpresa = nombreEmpresa;
		
	}
	public int getNit() {
		return nit;
	}

	public void setNit(int nit) {
		this.nit = nit;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
}