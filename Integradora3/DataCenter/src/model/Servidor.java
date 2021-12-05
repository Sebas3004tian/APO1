package model;

public class Servidor {
	
	private double cantMemoriaCache;
	private int numProcesadores;
	private double cantMemoriaRAM;
	private int cantDiscos;
	private double capaDiscos;
	
	private Marca procesador;


	public Servidor(double cantMemoriaCache,int numProcesadores,double cantMemoriaRAM,int cantDiscos,double capaDiscos) {
		this.cantMemoriaCache = cantMemoriaCache;
		this.numProcesadores = numProcesadores;
		this.cantMemoriaRAM = cantMemoriaRAM;
		this.cantDiscos = cantDiscos;
		this.capaDiscos = capaDiscos;
		
		
	}
	public double getCantMemoriaCache() {
		return cantMemoriaCache;
	}

	public void setCantMemoriaCache(double cantMemoriaCache) {
		this.cantMemoriaCache = cantMemoriaCache;
	}

	public int getNumProcesadores() {
		return numProcesadores;
	}

	public void setNumProcesadores(int numProcesadores) {
		this.numProcesadores = numProcesadores;
	}

	public double getCantMemoriaRAM() {
		return cantMemoriaRAM;
	}

	public void setCantMemoriaRAM(double cantMemoriaRAM) {
		this.cantMemoriaRAM = cantMemoriaRAM;
	}

	public int getCantDiscos() {
		return cantDiscos;
	}

	public void setCantDiscos(int cantDiscos) {
		this.cantDiscos = cantDiscos;
	}

	public double getCapaDiscos() {
		return capaDiscos;
	}

	public void setCapaDiscos(double capaDiscos) {
		this.capaDiscos = capaDiscos;
	}
	public Marca getProcesador() {
		return procesador;
	}

	public void setProcesador(Marca procesador) {
		this.procesador = procesador;
	}
	
}