package model;

public class MiniCuartos {
	private double valorAlquiler;
	private String numero;
	private int columna;
	private int fila;
	private EstadoAlquiler estadoDeAlquiler;
	private boolean ventana;
	private int numeroServidores;
	
	private Date fechaAlquiler;
	private Servidor[] servidores;
	private Empresa empresaAlquilo;
	private Estado estado;
	
	private int Servidor []=new int [numeroServidores];
	
	public MiniCuartos(double valorAlquiler,String numero,int day,int month,int year,int numeroServidores,String nit,String nombreEmpresa,int fila,int columna,boolean ventana) {
		this.valorAlquiler = valorAlquiler;
		this.numero = numero;
		this.columna = columna;
		this.fila = fila;
		this.ventana = ventana;
		fechaAlquiler = new Date(day, month, year);
		empresaAlquilo = new Empresa(nit, nombreEmpresa);
	}
	public MiniCuartos(double valorAlquiler,String numero,int day,int month,int year,int numeroServidores,int numRegistroProyecto,int fila,int columna,boolean ventana) {
		String nombreEmpresa="ICESI";
		String nit="890.316.745-5";
		this.valorAlquiler = valorAlquiler;
		this.numero = numero;
		this.columna = columna;
		this.fila = fila;
		this.ventana = ventana;
		fechaAlquiler = new Date(day, month, year);
		empresaAlquilo = new Empresa(nit, nombreEmpresa);
	}

	
	public double getValorAlquiler() {
		return valorAlquiler;
	}

	public void setValorAlquiler(double valorAlquiler) {
		this.valorAlquiler = valorAlquiler;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public EstadoAlquiler getEstadoDeAlquiler() {
		return estadoDeAlquiler;
	}

	public void setEstadoDeAlquiler(EstadoAlquiler estadoDeAlquiler) {
		this.estadoDeAlquiler = estadoDeAlquiler;
	}

	public boolean isVentana() {
		return ventana;
	}

	public void setVentana(boolean ventana) {
		this.ventana = ventana;
	}

	public Servidor[] getServidores() {
		return servidores;
	}

	public void setServidores(Servidor[] servidores) {
		this.servidores = servidores;
	}

	public Empresa getEmpresaAlquilo() {
		return empresaAlquilo;
	}

	public void setEmpresaAlquilo(Empresa empresaAlquilo) {
		this.empresaAlquilo = empresaAlquilo;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
}