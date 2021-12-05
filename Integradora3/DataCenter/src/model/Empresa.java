package model;

public class Empresa {
	private String nit;
	private String nombreEmpresa;
	
	public Empresa(String nit, String nombreEmpresa) {
		this.nit = nit;
		this.nombreEmpresa = nombreEmpresa;
		
	}
	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public String toString() {
		return nombreEmpresa +" NIT: " + nit +".";
	}
}