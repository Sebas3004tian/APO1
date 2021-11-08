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
			//System.out.println(channels.mostrarMovie());
			break;
		}
		
	}
	//--------------------------------------------------------------------------------------------------------------------------------------------------SEGUIMIENTO12
	public int createProductMenu(){
		System.out.println("");
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("You have just entered the Product Management section, select what you want to do:");
		System.out.println("(1).Add a series.");
		System.out.println("(2).Add a movie.");
		System.out.println("(0).Return to main menu");
		System.out.println("");
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		
		int answer=sc.nextInt();
		
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println("");

		return answer;
	}
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
				createNewSerie();
				System.out.println("Serie information has been saved successfully");
			}else{
				System.out.println("----------------------------------------------------------");
				System.out.println("");
				System.out.println("There are already 5 registered products");
				System.out.println("");
				System.out.println("----------------------------------------------------------");
			}
			
			break;
		case 2:
			if(!channels.SpaceForMoreProducts()){
				createNewMovie();
				System.out.println("Movie information has been saved successfully");
			}else{
				System.out.println("----------------------------------------------------------");
				System.out.println("");
				System.out.println("There are already 5 registered products");
				System.out.println("");
				System.out.println("----------------------------------------------------------");
			}
			break;
		}
		
	}
	public void createNewSerie(){
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
						//channels.addSerie(day, month, year,nombresProtagonistas,nameDirector,sinopsis,motivo);
						out=true;
						
					}
				}
			}
			
		}while(!out);
	}
	public void createNewMovie(){
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
						
						channels.addMovie(nameDirector,productora,sinopsis,day, month, year,tituloOriginal,edadMinima,categoria,trailer);
						out=true;
						
					}
				}
			}
			
		}while(!out);
	}
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