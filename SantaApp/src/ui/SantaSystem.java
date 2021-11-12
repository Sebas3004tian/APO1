package ui;

import java.util.Scanner;
import model.SantaApp;

public class SantaSystem {
	private SantaApp santa;
	private Scanner sc;
	
	
	public SantaSystem() {
		sc= new Scanner(System.in);
		santa = new SantaApp();
	}

	public static void main(String[] args) {
		SantaSystem menu = new SantaSystem();
		
		
		
		
		int answerInitialMenu= 0;
		
		
		do {
		    answerInitialMenu =menu.initialMenu();
		    menu.initialMenuOption(answerInitialMenu);
		}while (answerInitialMenu !=0);
		
	}


	public int initialMenu(){
		
		System.out.println("Select what you want to do");
		System.out.println("");
		System.out.println("---------------------------------------------------------");
		System.out.println("(1). Registrar datos de los niños");
		System.out.println("(2) .Cambiar a un niño de una lista a otra(bueno o malo)");
		System.out.println("(3) .Mostrar lista");
		System.out.println("(0). Exit the application");
		int answer=sc.nextInt();

		return answer;
	}

	public void initialMenuOption(int answerInitialMenu) {
		if(answerInitialMenu!=0&&answerInitialMenu!=1&&answerInitialMenu!=2&&answerInitialMenu!=3){
			System.out.println("///////REMEMBER TO SELECT a number from the menu/////////");
		}
		
		switch(answerInitialMenu) {
		case 0: 
			System.out.println("The application is closed, thanks ...");
			break;
		case 1:
			addChild();
			
			System.out.println("");
			break;
		case 2:
			cambiarChildEstado();
			break;
		case 3: 
			showList();
			break;
		}
		
	}
	public void addChild(){
		
		boolean out = false;
		do{
			System.out.println("Ingresa el nombre del niño: ");
			sc.nextLine();
			String nombre=sc.nextLine();
			if(nombre.equals("")){
				System.out.println("Debes escribir algo...");
				out=true;
			}
			if(!out){
				System.out.println("Ingresa los apellidos del niño: ");
				String apellido=sc.nextLine();
				if(apellido.equals("")){
					System.out.println("Debes escribir algo...");
					out=true;
				}
				if(!out){
					System.out.println("Ingresa la edad del niño: ");
					int edad=sc.nextInt();
					if(edad<=0){
						System.out.println("La edad no debe ser menor o de 0 creo..");
						out=true;
					}
					if(!out){
						System.out.println("Ingresa la direccion: ");
						sc.nextLine();
						String direccion=sc.nextLine();
						if(direccion.equals("")){
							System.out.println("Debes escribir algo...");
							out=true;
						}
						if(!out){
							System.out.println("Ingresa la ciudad: ");
							String ciudad=sc.nextLine();
							if(ciudad.equals("")){
								System.out.println("Debes escribir algo...");
								out=true;
							}
							if(!out){
								System.out.println("Ingresa el pais: ");
								String pais=sc.nextLine();
								if(pais.equals("")){
									System.out.println("Debes escribir algo...");
									out=true;
								}
								if(!out){
									System.out.println("Ingresa tu deseo ");
									String deseo=sc.nextLine();
									if(deseo.equals("")){
										System.out.println("Debes escribir algo...");
										out=true;
									}
									if(!out){
										System.out.println("Como se comporta el niño (GOOD OR NAUGHTY) ");
										String comportamiento=sc.nextLine();
										if(comportamiento.equalsIgnoreCase("GOOD")||comportamiento.equalsIgnoreCase("NAUGHTY")){
											if(!out){
												santa.addChild(nombre,apellido,edad,direccion,ciudad,pais,deseo,comportamiento);
												System.out.println("Informacion guardada, pronto tendras tu regalo ");
												out=true;
											}
										}else{
											System.out.println("Por favor escribe alguna de las 2 opciones.");
											out=true;
										}
										
										
									}
								}
							}
						}
					}
				}
			}
		}while(!out);
		
		
	}
	public void cambiarChildEstado(){
		
		
		
		
	}
	public void showList(){
		boolean out = false;
		do{
			System.out.println("Que lista quieres ver: (GOOD OR NAUGHTY) ");
			sc.nextLine();
			String tipoLista=sc.nextLine();
			if(tipoLista.equalsIgnoreCase("GOOD")||tipoLista.equalsIgnoreCase("NAUGHTY")){
				System.out.println(santa.showList(tipoLista));
				out=true;
			}else{
				System.out.println("Por favor escribe alguna de las 2 opciones.");
				out=true;
			}
		}while(!out);
		
		
	}
	
	
}