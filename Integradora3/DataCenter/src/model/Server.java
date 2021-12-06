package model;

public class Server {
	
	private double amountCacheMemory;
	private int getNumProcessors;
	private double amountRAMmemory;
	private int discQuantity;
	private double disksCapacity;
	
	private Mark processor;


	public Server(double amountCacheMemory,int getNumProcessors,double amountRAMmemory,int discQuantity,double disksCapacity) {
		this.amountCacheMemory = amountCacheMemory;
		this.getNumProcessors = getNumProcessors;
		this.amountRAMmemory = amountRAMmemory;
		this.discQuantity = discQuantity;
		this.disksCapacity = disksCapacity;
		
		
	}
	public double getAmountCacheMemory() {
		return amountCacheMemory;
	}

	public void setAmountCacheMemory(double amountCacheMemory) {
		this.amountCacheMemory = amountCacheMemory;
	}

	public int getNumProcessors() {
		return getNumProcessors;
	}

	public void setNumProcesadores(int getNumProcessors) {
		this.getNumProcessors = getNumProcessors;
	}

	public double getAmountRAMmemory() {
		return amountRAMmemory;
	}

	public void setAmountRAMmemory(double amountRAMmemory) {
		this.amountRAMmemory = amountRAMmemory;
	}

	public int getDiscQuantity() {
		return discQuantity;
	}

	public void setDiscQuantity(int discQuantity) {
		this.discQuantity = discQuantity;
	}

	public double getDisksCapacity() {
		return disksCapacity;
	}

	public void setDisksCapacity(double disksCapacity) {
		this.disksCapacity = disksCapacity;
	}
	public Mark getProcessor() {
		return processor;
	}

	public void setProcessor(Mark processor) {
		this.processor = processor;
	}
	/*
	public String toString(){
		return  "\n"+"**** Server data****"+
		"\n"+"--------------------------------------------------------------"+
		"\n"+"getAmountCacheMemory"+getAmountCacheMemory()+
		"\n"+"getNumProcessors"+getNumProcessors()+
		"\n"+"getAmountRAMmemory"+getAmountRAMmemory()+
		"\n"+"getDiscQuantity"+getDiscQuantity()+
		"\n"+"getDisksCapacity"+getDisksCapacity()+
		"\n"+"getProcessor"+getProcessor()
		+"--------------------------------------------------------------"+"\n";
	}*/
	
}