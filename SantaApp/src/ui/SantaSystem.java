package ui;

import java.util.Scanner;
import model.SantaApp;

public class SantaSystem {
	private SantaApp santa;
	private Scanner sc;
	
	/**
    * constructor clase SantaSystem
    */
	public SantaSystem() {
		sc= new Scanner(System.in);
		santa = new SantaApp();
	}
	/**
    * main de la clase SantaSystem
    * @param args String
    */
	public static void main(String[] args) {
		SantaSystem menu = new SantaSystem();
		
		
		
		
		int answerInitialMenu= 0;
		
		
		do {
		    answerInitialMenu =menu.initialMenu();
		    menu.initialMenuOption(answerInitialMenu);
		}while (answerInitialMenu !=0);
		
	}

	/**
    * Metodo de menu inicial con las opciones iniciales(requerimientos)
    */
	public int initialMenu(){
		System.out.println("                             $$"+"\n"+"                            $$$$"+"\n"+"                         $$$$$$$            $$$"+"\n"+"                        $$$$$$$           $$$$$$"+"\n"+"                        $$$$$$$$         $$$$$$$$$"+"\n"+"                         $$$$$$$          $$$$$$$"+"\n"+"                             $$$$$      $$$$$$$"+"\n"+"                         $$$$$$$$$$  $$$$$$$"+"\n"+"                         $$$$$  $$$$$   $$$$$$$"+"\n"+"                              $$$$$$$    $    $$"+"\n"+"                            $$$        0 0$  $$                                           WELCOME TO THE NEW SANTA APP"+"\n"+"                           $$     $       $$$"+"\n"+"                           $     $$        $$$$"+"\n"+"                           $$$$$$$            $$$"+"\n"+"                                $           $$$$$$"+"\n"+"      $$                       $       $    $$$$$$"+"\n"+"     $  $$   $$$$$   $$$$     $$    $  $     $$$$"+"\n"+"     $    $$$$   $$$$$ $$$   $$    $$$ $$$$$$$$                                        Please select what you want to do:"+"\n"+"     $$$$          $$$$$$$$$$$     $$ $$$$"+"\n"+"       $$         $    $           $$"+"\n"+"      $$         $$   $            $$"+"\n"+"      $          $ $$ $            $"+"\n"+"      $          $ $$ $           $"+"\n"+"       $        $$   $$          $$"+"\n"+"       $        $$   $$         $$"+"\n"+"      $     $$$$$$    $ $$$$  $$ $"+"\n"+"    $$    $$$ $$ $$$$ $$$ $$  $  $                                                    (1). Record children's data"+"\n"+"  $$    $$$  $    $$$$     $  $  $"+"\n"+" $$   $$$   $             $$  $ $$"+"\n"+"  $  $$  $  $$            $$  $  $$"+"\n"+"  $$  $  $$  $           $$   $$ $                                                    (2) .Change a child from one list to another (good or naughty)"+"\n"+"   $  $$  $   $           $  $$ $"+"\n"+"    $  $$  $   $          $$ $$ $"+"\n"+"    $   $$ $    $          $  $ $$"+"\n"+"     $   $ $$$$$$$        $   $  $$                                                   (3) .Show list"+"\n"+"    $$    $$$    $$      $$    $$$$"+"\n"+"    $$$$$$$ $$ $$$       $$$$$$$  $$"+"\n"+"     $    $$$$$$         $$ $  $$$$"+"\n"+"      $$$$$$              $$$$$$                                                      (0). Exit the application"+"\n"+"                                    "+"\n"+"$$   $$ $$$$$ $$$$$  $$$$$  $$    $$"+"\n"+"$$$ $$$ $$    $$  $$ $$  $$  $$  $$"+"\n"+"$$ $ $$ $$$$$ $$$$$  $$$$$     $$"+"\n"+"$$   $$ $$    $$  $$ $$  $$    $$"+"\n"+"$$   $$ $$$$$ $$  $$ $$  $$    $$"+"\n"+"                                 "+"\n"+"$$   $$       $$   $$ $$$$$ $$$$$"+"\n"+" $$ $$        $$$ $$$ $$ $$ $$"+"\n"+"  $$$   $$$$$ $$ $ $$ $$$$$ $$$$$"+"\n"+" $$ $$        $$   $$ $$ $$    $$"+"\n"+"$$   $$       $$   $$ $$ $$ $$$$$");
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		int answer=sc.nextInt();

		return answer;
	}
	/**
    * Metodo encargado de llamar a los demas metodos para solucionar cada opcion en el menu
    * @param answerInitialMenu int
    */
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
	/**
    * Metodo encargado de llamar metodos en la clase SantaApp y crear un objeto Child
    */
	public void addChild(){
		
		boolean out = false;
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You have just entered the section to register a child");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		do{
			System.out.println("Enter the child's name:");
			sc.nextLine();
			String nombre=sc.nextLine();
			if(nombre.equals("")){
				System.out.println("You must write something ...");
				out=true;
			}
			if(!out){
				System.out.println("Enter the child's last name: ");
				String apellido=sc.nextLine();
				if(apellido.equals("")){
					System.out.println("You must write something ...");
					out=true;
				}
				if(!out){
					System.out.println("write the age: ");
					int edad=sc.nextInt();
					if(edad<=0){
						System.out.println("The age should not be less than 0 I think ..");
						out=true;
					}
					if(!out){
						System.out.println("Enter the address: ");
						sc.nextLine();
						String direccion=sc.nextLine();
						if(direccion.equals("")){
							System.out.println("You must write something ...");
							out=true;
						}
						if(!out){
							System.out.println("Enter the city:");
							String ciudad=sc.nextLine();
							if(ciudad.equals("")){
								System.out.println("You must write something ...");
								out=true;
							}
							if(!out){
								System.out.println("Enter the country:");
								String pais=sc.nextLine();
								if(pais.equals("")){
									System.out.println("You must write something ...");
									out=true;
								}
								if(!out){
									
									System.out.println("Enter your wish");
									System.out.println("Please remember that it is something that Santa can give you, I think a girlfriend or boyfriend can not");
									String deseo=sc.nextLine();
									if(deseo.equals("")){
										System.out.println("You must write something ...");
										out=true;
									}
									if(!out){
										System.out.println("how does the child behave (GOOD OR NAUGHTY) ");
										String comportamiento=sc.nextLine();
										if(comportamiento.equalsIgnoreCase("GOOD")||comportamiento.equalsIgnoreCase("NAUGHTY")){
											if(!out){
												String dirrecionTotal=direccion+" de "+ciudad+", "+pais;
												santa.addChild(nombre,apellido,edad,dirrecionTotal,deseo,comportamiento);
												System.out.println("Information saved, soon you will have your gift ");
												out=true;
											}
										}else{
											System.out.println("Please write one of the 2 options.");
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
	/**
    * Metodo encargado de llamar a metodo de la clase SantaApp para cambiar un child de una lista a otra
    */
	public void cambiarChildEstado(){
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("You entered the section to change the status of a child");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		boolean out = false;
		do{
			System.out.println("Enter the child's name:");
			sc.nextLine();
			String nombreChild=sc.nextLine();
			if(nombreChild.equals("")){
				System.out.println("You must write something ...");
				out=true;
			}
			if(!out){
				System.out.println("Enter the child's last name:");
				String apellidoChild=sc.nextLine();
				if(apellidoChild.equals("")){
					System.out.println("You must write something ...");
					out=true;
				}
				if(!out){
					System.out.println("Enter the child's age:");
					int edadChild=sc.nextInt();
					if(edadChild<=0){
						System.out.println("The age should not be less than 0 I think ..");
						out=true;
					}
					if(!out){
						System.out.println("What list does the child belong to:(GOOD OR NAUGHTY) ");
						sc.nextLine();
						String tipoLista=sc.nextLine();
						if(tipoLista.equalsIgnoreCase("GOOD")||tipoLista.equalsIgnoreCase("NAUGHTY")){
							if(!out){
								int pocision=santa.verificarChild(nombreChild,apellidoChild,edadChild,tipoLista);
								if(pocision!=-1){
									santa.cambiarLista(nombreChild,apellidoChild,edadChild,tipoLista,pocision);
									System.out.println("Successful change");
									out=true;
								}else{
									System.out.println("Oops ... It seems that the data has not been found");
									out=true;
								}
							}
						}else{
							System.out.println("Please write one of the 2 options.");
							out=true;
						}
					}
				}
			}
		}while(!out);	
	}
	/**
    * Metodo encargado de mostrar la lista que el ususario desee
    */
	public void showList(){
		boolean out = false;
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Hello Santa, what list do you want to see?(GOOD OR NAUGHTY) ");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		do{
			System.out.println("What list do you want to see:(GOOD OR NAUGHTY) ");
			sc.nextLine();
			String tipoLista=sc.nextLine();
			if(tipoLista.equalsIgnoreCase("GOOD")||tipoLista.equalsIgnoreCase("NAUGHTY")){
				System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println(santa.showList(tipoLista));
				System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				out=true;
			}else{
				System.out.println("Please write one of the 2 options.");
				out=true;
			}
		}while(!out);
		
		
	}
	
	
}