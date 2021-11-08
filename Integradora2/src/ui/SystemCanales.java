package ui;
import java.util.Scanner;
import model.Canal;


public class SystemCanales {
	private Canal canales;
	private Scanner sc;
	
	public SystemCanales() {
		sc= new Scanner(System.in);
	}
	public static void main(String[] args) {
		SystemCanales menu = new SystemCanales();
		menu.inicioCanal();
		
		
		
		int respuestaMenuInicial= 0;
		
		
		do {
		    respuestaMenuInicial =menu.MenuInicial();
		    menu.opcionMenuInicial(respuestaMenuInicial);
		}while (respuestaMenuInicial !=0);
		
	}
	public void inicioCanal() {
		System.out.println("Bienvenido a la aplicacion de ...., digite el nit");
		int nit= sc.nextInt();
		
		System.out.println("Digite la direccion");
		String direccion= sc.next();
		sc.nextLine();
		
		System.out.println("Digite el website");
		String website= sc.next();
		sc.nextLine();
		canales = new Canal(nit,direccion,website);
	}
	public int MenuInicial(){
		System.out.println("Bienvenido a ");
		System.out.println("Selecciona lo que deseas hacer");
		System.out.println("(1).Gestión de suscriptores");
		System.out.println("(2).Gestión del catálogo de productos");
		System.out.println("(3).Creación de servicios");
		System.out.println("(0).Salir de la aplicacion");
		int respuesta=sc.nextInt();

		return respuesta;
	}
	public void opcionMenuInicial(int respuestaMenuInicial) {
		if(respuestaMenuInicial!=0&&respuestaMenuInicial!=1&&respuestaMenuInicial!=2&respuestaMenuInicial!=3){
			System.out.println("///////RECUERDA SELECCIONAR un numero del menu/////////");
		}
		switch(respuestaMenuInicial) {
		case 0: 
			System.out.println("Se cierra la aplicacion,gracias...");
			break;
		case 1:
			int respuestaMenuSuscriptores=0;
			do{
				respuestaMenuSuscriptores=MenuSuscriptores();
				opcionMenuSuscriptores(respuestaMenuSuscriptores);
			}while(respuestaMenuSuscriptores!=0);
			break;
		case 2:
			System.out.println(canales.AllSuscriptor());
			break;
		case 3: 
			
			break;
		}
		
	}
	public int MenuSuscriptores(){
		System.out.println("Bienvenido a ");
		System.out.println("Selecciona lo que deseas hacer");
		System.out.println("(1).Crear un nuevo suscriptor.");
		System.out.println("(2).Desactivar  un suscriptor.");
		System.out.println("(3).Desplegar la cantidad de suscriptores activos por cada tipo de cliente.");
		System.out.println("(4).Desplegar el nombre del suscriptor menor de edad que tenga el mayor número de horas dispuesto a consumir.");
		System.out.println("(0).Volver al menu principal");
		int respuesta=sc.nextInt();

		return respuesta;
	}
	
	public void opcionMenuSuscriptores(int respuestaMenuSuscriptores) {
		if(respuestaMenuSuscriptores!=0&&respuestaMenuSuscriptores!=1&&respuestaMenuSuscriptores!=2&respuestaMenuSuscriptores!=3&&respuestaMenuSuscriptores!=4){
			System.out.println("///////RECUERDA SELECCIONAR un numero del menu/////////");
		}
		switch(respuestaMenuSuscriptores) {
		case 0: 
			System.out.println("Devuleta al menu inicial");
			break;
		case 1:
			if(!canales.hayEspacioSuscriptores()){
				crearNuevoSuscriptor();
				System.out.println("La informacion del suscriptor se ha guardado correctamente");
			}else{
				System.out.println("----------------------------------------------------------");
				System.out.println("");
				System.out.println("Ya los 50 suscriptores estan completos");
				System.out.println("");
				System.out.println("----------------------------------------------------------");
			}
			
			break;
		case 2:
			desactivarSuscriptor();
			break;
		case 3: 
			mostrarInfoSuscriptoresActivos();
			break;
		case 4: 
			mostrarSuscriptorMayorDispuestoConsumir();
			break;
		}
		
	}
	public void mostrarSuscriptorMayorDispuestoConsumir(){
		System.out.println("Has ingresado al apartado de desplegar el nombre del suscriptor menor de edad que tenga el mayor número de horas dispuesto a consumir");
		System.out.println(canales.suscriptorMayorDispuestoConsumir());
	}
	public void mostrarInfoSuscriptoresActivos(){
		System.out.println("Has ingresado al apartado de mostrar la cantidad de suscriptores activos por cada tipo de cliente ");
		System.out.println("");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("-                             INFORMACION                                       -");
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.println(canales.infoTOTALAct());
		System.out.println(canales.infoNORMAL());
		System.out.println(canales.infoPLATINO());
		System.out.println(canales.infoORO());
		System.out.println(canales.infoDIAMANTE());

		
		System.out.println("--------------------------------------------------------------------------------");
	}
	public void desactivarSuscriptor(){
		System.out.println("Has ingresado al apartado de desactivar la cuenta de un suscriptor. ");
		System.out.println("Selecciona si quieres ingresar el numero del suscriptor para desactivarlo,o la cedula de este: ");
		System.out.println("(1).Desactivar con el numero");
		System.out.println("(2).Desactivar con la cedula");
		int respuestaDesactivar= sc.nextInt();
		if(respuestaDesactivar==1 || respuestaDesactivar==2){
			if(respuestaDesactivar==1){
				System.out.println("Ingresa el numero de el suscriptor");
				int numeroDescativar= sc.nextInt();
				if(numeroDescativar>0 && numeroDescativar<=50){
					if(canales.numDesactivarExiste(numeroDescativar)){
						canales.desactivateSuscriptorNumber(numeroDescativar);
					}else{
						System.out.println("---------------------------------------------------------------------------------------");
						System.out.println("");
						System.out.println("Ese numero de usuario no ha sido registrado aun");
						System.out.println("");
						System.out.println("---------------------------------------------------------------------------------------");
					}
				}else{
					System.out.println("---------------------------------------------------------------------------------------");
					System.out.println("");
					System.out.println("Solo pueden haber 50 suscriptores,por favor ingresa un numero valido(1-50)");
					
					System.out.println("");
					System.out.println("---------------------------------------------------------------------------------------");
					System.out.println("");
				}
				
			}
			if(respuestaDesactivar==2){
				System.out.println("Digita el suscriptor que deseas desactivar: ");
				int cedulaDesactivar= sc.nextInt();
				if(canales.cedulaDesactivarExiste(cedulaDesactivar)){
					canales.desactivateSuscriptor(cedulaDesactivar);
					System.out.println("");
				}else{
					System.out.println("---------------------------------------------------------------------------------------");
					System.out.println("");
					System.out.println("La cedula que quieres desactivar no se encuentra registrada con ningun suscriptor.....");
					System.out.println("");
					System.out.println("----------------------------------------------------------------------------------------");
				}
				
			}
			
		}else{
			System.out.println("----------------------------------------------------------");
			System.out.println("");
			System.out.println("Recuerda seleccionar 1 o 2 solamente....");
			System.out.println("");
			System.out.println("----------------------------------------------------------");
			
		}
		
	}
	public void crearNuevoSuscriptor(){
		boolean salir = false;
		

		do{
			System.out.println("Digita la cedula");
			int cedula= sc.nextInt();

			if(canales.verificarCedula(cedula)){
				System.out.println("Esa cedula que ingresaste ya se encontraba registrada");
				salir=true;
			}
			if (!salir){
				System.out.println("Digita el nombre completo");
				String nombre= sc.next();
				sc.nextLine();
				
				System.out.println("Digita la edad");
				int edad= sc.nextInt();
				
				if(edad<=0){
					System.out.println("Alto ahi! creo que no se puede tener una edad menor a 0");
					salir=true;
				}
				if(!salir){
					System.out.println("Digita la cantidad de horas dispuestas a consumir");
					int horasDisConsumir= sc.nextInt();
					if(horasDisConsumir<0){
						System.out.println("Mmmmm Las horas no son negativas ");
						salir=true;
					}
					if(!salir){
						int correctoCliente=0;
						int tipoCliente=0;
						while(correctoCliente==0){
							
							System.out.println("Digita el tipo de cliente:");
							System.out.println("-------------------------");
							System.out.println("(1).NORMAL");
							System.out.println("(2).PLATINO");
							System.out.println("(3).ORO");
							System.out.println("(4).DIAMANTE");
							System.out.println("-------------------------");
							System.out.print("Digita: ");
							tipoCliente= sc.nextInt();
							if(tipoCliente==1 || tipoCliente==2 || tipoCliente==3 || tipoCliente==4){
								correctoCliente=1;
							}else{
								System.out.println("----------------------------------");
								System.out.println("");
								System.out.println("Selecciona una opcion valida!!!!");
								System.out.println("");
								System.out.println("----------------------------------");
							}
						
						}
						canales.addSuscriptor(cedula,nombre,edad,horasDisConsumir,tipoCliente);
						salir=true;
						
					}
				}
			}
			
		}while(!salir);
	}
	
	
}