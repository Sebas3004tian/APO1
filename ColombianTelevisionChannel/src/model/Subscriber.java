package model;



/**
* It is the class that has the subscriber object 
*/
public class Subscriber {
	

	private int id;
	private String fullName;
	private int age;
	private int hoursWillingConsume;
	

	private CustomerType type;
	private Status states;
	/**
    * This is the constructor method of the Subscriber class
   
    * @param id int
	* @param fullName String
	* @param age int
	* @param hoursWillingConsume int
    */
	public Subscriber(int id, String fullName, int age, int hoursWillingConsume) {
		this.id = id;
		this.fullName = fullName;
		this.age = age;
		this.hoursWillingConsume = hoursWillingConsume;
		this.type=type;
		this.states=states;
		
		
		
	}
	
	public int getID(){
		return id;
		
	}
	public void setID(int id){
		this.id=id;
		
	}
	public String getFullName(){
		return fullName;
		
	}
	public void setFullName(String fullName){
		this.fullName=fullName;
		
	}
	public int getAge(){
		return age;
		
	}
	public void setAge(int age){
		this.age=age;
		
	}
	public int getHoursWillingConsume(){
		return hoursWillingConsume;
		
	}
	public void setHoursWillingConsume(int hoursWillingConsume){
		this.hoursWillingConsume=hoursWillingConsume;
		
	}
	public CustomerType getType(){
		return type;
		
	}
	public void setType(CustomerType type){
		this.type=type;
		
	}
	public Status getStatus(){
		return states;
		
	}
	public void setStatus(Status states){
		this.states=states;
		
	}
	/**
    * This method is the toString method of the class and stores the information of each subscriber object individually.

    * @return toString String, this return is a string with the subscriber's information
    */
	public String toString(){
	
		
		return "\n"+"**** Subscriber data****"+
		"\n"+"------------------------------"+
		"\n"+"La id del suscriptor es "+id+
		"\n"+"The subscriber id is "+fullName+
		"\n"+"The subscriber's age is "+age+
		"\n"+"The hours willing to consume are "+hoursWillingConsume+" hours "+
		"\n"+"State is "+states+
		"\n"+"The type of client is "+type+"\n"
		+"--------------------------------------------------------------"+"\n";

	}
}