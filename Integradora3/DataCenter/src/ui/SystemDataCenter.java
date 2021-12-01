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
		boolean salir=false;
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Bienvenido a la aplicacion de DataCenter.");
		System.out.println(" ");
		System.out.println("Digite el valor de alquiler para todos los minicuartos: ");
		do{
			double valorAlquilerGeneral= sc.nextDouble();
			if(valorAlquilerGeneral>0){
				salir=true;
				valorAlquiler=valorAlquilerGeneral;
				center = new DataCenter(valorAlquilerGeneral);
			}else{
				System.out.println("Porfavor ingresa un valor valido!!");
			}
		}while(!salir);
		
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
			break;
		case 2:
			break;
		case 3: 
			break;
		}
		
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