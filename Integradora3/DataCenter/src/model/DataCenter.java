package model;

public class DataCenter {
	
	
	

	
	
	private double valorAlquilerGeneral;
	
	private MiniCuartos rooms[][];
	private MiniCuartos roomSimuladas[][];
	
	
	
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	public static final String ANSI_RESET = "\u001B[0m";
	
	
	public DataCenter(double valorAlquilerGeneral) {
		this.valorAlquilerGeneral = valorAlquilerGeneral;
		
		rooms=new MiniCuartos[50][8];
		roomSimuladas=new MiniCuartos[50][8];
		
		
		boolean ventanaSIoNO=false;
		String numero="";
		double valorAlquiler=0;
		for (int i=0; i< 8; i++ ) { // filas numbers.length
			for (int j = 0; j < 50; j++) { //columnas numbers[0].length
				if(rooms[j][i]==null){
					ventanaSIoNO=false;
					
					if(i==0 || i==7){
						ventanaSIoNO=true;
					}else if(j==0 || j==49){
						ventanaSIoNO=true;
					}
					numero=cambiarStringNumero(j,i);
					
					valorAlquiler=calcularDescuentos(i,valorAlquilerGeneral,ventanaSIoNO);
					rooms[j][i] = new MiniCuartos(valorAlquiler,numero,i,j,ventanaSIoNO);
					rooms[j][i].setEstadoDeAlquiler(EstadoAlquiler.DISPONIBLE);
					rooms[j][i].setEstado(Estado.APAGADO);
					
					roomSimuladas[j][i] = new MiniCuartos(valorAlquiler,numero,i,j,ventanaSIoNO);
					roomSimuladas[j][i].setEstadoDeAlquiler(EstadoAlquiler.DISPONIBLE);
					roomSimuladas[j][i].setEstado(Estado.APAGADO);
				}	
			}
			
		}
		
	}
	public String showMapa(){
		
		Estado estadoRoomEncendido=Estado.ENCENDIDO;
		Estado estadoRoomApagado=Estado.APAGADO;
		
		
		String print ="   Corredor 1    Corredor 2    Corredor 3    Corredor 4    Corredor 5    Corredor 6    Corredor 7    Corredor 8 "+"     "+"\n";
		print +="-----------------------------------------------------------------------------------------------------------------"+"\n";
		for (int i=0; i< 50; i++ ) { 
			print+="|     ";
			for (int j = 0; j < 8; j++) { 
				if((rooms[i][j].getEstado())==estadoRoomEncendido){
					print += ANSI_YELLOW +rooms[i][j].getNumero()+ ANSI_RESET;
				}
				if((rooms[i][j].getEstado())==estadoRoomApagado){
					print += ANSI_CYAN +rooms[i][j].getNumero()+ ANSI_RESET;
				}
				
				print +="     |     ";
			}
			//System.out.println(ANSI_RED + "Texto de color rojo" + ANSI_RESET);
			print += "\n";
		}
		print +="-----------------------------------------------------------------------------------------------------------------"+"\n";
		return print;
	}
	public String cambiarStringNumero(int j,int i){
		j=j+1;
		i=i+1;
		//String [] numerosLetras= {"A","B","C","D","E","F","G","H"};
		String numero=i+"";
		if(j<10){
			numero=numero+"0"+j+"";
		}else{
			numero=numero+j+"";
		}
		return numero;

	}
	public String showListRooms(double valorAlquiler){
		//rooms[j][i] = new MiniCuartos(numero);
		String print ="";
		String numero="";
		boolean ventanaSIoNO=false;
		EstadoAlquiler estadoRoom=EstadoAlquiler.DISPONIBLE;
		String ventana="No";
		for (int i=0; i< 8; i++ ) { // filas numbers.length
			for (int j = 0; j < 50; j++) { //columnas numbers[0].length
				if(rooms[j][i].getEstadoDeAlquiler()==estadoRoom){
					ventanaSIoNO=false;
					
					if(i==0 || i==7){
						ventanaSIoNO=true;
					}else if(j==0 || j==49){
						ventanaSIoNO=true;
					}
					if(ventanaSIoNO==true){
						ventana="Si";
					}else{
						ventana="No";
					}
					
					numero=cambiarStringNumero(j,i);
					valorAlquiler=calcularDescuentos(i,valorAlquilerGeneral,ventanaSIoNO);
					print=print+rooms[j][i].toString();
					/*print +="Cuarto numero: "+numero+" - Corredor: "+(i+1)+" - Posicion/Columna: "+(j+1)+" - Ventana: "+ventana+" - Valor de alquiler: "+valorAlquiler+" pesos.";
					print += "\n";*/
				}	
			}
			
		}
		return print;
	}
	public double calcularDescuentos(int i,double valorAlquilerGeneral,boolean ventanaSIoNO){
		double valorAlquiler=valorAlquilerGeneral;
		
		/*Minicuarto ubicado en Ventana: tiene un descuento del 10%
		Minicuarto ubicado en el séptimo corredor: tiene un descuento del 15%
		Minicuarto ubicado entre el segundo y sexto corredor, tiene un recargo del 25%*/
		
		if(ventanaSIoNO==true){
			valorAlquiler=valorAlquiler-(valorAlquiler*0.1);
		}
		if(i==6){
			valorAlquiler=valorAlquiler-(valorAlquiler*0.15);
		}
		if(i>0 && i<5){
			valorAlquiler=valorAlquiler+(valorAlquiler*0.25);
		}

		return valorAlquiler;
	}
	public boolean miniRoomDisponible(String numeroCuarto){
		boolean miniRoomEncontrada=false;
		
		String fila=numeroCuarto.substring(0,1);
		String columna=numeroCuarto.substring(1,3);
		
		int intFila=Integer.parseInt(fila);
		int intColumna=Integer.parseInt(columna);
		
		EstadoAlquiler estadoRoom=EstadoAlquiler.DISPONIBLE;
		
		
		//System.out.println("fila:"+intFila+"columna:"+intColumna);
		if(intFila>0 && intFila<9 && intColumna>0 && intColumna<51){
			if(rooms[intColumna-1][intFila-1].getEstadoDeAlquiler()==estadoRoom){
				miniRoomEncontrada=true;
			}
		}
		
		return miniRoomEncontrada;
		
	}
	public String capacidadRACK(String numeroCuarto){
		String capacidadTotalRack="";
		
		String fila=numeroCuarto.substring(0,1);
		String columna=numeroCuarto.substring(1,3);
		
		int intFila=Integer.parseInt(fila);
		int intColumna=Integer.parseInt(columna);
		
		int i=intFila-1;
		int j=intColumna-1;
		
		capacidadTotalRack=rooms[j][i].calcularCapacidadTotalProcesamiento();
		
		return capacidadTotalRack;
		
	}
	public String capacidadTodosRACK(String nombreEmpresa){
		String capacidadTotalTodosRack="";
		double totalRam=0;
		double totalDisco=0;
		
		for (int i=0; i< 8; i++ ) { 
			for (int j = 0; j < 50; j++) { 
			//System.out.println(rooms[j][i].getNombreEmpresa());
				if(rooms[j][i].getNombreEmpresa()!=null){
					if(rooms[j][i].getNombreEmpresa().equalsIgnoreCase(nombreEmpresa)){
						totalDisco=+rooms[j][i].capacidadServidoresDisco();
						totalRam=+rooms[j][i].capacidadServidoresRAM();
						
					}
					
				}
					
				
				
			}
			
		}
		capacidadTotalTodosRack="La capadidad total de disco es de "+totalDisco+" teras."+"\n"+"El total de memoria RAM es de "+totalRam+" GB";
		
		return capacidadTotalTodosRack;
		
	}
	public void cancelarAlquilerTodas(String nombreEmpresa){
		boolean ventanaSIoNO=false;
		String numero="";
		double valorAlquiler=0;
		for (int i=0; i< 8; i++ ) { 
			for (int j = 0; j < 50; j++) { 
				if(rooms[j][i].getNombreEmpresa()!=null){
					if(rooms[j][i].getNombreEmpresa().equalsIgnoreCase(nombreEmpresa)){
						ventanaSIoNO=false;
						
						if(i==0 || i==7){
							ventanaSIoNO=true;
						}else if(j==0 || j==49){
							ventanaSIoNO=true;
						}
						numero=cambiarStringNumero(j,i);
						valorAlquiler=calcularDescuentos(i,valorAlquilerGeneral,ventanaSIoNO);
						rooms[j][i] = new MiniCuartos(valorAlquiler,numero,i,j,ventanaSIoNO);
						rooms[j][i].setEstadoDeAlquiler(EstadoAlquiler.DISPONIBLE);
						rooms[j][i].setEstado(Estado.APAGADO);
						
					}
					
				}
					
				
				
			}
			
		}
	}

	public void cancelarAlquiler(String numeroCuarto){
		String fila=numeroCuarto.substring(0,1);
		String columna=numeroCuarto.substring(1,3);
		
		int intFila=Integer.parseInt(fila);
		int intColumna=Integer.parseInt(columna);
		
		int i=intFila-1;
		int j=intColumna-1;
		rooms[j][i].setEstadoDeAlquiler(EstadoAlquiler.DISPONIBLE);
		
		boolean ventanaSIoNO=false;
		String numero="";
		double valorAlquiler=0;
		if(i==0 || i==7){
			ventanaSIoNO=true;
		}else if(j==0 || j==49){
			ventanaSIoNO=true;
		}
		numero=cambiarStringNumero(j,i);
		valorAlquiler=calcularDescuentos(i,valorAlquilerGeneral,ventanaSIoNO);
		rooms[j][i] = new MiniCuartos(valorAlquiler,numero,i,j,ventanaSIoNO);
		rooms[j][i].setEstadoDeAlquiler(EstadoAlquiler.DISPONIBLE);
		rooms[j][i].setEstado(Estado.APAGADO);
	}
	public boolean miniRoomAlquilada(String numeroCuarto){
		boolean miniRoomEncontrada=false;
		
		String fila=numeroCuarto.substring(0,1);
		String columna=numeroCuarto.substring(1,3);
		
		int intFila=Integer.parseInt(fila);
		int intColumna=Integer.parseInt(columna);
		
		int i=intFila-1;
		int j=intColumna-1;
		
		EstadoAlquiler estadoRoom=EstadoAlquiler.ALQUILADO;
		
		
		if(intFila>0 && intFila<9 && intColumna>0 && intColumna<51){
			if(rooms[j][i].getEstadoDeAlquiler()==estadoRoom){
				miniRoomEncontrada=true;
			}
		}
		
		return miniRoomEncontrada;
		
	}
	public void alquilarRoom(String numeroCuarto,int day,int month,int year,int numeroServidores,String nit,String nombreEmpresa,int numRegistroProyecto,int asignadoMiniRoom){
		boolean ventanaSIoNO=false;
		String fila=numeroCuarto.substring(0,1);
		String columna=numeroCuarto.substring(1,3);
		
		int intFila=Integer.parseInt(fila);
		int intColumna=Integer.parseInt(columna);
		int i=intFila-1;
		int j=intColumna-1;
		if(i==0 || i==7){
			ventanaSIoNO=true;
		}else if((intColumna-1)==0 || (intColumna-1)==49){
			ventanaSIoNO=true;
		}
		double precio=calcularDescuentos(i,valorAlquilerGeneral,ventanaSIoNO);
		if(numeroServidores<4){
			precio=precio+(precio*0.15);
		}
		if(asignadoMiniRoom==1){
			rooms[j][i] = new MiniCuartos(precio,numeroCuarto,day,month,year,numeroServidores,numRegistroProyecto,i,j,ventanaSIoNO);
			/*rooms[j][i].setEstado(Estado.ENCENDIDO);
			rooms[j][i].setEstadoDeAlquiler(EstadoAlquiler.ALQUILADO);*/
		}
		if(asignadoMiniRoom==2){
			rooms[j][i] = new MiniCuartos(precio,numeroCuarto,day,month,year,numeroServidores,nit,nombreEmpresa,i,j,ventanaSIoNO);
			
			/*rooms[j][i].setEstado(Estado.ENCENDIDO);
			rooms[j][i].setEstadoDeAlquiler(EstadoAlquiler.ALQUILADO);*/
		}
		
		rooms[j][i].setEstado(Estado.ENCENDIDO);
		rooms[j][i].setEstadoDeAlquiler(EstadoAlquiler.ALQUILADO);
		
		
		
		
	}
	public void anadirServidor(String numeroCuarto,int x,double cantMemoriaCache,int numProcesadores,int marcaProcesador,double cantMemoriaRAM,int cantDiscos,double capaDiscos){
		String fila=numeroCuarto.substring(0,1);
		String columna=numeroCuarto.substring(1,3);
		
		int intFila=Integer.parseInt(fila);
		int intColumna=Integer.parseInt(columna);
		int i=intFila-1;
		int j=intColumna-1;
		rooms[j][i].addServidor(x,cantMemoriaCache,numProcesadores,marcaProcesador,cantMemoriaRAM,cantDiscos,capaDiscos);
	}
	public boolean simularTodosPrendido(){
		boolean prendidoExitoso=false;
		int contador=0;
		for (int i=0; i< 8; i++ ) { 
			for (int j = 0; j < 50; j++) { 
				roomSimuladas[j][i].setEstado(Estado.ENCENDIDO);
				contador++;
			}
		}
		if (contador==400){
			prendidoExitoso=true;
		}
		return prendidoExitoso;
		
	}
	public void simularApagadoL(){
		for (int i=0; i< 8; i++ ) { 
			for (int j = 0; j < 50; j++) { 
				if(j==0 || i==0){
					roomSimuladas[j][i].setEstado(Estado.APAGADO);
				}
			}
		}
	}
	public void simularApagadoZ(){
		int diagonal=48;
		for (int i=0; i< 8; i++ ) { 
			for (int j = 0; j < 50; j++) { 
				if(i==0 || i==7){
					roomSimuladas[j][i].setEstado(Estado.APAGADO);
				}
				if((j+1)==diagonal){
					roomSimuladas[j][i].setEstado(Estado.APAGADO);
				}
			}
			diagonal=diagonal-8;
		}
	}
	public void simularApagadoH(){
		for (int i=0; i< 8; i++ ) { 
			for (int j = 0; j < 50; j++) { 
				if(i%2!=0){
					roomSimuladas[j][i].setEstado(Estado.APAGADO);
				}
			}
		}
	}
	public void simularApagadoO(){
		for (int i=0; i< 8; i++ ) { 
			for (int j = 0; j < 50; j++) { 
				if(i==0 || i==7 || j==0 || j==49){
					roomSimuladas[j][i].setEstado(Estado.APAGADO);
				}
			}
		}
		
	}
	public void simularApagadoM(int columnaApagar){
		for (int i=0; i< 8; i++ ) { 
			for (int j = 0; j < 50; j++) { 
				if(j==(columnaApagar-1)){
					roomSimuladas[j][i].setEstado(Estado.APAGADO);
				}
			}
		}
	}
	public void simularApagadoP(int corredorApagar){
		for (int i=0; i< 8; i++ ) { 
			for (int j = 0; j < 50; j++) { 
				if(i==(corredorApagar-1)){
					roomSimuladas[j][i].setEstado(Estado.APAGADO);
				}
			}
		}
	}
	public double getValorAlquilerGeneral() {
		return valorAlquilerGeneral;
	}

	public void setValorAlquilerGeneral(double valorAlquilerGeneral) {
		this.valorAlquilerGeneral = valorAlquilerGeneral;
	}
	public String showMapaSimulacion(){
		
		Estado estadoRoomEncendido=Estado.ENCENDIDO;
		Estado estadoRoomApagado=Estado.APAGADO;
		
		
		String print ="   Corredor 1    Corredor 2    Corredor 3    Corredor 4    Corredor 5    Corredor 6    Corredor 7    Corredor 8 "+"     "+"\n";
		print +="-----------------------------------------------------------------------------------------------------------------"+"\n";
		for (int i=0; i< 50; i++ ) { 
			print+="|     ";
			for (int j = 0; j < 8; j++) { 
				if((roomSimuladas[i][j].getEstado())==estadoRoomEncendido){
					print += ANSI_YELLOW +roomSimuladas[i][j].getNumero()+ ANSI_RESET;
				}
				if((roomSimuladas[i][j].getEstado())==estadoRoomApagado){
					print += ANSI_CYAN +roomSimuladas[i][j].getNumero()+ ANSI_RESET;
				}
				
				print +="     |     ";
			}
			//System.out.println(ANSI_RED + "Texto de color rojo" + ANSI_RESET);
			print += "\n";
		}
		print +="-----------------------------------------------------------------------------------------------------------------"+"\n";
		return print;
	}

	
}