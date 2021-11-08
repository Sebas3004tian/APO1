package model;

public class Canal {
	

	private int nit;
	private String direccion;
	private String website;
	
	private Suscriptor [] suscriptores;
	private int Suscriptor []=new int [50];
	
	public Canal(int nit, String direccion, String website) {
		this.nit = nit;
		this.direccion = direccion;
		this.website = website;
		suscriptores=new Suscriptor[50];
		
	}
	public int getNit() {
		return nit;
	}

	public void setNit(int nit) {
		this.nit = nit;
	}
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
	public boolean verificarCedula(int cedula){
		boolean salida=false;
		for(int x=0;x<50;x++){
			if(suscriptores[x]!=null){
				if(cedula==suscriptores[x].getCedula()){
					return true;
				}
			}
			
		}
		return salida;
		
	}
	public boolean hayEspacioSuscriptores(){
		boolean noHay=false;
		int posicion=-1;
		for(int x=0;x<50;x++){
			if(x==49){
				if(suscriptores[49]!=null){
					noHay=true;
				}
			}
			if(suscriptores[x]==null){
				posicion=x;
				x=50;
			}
			
			
		}
		if(posicion==-1){
			noHay=true;
		}
		return noHay;
		
	}
	public String AllSuscriptor(){
		String allSuscriptorRegistered="";

		for(int x=0; x<50; x++ ){

			if(suscriptores[x]!=null){
				allSuscriptorRegistered+="SUSCRIPTOR "+(x+1)+ " \n";
				allSuscriptorRegistered+=suscriptores[x].toString();
				allSuscriptorRegistered+="\n";
			}
			
		}
		
		return allSuscriptorRegistered;
	}
	public void addSuscriptor(int cedula,String nombre,int edad,int horasDisConsumir,int tipoCliente){
		boolean guardado=false;
		int posicionGuardada=-1;
		

		for(int x=0;x<50;x++){
			if(suscriptores[x]==null){
				
				suscriptores[x] = new Suscriptor(cedula, nombre, edad, horasDisConsumir);
				if(tipoCliente==1){
					suscriptores[x].setType(TipoCliente.NORMAL);
				}
				if(tipoCliente==2){
					suscriptores[x].setType(TipoCliente.PLATINO);
				}
				if(tipoCliente==3){
					suscriptores[x].setType(TipoCliente.ORO);
				}
				if(tipoCliente==4){
					suscriptores[x].setType(TipoCliente.DIAMANTE);
				}
				suscriptores[x].setEstados(Estado.ACTIVO);
				guardado=true;
			}
			if(guardado){
				
				posicionGuardada=x;
				x=50;
			}
			
			
		}
		
		

	}
	public boolean numDesactivarExiste(int numeroDescativar){
		boolean siExiste=false;
		if(suscriptores[numeroDescativar-1]!=null){
			siExiste=true;
		}

		return siExiste;
	}
	public void desactivateSuscriptorNumber(int numeroDescativar){
		suscriptores[numeroDescativar-1].setEstados(Estado.INACTIVO);
		suscriptores[numeroDescativar-1].setType(TipoCliente.NORMAL);
	}
	public boolean cedulaDesactivarExiste(int cedulaDesactivar){
		boolean siExiste=false;
		int posicionSuscriptorDesactivar=-1;
		for(int x=0;x<50;x++){
			if(suscriptores[x]!=null){
				if(cedulaDesactivar==suscriptores[x].getCedula()){
					posicionSuscriptorDesactivar=x;
				}
			}
			
		}
		if(posicionSuscriptorDesactivar!=-1){
			siExiste=true;
		}
		return siExiste;
	}

	public void desactivateSuscriptor(int cedulaDesactivar){
		
		int posicionSuscriptorDesactivar=-1;
		for(int x=0;x<50;x++){
			if(suscriptores[x]!=null){
				if(cedulaDesactivar==suscriptores[x].getCedula()){
					posicionSuscriptorDesactivar=x;
				}
			}
			
		}
		if(posicionSuscriptorDesactivar!=-1){
			suscriptores[posicionSuscriptorDesactivar].setEstados(Estado.INACTIVO);
			suscriptores[posicionSuscriptorDesactivar].setType(TipoCliente.NORMAL);
			
		}
	}
	public String infoTOTALAct(){
		
		int numSuscriptoresActivos=0;
		for(int x=0;x<50;x++){
			if(suscriptores[x]!=null){
				if(suscriptores[x].getEstados()==Estado.ACTIVO){
					numSuscriptoresActivos+=1;
				}
			}
			
		}
		return "-El numero total de suscriptores activos es "+numSuscriptoresActivos+"\n";
	}
	public String infoNORMAL(){
		
		int ActivosNORMAL=0;
		for(int x=0;x<50;x++){
			if(suscriptores[x]!=null){
				if(suscriptores[x].getEstados()==Estado.ACTIVO){
					if(suscriptores[x].getType()==TipoCliente.NORMAL){
						ActivosNORMAL+=1;
					}
				}
			}
			
		}
		return "-El numero de suscriptores activos y de tipo NORMAL: "+ActivosNORMAL+"\n";
	}
	public String infoPLATINO(){
		
		int ActivosPLATINO=0;
		for(int x=0;x<50;x++){
			if(suscriptores[x]!=null){
				if(suscriptores[x].getEstados()==Estado.ACTIVO){
					if(suscriptores[x].getType()==TipoCliente.PLATINO){
						ActivosPLATINO+=1;
					}
				}
			}
			
		}
		return "-El numero de suscriptores activos y de tipo PLATINO: "+ActivosPLATINO+"\n";
	}
	public String infoORO(){
		
		int ActivosORO=0;
		for(int x=0;x<50;x++){
			if(suscriptores[x]!=null){
				if(suscriptores[x].getEstados()==Estado.ACTIVO){
					if(suscriptores[x].getType()==TipoCliente.ORO){
						ActivosORO+=1;
					}
				}
			}
			
		}
		return "-El numero de suscriptores activos y de tipo ORO: "+ActivosORO+"\n";
	}
	public String infoDIAMANTE(){
		String ActivosDIAMANTE="";
		int ActivosPLATINO=0;
		for(int x=0;x<50;x++){
			if(suscriptores[x]!=null){
				if(suscriptores[x].getEstados()==Estado.ACTIVO){
					if(suscriptores[x].getType()==TipoCliente.DIAMANTE){
						ActivosPLATINO+=1;
					}
				}
			}
			
		}
		return "-El numero de suscriptores activos y de tipo DIAMANTE: "+ActivosPLATINO+"\n";
	}
	public String suscriptorMayorDispuestoConsumir(){
		int numSuscriptor=0;
		int numeroMayor=0;
		for(int x=0;x<50;x++){
			if(suscriptores[x]!=null){
				if(suscriptores[x].getEdad()<18){
					if(suscriptores[x].getEstados()==Estado.ACTIVO){
						if(suscriptores[x].getHorasDisConsumir()>numeroMayor){ 
							numeroMayor = suscriptores[x].getHorasDisConsumir();
							numSuscriptor=x;
						}
					}
				}
			}
		}
		return"El suscriptor menor de edad que tiene el mayor número de horas dispuesto a consumir es :"+suscriptores[numSuscriptor].toString();
		
	}
	

}