package ui;
import java.util.Scanner;
import model.BlackSnail;


public class ColombianChannel {
	private BlackSnail channels;
	private Scanner sc;
	
	
	private int [] cantEpiProgramados;
	
	
	/**
    * The method is used to define the scanner</br>

    */
	public ColombianChannel() {
		sc= new Scanner(System.in);
	}
	/**
    *In this method a menu object is created and the initial menu method is called</br>

    */
	public static void main(String[] args) {
		ColombianChannel menu = new ColombianChannel();
		menu.systemStartChannel();
		
		
		
		int answerInitialMenu= 0;
		
		
		do {
		    answerInitialMenu =menu.initialMenu();
		    menu.initialMenuOption(answerInitialMenu);
		}while (answerInitialMenu !=0);
		
	}
	/**
    *This method is the one that asks for the main entries before starting to go to the main menu</br>

    */
	public void systemStartChannel() {
		System.out.println("Welcome to the management application for the channel");
		System.out.println("Enter the NIT");
		int nit= sc.nextInt();
		
		System.out.println("Enter the address");
		String address= sc.next();
		sc.nextLine();
		
		System.out.println("Enter the website");
		String website= sc.next();
		sc.nextLine();
		channels = new BlackSnail(nit,address,website);
	}
	/**
    *In this method you can choose 3 options, (currently only option 1 works)</br>

    */
	public int initialMenu(){
		
		System.out.println("Select what you want to do");
		System.out.println("");
		System.out.println("---------------------------------------------------------");
		System.out.println("(1). Subscriber management");
		System.out.println("(2) .Product catalog management");
		System.out.println("(3) .Creation of services(Out of service)");
		System.out.println("(0). Exit the application");
		int answer=sc.nextInt();

		return answer;
	}
	/**
    *In this method you can choose 3 options, (currently only option 1 works)</br>

    */
	public void initialMenuOption(int answerInitialMenu) {
		if(answerInitialMenu!=0&&answerInitialMenu!=1&&answerInitialMenu!=2&answerInitialMenu!=3){
			System.out.println("///////REMEMBER TO SELECT a number from the menu/////////");
		}
		//int answerMenuSubscribers=0;
		switch(answerInitialMenu) {
		case 0: 
			System.out.println("The application is closed, thanks ...");
			break;
		case 1:
			int answerMenuSubscribers=0;
			do{
				answerMenuSubscribers=MenuSubscribers();
				optionMenuSubscribers(answerMenuSubscribers);
			}while(answerMenuSubscribers!=0);
			break;
		case 2:
			int answerMenuProducts=0;
			do{
				answerMenuProducts=createProductMenu();
				optionMenuProduct(answerMenuProducts);
			}while(answerMenuProducts!=0);
			
			break;
		case 3: 
			System.out.println(channels.mostrarMovie());
			System.out.println(channels.mostrarSerie());
			break;
		}
		
	}
	//--------------------------------------------------------------------------------------------------------------------------------------------------SEGUIMIENTO12
	public int createProductMenu(){
		System.out.println("");
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("You have just entered the Product Management section, select what you want to do:");
		System.out.println("(1).Crear un nuevo producto");
		System.out.println("(2).Desplegar la información de un producto");
		System.out.println("(3).Crear la siguiente temporada de una serie");
		System.out.println("(4).Listar todas las películas de acuerdo a una categoría");
		System.out.println("(5).Listar todas las series y mostrar  la información de la última temporada");
		System.out.println("(0).Return to main menu");
		System.out.println("");
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		
		int answer=sc.nextInt();
		
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println("");

		return answer;
	}
	public void optionMenuProduct(int answerMenuProducts) {
		if(answerMenuProducts!=0&&answerMenuProducts!=1&&answerMenuProducts!=2&&answerMenuProducts!=3&&answerMenuProducts!=4&&answerMenuProducts!=5){
			System.out.println("///////REMEMBER TO SELECT a number from the menu/////////");
		}
		switch(answerMenuProducts) {
		case 0: 
			System.out.println("Return to the initial menu ...");
			break;
		case 1:
			if(!channels.SpaceForMoreProducts()){
				crearNuevoProducto();
				System.out.println("Producto information has been saved successfully");
			}else{
				System.out.println("----------------------------------------------------------");
				System.out.println("");
				System.out.println("There are already 85 registered products");
				System.out.println("");
				System.out.println("----------------------------------------------------------");
			}
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		}
		
	}
	public void crearNuevoProducto(){
		
		int tipoProducto=0;
		//Declarando variables 
		String nameDirector="";
		String sinopsis="";
		//Pelicula
		int dia=0;
		int mes=0;
		int ano=0;
		String tituloOriginal="";
		
		String productora="";
		int edadMinima=0;
		int categoria=0;
		String trailer="";
		
		//Serie
		int numeroProta=1;
		String nomProtagonista="";
		String todosProtagonistas="";
		int censurada=0;
		String motivo="";
		int numTemporadasSerie=1;
		//temporadas
		int numTemporada=0;
		int cantEpiPro=0;
		int cantEpiPub=0;
		
		
		
		//--------------------
		
		
		
		System.out.println("Que vas tipo de producto quieres agregar?");
		System.out.println("(1).Pelicula");
		System.out.println("(2).Serie");
		tipoProducto=sc.nextInt();
		if(tipoProducto!=1&&tipoProducto!=2){
			System.out.println("Solo puedes escoger 1 o 2.");
		}else if (tipoProducto==1||tipoProducto==2){
			if(tipoProducto==1){
				
				boolean out = false;
				

				do{
					System.out.println("Ingresa la fecha del estreno mundial de la pelicula :");
					System.out.println("Dia :");
					dia=sc.nextInt();
					
					if(dia>31 || dia<0){
						out=true;
						System.out.println("ERROR Ningun mes tiene mas de 31 dias.");
					}
					if(!out){
						System.out.println("Mes :");
						mes=sc.nextInt();
						if(mes>12 || mes<0){
							out=true;
							System.out.println("ERROR Ningun año tiene mas de 12 meses.");
						}
						if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12 ){
							
						}
						if(mes==4 || mes==6 || mes==9 || mes==11){
							if(dia>30){
								System.out.println("ERROR Este mes tiene 30 dias.");
								out=true;
							}
						}
						if(mes==2){
							if(mes%4==0){
								if(dia>29){
									System.out.println("ERROR Este mes tiene 29 dias.");
									out=true;
								}
							}
							if(mes%4!=0){
								if(dia>28){
									System.out.println("ERROR Este mes tiene 29 dias.");
									out=true;
								}
							}					
						}
						if(!out){
							System.out.println("Año :");
							ano=sc.nextInt();
							if(ano<0){
								System.out.println(" ERROR no hay años negativos");
								out=true;
							}
							if(!out){
								System.out.println("Ingresa el titulo original de la pelicula: ");
								sc.nextLine();
								tituloOriginal=sc.nextLine();
								
								System.out.println("Ingresa el nombre del director de la pelicula: ");
								nameDirector=sc.nextLine();
								
								System.out.println("Ingresa el nombre de la productora de la pelicula: ");
								productora=sc.nextLine();
								
								System.out.println("Ingresa la sinopsis de la pelicula: ");
								sinopsis=sc.nextLine();
								
								System.out.println("Ingresa la edad minima para ver la pelicula: ");
								edadMinima=sc.nextInt();
								if(edadMinima<1){
									System.out.println("ERROR la edad minima obviamente tiene que estar mayor a 0");
									out=true;
								}
								if(!out){
									System.out.println("Ingresa la categoria de la pelicula: ");
									System.out.println("(1).ROMANTICA");
									System.out.println("(2).ACCION");
									System.out.println("(3).SUSPENSO");
									System.out.println("(4).TERROR");
									System.out.println("(5)COMEDIA");
									categoria=sc.nextInt();
									if(categoria!=1&&categoria!=2&&categoria!=3&&categoria!=4&&categoria!=5){
										System.out.println("ERROR Selecciona de 1 a 5 la categoria");
										out=true;
									}
									if(!out){
										System.out.println("Ingresa el link del trailer de la pelicula: ");
										sc.nextLine();
										trailer=sc.nextLine();
										channels.addProduct(tipoProducto,nameDirector,sinopsis,dia,mes,ano,tituloOriginal,productora,edadMinima,categoria,trailer,todosProtagonistas,censurada,motivo,numTemporadasSerie,numTemporada,cantEpiPro,cantEpiPub, cantEpiProgramados);
									}
								}
								
								out=true;
								
							}
						}
					}
					
				}while(!out);
				
			}
			
			if(tipoProducto==2){
				boolean out = false;
				boolean censured=false;
				

				do{
					System.out.println("Ingresa la fecha de la primera emicion:");
					System.out.println("Dia :");
					dia=sc.nextInt();
					
					if(dia>31 || dia<0){
						out=true;
						System.out.println("ERROR Ningun mes tiene mas de 31 dias.");
					}
					if(!out){
						System.out.println("Mes :");
						mes=sc.nextInt();
						if(mes>12 || mes<0){
							out=true;
							System.out.println("ERROR Ningun año tiene mas de 12 meses.");
						}
						if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12 ){
							
						}
						if(mes==4 || mes==6 || mes==9 || mes==11){
							if(dia>30){
								System.out.println("ERROR Este mes tiene 30 dias.");
								out=true;
							}
						}
						if(mes==2){
							if(mes%4==0){
								if(dia>29){
									System.out.println("ERROR Este mes tiene 29 dias.");
									out=true;
								}
							}
							if(mes%4!=0){
								if(dia>28){
									System.out.println("ERROR Este mes tiene 29 dias.");
									out=true;
								}
							}					
						}
						if(!out){
							System.out.println("Año :");
							ano=sc.nextInt();
							if(ano<0){
								System.out.println(" ERROR no hay años negativos");
								out=true;
							}
							if(!out){
								System.out.println("Ingresa el numero de protagonistas que hay en la serie: ");
								numeroProta=sc.nextInt();
								if(numeroProta<1){
									System.out.println("ERROR La serie tiene que tener por lo menos 1 protagonista");
									out=true;
									
								}
								if(!out){
									System.out.println("Ingresa los nombres de los protagonistas:");
									sc.nextLine();
									for(int x=0;x<numeroProta;x++){
										System.out.print("("+(x+1)+"). ");
										nomProtagonista=sc.nextLine();
										nomProtagonista="("+(x+1)+"). "+nomProtagonista;
										todosProtagonistas=todosProtagonistas+"\n"+nomProtagonista;
										
									}
									
									System.out.println("Ingresa el nombre del director de la serie: ");
									
									nameDirector=sc.nextLine();
									System.out.println("Ingresa la sinopsis de la serie: ");
									
									sinopsis=sc.nextLine();
									
									System.out.println("Ingresa si la serie fue censurada (SI=1)(NO=2): ");
									censurada=sc.nextInt();
									if(censurada!=1&&censurada!=2){
										System.out.println("ERROR toca colocar 1 o 2");
										out=true;
									}
									if(censurada==1){
										System.out.println("Ingresa el motivo de censura de la serie: ");
										sc.nextLine();
										motivo=sc.nextLine();
										
									}
									if(!out){
										System.out.println("Ingresa el numero de temporadas que tiene la serie: ");
										numTemporadasSerie=sc.nextInt();
										if(numTemporadasSerie<1){
											System.out.println("La serie tiene que tener por lo menos 1 temporada");
											out=true;
											
										}
										if(!out){
											cantEpiProgramados = new int [numTemporadasSerie];
											channels.addProduct(tipoProducto,nameDirector,sinopsis,dia,mes,ano,tituloOriginal,productora,edadMinima,categoria,trailer,todosProtagonistas,censurada,motivo,numTemporadasSerie,numTemporada,cantEpiPro,cantEpiPub, cantEpiProgramados);//, cantEpiProgramados eso es un arreglo quitalo si no lo queres
											for(int i=0;i<numTemporadasSerie;i++){
												numTemporada=i+1;
												System.out.println("Ingresa el numero de episodios programados para la temporada "+numTemporada+" : ");
												cantEpiPro=sc.nextInt();
												cantEpiProgramados[i] = cantEpiPro;
												
												if(cantEpiPro<0){
													System.out.println("ERROR el numero de episodios programados debe ser mayor o 0");
													out=true;
													i=numTemporadasSerie;
												}
												if(!out){
													
													System.out.println("Ingresa el numero de episodios publicados para la temporada "+numTemporada+" : ");
													cantEpiPub=sc.nextInt();
													if(cantEpiPub<0){
														System.out.println("ERROR el numero de episodios publicados debe ser mayor o 0");
														out=true;
														i=numTemporadasSerie;
													}
													if(!out){
														
														
													
														System.out.println("Ingresa la fecha de estreno de la temporada:");
														System.out.println("Dia :");
														dia=sc.nextInt();
														
														if(dia>31 || dia<0){
															
															System.out.println("ERROR Ningun mes tiene mas de 31 dias.");
															out=true;
															i=numTemporadasSerie;
														}
														if(!out){
															System.out.println("Mes :");
															mes=sc.nextInt();
															if(mes>12 || mes<0){
																System.out.println("ERROR Ningun año tiene mas de 12 meses.");
																out=true;
																i=numTemporadasSerie;
															}
															if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12 ){
																
															}
															if(mes==4 || mes==6 || mes==9 || mes==11){
																if(dia>30){
																	System.out.println("ERROR Este mes tiene 30 dias.");
																	out=true;
																	i=numTemporadasSerie;
																}
															}
															if(mes==2){
																if(mes%4==0){
																	if(dia>29){
																		System.out.println("ERROR Este mes tiene 29 dias.");
																		out=true;
																		i=numTemporadasSerie;
																	}
																}
																if(mes%4!=0){
																	if(dia>28){
																		System.out.println("ERROR Este mes tiene 29 dias.");
																		out=true;
																		i=numTemporadasSerie;
																	}
																}					
															}
															if(!out){
																System.out.println("Año :");
																ano=sc.nextInt();
																if(ano<0){
																	System.out.println(" ERROR no hay años negativos");
																	out=true;
																	i=numTemporadasSerie;
																}
																if(!out){
																	System.out.println("Ingresa el link del trailer de la temporada: ");
																	sc.nextLine();
																	trailer=sc.nextLine();
																	channels.addSeason(numTemporada,cantEpiPro,cantEpiPub,dia,mes,ano,trailer);
																	
																}
															}
														}
													}
												}
											
												
											}
											
										}
									}
									
									out=true;
								}
								
							}
						}
					}
					
				}while(!out);
			}
			
		}
		
	}
	/*
	public void optionMenuProduct(int answerMenuProducts) {
		if(answerMenuProducts!=0&&answerMenuProducts!=1&&answerMenuProducts!=2){
			System.out.println("///////REMEMBER TO SELECT a number from the menu/////////");
		}
		switch(answerMenuProducts) {
		case 0: 
			System.out.println("Return to the initial menu ...");
			break;
		case 1:
			if(!channels.SpaceForMoreProducts()){
				createNewSerie(answerMenuProducts);
				System.out.println("Serie information has been saved successfully");
			}else{
				System.out.println("----------------------------------------------------------");
				System.out.println("");
				System.out.println("There are already 85 registered products");
				System.out.println("");
				System.out.println("----------------------------------------------------------");
			}
			
			break;
		case 2:
			if(!channels.SpaceForMoreProducts()){
				createNewMovie(answerMenuProducts);
				System.out.println("Movie information has been saved successfully");
			}else{
				System.out.println("----------------------------------------------------------");
				System.out.println("");
				System.out.println("There are already 85 registered products");
				System.out.println("");
				System.out.println("----------------------------------------------------------");
			}
			break;
		}
		
	}
	*/
	/*
	public void createNewSerie(int answerMenuProducts){
		boolean out = false;
		boolean censured=false;
		String motivo="";

		do{
			System.out.println("Ingresa la fecha de la primera emicion:");
			System.out.print("Dia :");
			int day=sc.nextInt();
			
			if(day>31 || day<0){
				out=true;
				System.out.println("ERROR Ningun month tiene mas de 31 dias.");
			}
			if(!out){
				System.out.print("/Mes :");
				int month=sc.nextInt();
				if(month>12 || month<0){
					out=true;
					System.out.println("ERROR Ningun año tiene mas de 12 meses.");
				}
				if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12 ){
					
				}
				if(month==4 || month==6 || month==9 || month==11){
					if(day>30){
						System.out.println("ERROR Este month tiene 30 dias.");
						out=true;
					}
				}
				if(month==2){
					if(day>29){
						System.out.println("ERROR Este month tiene 29 dias.");
						out=true;
					}
					
				}
				if(!out){
					System.out.print("/Año :");
					int year=sc.nextInt();
					if(year<0){
						System.out.println(" ERROR no hay años negativos");
						out=true;
					}
					if(!out){
						System.out.println("Ingrese el nombre de los protagonistas ");
						String nombresProtagonistas= sc.next();
						sc.nextLine();
						
						System.out.println("Ingrese el nombre del director ");
						String nameDirector= sc.next();
						sc.nextLine();
						
						System.out.println("Ingrese la sinopsis ");
						String sinopsis= sc.next();
						sc.nextLine();
						
						System.out.println("Ingrese si la serie fue censurada si si (1) si no (0) ");
						int censurada=sc.nextInt();
						if(censurada==1){
							censured=true;
							System.out.println("Ingrese el motivo?");
							motivo= sc.next();
							sc.nextLine();
						}
						System.out.println("Ingrese el numero de temporadas que tiene la serie");
						int temporadas=sc.nextInt();
						for(int x=0;x<temporadas;x++){
							
						}
						//channels.addProduct(answerMenuProducts,day, month, year,nombresProtagonistas,nameDirector,sinopsis,motivo);
						out=true;
						
					}
				}
			}
			
		}while(!out);
	}
	*/
	/*
	public void createNewMovie(int answerMenuProducts){
		boolean out = false;
		boolean censured=false;
		String motivo="";

		do{
			System.out.println("Ingresa la fecha de estreno a nivel mundial ");
			System.out.print("Dia :");
			int day=sc.nextInt();
			
			if(day>31 || day<0){
				out=true;
				System.out.println("ERROR Ningun month tiene mas de 31 dias.");
			}
			if(!out){
				System.out.print("/Mes :");
				int month=sc.nextInt();
				if(month>12 || month<0){
					out=true;
					System.out.println("ERROR Ningun año tiene mas de 12 meses.");
				}
				if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12 ){
					
				}
				if(month==4 || month==6 || month==9 || month==11){
					if(day>30){
						System.out.println("ERROR Este month tiene 30 dias.");
						out=true;
					}
				}
				if(month==2){
					if(day>29){
						System.out.println("ERROR Este month tiene 29 dias.");
						out=true;
					}
					
				}
				if(!out){
					System.out.print("/Año :");
					int year=sc.nextInt();
					if(year<0){
						System.out.println(" ERROR no hay años negativos");
						out=true;
					}
					if(!out){
						System.out.println("Ingrese el titulo original ");
						String tituloOriginal= sc.next();
						sc.nextLine();
						
						System.out.println("Ingrese el nombre del director ");
						String nameDirector= sc.next();
						sc.nextLine();
						
						System.out.println("Ingrese el nombre de la productora ");
						String productora= sc.next();
						sc.nextLine();
						
						System.out.println("Ingrese la sinopsis ");
						String sinopsis= sc.next();
						sc.nextLine();
						
						System.out.println("Ingrese si la edad minima para ver la pelicula ");
						int edadMinima=sc.nextInt();
						
						System.out.println("Ingrese la categoria ((1)ROMANTICA, (2)ACCION, (3)SUSPENSO, (4)TERROR, (5)COMEDIA)");
						int categoria=sc.nextInt();
						
						System.out.println("Ingrese el trailer ");
						String trailer= sc.next();
						sc.nextLine();
						
						//channels.addProduct(answerMenuProducts,nameDirector,productora,sinopsis,day, month, year,tituloOriginal,edadMinima,categoria,trailer);
						out=true;
						
					}
				}
			}
			
		}while(!out);
	}
	*/
	//--------------------------------------------------------------------------------------------------------------------------------------------------
	/**
    *This method is the method that the menu contains when the subscriber management option is selected.</br>
   
    */
	public int MenuSubscribers(){
		System.out.println("");
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("You have just entered the Subscriber Management section, select what you want to do:");
		System.out.println("(1).Create a new subscriber.");
		System.out.println("(2).Deactivate a subscriber.");
		System.out.println("(3).Display the number of active subscribers for each type of customer.");
		System.out.println("(4).Display the name of the underage subscriber who has the highest number of hours willing to consume.");
		System.out.println("(0).Return to main menu");
		System.out.println("");
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		
		int answer=sc.nextInt();
		
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println("");

		return answer;
	}
	/**
    *This method is in charge of calling the methods that meet each requirement and that perform the function shown in the subscribers menu method.</br>
    
    * @param answerMenuSubscribers int,This number is from 0 to 4
    
    */
	public void optionMenuSubscribers(int answerMenuSubscribers) {
		if(answerMenuSubscribers!=0&&answerMenuSubscribers!=1&&answerMenuSubscribers!=2&&answerMenuSubscribers!=3&&answerMenuSubscribers!=4){
			System.out.println("///////REMEMBER TO SELECT a number from the menu/////////");
		}
		switch(answerMenuSubscribers) {
		case 0: 
			System.out.println("Return to the initial menu ...");
			break;
		case 1:
			if(!channels.SpaceForMoreSubscribers()){
				createNewSubscriber();
				System.out.println("Subscriber information has been saved successfully");
			}else{
				System.out.println("----------------------------------------------------------");
				System.out.println("");
				System.out.println("There are already 50 registered subscribers");
				System.out.println("");
				System.out.println("----------------------------------------------------------");
			}
			
			break;
		case 2:
			deactivateSubscriber();
			break;
		case 3: 
			showInfoSubscribersActive();
			break;
		case 4: 
			showHigherSubscriberWillConsume();
			break;
		}
		
	}
	/**
    * This is responsible for calling another method hosted in the BlackSnail class</br>
    
    */
	public void showHigherSubscriberWillConsume(){
		System.out.println("You have entered the section to display the name of the underage subscriber who has the highest number of hours willing to consume");
		System.out.println(channels.subscriberMayorWillConsume());
	}
	/**
    * This method is in charge of calling another method hosted in the BlackSnail class, it does not ask for inputs</br>
    
    */
	public void showInfoSubscribersActive(){
		System.out.println("You have entered the section to show the number of active subscribers for each type of client ");
		System.out.println("");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("-                             INFORMATION                                       -");
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.println(channels.infoTOTALAct());
		System.out.println(channels.infoNORMAL());
		System.out.println(channels.infoPLATINUM());
		System.out.println(channels.infoGOLD());
		System.out.println(channels.infoDIAMOND());

		
		System.out.println("--------------------------------------------------------------------------------");
	}
	/**
    * This method is responsible for calling another method hosted in the BlackSnail class, before that it asks for the necessary inputs, verifies some, and calls 2 validation methods</br>
   
    */
	public void deactivateSubscriber(){
		System.out.println("You have entered the section to deactivate a subscriber's account.");
		System.out.println("Select if you want to enter the subscriber's number to deactivate it, or his ID:");
		System.out.println("(1) .Deactivate with the number");
		System.out.println("(2) .Deactivate with the ID");
		int answerDisable= sc.nextInt();
		if(answerDisable==1 || answerDisable==2){
			if(answerDisable==1){
				System.out.println("Enter the subscriber's number");
				int numberDisable= sc.nextInt();
				if(numberDisable>0 && numberDisable<=50){
					if(channels.numDeactivateExists(numberDisable)){
						channels.disableSubscriberNumber(numberDisable);
						System.out.println("");
						System.out.println("Subscriber has been successfully deactivated");
						System.out.println("");
					}else{
						System.out.println("---------------------------------------------------------------------------------------");
						System.out.println("");
						System.out.println("This user number has not been registered yet");
						System.out.println("");
						System.out.println("---------------------------------------------------------------------------------------");
					}
				}else{
					System.out.println("---------------------------------------------------------------------------------------");
					System.out.println("");
					System.out.println("There can only be 50 subscribers, please enter a valid number (1-50)");
					
					System.out.println("");
					System.out.println("---------------------------------------------------------------------------------------");
					System.out.println("");
				}
				
			}
			if(answerDisable==2){
				System.out.println("Enter the subscriber you want to deactivate:");
				int idForDisable= sc.nextInt();
				if(channels.idDeactivateExists(idForDisable)){
					channels.deactivateSubscriber(idForDisable);
					
					System.out.println("");
					System.out.println("Subscriber has been successfully deactivated");
					System.out.println("");
				}else{
					System.out.println("---------------------------------------------------------------------------------------");
					System.out.println("");
					System.out.println("The ID you want to deactivate is not registered with any subscriber .....");
					System.out.println("");
					System.out.println("----------------------------------------------------------------------------------------");
				}
				
			}
			
		}else{
			System.out.println("----------------------------------------------------------");
			System.out.println("");
			System.out.println("Remember to select 1 or 2 only!!");
			System.out.println("");
			System.out.println("----------------------------------------------------------");
			
		}
		
	}
	/**
    * This method is in charge of calling another method hosted in the BlackSnail class, but first it asks for the necessary inputs to create a subscriber</br>

    */
	public void createNewSubscriber(){
		boolean out = false;
		

		do{
			System.out.println("Enter the ID");
			int id= sc.nextInt();

			if(channels.verifyID(id)){
				System.out.println("That ID you entered was already registered");
				out=true;
			}
			if (!out){
				System.out.println("Enter the full name");
				String fullName= sc.next();
				sc.nextLine();
				
				System.out.println("Enter the age");
				int age= sc.nextInt();
				
				if(age<=0){
					System.out.println("Stop there! I think you can't have an age lower than 0");
					out=true;
				}
				if(!out){
					System.out.println("Enter the number of hours willing to consume");
					int hoursWillingConsume= sc.nextInt();
					if(hoursWillingConsume<0){
						System.out.println("Mmmmm The hours are not negative");
						out=true;
					}
					if(!out){
						int correctClient=0;
						int clientType=0;
						while(correctClient==0){
							
							System.out.println("Enter the type of customer:");
							System.out.println("-------------------------");
							System.out.println("(1).NORMAL");
							System.out.println("(2).PLATINUM");
							System.out.println("(3).GOLD");
							System.out.println("(4).DIAMOND");
							System.out.println("-------------------------");
							System.out.print("Enter:");
							clientType= sc.nextInt();
							if(clientType==1 || clientType==2 || clientType==3 || clientType==4){
								correctClient=1;
							}else{
								System.out.println("----------------------------------");
								System.out.println("");
								System.out.println("Select a valid option !!!!");
								System.out.println("");
								System.out.println("----------------------------------");
							}
						
						}
						channels.addSubscriber(id,fullName,age,hoursWillingConsume,clientType);
						out=true;
						
					}
				}
			}
			
		}while(!out);
	}
	
	
}