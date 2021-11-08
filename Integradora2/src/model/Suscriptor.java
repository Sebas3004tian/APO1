package model;


public class Suscriptor {
	

	private int cedula;
	private String nombre;
	private int edad;
	private int horasDisConsumir;
	

	private TipoCliente type;
	private Estado estados;
	
	public Suscriptor(int cedula, String nombre, int edad, int horasDisConsumir) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.edad = edad;
		this.horasDisConsumir = horasDisConsumir;
		this.type=type;
		this.estados=estados;
		
		
		
	}
	
	public int getCedula(){
		return cedula;
		
	}
	public void setCedula(int cedula){
		this.cedula=cedula;
		
	}
	public String getNombre(){
		return nombre;
		
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
		
	}
	public int getEdad(){
		return edad;
		
	}
	public void setEdad(int edad){
		this.edad=edad;
		
	}
	public int getHorasDisConsumir(){
		return horasDisConsumir;
		
	}
	public void setHorasDisConsumir(int horasDisConsumir){
		this.horasDisConsumir=horasDisConsumir;
		
	}
	public TipoCliente getType(){
		return type;
		
	}
	public void setType(TipoCliente type){
		this.type=type;
		
	}
	public Estado getEstados(){
		return estados;
		
	}
	public void setEstados(Estado estados){
		this.estados=estados;
		
	}
	public String toString(){
	
		
		return "\n"+"**** Datos del suscriptor ****"+
		"\n"+"La cedula del suscriptor es "+cedula+
		"\n"+"El nombre del suscriptor es "+nombre+
		"\n"+"La edad del suscriptor es "+edad+
		"\n"+"Las horas dispuestas a consumir son "+horasDisConsumir+
		"\n"+"El estado es "+estados+
		"\n"+"El tipo de cliente es "+type+"\n"
		+"--------------------------------------------------------------"+"\n";

	}
}