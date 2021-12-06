package model;

import java.util.ArrayList;

public class MiniCuartos {
	private double valorAlquiler;
	private String numero;
	private int columna;
	private int fila;
	private EstadoAlquiler estadoDeAlquiler;
	private boolean ventana;
	private int numeroServidores;
	private String nombreEmpresa;
	
	private Date fechaAlquiler;
	private ArrayList<Servidor> rack;

	//private Servidor[] racks;
	private Empresa empresaAlquilo;
	private Estado estado;
	
	
	
	//private int Servidor []=new int [numeroServidores];
	
	public MiniCuartos(double valorAlquiler,String numero,int day,int month,int year,int numeroServidores,String nit,String nombreEmpresa,int fila,int columna,boolean ventana) {
		this.nombreEmpresa=nombreEmpresa;
		this.valorAlquiler = valorAlquiler;
		this.numero = numero;
		this.columna = columna;
		this.fila = fila;
		this.ventana = ventana;
		fechaAlquiler = new Date(day, month, year);
		empresaAlquilo = new Empresa(nit, nombreEmpresa);
		rack = new ArrayList <Servidor>();
		
	}
	public MiniCuartos(double valorAlquiler,String numero,int day,int month,int year,int numeroServidores,int numRegistroProyecto,int fila,int columna,boolean ventana) {
		String nombreEmpresa="ICESI";
		String nit="890.316.745-5"; 
		this.nombreEmpresa=nombreEmpresa;		
		this.valorAlquiler = valorAlquiler;
		this.numero = numero;
		this.columna = columna;
		this.fila = fila;
		this.ventana = ventana;
		fechaAlquiler = new Date(day, month, year);
		empresaAlquilo = new Empresa(nit, nombreEmpresa);
		rack = new ArrayList <Servidor>();
	}
	public MiniCuartos(double valorAlquiler,String numero,int fila,int columna,boolean ventana){
		this.valorAlquiler = valorAlquiler;
		this.numero = numero;
		this.columna = columna;
		this.fila = fila;
		this.ventana = ventana;
		rack = new ArrayList <Servidor>();
	}

	public double capacidadServidoresDisco(){
		double capServidoresDisco=0;
		for (int i = 0; i < rack.size(); i++) {
			capServidoresDisco=+(rack.get(i).getCapaDiscos()*rack.get(i).getCantDiscos());
		}
		return capServidoresDisco;
	}
	public double capacidadServidoresRAM(){
		double capServidoresRAM=0;
		for (int i = 0; i < rack.size(); i++) {
			capServidoresRAM=+rack.get(i).getCantMemoriaRAM();
		}
		return capServidoresRAM;
	}

	public String calcularCapacidadTotalProcesamiento(){
		String capacidadTotal="";
		double capacidadTotalDisco=0;
		double totalMemoriaRAM=0;
		for (int i = 0; i < rack.size(); i++) {
			capacidadTotalDisco=+(rack.get(i).getCapaDiscos()*rack.get(i).getCantDiscos());
			totalMemoriaRAM=+rack.get(i).getCantMemoriaRAM();
		}
		capacidadTotal="La capadidad total de disco es de "+capacidadTotalDisco+" teras."+"\n"+"El total de memoria RAM es de "+totalMemoriaRAM+" GB";
		return capacidadTotal;
	}

	public void addServidor(int x,double cantMemoriaCache,int numProcesadores,int marcaProcesador,double cantMemoriaRAM,int cantDiscos,double capaDiscos){
		//rack = new ArrayList <Servidor>(cantMemoriaCache,numProcesadores,cantMemoriaRAM,cantDiscos,capaDiscos);
		//rack.get[x] = new Servidor(cantMemoriaCache,numProcesadores,cantMemoriaRAM,cantDiscos,capaDiscos);
		rack.add(new Servidor(cantMemoriaCache,numProcesadores,cantMemoriaRAM,cantDiscos,capaDiscos));
		if(marcaProcesador==1){
			rack.get(x).setProcesador(Marca.INTEL);
		}
		if(marcaProcesador==2){
			rack.get(x).setProcesador(Marca.AMD);
		}
		
		
		
	}
	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
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

	public boolean getVentana() {
		return ventana;
	}

	public void setVentana(boolean ventana) {
		this.ventana = ventana;
	}

	/*public ArrayList get<Servidor>()
	{
		return <Servidor>;
	}

	public void set<Servidor>(ArrayList<Servidor>)
	{
		this.<Servidor> = <Servidor>;
	}*/

	/*public Servidor[] getRack() {
		return rack;
	}

	public void setSRack(Servidor[] rack) {
		this.rack = rack;
	}*/

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
	
	public String toString() {
		String ventanaMensaje=" NO ";
		if(ventana){
			ventanaMensaje=" SI ";
		}
		return  "\n"+"**** MiniRoom data****"+
		"\n"+"--------------------------------------------------------------"+
		"\n"+"El numero de la habitacion es: "+numero+" En el corredor: "+(fila+1)+" En la posicion: "+(columna+1)+
		"\n"+"La habitacion"+ventanaMensaje+"tiene ventana cercana."+
		"\n"+"El valor total de arriendo es de: "+valorAlquiler+" pesos."+"\n"
		+"--------------------------------------------------------------"+"\n";
	}
	/*public String toString() {
		String ventanaMensaje=" NO ";
		if(ventana){
			ventanaMensaje=" SI ";
		}
		return  "\n"+"**** MiniRoom data****"+
		"\n"+"------------------------------"+
		"\n"+"El numero de la habitacion es: "+numero+" En el corredor: "+fila+" En la posicion: "+columna+
		"\n"+"La habitacion"+ventanaMensaje+"tiene ventana cercana."+
		"\n"+"El numero de servidodes en la habitacion es "+numeroServidores+" rack."+
		"\n"+"La empresa que alquilo la habitacion es "+empresaAlquilo+
		"\n"+"La fecha en la que se alquilo es "+fechaAlquiler+
		"\n"+"El estado de el alquiler es "+estadoDeAlquiler+
		"\n"+"El estado de la habitacion es "+estado+
		"\n"+"El valor total de arriendo es de: "+valorAlquiler+" pesos."+"\n"
		+"--------------------------------------------------------------"+"\n";
	}*/
	
}