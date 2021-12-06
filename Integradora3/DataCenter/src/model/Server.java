package model;
/**
* this is the Server class
*/
public class Server {
	
	private double amountCacheMemory;
	private int numberProcessors;
	private double amountRAMmemory;
	private int discQuantity;
	private double disksCapacity;
	
	private Mark processor;

	/**
    * this method is the constructor of the class
    
    * @param amountCacheMemory double
	* @param numberProcessors int
	* @param amountRAMmemory double
	* @param discQuantity int
	* @param disksCapacity double
    */
	public Server(double amountCacheMemory,int numberProcessors,double amountRAMmemory,int discQuantity,double disksCapacity) {
		this.amountCacheMemory = amountCacheMemory;
		this.numberProcessors = numberProcessors;
		this.amountRAMmemory = amountRAMmemory;
		this.discQuantity = discQuantity;
		this.disksCapacity = disksCapacity;
		
		
	}
	/**
    * A get method
    * @return amountCacheMemory double
    */
	public double getAmountCacheMemory() {
		return amountCacheMemory;
	}
	/**
    * A set method
    * @param amountCacheMemory double
    */
	public void setAmountCacheMemory(double amountCacheMemory) {
		this.amountCacheMemory = amountCacheMemory;
	}
	/**
    * A get method
    * @return numberProcessors int
    */
	public int getNumberProcessors() {
		return numberProcessors;
	}
	/**
    * A set method
    * @param numberProcessors int
    */
	public void setNumProcesadores(int numberProcessors) {
		this.numberProcessors = numberProcessors;
	}
	/**
    * A get method
    * @return amountRAMmemory double
    */
	public double getAmountRAMmemory() {
		return amountRAMmemory;
	}
	/**
    * A set method
    * @param amountRAMmemory double
    */
	public void setAmountRAMmemory(double amountRAMmemory) {
		this.amountRAMmemory = amountRAMmemory;
	}
	/**
    * A get method
    * @return discQuantity int
    */
	public int getDiscQuantity() {
		return discQuantity;
	}
	/**
    * A set method
    * @param discQuantity int
    */
	public void setDiscQuantity(int discQuantity) {
		this.discQuantity = discQuantity;
	}
	/**
    * A get method
    * @return disksCapacity double
    */
	public double getDisksCapacity() {
		return disksCapacity;
	}
	/**
    * A set method
    * @param disksCapacity double
    */
	public void setDisksCapacity(double disksCapacity) {
		this.disksCapacity = disksCapacity;
	}
	/**
    * A get method
    * @return processor Mark
    */
	public Mark getProcessor() {
		return processor;
	}
	/**
    * A set method
    * @param processor Mark
    */
	public void setProcessor(Mark processor) {
		this.processor = processor;
	}
	/*
	public String toString(){
		return  "\n"+"**** Server data****"+
		"\n"+"--------------------------------------------------------------"+
		"\n"+"getAmountCacheMemory"+getAmountCacheMemory()+
		"\n"+"numberProcessors"+numberProcessors()+
		"\n"+"getAmountRAMmemory"+getAmountRAMmemory()+
		"\n"+"getDiscQuantity"+getDiscQuantity()+
		"\n"+"getDisksCapacity"+getDisksCapacity()+
		"\n"+"getProcessor"+getProcessor()
		+"--------------------------------------------------------------"+"\n";
	}*/
	
}