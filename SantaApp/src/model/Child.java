package model;

public class Child implements  Comparable<Child>{
//public class Child {
	private String nombre;
	private String apellido;
	private int edad;
	/*private String direccion;
	private String ciudad;
	private String pais;*/
	private String dirrecionTotal;
	private String deseo;
		
	
	
	private Estado buenoOmalo;
	
	public Child(String nombre,String apellido,int edad,String dirrecionTotal,String deseo) {

		this.nombre=nombre;
		this.apellido=apellido;
		/*this.direccion=direccion;
		this.ciudad=ciudad;
		this.pais=pais;*/
		this.dirrecionTotal=dirrecionTotal;
		this.deseo=deseo;
		this.edad=edad;
		this.buenoOmalo=buenoOmalo;
	}
	@Override
	public int compareTo(Child otherChild){
		return this.edad-otherChild.edad;
	}

	/*public int compareTo() {
		int pdf=1;
        if (pdt == null) {
            return 1; //podemos asumir que this es mayor que null
        }
        // asumo que la fecha es de tipo LocalDate, Date o similar, que ya cumplen 
        //la interfaz Comparable
        return this.fechaReparacion.compareTo(pdt.fechaReparacion);

    }*/
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDirrecionTotal() {
		return dirrecionTotal;
	}
	public void setDirrecionTotal(String dirrecionTotal) {
		this.dirrecionTotal = dirrecionTotal;
	}
	
	/*public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}*/
	
	public String getDeseo() {
		return deseo;
	}
	public void setDeseo(String deseo) {
		this.deseo = deseo;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Estado getBuenoOmalo(){
		return buenoOmalo;
		
	}
	public void setBuenoOmalo(Estado buenoOmalo){
		this.buenoOmalo=buenoOmalo;
		
	}
	public String toString(){

		return "\n"+"**** Child data****"+
		"\n"+"------------------------------"+
		"\n"+"El nombre es : "+getNombre()+
		"\n"+"El apellido es : "+getApellido()+
		"\n"+"Su edad es : "+getEdad()+
		"\n"+"Su direccion es : "+getDirrecionTotal()+
		"\n"+"Y su deseo es : "+getDeseo()+"\n"
		+"--------------------------------------------------------------"+"\n";

	}
}