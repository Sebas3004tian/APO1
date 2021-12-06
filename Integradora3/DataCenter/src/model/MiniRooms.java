package model;

import java.util.ArrayList;
/**
* this is the MiniRooms class
*/
public class MiniRooms {
	private double rentalValue;
	private String number;
	private int column;
	private int row;
	private StatusRent rentalStatus;
	private boolean window;
	private int numberServers;
	private String companyName;
	
	private Date rentalDate;
	private ArrayList<Server> rack;

	
	private Company companyThatRent;
	private Status status;
	
	/**
    * this method is the constructor of the class
    
    * @param rentalValue double
	* @param number String
	* @param day int
	* @param month int
	* @param year int
	* @param numberServers int
	* @param nit String
	* @param companyName String
	* @param row int
	* @param column int
	* @param window boolean
    */
	public MiniRooms(double rentalValue,String number,int day,int month,int year,int numberServers,String nit,String companyName,int row,int column,boolean window) {
		this.companyName=companyName;
		this.rentalValue = rentalValue;
		this.number = number;
		this.column = column;
		this.row = row;
		this.window = window;
		rentalDate = new Date(day, month, year);
		companyThatRent = new Company(nit, companyName);
		rack = new ArrayList <Server>();
		
	}
	/**
    * this method is the constructor of the class
    
    * @param rentalValue double
	* @param number String
	* @param day int
	* @param month int
	* @param year int
	* @param numberServers int
	* @param numProjectRegistration int
	* @param row int
	* @param column int
	* @param window boolean
    */
	public MiniRooms(double rentalValue,String number,int day,int month,int year,int numberServers,int numProjectRegistration,int row,int column,boolean window) {
		String companyName="ICESI";
		String nit="890.316.745-5"; 
		this.companyName=companyName;		
		this.rentalValue = rentalValue;
		this.number = number;
		this.column = column;
		this.row = row;
		this.window = window;
		rentalDate = new Date(day, month, year);
		companyThatRent = new Company(nit, companyName);
		rack = new ArrayList <Server>();
	}
	/**
    * this method is the constructor of the class
    
    * @param rentalValue double
	* @param number String
	* @param row int
	* @param column int
	* @param window boolean
    */
	public MiniRooms(double rentalValue,String number,int row,int column,boolean window){
		this.rentalValue = rentalValue;
		this.number = number;
		this.column = column;
		this.row = row;
		this.window = window;
		rack = new ArrayList <Server>();
	}
	/**
    * This method calculates the capacity of the disks in a mini room
    * @return diskServersCapacity double
    */
	public double capacityServersDisk(){
		double diskServersCapacity=0;
		for (int i = 0; i < rack.size(); i++) {
			diskServersCapacity+=(rack.get(i).getDisksCapacity()*rack.get(i).getDiscQuantity());
		}
		return diskServersCapacity;
	}
	/**
    * This method calculates the capacity of the RAM in a mini room
    * @return ramServersCapacity double
    */
	public double capacityServersRAM(){
		double ramServersCapacity=0;
		for (int i = 0; i < rack.size(); i++) {
			ramServersCapacity+=rack.get(i).getAmountRAMmemory();
		}
		return ramServersCapacity;
	}
	/**
    * This method calculates the capacity of the entire processor
    * @return totalCapacity String
    */
	public String calculateTotalProcessCapacity(){
		String totalCapacity="";
		double capacityTotalDisk=0;
		double totalMemoriaRAM=0;
		
		for (int i = 0; i < rack.size(); i++) {
			capacityTotalDisk+=(rack.get(i).getDisksCapacity()*rack.get(i).getDiscQuantity());
			totalMemoriaRAM+=rack.get(i).getAmountRAMmemory();
		}
		totalCapacity="The total disk capacity is "+capacityTotalDisk+" teras."+"\n"+"The total RAM memory is "+totalMemoriaRAM+" GB";
		return totalCapacity;
	}
	/**
    * This method calculates the capacity of the entire processor
	* @param x int
	* @param amountCacheMemory double
	* @param numberProcessors int
	* @param brandProcessor int
	* @param amountRAMmemory boolean
	* @param discQuantity int
	* @param disksCapacity boolean
    */
	public void addServidor(int x,double amountCacheMemory,int numberProcessors,int brandProcessor,double amountRAMmemory,int discQuantity,double disksCapacity){
		
		rack.add(new Server(amountCacheMemory,numberProcessors,amountRAMmemory,discQuantity,disksCapacity));
		if(brandProcessor==1){
			rack.get(x).setProcessor(Mark.INTEL);
		}
		if(brandProcessor==2){
			rack.get(x).setProcessor(Mark.AMD);
		}
		
		
		
	}
	/**
    * A get method
    * @return companyName String
    */
	public String getCompanyName() {
		return companyName;
	}
	/**
    * A set method
    * @param companyName String
    */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/**
    * A get method
    * @return rentalValue double
    */
	public double getRentalValue() {
		return rentalValue;
	}
	/**
    * A set method
    * @param rentalValue double
    */
	public void setRentalValue(double rentalValue) {
		this.rentalValue = rentalValue;
	}
	/**
    * A get method
    * @return number String
    */
	public String getNumber() {
		return number;
	}
	/**
    * A set method
    * @param number String
    */
	public void setNumber(String number) {
		this.number = number;
	}
	/**
    * A get method
    * @return column int
    */
	public int getColumn() {
		return column;
	}
	/**
    * A set method
    * @param column int
    */
	public void setColumn(int column) {
		this.column = column;
	}
	/**
    * A get method
    * @return row int
    */
	public int getRow() {
		return row;
	}
	/**
    * A set method
    * @param row int
    */
	public void setRow(int row) {
		this.row = row;
	}
	/**
    * A get method
    * @return rentalStatus StatusRent
    */
	public StatusRent getRentalStatus() {
		return rentalStatus;
	}
	/**
    * A set method
    * @param rentalStatus StatusRent
    */
	public void setRentalStatus(StatusRent rentalStatus) {
		this.rentalStatus = rentalStatus;
	}
	/**
    * A get method
    * @return window boolean
    */
	public boolean getWindow() {
		return window;
	}
	/**
    * A set method
    * @param window boolean
    */
	public void setWindow(boolean window) {
		this.window = window;
	}
	/**
    * A get method
    * @return companyThatRent Company
    */
	public Company getCompanyThatRent() {
		return companyThatRent;
	}
	/**
    * A set method
    * @param companyThatRent Company
    */
	public void setCompanyThatRent(Company companyThatRent) {
		this.companyThatRent = companyThatRent;
	}
	/**
    * A get method
    * @return status Status
    */
	public Status getStatus() {
		return status;
	}
	/**
    * A set method
    * @param status Status
    */
	public void setStatus(Status status) {
		this.status = status;
	}
	/**
    * It is the toString method of the class
    * @return string String
    */
	public String toString() {
		String windowMessage=" HAS NOT ";
		if(window){
			windowMessage=" HAS ";
		}
		String string= "\n"+"**** MiniRoom data****"+
		"\n"+"--------------------------------------------------------------"+
		"\n"+"The room number is: "+number+" In the corridor: "+(row+1)+" In the position: "+(column+1)+
		"\n"+"The room"+windowMessage+"close window."+
		"\n"+"The total rental value is: "+rentalValue+" pesos."+"\n"
		+"--------------------------------------------------------------"+"\n";
		return string;
	}
}