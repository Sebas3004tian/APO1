package ui;
import java.util.Scanner;
import model.DataCenter;

public class SystemDataCenter {
	private DataCenter center;
	private Scanner sc;
	
	private double valorAlquiler=0;
	
	public SystemDataCenter() {
		sc= new Scanner(System.in);
		
	}
	public static void main(String[] args) {
		SystemDataCenter menu = new SystemDataCenter();
		menu.inicioDataCenter();
		
		int respuestaMenuInicial= 0;
		
		try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            
        }
		do {
		    respuestaMenuInicial =menu.MenuInicial();
		    menu.opcionMenuInicial(respuestaMenuInicial);
		}while (respuestaMenuInicial !=0);
		
	}
	public void inicioDataCenter() {
		try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            
        }
		boolean out=false;
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Bienvenido a la aplicacion de DataCenter.");
		System.out.println(" ");
		System.out.println("Digite el valor de alquiler para todos los minicuartos: ");
		do{
			double valorAlquilerGeneral= sc.nextDouble();
			if(valorAlquilerGeneral>0){
				out=true;
				valorAlquiler=valorAlquilerGeneral;
				center = new DataCenter(valorAlquilerGeneral);
			}else{
				System.out.println("Porfavor ingresa un valor valido!!");
			}
		}while(!out);
		
	}
	public int MenuInicial(){
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Bienvenido al menu del data center ");
		System.out.println(" ");
		System.out.println("Selecciona lo que deseas hacer:");
		System.out.println(" ");
		System.out.println("(1). Generar un listado con lo minicuartos disponibles");
		System.out.println("(2). Apartado de Alquiler");
		System.out.println("(3). Mapa General");
		System.out.println("(4). Apartado de Simulaciones");
		System.out.println("(0). Salir de la aplicacion");
		int respuesta=sc.nextInt();

		return respuesta;
	}
	public void opcionMenuInicial(int respuestaMenuInicial) {
		if(respuestaMenuInicial!=0&&respuestaMenuInicial!=1&&respuestaMenuInicial!=2&&respuestaMenuInicial!=3&&respuestaMenuInicial!=4){
			System.out.println(" ");
			System.out.println("///////RECUERDA SELECCIONAR un numero del menu/////////");
			System.out.println(" ");
		}
		try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            
        }
		switch(respuestaMenuInicial) {
		case 0: 
			System.out.println(" ");	
			System.out.println("Se cierra la aplicacion,gracias...");
			System.out.println(" ");
			break;
		case 1:
			System.out.println(center.showListRooms(valorAlquiler));
			break;
		case 2:
			int respuestaMenuAlquiler=0;
			do{
				respuestaMenuAlquiler=MenuAlquiler();
				opcionMenuAlquiler(respuestaMenuAlquiler);
			}while(respuestaMenuAlquiler!=0);
			break;
		case 3: 
			mapa();
			break;
		case 4: 
			int respuestaMenuSimulacion=0;
			do{
				respuestaMenuSimulacion=MenuSimulacion();
				opcionMenuSimulacion(respuestaMenuSimulacion);
			}while(respuestaMenuSimulacion!=0);
			break;
		}
		
	}
	public void mapa(){
		System.out.println(" ");
		System.out.println(center.showMapa());
		System.out.println(" ");
		System.out.println("Las habitaciones que aparecen en blanco se encuentran encendidas");
		System.out.println(" ");
	}
	public int MenuAlquiler(){
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Bienvenido al apartado de Alquiler.");
		System.out.println(" ");
		System.out.println("Selecciona lo que deseas hacer:");
		System.out.println(" ");
		System.out.println("(1). Alquilar  un minicuarto");
		System.out.println("(2). Cancelar el alquiler para un minicuarto");
		System.out.println("(3). Cancelar el alquiler para todos los minicuartos de una empresa");
		System.out.println("(0). Volver al menu principal");
		int respuesta=sc.nextInt();

		return respuesta;
	}
	
	public void opcionMenuAlquiler(int respuestaMenuAlquiler) {
		if(respuestaMenuAlquiler!=0&&respuestaMenuAlquiler!=1&&respuestaMenuAlquiler!=2&&respuestaMenuAlquiler!=3){
			System.out.println(" ");
			System.out.println("///////RECUERDA SELECCIONAR un numero del menu/////////");
			System.out.println(" ");
		}
		try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            
        }
		switch(respuestaMenuAlquiler) {
		case 0: 
			System.out.println(" ");
			System.out.println("Devuleta al menu inicial");
			System.out.println(" ");
			break;
		case 1:
			alquilarMiniRoom();
			break;
		case 2:
			cancelarMiniRoom();
			break;
		case 3:
			cancelarTodosMiniRoom();		
			break;
		}
		
	}
	public void cancelarTodosMiniRoom(){
		boolean out=false;
		do{
			System.out.println("Ingresa el nombre de la empresa para cancelar el alquiler de todas las habitaciones asociadas: ");
			String nombreEmpresa= sc.next();
			sc.nextLine();
			System.out.println("Antes de proceder a la cancelacion la capacidad de procesamiento del RACK de esta habitacion es:");
			System.out.println("--------------------------------------------------------------------------");
			System.out.println(center.capacidadTodosRACK(nombreEmpresa));
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("Desea continuar?: ");
				System.out.println("(1). Si");
				System.out.println("(2). No");
				int respuestaContinuar=sc.nextInt();
				if(respuestaContinuar==1 || respuestaContinuar==2){
					if(respuestaContinuar==1){
						if(!out){
							center.cancelarAlquilerTodas(nombreEmpresa);
							System.out.println("El alquiler de las habtiaciones a nombre de la empresa "+nombreEmpresa+" han sido canceladas con exito.");
							out=true;
						}
					}else if(respuestaContinuar==2){
						System.out.println(" ");
						System.out.println("En otra ocacion sera, gracias....");
						System.out.println(" ");
						out=true;
						
					}
				}else{
					System.out.println(" ");
					System.out.println("Por favor escoge 1 o 2");
					System.out.println(" ");
					out=true;
				}
			
			
		}while(!out);
	}
	public void cancelarMiniRoom(){
		boolean out=false;
		do{
			System.out.println("Ingresa el numero del minicuarto que deseas cancelar el alquiler: ");
			String numeroCuarto= sc.next();
			sc.nextLine();
			
			
			if(center.miniRoomAlquilada(numeroCuarto)){
				System.out.println("Antes de proceder a la cancelacion la capacidad de procesamiento del RACK de esta habitacion es:");
				System.out.println("--------------------------------------------------------------------------");
				System.out.println(center.capacidadRACK(numeroCuarto));
				System.out.println("--------------------------------------------------------------------------");
				System.out.println("Desea continuar?: ");
				System.out.println("(1). Si");
				System.out.println("(2). No");
				int respuestaContinuar=sc.nextInt();
				if(respuestaContinuar==1 || respuestaContinuar==2){
					if(respuestaContinuar==1){
						if(!out){
							center.cancelarAlquiler(numeroCuarto);
							System.out.println("El alquiler de la habtiacion numero "+numeroCuarto+" ha sido cancelado con exito.");
							out=true;
						}
					}else if(respuestaContinuar==2){
						System.out.println(" ");
						System.out.println("En otra ocacion sera, gracias....");
						System.out.println(" ");
						out=true;
						
					}
				}else{
					System.out.println(" ");
					System.out.println("Por favor escoge 1 o 2");
					System.out.println(" ");
					out=true;
				}
				
			}else if (!center.miniRoomAlquilada(numeroCuarto)){
				System.out.println("La habitacion no ha sido encontrada, o  no esta en estado ALQUILADO,por favor verifica el mapa de estados de las habitaciones.");
				out=true;
			}
		}while(!out);
	}
	public void alquilarMiniRoom(){
		boolean out=false;
		int day=0;
		int month=0;
		int year=0;
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Bienvenido al apartado de alquilar un minicuarto");
		System.out.println(" ");
		do{
			System.out.println("Ingresa el numero del minicuarto que deseas alquilar: ");
			String numeroCuarto= sc.next();
			sc.nextLine();
			
			
			if(center.miniRoomDisponible(numeroCuarto)){
	
				System.out.println("Ingresa la fecha de hoy: ");
				System.out.println("Day : ");
				day=sc.nextInt();
				
				
				if(day>31 || day<0){
					
					System.out.println("ERROR No month has more than 31 days.");
					out=true;
					
				}
				if(!out){
					
					System.out.println("Month : ");
					month=sc.nextInt();
					if(month>12 || month<0){
						System.out.println("ERROR No year has more than 12 months.");
						out=true;
						
					}
					if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12 ){
						
					}
					if(month==4 || month==6 || month==9 || month==11){
						if(day>30){
							System.out.println("ERROR This month has 30 days.");
							out=true;
							
						}
					}
					if(month==2){
						if(month%4==0){
							if(day>29){
								System.out.println("ERROR This month has 29 days.");
								out=true;
								
							}
						}
						if(month%4!=0){
							if(day>28){
								System.out.println("ERROR This month has 29 days.");
								out=true;
								
							}
						}					
					}
					if(!out){
						
						System.out.println("Year : ");
						year=sc.nextInt();
						if(year<0){
							System.out.println("ERROR no negative years ");
							out=true;
							
						}
						if(!out){
							System.out.println("Ingresa el numero de rack que habra en el RACK:  ");
							int numeroServidores=sc.nextInt();
							if(numeroServidores<0){
								System.out.println("Error... selecciona un numero mayor a o igual a 0");
								out=true;
							}
							if(!out){
								System.out.println("Ingresa a quien estara asignado el minicuarto:  ");
								System.out.println("1.Proyecto de Investigacion");
								System.out.println("2.Empresa");
								int asignadoMiniRoom=sc.nextInt();
								if(asignadoMiniRoom==1 || asignadoMiniRoom==2){
									int numRegistroProyecto=0;
									String nit="";
									String nombreEmpresa="";
									if(asignadoMiniRoom==1){
										System.out.println("Ingresa el numero de registro del proyecto: ");
										numRegistroProyecto=sc.nextInt();
										
										//center.alquilarRoomProyecto(numeroCuarto,day,month,year,numeroServidores,numRegistroProyecto);
										
										
									}
									if(asignadoMiniRoom==2){
										System.out.println("Ingresa el nit de la empresa: ");
										nit= sc.next();
										sc.nextLine();
										System.out.println("Ingresa el nombre de la empresa: ");
										nombreEmpresa= sc.next();
										
										//center.alquilarRoomEmpresa(numeroCuarto,day,month,year,numeroServidores,nit,nombreEmpresa);
										

									}
									
									System.out.println("El valor total de la habitacion es de: "+center.calcularValorHabitacion(numeroCuarto,numeroServidores)+" pesos");
									System.out.println("Desea continuar?: ");
									System.out.println("(1). Si");
									System.out.println("(2). No");
									int respuestaContinuar=sc.nextInt();
									if(respuestaContinuar==1 || respuestaContinuar==2){
										if(respuestaContinuar==1){
											if(!out){
												center.alquilarRoom(numeroCuarto,day,month,year,numeroServidores,nit,nombreEmpresa,numRegistroProyecto,asignadoMiniRoom);
												anadirServidor(numeroCuarto,numeroServidores);
												System.out.println(" ");
												System.out.println("Alquiler realizado con exito... ");
												System.out.println(" ");
												out=true;
											}
										}else if(respuestaContinuar==2){
											System.out.println(" ");
											System.out.println("En otra ocacion sera, gracias....");
											System.out.println(" ");
											out=true;
											
										}
									}else{
										System.out.println(" ");
										System.out.println("Por favor escoge 1 o 2");
										System.out.println(" ");
										out=true;
									}
									
								}else {
									System.out.println(" ");
									System.out.println("Por favor escoge 1 o 2");
									System.out.println(" ");
									out=true;
								}
							}
						}
					}
				}
			}else if(!center.miniRoomDisponible(numeroCuarto)){
				System.out.println(" ");
				System.out.println("El cuarto ingresado se encuentra ocupado o no existe,intenta con otro numero(tambien puedes revisar el mapa,para saber los numeros de cuartos disponibles)");
				System.out.println(" ");
				out=true;
			}
			
		}while(!out);
	}
	public void anadirServidor(String numeroCuarto,int numeroServidores){
		boolean out=false;
		double cantMemoriaCache=0;
		int numProcesadores=0;
		int marcaProcesador=0;
		double cantMemoriaRAM=0;
		int cantDiscos=0;
		double capaDiscos=0;
		System.out.println(" ");
		System.out.println("A continuacion ingresa la informacion de cada servidor en el RACK");
		System.out.println(" ");
		for(int x=0;x<numeroServidores;x++){
			cantMemoriaCache=0;
			numProcesadores=0;
			marcaProcesador=0;
			cantMemoriaRAM=0;
			cantDiscos=0;
			capaDiscos=0;
			System.out.println("Servidor "+(x+1)+" --------------------------------------------------------");
			do{
				System.out.println("Ingresa la cantidad de memoria cache en GB:");
				cantMemoriaCache=sc.nextDouble();
				if(cantMemoriaCache<0){
					System.out.println("La memoria cache no puede ser negativa.");
				}else{
					out=true;
				}
			}while(!out);
			out=false;
			do{
				System.out.println("Ingresa el numero de procesadores:");
				numProcesadores=sc.nextInt();
				if(numProcesadores<0){
					System.out.println("El numero de procesadores no puede ser negativo.");
				}else{
					out=true;
				}
			}while(!out);
			out=false;
			do{
				System.out.println("Ingresa la marca del procesador: ");
				System.out.println("1.INTEL");
				System.out.println("2.AMD");
				marcaProcesador=sc.nextInt();
				if(marcaProcesador!=1 && marcaProcesador!=2){
					System.out.println("Solo puedes seleccionar INTEL o AMD");
				}else{
					out=true;
				}
			}while(!out);
			out=false;
			do{
				System.out.println("Ingresa la cantidad de memoria RAM en GB:");
				cantMemoriaRAM=sc.nextDouble();
				if(cantMemoriaRAM<0){
					System.out.println("La memoria RAM no puede ser negativa.");
				}else{
					out=true;
				}
			}while(!out);
			out=false;
			do{
				System.out.println("Ingresa la cantidad de discos:");
				cantDiscos=sc.nextInt();
				if(cantDiscos<0){
					System.out.println("El numero de discos no puede ser negativo.");
				}else{
					out=true;
				}
			}while(!out);
			out=false;
			do{
				System.out.println("Ingresa la capacidad de los discos en teras:");
				capaDiscos=sc.nextDouble();
				if(capaDiscos<0){
					System.out.println("La capacidad de los discos no puede ser negativa.");
				}else{
					out=true;
				}
			}while(!out);
			center.anadirServidor(numeroCuarto,x,cantMemoriaCache,numProcesadores,marcaProcesador,cantMemoriaRAM,cantDiscos,capaDiscos);
			out=false;
				
		}
	}
	public int MenuSimulacion(){
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Bienvenido al apartado de simulacion.");
		System.out.println("Selecciona lo que deseas hacer:");
		System.out.println(" ");
		System.out.println("(1). Simular el prendido de todos los minicuartos.");
		System.out.println("(2). Simular el apagado de los minicuartos.");
		System.out.println("(0). Volver al menu principal");
		int respuesta=sc.nextInt();

		return respuesta;
	}
	
	public void opcionMenuSimulacion(int respuestaMenuSimulacion) {
		if(respuestaMenuSimulacion!=0&&respuestaMenuSimulacion!=1&&respuestaMenuSimulacion!=2){
			System.out.println(" ");
			System.out.println("///////RECUERDA SELECCIONAR un numero del menu/////////");
			System.out.println(" ");
		}
		try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            
        }
		switch(respuestaMenuSimulacion) {
		case 0: 
			System.out.println(" ");	
			System.out.println("Devuleta al menu inicial");
			System.out.println(" ");
			break;
		case 1:
			simularPrendidoTodos();
			break;
		case 2:
			int respuestaMenuSimulacionApagado=0;
			do{
				respuestaMenuSimulacionApagado=menuSimulacionApagado();
				opcionMenuSimulacionApagado(respuestaMenuSimulacionApagado);
				mapaSimulacion();
			}while(respuestaMenuSimulacionApagado!=0);
			
			break;
		}
		
	}
	public void simularPrendidoTodos(){
		
		if(center.simularTodosPrendido()){
			
			System.out.println(" ");
			System.out.println("Todas las habitaciones han sido prendidas exitosamente");
			System.out.println(" ");
		}
		
	}
	public int menuSimulacionApagado(){
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Selecciona lo que deseas hacer:");
		System.out.println(" ");
		System.out.println("(1). Apagado en forma de L");
		System.out.println("(2). Apagado en forma de Z");
		System.out.println("(3). Apagado en forma de H");
		System.out.println("(4). Apagado en forma de O");
		System.out.println("(5). Apagado en forma de M (apaga una columna escogida)");
		System.out.println("(6). Apagado en forma de P (apaga un corredor escogido)");
		System.out.println("(0). Volver al menu principal");
		int respuesta=sc.nextInt();

		return respuesta;
	}
	
	public void opcionMenuSimulacionApagado(int respuestaMenuSimulacion) {
		if(respuestaMenuSimulacion!=0&&respuestaMenuSimulacion!=1&&respuestaMenuSimulacion!=2&&respuestaMenuSimulacion!=3&&respuestaMenuSimulacion!=4&&respuestaMenuSimulacion!=5&&respuestaMenuSimulacion!=6){
			System.out.println(" ");
			System.out.println("///////RECUERDA SELECCIONAR un numero del menu/////////");
			System.out.println(" ");
		}
		try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            
        }
		switch(respuestaMenuSimulacion) {
		case 0: 
			System.out.println(" ");	
			System.out.println("Devuleta al menu inicial");
			System.out.println(" ");
			break;
		case 1:
			apagadoL();
			break;
		case 2:
			apagadoZ();
			break;
		case 3:
			apagadoH();
			break;
		case 4:
			apagadoO();
			break;
		case 5:
			apagadoM();
			break;
		case 6:
			apagadoP();
			break;
		}
		
	}
	public void apagadoL(){
		center.simularApagadoL();
	}
	public void apagadoZ(){
		center.simularApagadoZ();
	}
	public void apagadoH(){
		center.simularApagadoH();
	}
	public void apagadoO(){
		center.simularApagadoO();
	}
	public void apagadoM(){
		boolean out=false;
		do{
			System.out.println("Digita la columna que quieres apagar (1-50)");
			System.out.println(" ");
			int columnaApagar=sc.nextInt();
			
			if(columnaApagar<1 || columnaApagar>50){
				System.out.println("Error selecciona una columna del 1 al 50.");
				out=true;
			}
			if(!out){
				center.simularApagadoM(columnaApagar);
				out=true;
			}
		}while(!out);
	}
	public void apagadoP(){
		boolean out=false;
		do{
			System.out.println("Digita el corredor que quieres apagar (1-8)");
			System.out.println(" ");
			int corredorApagar=sc.nextInt();
			
			if(corredorApagar<1 || corredorApagar>8){
				System.out.println("Error selecciona un corredor del 1 al 8.");
				out=true;
			}
			if(!out){
				center.simularApagadoP(corredorApagar);
				out=true;
			}
		}while(!out);
		
	}
	public void mapaSimulacion(){
		System.out.println(" ");
		System.out.println(center.showMapaSimulacion());
		System.out.println(" ");
		System.out.println("Las habitaciones que aparecen en blanco se encuentran encendidas");
		System.out.println(" ");
		
	}
}