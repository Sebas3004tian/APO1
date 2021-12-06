package model;

import java.util.ArrayList;

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
	public MiniRooms(double rentalValue,String number,int row,int column,boolean window){
		this.rentalValue = rentalValue;
		this.number = number;
		this.column = column;
		this.row = row;
		this.window = window;
		rack = new ArrayList <Server>();
	}

	public double capacityServersDisk(){
		double diskServersCapacity=0;
		for (int i = 0; i < rack.size(); i++) {
			diskServersCapacity+=(rack.get(i).getDisksCapacity()*rack.get(i).getDiscQuantity());
		}
		return diskServersCapacity;
	}
	public double capacityServersRAM(){
		double ramServersCapacity=0;
		for (int i = 0; i < rack.size(); i++) {
			ramServersCapacity+=rack.get(i).getAmountRAMmemory();
		}
		return ramServersCapacity;
	}

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

	public void addServidor(int x,double amountCacheMemory,int getNumProcessors,int brandProcessor,double amountRAMmemory,int discQuantity,double disksCapacity){
		
		rack.add(new Server(amountCacheMemory,getNumProcessors,amountRAMmemory,discQuantity,disksCapacity));
		if(brandProcessor==1){
			rack.get(x).setProcessor(Mark.INTEL);
		}
		if(brandProcessor==2){
			rack.get(x).setProcessor(Mark.AMD);
		}
		
		
		
	}
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public double getRentalValue() {
		return rentalValue;
	}

	public void setRentalValue(double rentalValue) {
		this.rentalValue = rentalValue;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public StatusRent getRentalStatus() {
		return rentalStatus;
	}

	public void setRentalStatus(StatusRent rentalStatus) {
		this.rentalStatus = rentalStatus;
	}

	public boolean getWindow() {
		return window;
	}

	public void setWindow(boolean window) {
		this.window = window;
	}
	
	public Company getCompanyThatRent() {
		return companyThatRent;
	}

	public void setCompanyThatRent(Company companyThatRent) {
		this.companyThatRent = companyThatRent;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	public String toString() {
		String windowMessage=" HAS NOT ";
		if(window){
			windowMessage=" HAS ";
		}
		return  "\n"+"**** MiniRoom data****"+
		"\n"+"--------------------------------------------------------------"+
		"\n"+"The room number is: "+number+" In the corridor: "+(row+1)+" In the position: "+(column+1)+
		"\n"+"The room"+windowMessage+"close window."+
		"\n"+"The total rental value is: "+rentalValue+" pesos."+"\n"
		+"--------------------------------------------------------------"+"\n";
	}
}