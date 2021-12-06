package ui;
import java.util.Scanner;
import model.DataCenter;

/**
* It is the main class of the application 
*/

public class SystemDataCenter {
	private DataCenter center;
	private Scanner sc;
	
	private double rentalValue=0;
	/**
    * The method is used to define the scanner 

    */
	public SystemDataCenter() {
		sc= new Scanner(System.in);
		
	}
	/**
    *In this method a menu object is created and the initial menu method is called 
	* @param args String
    */
	public static void main(String[] args) {
		SystemDataCenter menu = new SystemDataCenter();
		menu.homeDataCenter();
		
		int answerInitialMenu= 0;
		
		try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            
        }
		do {
		    answerInitialMenu =menu.initialMenu();
		    menu.initialMenuOption(answerInitialMenu);
		}while (answerInitialMenu !=0);
		
	}
	/**
    *this method is the main menu
    */
	public void homeDataCenter() {
		try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            
        }
		boolean out=false;
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Welcome to the DataCenter application.");
		System.out.println(" ");
		System.out.println("Enter the rental value for all mini-rooms:");
		do{
			double generalRentValue= sc.nextDouble();
			if(generalRentValue>0){
				out=true;
				rentalValue=generalRentValue;
				center = new DataCenter(generalRentValue);
			}else{
				System.out.println("Please enter a valid value !!");
			}
		}while(!out);
		
	}
	/**
    *this method is the main menu
	* @return answer int
    */
	public int initialMenu(){
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Welcome to the data center menu");
		System.out.println(" ");
		System.out.println("Select what you want to do:");
		System.out.println(" ");
		System.out.println("(1). Generate a list with the available mini-rooms");
		System.out.println("(2). Rent Section");
		System.out.println("(3). General Map");
		System.out.println("(4). Simulations Section");
		System.out.println("(0). Exit application");
		int answer=sc.nextInt();

		return answer;
	}
	/**
    *this method is to answer the main
	* @param answerInitialMenu int
    */
	public void initialMenuOption(int answerInitialMenu) {
		if(answerInitialMenu!=0&&answerInitialMenu!=1&&answerInitialMenu!=2&&answerInitialMenu!=3&&answerInitialMenu!=4){
			System.out.println(" ");
			System.out.println("///////REMEMBER TO SELECT a number from the menu/////////");
			System.out.println(" ");
		}
		try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            
        }
		switch(answerInitialMenu) {
		case 0: 
			System.out.println(" ");	
			System.out.println("The application is closed, thanks ...");
			System.out.println(" ");
			break;
		case 1:
			System.out.println(center.showListRooms(rentalValue));
			break;
		case 2:
			int answerMenuRent=0;
			do{
				answerMenuRent=menuRent();
				optionMenuRent(answerMenuRent);
			}while(answerMenuRent!=0);
			break;
		case 3: 
			map();
			break;
		case 4: 
			int answerMenuSimulation=0;
			do{
				answerMenuSimulation=menuSimulation();
				optionMenuSimulation(answerMenuSimulation);
			}while(answerMenuSimulation!=0);
			break;
		}
		
	}
	/**
    *this method takes care of the map
    */
	public void map(){
		System.out.println(" ");
		System.out.println(center.showMapa());
		System.out.println(" ");
		System.out.println("Rooms that appear in WHITE are on, others are off.");
		System.out.println(" ");
	}
	/**
    *this method is the rent menu
	* @return answer int
    */
	public int menuRent(){
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Welcome to the Rental section.");
		System.out.println(" ");
		System.out.println("Select what you want to do:");
		System.out.println(" ");
		System.out.println("(1). Rent a mini-room");
		System.out.println("(2). Cancel the rental for a mini-room");
		System.out.println("(3). Cancel the rent for all the mini-rooms of a company");
		System.out.println("(0). Back to Main Menu");
		int answer=sc.nextInt();

		return answer;
	}
	/**
    *this method is to answer the rent menu
	@param answerMenuRent int
    */
	public void optionMenuRent(int answerMenuRent) {
		if(answerMenuRent!=0&&answerMenuRent!=1&&answerMenuRent!=2&&answerMenuRent!=3){
			System.out.println(" ");
			System.out.println("///////REMEMBER TO SELECT a number from the menu/////////");
			System.out.println(" ");
		}
		try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            
        }
		switch(answerMenuRent) {
		case 0: 
			System.out.println(" ");
			System.out.println("Back to the initial menu ");
			System.out.println(" ");
			break;
		case 1:
			rentMiniRoom();
			break;
		case 2:
			cancelMiniRoom();
			break;
		case 3:
			cancelAllMiniRoom();		
			break;
		}
		
	}
	/**
    *this method is to cancel all the mini rooms of a company
    */
	public void cancelAllMiniRoom(){
		boolean out=false;
		do{
			System.out.println("Enter the name of the company to cancel the rental of all associated rooms:");
			String companyName= sc.next();
			sc.nextLine();
			System.out.println("Before proceeding with the cancellation, the processing capacity of the RACK of this room is:");
			System.out.println("--------------------------------------------------------------------------");
			System.out.println(center.capacityAllRACK(companyName));
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("Do you wish to continue?: ");
				System.out.println("(1). Yes");
				System.out.println("(2). No");
				int answerContinue=sc.nextInt();
				if(answerContinue==1 || answerContinue==2){
					if(answerContinue==1){
						if(!out){
							center.cancelRentAll(companyName);
							System.out.println("The rent of the rooms in the name of the company "+companyName+" have been successfully canceled.");
							out=true;
						}
					}else if(answerContinue==2){
						System.out.println(" ");
						System.out.println("On another occasion it will be, thank you ...");
						System.out.println(" ");
						out=true;
						
					}
				}else{
					System.out.println(" ");
					System.out.println("Please choose 1 or 2");
					System.out.println(" ");
					out=true;
				}
			
			
		}while(!out);
	}
	/**
    *this method is to cancel one mini room
    */
	public void cancelMiniRoom(){
		boolean out=false;
		do{
			System.out.println("Enter the number of the mini-room you want to cancel the rental: ");
			String roomNumber= sc.next();
			sc.nextLine();
			
			
			if(center.miniRoomRented(roomNumber)){
				System.out.println("Before proceeding with the cancellation, the processing capacity of the RACK of this room is:");
				System.out.println("--------------------------------------------------------------------------");
				System.out.println(center.capacityRACK(roomNumber));
				System.out.println("--------------------------------------------------------------------------");
				System.out.println("Do you wish to continue?: ");
				System.out.println("(1). Yes");
				System.out.println("(2). No");
				int answerContinue=sc.nextInt();
				if(answerContinue==1 || answerContinue==2){
					if(answerContinue==1){
						if(!out){
							center.cancelRental(roomNumber);
							System.out.println("The rent of the room number "+roomNumber+" has been successfully canceled.");
							out=true;
						}
					}else if(answerContinue==2){
						System.out.println(" ");
						System.out.println("On another occasion it will be, thank you ...");
						System.out.println(" ");
						out=true;
						
					}
				}else{
					System.out.println(" ");
					System.out.println("Please choose 1 or 2");
					System.out.println(" ");
					out=true;
				}
				
			}else if (!center.miniRoomRented(roomNumber)){
				System.out.println("The room has not been found, or it is not in RENTED status, please check the status map of the rooms.");
				out=true;
			}
		}while(!out);
	}
	/**
    *this method takes care of renting a mini room
    */
	public void rentMiniRoom(){
		boolean out=false;
		int day=0;
		int month=0;
		int year=0;
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Welcome to the section of renting a mini-room");
		System.out.println(" ");
		do{
			System.out.println("Enter the number of the mini-room you want to rent: ");
			String roomNumber= sc.next();
			sc.nextLine();
			
			
			if(center.miniRoomAvailable(roomNumber)){
	
				System.out.println("Enter today's date: ");
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
							System.out.println("Enter the rack number that will be in the RACK: ");
							int numberServers=sc.nextInt();
							if(numberServers<0){
								System.out.println("Error ... select a number greater than or equal to 0");
								out=true;
							}
							if(!out){
								System.out.println("Enter who will be assigned the mini-room:  ");
								System.out.println("1.Investigation project");
								System.out.println("2.Company");
								int assignedMiniRoom=sc.nextInt();
								if(assignedMiniRoom==1 || assignedMiniRoom==2){
									int numProjectRegistration=0;
									String nit="";
									String companyName="";
									if(assignedMiniRoom==1){
										System.out.println("Enter the project registration number: ");
										numProjectRegistration=sc.nextInt();
									}
									if(assignedMiniRoom==2){
										System.out.println("Enter the nit of the company: ");
										nit= sc.next();
										sc.nextLine();
										System.out.println("Enter the name of the company: ");
										companyName= sc.next();
									}
									
									System.out.println("The total value of the room is: "+center.calculateRoomValue(roomNumber,numberServers)+" pesos");
									System.out.println("Do you wish to continue?: ");
									System.out.println("(1). Yes");
									System.out.println("(2). No");
									int answerContinue=sc.nextInt();
									if(answerContinue==1 || answerContinue==2){
										if(answerContinue==1){
											if(!out){
												center.rentRoom(roomNumber,day,month,year,numberServers,nit,companyName,numProjectRegistration,assignedMiniRoom);
												addServer(roomNumber,numberServers);
												System.out.println(" ");
												System.out.println("Rental made successfully ...");
												System.out.println(" ");
												out=true;
											}
										}else if(answerContinue==2){
											System.out.println(" ");
											System.out.println("On another occasion it will be, thank you ...");
											System.out.println(" ");
											out=true;
											
										}
									}else{
										System.out.println(" ");
										System.out.println("Please choose 1 or 2");
										System.out.println(" ");
										out=true;
									}
									
								}else {
									System.out.println(" ");
									System.out.println("Please choose 1 or 2");
									System.out.println(" ");
									out=true;
								}
							}
						}
					}
				}
			}else if(!center.miniRoomAvailable(roomNumber)){
				System.out.println(" ");
				System.out.println("The room entered is occupied or does not exist, try another number (you can also check the map, to know the numbers of rooms available)");
				System.out.println(" ");
				out=true;
			}
			
		}while(!out);
	}
	/**
    *this method is responsible for adding servers to a mini room
	* @param roomNumber String
	* @param numberServers int
    */
	public void addServer(String roomNumber,int numberServers){
		boolean out=false;
		double amountCacheMemory=0;
		int numberProcessors=0;
		int brandProcessor=0;
		double amountRAMmemory=0;
		int discQuantity=0;
		double disksCapacity=0;
		System.out.println(" ");
		System.out.println("Then enter the information of each server in the RACK ");
		System.out.println(" ");
		for(int x=0;x<numberServers;x++){
			amountCacheMemory=0;
			numberProcessors=0;
			brandProcessor=0;
			amountRAMmemory=0;
			discQuantity=0;
			disksCapacity=0;
			System.out.println("Server "+(x+1)+" --------------------------------------------------------");
			do{
				System.out.println("Enter the amount of cache memory in GB: ");
				amountCacheMemory=sc.nextDouble();
				if(amountCacheMemory<0){
					System.out.println("Cache memory cannot be negative. ");
				}else{
					out=true;
				}
			}while(!out);
			out=false;
			do{
				System.out.println("Enter the number of processors: ");
				numberProcessors=sc.nextInt();
				if(numberProcessors<0){
					System.out.println("The number of processors cannot be negative. ");
				}else{
					out=true;
				}
			}while(!out);
			out=false;
			do{
				System.out.println("Enter the processor brand: ");
				System.out.println("1.INTEL");
				System.out.println("2.AMD");
				brandProcessor=sc.nextInt();
				if(brandProcessor!=1 && brandProcessor!=2){
					System.out.println("You can only select INTEL or AMD ");
				}else{
					out=true;
				}
			}while(!out);
			out=false;
			do{
				System.out.println("Enter the amount of RAM in GB: " );
				amountRAMmemory=sc.nextDouble();
				if(amountRAMmemory<0){
					System.out.println("RAM cannot be negative. ");
				}else{
					out=true;
				}
			}while(!out);
			out=false;
			do{
				System.out.println("Enter the number of disks: ");
				discQuantity=sc.nextInt();
				if(discQuantity<0){
					System.out.println("The number of discs cannot be negative. ");
				}else{
					out=true;
				}
			}while(!out);
			out=false;
			do{
				System.out.println("Enter the capacity of the disks in teras: ");
				disksCapacity=sc.nextDouble();
				if(disksCapacity<0){
					System.out.println("The capacity of the discs cannot be negative. ");
				}else{
					out=true;
				}
			}while(!out);
			center.addServer(roomNumber,x,amountCacheMemory,numberProcessors,brandProcessor,amountRAMmemory,discQuantity,disksCapacity);
			out=false;
				
		}
	}
	/**
    *this method is the simulation menu
	* @return answer int
    */
	public int menuSimulation(){
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Welcome to the simulation section.");
		System.out.println("Select what you want to do:");
		System.out.println(" ");
		System.out.println("(1). Simulate the turning on of all the mini-rooms.");
		System.out.println("(2). Simulate turning off the mini-rooms.");
		System.out.println("(0). Back to Main Menu");
		int answer=sc.nextInt();

		return answer;
	}
	/**
    *this method is to respond to the simulation menu
	* @param answerMenuSimulation int
    */
	public void optionMenuSimulation(int answerMenuSimulation) {
		if(answerMenuSimulation!=0&&answerMenuSimulation!=1&&answerMenuSimulation!=2){
			System.out.println(" ");
			System.out.println("///////REMEMBER TO SELECT a number from the menu/////////");
			System.out.println(" ");
		}
		try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            
        }
		switch(answerMenuSimulation) {
		case 0: 
			System.out.println(" ");	
			System.out.println("Back to the initial menu");
			System.out.println(" ");
			break;
		case 1:
			simulateOnAll();
			break;
		case 2:
			int responseMenuSimulationOff=0;
			do{
				responseMenuSimulationOff=menuSimulationOff();
				optionMenuSimulationOff(responseMenuSimulationOff);
				simulationMap();
			}while(responseMenuSimulationOff!=0);
			
			break;
		}
		
	}
	/**
    *this method is to turn on all simulated locations
    */
	public void simulateOnAll(){
		
		if(center.simulateAllOn()){
			
			System.out.println(" ");
			System.out.println("All rooms have been successfully turned on");
			System.out.println(" ");
		}
		
	}
	/**
    *this method is the menu for the shutdowns of the simulated rooms
	* @return answer int
    */
	public int menuSimulationOff(){
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Select what you want to do: ");
		System.out.println(" ");
		System.out.println("(1). L-shaped shutdown");
		System.out.println("(2). Z-shaped shutdown");
		System.out.println("(3). H-shaped shutdown");
		System.out.println("(4). O-shaped shutdown");
		System.out.println("(5). M-shaped shutdown (turns off a chosen column)");
		System.out.println("(6). P-shaped shutdown (shuts down a chosen runner)");
		System.out.println("(0). Back to Main Menu");
		int answer=sc.nextInt();

		return answer;
	}
	/**
    *This method is to respond to the menu of the simulated rooms shutdowns
	* @param answerMenuSimulation int
    */
	public void optionMenuSimulationOff(int answerMenuSimulation) {
		if(answerMenuSimulation!=0&&answerMenuSimulation!=1&&answerMenuSimulation!=2&&answerMenuSimulation!=3&&answerMenuSimulation!=4&&answerMenuSimulation!=5&&answerMenuSimulation!=6){
			System.out.println(" ");
			System.out.println("///////REMEMBER TO SELECT a number from the menu/////////");
			System.out.println(" ");
		}
		try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            
        }
		switch(answerMenuSimulation) {
		case 0: 
			System.out.println(" ");	
			System.out.println("Back to the initial menu");
			System.out.println(" ");
			break;
		case 1:
			offL();
			break;
		case 2:
			offZ();
			break;
		case 3:
			offH();
			break;
		case 4:
			offO();
			break;
		case 5:
			offM();
			break;
		case 6:
			offP();
			break;
		}
		
	}
	/**
    *this method is turned off in an L shape
    */
	public void offL(){
		center.simulateOffL();
	}
	/**
    *this method is turned off in an Z shape
    */
	public void offZ(){
		center.simulateOffZ();
	}
	/**
    *this method is turned off in an H shape
    */
	public void offH(){
		center.simulateOffH();
	}
	/**
    *this method is turned off in an O shape
    */
	public void offO(){
		center.simulateOffO();
	}
	/**
    *this method is turned off in an M shape
    */
	public void offM(){
		boolean out=false;
		do{
			System.out.println("Enter the column you want to turn off (1-50)");
			System.out.println(" ");
			int columnTurnOff=sc.nextInt();
			
			if(columnTurnOff<1 || columnTurnOff>50){
				System.out.println("Error selects a column from 1 to 50. ");
				out=true;
			}
			if(!out){
				center.simulateOffM(columnTurnOff);
				out=true;
			}
		}while(!out);
	}
	/**
    *this method is turned off in an P shape
    */
	public void offP(){
		boolean out=false;
		do{
			System.out.println("DIgita the runner you want to turn off (1-8)");
			System.out.println(" ");
			int corridorTurnOff=sc.nextInt();
			
			if(corridorTurnOff<1 || corridorTurnOff>8){
				System.out.println("Error selects a corridor from 1 to 8.");
				out=true;
			}
			if(!out){
				center.simulateOffP(corridorTurnOff);
				out=true;
			}
		}while(!out);
		
	}
	/**
    *this method is shows all simulated locations
    */
	public void simulationMap(){
		System.out.println(" ");
		System.out.println(center.showMapSimulation());
		System.out.println(" ");
		System.out.println("Rooms that appear in WHITE are on, others are off");
		System.out.println(" ");
		
	}
}