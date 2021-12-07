package model;
/**
* this is the application controller DataCenter class
*/
public class DataCenter {
	
	private double generalRentValue;
	
	private MiniRooms rooms[][];
	private MiniRooms roomSimulated[][];
	
	
	
	//public static final String ANSI_BLACK = "\u001B[30m";
	//public static final String ANSI_RED = "\u001B[31m";
	//public static final String ANSI_GREEN = "\u001B[32m";
	//public static final String ANSI_BLUE = "\u001B[34m";
	//public static final String ANSI_PURPLE = "\u001B[35m";
	/**
	* constant to change the color of the words to yellow
	*/
	public static final String ANSI_YELLOW = "\u001B[33m";
	/**
	* constant to change the color of the words to cyan
	*/
	public static final String ANSI_CYAN = "\u001B[36m";
	/**
	* constant to change the color of the words to white
	*/
	public static final String ANSI_WHITE = "\u001B[37m";
	/**
	* constant to change the color of the words to the original
	*/
	public static final String ANSI_RESET = "\u001B[0m";
	
	
	/**
    * this method is the constructor of the class
    
    * @param generalRentValue double
    */
	public DataCenter(double generalRentValue) {
		this.generalRentValue = generalRentValue;
		
		rooms=new MiniRooms[50][8];
		roomSimulated=new MiniRooms[50][8];
		
		
		boolean windowYESorNO=false;
		String number="";
		double rentalValue=0;
		for (int i=0; i< 8; i++ ) { // filas numbers.length
			for (int j = 0; j < 50; j++) { //columnas numbers[0].length
				if(rooms[j][i]==null){
					windowYESorNO=false;
					
					if(i==0 || i==7){
						windowYESorNO=true;
					}else if(j==0 || j==49){
						windowYESorNO=true;
					}
					number=changeStringNumber(j,i);
					
					rentalValue=calculateDiscounts(i,generalRentValue,windowYESorNO);
					rooms[j][i] = new MiniRooms(rentalValue,number,i,j,windowYESorNO);
					rooms[j][i].setRentalStatus(StatusRent.AVAILABLE);
					rooms[j][i].setStatus(Status.OFF);
					
					roomSimulated[j][i] = new MiniRooms(rentalValue,number,i,j,windowYESorNO);
					roomSimulated[j][i].setRentalStatus(StatusRent.AVAILABLE);
					roomSimulated[j][i].setStatus(Status.OFF);
				}	
			}
			
		}
		
	}
	/**
    * This method takes care of creating a string from the array
    * @return print String,chain, quarter map
    */
	public String showMapa(){
		
		Status statusRoomOn=Status.ON;
		Status statusRoomOff=Status.OFF;
		
		
		String print ="   Corridor 1    Corridor 2    Corridor 3    Corridor 4    Corridor 5    Corridor 6    Corridor 7    Corridor 8 "+"     "+"\n";
		print +="-----------------------------------------------------------------------------------------------------------------"+"\n";
		for (int i=0; i< 50; i++ ) { 
			print+="|     ";
			for (int j = 0; j < 8; j++) { 
				if((rooms[i][j].getStatus())==statusRoomOn){
					print += ANSI_YELLOW +rooms[i][j].getNumber()+ ANSI_RESET;
				}
				if((rooms[i][j].getStatus())==statusRoomOff){
					print += ANSI_CYAN +rooms[i][j].getNumber()+ ANSI_RESET;
				}
				
				print +="     |     ";
			}
			print += "\n";
		}
		print +="-----------------------------------------------------------------------------------------------------------------"+"\n";
		return print;
	}
	/**
    * this method receives the position of the room and converts it to String
	* @param j int
	* @param i int
    * @return print String
    */
	public String changeStringNumber(int j,int i){
		j=j+1;
		i=i+1;
		//String [] numerosLetras= {"A","B","C","D","E","F","G","H"};
		String number=i+"";
		if(j<10){
			number=number+"0"+j+"";
		}else{
			number=number+j+"";
		}
		return number;

	}
	/**
    * This method displays the list of available rooms
	* @param rentalValue double
    * @return print String
    */
	public String showListRooms(double rentalValue){
		//rooms[j][i] = new MiniRooms(number);
		String print ="";
		String number="";
		boolean windowYESorNO=false;
		StatusRent statusRoom=StatusRent.AVAILABLE;
		String window="No";
		for (int i=0; i< 8; i++ ) { 
			for (int j = 0; j < 50; j++) { 
				if(rooms[j][i].getRentalStatus()==statusRoom){
					windowYESorNO=false;
					
					if(i==0 || i==7){
						windowYESorNO=true;
					}else if(j==0 || j==49){
						windowYESorNO=true;
					}
					if(windowYESorNO==true){
						window="Si";
					}else{
						window="No";
					}
					
					number=changeStringNumber(j,i);
					rentalValue=calculateDiscounts(i,generalRentValue,windowYESorNO);
					print=print+rooms[j][i].toString();
				}	
			}
			
		}
		return print;
	}
	/**
    * This method calculates the rental value of a room without taking into account the surcharge for servers
	* @param roomNumber String
	* @param numberServers int
    * @return rentalValue double
    */
	public double calculateRoomValue(String roomNumber,int numberServers){
		boolean windowYESorNO=false;
		
		String row=roomNumber.substring(0,1);
		String column=roomNumber.substring(1,3);
		
		int intRow=Integer.parseInt(row);
		int intColumn=Integer.parseInt(column);
		
		int i=intRow-1;
		int j=intColumn-1;
		
		if(i==0 || i==7){
			windowYESorNO=true;
		}else if(j==0 || j==49){
			windowYESorNO=true;
		}
		double rentalValue=calculateDiscounts(i,generalRentValue,windowYESorNO);
		if(numberServers<4){
			rentalValue=rentalValue+(rentalValue*0.15);			
		}
		return rentalValue;
		
		
	}
	/**
    * This method calculates discounts on the value of the room
	* @param i int
	* @param generalRentValue double
	* @param windowYESorNO boolean
    * @return rentalValue double
    */
	public double calculateDiscounts(int i,double generalRentValue,boolean windowYESorNO){
		double rentalValue=generalRentValue;
		if(windowYESorNO==true){
			rentalValue=rentalValue-(rentalValue*0.1);
		}
		if(i==6){
			rentalValue=rentalValue-(rentalValue*0.15);
		}
		if(i>0 && i<5){
			rentalValue=rentalValue+(rentalValue*0.25);
		}

		return rentalValue;
	}
	/**
    * This method checks if the room is available
	* @param roomNumber String
    * @return miniRoomFound boolean,true is available
    */
	public boolean miniRoomAvailable(String roomNumber){
		boolean miniRoomFound=false;
		
		String row=roomNumber.substring(0,1);
		String column=roomNumber.substring(1,3);
		
		int intRow=Integer.parseInt(row);
		int intColumn=Integer.parseInt(column);
		
		StatusRent statusRoom=StatusRent.AVAILABLE;
		
		if(intRow>0 && intRow<9 && intColumn>0 && intColumn<51){
			if(rooms[intColumn-1][intRow-1].getRentalStatus()==statusRoom){
				miniRoomFound=true;
			}
		}
		
		return miniRoomFound;
		
	}
	/**
    * This method calculates the capacity of the Rack
	* @param roomNumber String
    * @return capacityTotalRack String
    */
	public String capacityRACK(String roomNumber){
		String capacityTotalRack="";
		
		String row=roomNumber.substring(0,1);
		String column=roomNumber.substring(1,3);
		
		int intRow=Integer.parseInt(row);
		int intColumn=Integer.parseInt(column);
		
		int i=intRow-1;
		int j=intColumn-1;
		
		capacityTotalRack=rooms[j][i].calculateTotalProcessCapacity();
		
		return capacityTotalRack;
		
	}
	/**
    * This method calculates the capacity of all Racks
	* @param companyName String
    * @return capacityTotalAllRack String
    */
	public String capacityAllRACK(String companyName){
		String capacityTotalAllRack="";
		double totalRam=0;
		double totalDisk=0;
		
		for (int i=0; i< 8; i++ ) { 
			for (int j = 0; j < 50; j++) { 
				if(rooms[j][i].getCompanyName()!=null){
					if(rooms[j][i].getCompanyName().equalsIgnoreCase(companyName)){
						totalDisk=+rooms[j][i].capacityServersDisk();
						totalRam=+rooms[j][i].capacityServersRAM();
						
					}
				}
			}
		}
		capacityTotalAllRack="The total disk capacity is "+totalDisk+" teras."+"\n"+"The total RAM memory is "+totalRam+" GB";
		
		return capacityTotalAllRack;
		
	}
	/**
    * This method cancels the rent of all the rooms on behalf of a company
	* @param companyName String
    */
	public void cancelRentAll(String companyName){
		boolean windowYESorNO=false;
		String number="";
		double rentalValue=0;
		for (int i=0; i< 8; i++ ) { 
			for (int j = 0; j < 50; j++) { 
				if(rooms[j][i].getCompanyName()!=null){
					if(rooms[j][i].getCompanyName().equalsIgnoreCase(companyName)){
						windowYESorNO=false;
						
						if(i==0 || i==7){
							windowYESorNO=true;
						}else if(j==0 || j==49){
							windowYESorNO=true;
						}
						number=changeStringNumber(j,i);
						rentalValue=calculateDiscounts(i,generalRentValue,windowYESorNO);
						rooms[j][i] = new MiniRooms(rentalValue,number,i,j,windowYESorNO);
						rooms[j][i].setRentalStatus(StatusRent.AVAILABLE);
						rooms[j][i].setStatus(Status.OFF);
						
					}
					
				}
					
				
				
			}
			
		}
	}
	/**
    * This method cancels the rent of a single room given the number of this
	* @param roomNumber String
    */
	public void cancelRental(String roomNumber){
		String row=roomNumber.substring(0,1);
		String column=roomNumber.substring(1,3);
		
		int intRow=Integer.parseInt(row);
		int intColumn=Integer.parseInt(column);
		
		int i=intRow-1;
		int j=intColumn-1;
		rooms[j][i].setRentalStatus(StatusRent.AVAILABLE);
		
		boolean windowYESorNO=false;
		String number="";
		double rentalValue=0;
		if(i==0 || i==7){
			windowYESorNO=true;
		}else if(j==0 || j==49){
			windowYESorNO=true;
		}
		number=changeStringNumber(j,i);
		rentalValue=calculateDiscounts(i,generalRentValue,windowYESorNO);
		rooms[j][i] = new MiniRooms(rentalValue,number,i,j,windowYESorNO);
		rooms[j][i].setRentalStatus(StatusRent.AVAILABLE);
		rooms[j][i].setStatus(Status.OFF);
	}
	/**
    * This method checks if a miniroom is rented
	* @param roomNumber String
    * @return miniRoomFound boolean
    */
	public boolean miniRoomRented(String roomNumber){
		boolean miniRoomFound=false;
		
		String row=roomNumber.substring(0,1);
		String column=roomNumber.substring(1,3);
		
		int intRow=Integer.parseInt(row);
		int intColumn=Integer.parseInt(column);
		
		int i=intRow-1;
		int j=intColumn-1;
		
		StatusRent statusRoom=StatusRent.RENTED;
		
		
		if(intRow>0 && intRow<9 && intColumn>0 && intColumn<51){
			if(rooms[j][i].getRentalStatus()==statusRoom){
				miniRoomFound=true;
			}
		}
		
		return miniRoomFound;
		
	}
	/**
    * This method rents a room
	
	* @param roomNumber String
	* @param day int
	* @param month int
	* @param year int
	* @param numberServers int
	* @param nit String
	* @param companyName String
    * @param numProjectRegistration int
	* @param assignedMiniRoom int
    */
	public void rentRoom(String roomNumber,int day,int month,int year,int numberServers,String nit,String companyName,int numProjectRegistration,int assignedMiniRoom){
		boolean windowYESorNO=false;
		String row=roomNumber.substring(0,1);
		String column=roomNumber.substring(1,3);
		
		int intRow=Integer.parseInt(row);
		int intColumn=Integer.parseInt(column);
		int i=intRow-1;
		int j=intColumn-1;
		if(i==0 || i==7){
			windowYESorNO=true;
		}else if((intColumn-1)==0 || (intColumn-1)==49){
			windowYESorNO=true;
		}
		double precio=calculateDiscounts(i,generalRentValue,windowYESorNO);
		if(numberServers<4){
			precio=precio+(precio*0.15);
		}
		if(assignedMiniRoom==1){
			rooms[j][i] = new MiniRooms(precio,roomNumber,day,month,year,numberServers,numProjectRegistration,i,j,windowYESorNO);
		}
		if(assignedMiniRoom==2){
			rooms[j][i] = new MiniRooms(precio,roomNumber,day,month,year,numberServers,nit,companyName,i,j,windowYESorNO);
		}
		
		rooms[j][i].setStatus(Status.ON);
		rooms[j][i].setRentalStatus(StatusRent.RENTED);
		
		
		
		
	}
	/**
    * This method adds a server to a room
	* @param roomNumber String
	* @param x int
	* @param amountCacheMemory double
	* @param numberProcessors int
	* @param amountRAMmemory double
	* @param discQuantity int
	* @param disksCapacity double
	* @param brandProcessor int
    */
	public void addServer(String roomNumber,int x,double amountCacheMemory,int numberProcessors,int brandProcessor,double amountRAMmemory,int discQuantity,double disksCapacity){
		String row=roomNumber.substring(0,1);
		String column=roomNumber.substring(1,3);
		
		int intRow=Integer.parseInt(row);
		int intColumn=Integer.parseInt(column);
		int i=intRow-1;
		int j=intColumn-1;
		rooms[j][i].addServidor(x,amountCacheMemory,numberProcessors,brandProcessor,amountRAMmemory,discQuantity,disksCapacity);
	}
	/**
    * This method turns on all simulation rooms
	* @return turnOnSuccessful boolean
    */
	public boolean simulateAllOn(){
		boolean turnOnSuccessful=false;
		int count=0;
		for (int i=0; i< 8; i++ ) { 
			for (int j = 0; j < 50; j++) { 
				roomSimulated[j][i].setStatus(Status.ON);
				count++;
			}
		}
		if (count==400){
			turnOnSuccessful=true;
		}
		return turnOnSuccessful;
		
	}
	/**
    * This method turns off in L shape
    */
	public void simulateOffL(){
		for (int i=0; i< 8; i++ ) { 
			for (int j = 0; j < 50; j++) { 
				if(j==0 || i==0){
					roomSimulated[j][i].setStatus(Status.OFF);
				}
			}
		}
	}
	/**
    * This method turns off in Z shape
    */
	public void simulateOffZ(){
		int diagonal=48;
		for (int i=0; i< 8; i++ ) { 
			for (int j = 0; j < 50; j++) { 
				if(i==0 || i==7){
					roomSimulated[j][i].setStatus(Status.OFF);
				}
				if((j+1)==diagonal){
					roomSimulated[j][i].setStatus(Status.OFF);
				}
			}
			diagonal=diagonal-8;
		}
	}
	/**
    * This method turns off in H shape
	
    */
	public void simulateOffH(){
		for (int i=0; i< 8; i++ ) { 
			for (int j = 0; j < 50; j++) { 
				if(i%2==0){
					roomSimulated[j][i].setStatus(Status.OFF);
				}
			}
		}
	}
	/**
    * This method turns off in O shape
    */
	public void simulateOffO(){
		for (int i=0; i< 8; i++ ) { 
			for (int j = 0; j < 50; j++) { 
				if(i==0 || i==7 || j==0 || j==49){
					roomSimulated[j][i].setStatus(Status.OFF);
				}
			}
		}
		
	}
	/**
    * This method turns off in M shape
	* @param columnTurnOff int
    */
	public void simulateOffM(int columnTurnOff){
		for (int i=0; i< 8; i++ ) { 
			for (int j = 0; j < 50; j++) { 
				if(j==(columnTurnOff-1)){
					roomSimulated[j][i].setStatus(Status.OFF);
				}
			}
		}
	}
	/**
    * This method turns off in P shape
	* @param corridorTurnOff int
    */
	public void simulateOffP(int corridorTurnOff){
		for (int i=0; i< 8; i++ ) { 
			for (int j = 0; j < 50; j++) { 
				if(i==(corridorTurnOff-1)){
					roomSimulated[j][i].setStatus(Status.OFF);
				}
			}
		}
	}
	/**
    * A get method
    * @return generalRentValue double
    */
	public double getGeneralRentValue() {
		return generalRentValue;
	}
	/**
    * A set method
    * @param generalRentValue double
    */
	public void setGeneralRentValue(double generalRentValue) {
		this.generalRentValue = generalRentValue;
	}
	/**
    * This method shows the rooms that were simulated by means of a string of String
    * @return print String
    */
	public String showMapSimulation(){
		
		Status statusRoomOn=Status.ON;
		Status statusRoomOff=Status.OFF;
		
		
		String print ="   Corridor 1    Corridor 2    Corridor 3    Corridor 4    Corridor 5    Corridor 6    Corridor 7    Corridor 8 "+"     "+"\n";
		print +="-----------------------------------------------------------------------------------------------------------------"+"\n";
		for (int i=0; i< 50; i++ ) { 
			print+="|     ";
			for (int j = 0; j < 8; j++) { 
				if((roomSimulated[i][j].getStatus())==statusRoomOn){
					print += ANSI_YELLOW +roomSimulated[i][j].getNumber()+ ANSI_RESET;
				}
				if((roomSimulated[i][j].getStatus())==statusRoomOff){
					print += ANSI_CYAN +roomSimulated[i][j].getNumber()+ ANSI_RESET;
				}
				
				print +="     |     ";
			}
			print += "\n";
		}
		print +="-----------------------------------------------------------------------------------------------------------------"+"\n";
		return print;
	}

	
}