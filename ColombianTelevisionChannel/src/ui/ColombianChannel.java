package ui;
import java.util.Scanner;
import model.BlackSnail;


public class ColombianChannel {
	private BlackSnail channels;
	private Scanner sc;

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
			//System.out.println(channels.showMovie());     These 2 calls are in case you want to enable a function to see all the registered information of Series and Movies
			//System.out.println(channels.showSeries());
			break;
		}
		
	}
	/**
    * This method shows the 5 options that can be made in the product management section, it also receives the response input.</br>
	*/
	public int createProductMenu(){
		System.out.println("");
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("You have just entered the Product Management section, select what you want to do:");
		System.out.println("(1) .Create a new product");
		System.out.println("(2) .Display the information of a product");
		System.out.println("(3) .Create the next season of a series");
		System.out.println("(4) .List all movies according to a category");
		System.out.println("(5) .List all series and show the latest season information");
		System.out.println("(0).Return to main menu");
		System.out.println("");
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		
		int answer=sc.nextInt();
		
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println("");

		return answer;
	}
	/**
    * In this method you choose what you want to do (5 options) in the product management section.</br>
    * @param answerMenuProducts int, number from (0 to 5).
    */
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
			inforProduct();
			break;
		case 3:
			createSeason();
			break;
		case 4:
			listMovies();
			break;
		case 5:
			listSeries();
			break;
		}
		
	}
	/**
    * This method prints a method located in the BlackSanail class that is in charge of listing all the series registered with their last season</br>
	*/
	public void listSeries(){
		System.out.println(channels.listSerie());
	}
	/**
    * This method prints a method that stores information about the movies depending on their category, the calling method is in the BlackSnail class</br>
    */
	public void listMovies(){
		boolean out = false;
		do{
			System.out.println("Enter the category of movies you want to see listed: ");
			System.out.println("(1).ROMANTIC");
			System.out.println("(2).ACTION");
			System.out.println("(3).SUSPENSE");
			System.out.println("(4).TERROR");
			System.out.println("(5)COMEDY");
			System.out.println("Select one: ");
			int category=sc.nextInt();
			if(category!=1&&category!=2&&category!=3&&category!=4&&category!=5){
				System.out.println("ERROR Select from 1 to 5 the category");
				out=true;
			}
			if(!out){
				System.out.println(channels.listMoviesCategory(category));
				out=true;
			}
		}while(!out);
	}
	/**
    * This method is in charge of calling the methods that create a next season of a series that is in the BlackSnail class</br>
    */
	public void createSeason(){
		boolean out = false;
		int day=0;
		int month=0;
		int year=0;
		int numScheduledEpi=0;
		int numEpiPub=0;
		String trailer="";
		System.out.println("Enter the name of the series, to add a season:");
		sc.nextLine();
		String seriesName=sc.nextLine();
		if(channels.validateSeriesName(seriesName)){
			
			
			System.out.println("Enter the number of episodes scheduled for the season: ");
			numScheduledEpi=sc.nextInt();
			
			
			if(numScheduledEpi<0){
				System.out.println("ERROR the number of programmed episodes must be greater than or 0");
				out=true;
				
			}
			if(!out){
				
				System.out.println("Enter the number of episodes published for the season: ");
				numEpiPub=sc.nextInt();
				if(numEpiPub<0 || numEpiPub>numScheduledEpi){
					System.out.println("ERROR the number of published episodes must be greater or 0");
					out=true;
					
				}
				if(!out){
					
					
				
					System.out.println("Enter the season premiere date: ");
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
								
								System.out.println("Enter the link of the season trailer: ");
								sc.nextLine();
								trailer=sc.nextLine();
								
								channels.createOtherSeason(seriesName,numScheduledEpi,numEpiPub,day,month,year,trailer);

								
							}
						}
					}
				}
			}
			
			
		}
		
		
	}
	/**
    * This method is in charge of asking for the name of the product, calling the method that validates the name and then printing the method that stores the product information.</br>
    */
	public void inforProduct(){
		System.out.println("Enter the name of the product you want to search for:");
		sc.nextLine();
		String productName=sc.nextLine();
		System.out.println(channels.searchProduct(productName));
		
	}
	/**
    *This method is in charge of creating a new product (movie or series), it also calls the validation methods that store the data in the BlackSnail class.</br>
    */
	public void crearNuevoProducto(){
		
		int productType=0;
		String nameDirector="";
		String synopsis="";
		int day=0;
		int month=0;
		int year=0;
		String productName="";
		
		String producer="";
		int minimumAge=0;
		int category=0;
		String trailer="";
		int numOfProtagonists=1;
		String protagonistName="";
		String allProtagonists="";
		int censored=0;
		String reason="";
		int numSeasonsSeries=1;
		int seasonNumber=0;
		int numScheduledEpi=0;
		int numEpiPub=0;
		
		
		System.out.println("What type of product do you want to add?");
		System.out.println("(1).Movie");
		System.out.println("(2).Serie");
		productType=sc.nextInt();
		if(productType!=1&&productType!=2){
			System.out.println("You can only choose 1 or 2.");
		}else if (productType==1||productType==2){
			if(productType==1){
				
				boolean out = false;
				

				do{
					System.out.println("Enter the world premiere date of the film:");
					System.out.println("Day : ");
					day=sc.nextInt();
					
					if(day>31 || day<0){
						out=true;
						System.out.println("ERROR No month has more than 31 days.");
					}
					if(!out){
						System.out.println("Month :");
						month=sc.nextInt();
						if(month>12 || month<0){
							out=true;
							System.out.println("ERROR No year has more than 12 months.");
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
							System.out.println("Year :");
							year=sc.nextInt();
							if(year<0){
								System.out.println(" ERROR no negative years");
								out=true;
							}
							if(!out){
								System.out.println("Enter the original title of the film:");
								sc.nextLine();
								productName=sc.nextLine();
								if(channels.validateProductName(productName)){
									System.out.println(" ERROR that name is already registered");
									out=true;
								}
								if(!out){
									System.out.println("Enter the name of the movie director: ");
									nameDirector=sc.nextLine();
									
									System.out.println("Enter the name of the producer of the film: ");
									producer=sc.nextLine();
									
									System.out.println("Enter the movie synopsis:");
									synopsis=sc.nextLine();
									
									System.out.println("Enter the minimum age to see the movie: ");
									minimumAge=sc.nextInt();
									if(minimumAge<1){
										System.out.println("ERROR the minimum age obviously has to be greater than 0");
										out=true;
									}
									if(!out){
										System.out.println("Enter the category of the movie: ");
										System.out.println("(1).ROMANTIC");
										System.out.println("(2).ACTION");
										System.out.println("(3).SUSPENSE");
										System.out.println("(4).TERROR");
										System.out.println("(5)COMEDY");
										category=sc.nextInt();
										if(category!=1&&category!=2&&category!=3&&category!=4&&category!=5){
											System.out.println("ERROR Select from 1 to 5 the category");
											out=true;
										}
										if(!out){
											System.out.println("Enter the link of the movie trailer:");
											sc.nextLine();
											trailer=sc.nextLine();
											channels.addProduct(productType,nameDirector,synopsis,day,month,year,productName,producer,minimumAge,category,trailer,allProtagonists,censored,reason,numScheduledEpi,numEpiPub);
										}
									}
								}
								out=true;
								
							}
						}
					}
					
				}while(!out);
				
			}
			
			if(productType==2){
				boolean out = false;
				boolean censured=false;
				

				do{
					System.out.println("Enter the name of the Series:");
					sc.nextLine();
					productName=sc.nextLine();
					if(channels.validateProductName(productName)){
						System.out.println(" ERROR that name is already registered");
						out=true;
					}
					if(!out){
					
						System.out.println("Enter the date of the first issue: ");
						System.out.println("Day :");
						day=sc.nextInt();
						
						if(day>31 || day<0){
							out=true;
							System.out.println("ERROR No month has more than 31 days.");
						}
						if(!out){
							System.out.println("Month :");
							month=sc.nextInt();
							if(month>12 || month<0){
								out=true;
								System.out.println("ERROR No year has more than 12 months.");
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
								System.out.println("Year :");
								year=sc.nextInt();
								if(year<0){
									System.out.println("ERROR no negative years");
									out=true;
								}
								if(!out){
									System.out.println("Enter the number of protagonists in the series: ");
									numOfProtagonists=sc.nextInt();
									if(numOfProtagonists<1){
										System.out.println("ERROR The series must have at least 1 protagonist ");
										out=true;
										
									}
									if(!out){
										System.out.println("Enter the names of the protagonists: ");
										sc.nextLine();
										for(int x=0;x<numOfProtagonists;x++){
											System.out.print("("+(x+1)+"). ");
											protagonistName=sc.nextLine();
											protagonistName="("+(x+1)+"). "+protagonistName;
											allProtagonists=allProtagonists+"\n"+protagonistName;
											
										}
										
										System.out.println("Enter the name of the series director:  ");
										
										nameDirector=sc.nextLine();
										System.out.println("Enter the synopsis of the series: ");
										
										synopsis=sc.nextLine();
										
										System.out.println("Enter if the series was censored (YES=1)(NO=2): ");
										censored=sc.nextInt();
										if(censored!=1&&censored!=2){
											System.out.println("ERROR touch to place 1 or 2");
											out=true;
										}
										if(censored==1){
											System.out.println("Enter the reason for the series' censorship: ");
											sc.nextLine();
											reason=sc.nextLine();
											
										}
										if(!out){
											if(!out){
												System.out.println("Enter the number of episodes scheduled for the season: ");
												numScheduledEpi=sc.nextInt();
												
												
												if(numScheduledEpi<0){
													System.out.println("ERROR the number of programmed episodes must be greater than or 0 ");
													out=true;
													
												}
												if(!out){
													
													System.out.println("Enter the number of episodes published for the season: ");
													numEpiPub=sc.nextInt();
													if(numEpiPub<0){
														System.out.println("ERROR the number of published episodes must be greater or 0 ");
														out=true;
														
													}
													if(!out){
														
														
													
														System.out.println("Enter the season premiere date: ");
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
																System.out.println("ERROR No year has more than 12 months. ");
																out=true;
																
															}
															if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12 ){
																
															}
															if(month==4 || month==6 || month==9 || month==11){
																if(day>30){
																	System.out.println("ERROR This month has 30 days. ");
																	out=true;
																	
																}
															}
															if(month==2){
																if(month%4==0){
																	if(day>29){
																		System.out.println("ERROR This month has 29 days. ");
																		out=true;
																		
																	}
																}
																if(month%4!=0){
																	if(day>28){
																		System.out.println("ERROR This month has 29 days. ");
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
																	
																	System.out.println("Enter the link of the season trailer: ");
																	sc.nextLine();
																	trailer=sc.nextLine();
																	
																	channels.addProduct(productType,nameDirector,synopsis,day,month,year,productName,producer,minimumAge,category,trailer,allProtagonists,censored,reason,numScheduledEpi,numEpiPub);
																	
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
					}
				}while(!out);
			}
			
		}
		
	}
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