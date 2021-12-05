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
	public int MenuAlquiler(){
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Bienvenido al apartado de Alquiler.");
		System.out.println(" ");
		System.out.println("Selecciona lo que deseas hacer:");
		System.out.println(" ");
		System.out.println("(1). Alquilar  un minicuarto");
		System.out.println("(2). Cancelar el alquiler para un minicuarto");
		System.out.println("(3). Cancelar el alquiler para todos los minicuartos");
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
			break;
		case 3: 
			break;
		}
		
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
							System.out.println("Ingresa el numero de servidores que habra en el RACK:  ");
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
									if(asignadoMiniRoom==1){
										System.out.println("Ingresa el numero de registro del proyecto: ");
										int numRegistroProyecto=sc.nextInt();
										
										//center.alquilarRoomProyecto(numeroCuarto,day,month,year,numeroServidores,numRegistroProyecto);
										
										
									}
									if(asignadoMiniRoom==2){
										System.out.println("Ingresa el nit de la empresa: ");
										String nit= sc.next();
										sc.nextLine();
										System.out.println("Ingresa el nombre de la empresa: ");
										String nombreEmpresa= sc.next();
										
										//center.alquilarRoomEmpresa(numeroCuarto,day,month,year,numeroServidores,nit,nombreEmpresa);
										

									}
									center.alquilarRoomEmpresa(numeroCuarto,day,month,year,numeroServidores,nit,nombreEmpresa,numRegistroProyecto,asignadoMiniRoom);
									out=true;
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
	public int MenuSimulacion(){
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Bienvenido al apartado de Alquiler.");
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
			break;
		case 2:
			break;
		}
		
	}
}