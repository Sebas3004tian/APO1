package model;


/**
* It is the main class of the model 
*/
public class BlackSnail {
	

	private int nit;
	private String address;
	private String website;
	
	private Subscriber [] subscribers;
	private int Subscriber []=new int [50];

	
	private Product [] products;
	private int Product []=new int [85];

	
	/**
    * This is the constructor method of the Blacksnail class
   
    * @param nit int
	* @param address String
	* @param website String

    */
	public BlackSnail(int nit, String address, String website) {
		this.nit = nit;
		this.address = address;
		this.website = website;
		subscribers=new Subscriber[50];
		products=new Product[85];
		
		
	}
	public int getNit() {
		return nit;
	}

	public void setNit(int nit) {
		this.nit = nit;
	}
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
	/**
    * This method validates if the ID entered by the user is already registered
   
    * @param id int
    * @return out boolean
    */
	public boolean verifyID(int id){
		boolean out=false;
		for(int x=0;x<50;x++){
			if(subscribers[x]!=null){
				if(id==subscribers[x].getID()){
					return true;
				}
			}
			
		}
		return out;
		
		
	}
	/**
    * This method does not belong to exercise, but it works to display all the stored information of the movie type products.
    * @return films String, It is a chain of all the information of all the stored movies.
    */
	public String showMovie(){
		String films="";
		for(int x=0;x<85;x++){
			if(products[x]!=null){
				if(products[x] instanceof Movie){
					films="\n"+products[x].toString()+"\n";
				}
			}
			
		}
		return films;
	}
	/**
    * This method does not belong to exercise, but it works to display all the stored information of the Series type products.
    * @return series String, It is a chain of all the information of all the stored series.
    */
	public String showSeries(){
		String series="";
		for(int x=0;x<85;x++){
			if(products[x]!=null){
				if(products[x] instanceof Serie){
					series="\n"+products[x].toString()+"\n";
				}
			}
			
		}
		return series;
	}
	/**
    *This method is in charge of validating if there is space to register more products 
    * @return thereIsNot boolean,If true it means that there is no space to record more.
    */
	public boolean SpaceForMoreProducts(){
		boolean thereIsNot=false;
		int position=-1;
		for(int x=0;x<85;x++){
			if(x==84){
				if(products[84]!=null){
					thereIsNot=true;
				}
			}
			if(products[x]==null){
				position=x;
				x=85;
			}
			
			
		}
		if(position==-1){
			thereIsNot=true;
		}
		return thereIsNot;
		
		
	}
	/**
    * This method is in charge of creating a String chain where it stores the information of all the series with its last season.
    * @return listseries String, String string with all the information to print
    */
	public String listSerie(){
		String listseries="";
		int accountant=1;
		for(int x=0;x<85;x++){
			if(products[x]!=null){
				if(products[x] instanceof Serie){
					listseries=listseries+"\n"+"............................................................................................."+"\n"+((Serie)products[x]).seriesLastSeason();
				}
			}
		}
		return listseries;
	}
	/**
    * This method, according to the selected category, creates a chain of Strings where it stores a list of all the movies of that chosen category.
    * @param category int
    * @return listMovies String, chain with all the information of the movies of that selected category
    */
	public String listMoviesCategory(int category){
		int accountant=1;
		String listMovies="";
		String typeCategory="";
		Category categoryList=Category.ROMANTIC;
		
		if(category==1){
			categoryList=Category.ROMANTIC;
			typeCategory="ROMANTIC";
		}
		if(category==2){
			
			categoryList=Category.ACTION;
			typeCategory="ACTION";
		}
		if(category==3){
			
			categoryList=Category.SUSPENSE;
			typeCategory="SUSPENSE";
		}
		if(category==4){
			
			categoryList=Category.TERROR;
			typeCategory="TERROR";
		}
		if(category==5){
			
			categoryList=Category.COMEDY;
			typeCategory="COMEDY";
		}
		listMovies="\n"+"TYPE MOVIES LIST "+typeCategory+" : "+"\n";
		for(int x=0;x<85;x++){
			if(products[x]!=null){
				if(products[x] instanceof Movie){
					
					if(((Movie)products[x]).getGenero()==categoryList){
						listMovies=listMovies+"\n";
						listMovies=listMovies+"("+accountant+"). ";
						listMovies=listMovies+products[x].getProductName();
						listMovies=listMovies+"\n";
						accountant++;
					}
				}
			}
			
		}
	
		return listMovies;
	}
	/**
    * This method is responsible for creating another season for an already created series, and for this it calls a method of the Series subclass.
    * @param seriesName String
	* @param numScheduledEpi int
	* @param numEpiPub int
	* @param day int
	* @param month int
	* @param year int
	* @param trailer String
    */
	public void createOtherSeason(String seriesName,int numScheduledEpi,int numEpiPub,int day,int month,int year,String trailer){
	String synopsis;
	String nameDirector;
		for(int x=0;x<85;x++){
			if(products[x]!=null){
				if(products[x] instanceof Serie){
					
					if(products[x].getProductName().equals(seriesName)){
						((Serie)products[x]).addSeason(numScheduledEpi,numEpiPub,day,month,year,trailer);
					}
				}
			}
			
		}
		
	}
	/**
    * This method is in charge of checking if the name of the series that the user entered if it is registered
    * @param seriesName String
    * @return registered boolean,If it is true it means that if it is registered
    */
	public boolean validateSeriesName(String seriesName){
		boolean registered=false;
		for(int x=0;x<85;x++){
			if(products[x]!=null){
				if(products[x] instanceof Serie){
					
					if(products[x].getProductName().equals(seriesName)){
						registered=true;
					}
				}
			}
			
		}
		
		
		return registered;
	}
	/**
    * This method is in charge of validating if the name to be registered for a product is already registered.
    * @param productName String
    * @return registered boolean,If it is true it means that if it is registered
    */
	public boolean validateProductName(String productName){
		boolean registered=false;
		for(int x=0;x<85;x++){
			if(products[x]!=null){
				if(products[x] instanceof Movie){
					
					if(products[x].getProductName().equals(productName)){
						registered=true;
					}
				}
				if(products[x] instanceof Serie){
					
					if(products[x].getProductName().equals(productName)){
						registered=true;
					}
				}
			}
			
		}
		
		
		return registered;
	}
	/**
    * This method searches for the product with the name that the user enters
    * @param productName String
    * @return productInformation String,It depends on whether you find (product information) or not the product (product message not found).
    */
	public String searchProduct(String productName){
		String productInformation="";
		for(int x=0;x<85;x++){
			if(products[x]!=null){
				if(products[x] instanceof Movie){
					
					if(products[x].getProductName().equals(productName)){
						productInformation=products[x].toString();
					}
				}
				if(products[x] instanceof Serie){
					
					if(products[x].getProductName().equals(productName)){
						productInformation=products[x].toString();
					}
				}
			}
			
		}
		if(productInformation.equals("")){
			
			productInformation="The product you are looking for is probably not registered (or check if you spelled the name correctly)";
		}
		return productInformation;
		
	}
	
	
	
	/**
    * This method is responsible for creating the objects depending on the type of product that the user chose
	* @param productType int
	* @param nameDirector String
	* @param synopsis String
	* @param day int
	* @param month int
	* @param year int
	* @param productName String
	* @param producer String
	* @param minimumAge int
	* @param category int
	* @param trailer String
	* @param allProtagonists String
	* @param censored int
	* @param reason String
	* @param numScheduledEpi int
	* @param numEpiPub int
    */
	public void addProduct(int productType,String nameDirector,String synopsis,int day,int month,int year,String productName,String producer,int minimumAge,int category,String trailer,String allProtagonists,int censored,String reason,int numScheduledEpi,int numEpiPub){
		if(productType==1){
			for(int x=0;x<85;x++){
				if(products[x]==null){
					products[x] = new Movie(nameDirector,producer,synopsis,day, month, year,productName,minimumAge,trailer,category);
					x=85;
				}
			}
		}
		if(productType==2){
			for(int x=0;x<85;x++){
				if(products[x]==null){
					products[x] = new Serie(productName,nameDirector, synopsis,allProtagonists, censored,reason, day, month, year,numScheduledEpi,numEpiPub,trailer);
					x=85;
				}
			}
		}
		
		
	}
	/**
    *This method is in charge of validating if there is space to register more subscribers
  
    * @return thereIsNot boolean,If true, it means that there is no space to register more subscribers, that is, the limit has already been reached.
    */
	public boolean SpaceForMoreSubscribers(){
		boolean thereIsNot=false;
		int position=-1;
		for(int x=0;x<50;x++){
			if(x==49){
				if(subscribers[49]!=null){
					thereIsNot=true;
				}
			}
			if(subscribers[x]==null){
				position=x;
				x=50;
			}
			
			
		}
		if(position==-1){
			thereIsNot=true;
		}
		return thereIsNot;
		
	}
	
	/**
    * This method shows all the information of all subscribers
    * @return allSuscriptorRegistered String,chain of all subscribers
    */
	public String AllSuscriptor(){
		String allSuscriptorRegistered="";

		for(int x=0; x<50; x++ ){

			if(subscribers[x]!=null){
				allSuscriptorRegistered+="SUSCRIPTOR "+(x+1)+ " \n";
				allSuscriptorRegistered+=subscribers[x].toString();
				allSuscriptorRegistered+="\n";
			}
			
		}
		
		return allSuscriptorRegistered;
	}
	/**
    *This method is responsible for saving the information in the subscriber object, it also adds the enumerations
   
    * @param id int
	* @param fullName String
	* @param age int
	* @param hoursWillingConsume int
	* @param clientType int,can be from 1 to 4
    
    */
	public void addSubscriber(int id,String fullName,int age,int hoursWillingConsume,int clientType){
		boolean saved=false;
		int savedPosition=-1;
		

		for(int x=0;x<50;x++){
			if(subscribers[x]==null){
				
				subscribers[x] = new Subscriber(id, fullName, age, hoursWillingConsume);
				if(clientType==1){
					subscribers[x].setType(CustomerType.NORMAL);
				}
				if(clientType==2){
					subscribers[x].setType(CustomerType.PLATINUM);
				}
				if(clientType==3){
					subscribers[x].setType(CustomerType.GOLD);
				}
				if(clientType==4){
					subscribers[x].setType(CustomerType.DIAMOND);
				}
				subscribers[x].setStatus(Status.ACTIVE);
				saved=true;
			}
			if(saved){
				
				savedPosition=x;
				x=50;
			}
			
			
		}
		
		

	}
	/**
    * This method is in charge of validating if the subscriber to be deactivated already exists

    * @param numberDisable int
    * @return yesExists boolean, if true it means that this subscriber is registered
    */
	public boolean numDeactivateExists(int numberDisable){
		boolean yesExists=false;
		if(subscribers[numberDisable-1]!=null){
			yesExists=true;
		}

		return yesExists;
	}
	/**
    * This method is responsible for deactivating the selected subscriber
  
    * @param numberDisable int
   
    */
	public void disableSubscriberNumber(int numberDisable){
		subscribers[numberDisable-1].setStatus(Status.INACTIVE);
		subscribers[numberDisable-1].setType(CustomerType.NORMAL);
	}
	/**
    * This method is responsible for validating that the id entered to disable a subscriber, is already registered
   
    * @param idForDisable int
    * @return yesExistsboolean, If true, it means that the id is registered and can be disabled
    */
	public boolean idDeactivateExists(int idForDisable){
		boolean yesExists=false;
		int positionSubscriberDeactivate=-1;
		for(int x=0;x<50;x++){
			if(subscribers[x]!=null){
				if(idForDisable==subscribers[x].getID()){
					positionSubscriberDeactivate=x;
				}
			}
			
		}
		if(positionSubscriberDeactivate!=-1){
			yesExists=true;
		}
		return yesExists;
	}
	/**
    * This method is responsible for deactivating the subscriber, and modifying their information
   
    * @param idForDisable int
   
    */
	public void deactivateSubscriber(int idForDisable){
		
		int positionSubscriberDeactivate=-1;
		for(int x=0;x<50;x++){
			if(subscribers[x]!=null){
				if(idForDisable==subscribers[x].getID()){
					positionSubscriberDeactivate=x;
				}
			}
			
		}
		if(positionSubscriberDeactivate!=-1){
			subscribers[positionSubscriberDeactivate].setStatus(Status.INACTIVE);
			subscribers[positionSubscriberDeactivate].setType(CustomerType.NORMAL);
			
		}
	}
	/**
    * this method adds each registered subscriber of type ACTIVE to have a total
   
    * @return infoTOTALAct String,Chain with the total sum of ACTIVE subscribers
    */
	public String infoTOTALAct(){
		
		int numActiveSubscribers=0;
		for(int x=0;x<50;x++){
			if(subscribers[x]!=null){
				if(subscribers[x].getStatus()==Status.ACTIVE){
					numActiveSubscribers+=1;
				}
			}
			
		}
		return "-The total number of active subscribers is:  "+numActiveSubscribers+"\n";
	}
	/**
    * this method takes the sum of all registered subscribers who have a NORMAL account type
   
    * @return infoNORMAL String,string of total sum of subscribers of type NORMAL
    */
	public String infoNORMAL(){
		
		int ActiveNORMAL=0;
		for(int x=0;x<50;x++){
			if(subscribers[x]!=null){
				if(subscribers[x].getStatus()==Status.ACTIVE){
					if(subscribers[x].getType()==CustomerType.NORMAL){
						ActiveNORMAL+=1;
					}
				}
			}
			
		}
		return "-The number of active and NORMAL subscribers: "+ActiveNORMAL+"\n";
	}
	/**
    * this method takes the sum of all registered subscribers who have a PLATINUM account type
   
    * @return infoPLATINUM String,string of total sum of subscribers of type PLATINUM
    */
	public String infoPLATINUM(){
		
		int ActivePLATINUM=0;
		for(int x=0;x<50;x++){
			if(subscribers[x]!=null){
				if(subscribers[x].getStatus()==Status.ACTIVE){
					if(subscribers[x].getType()==CustomerType.PLATINUM){
						ActivePLATINUM+=1;
					}
				}
			}
			
		}
		return "-The number of active and PLATINUM subscribers:"+ActivePLATINUM+"\n";
	}
	/**
    * this method takes the sum of all registered subscribers who have a GOLD account type
   
    * @return infoGOLD String,string of total sum of subscribers of type GOLD
    */
	public String infoGOLD(){
		
		int ActiveGOLD=0;
		for(int x=0;x<50;x++){
			if(subscribers[x]!=null){
				if(subscribers[x].getStatus()==Status.ACTIVE){
					if(subscribers[x].getType()==CustomerType.GOLD){
						ActiveGOLD+=1;
					}
				}
			}
			
		}
		return "-The number of active and GOLD subscribers:"+ActiveGOLD+"\n";
	}
	/**
    * this method takes the sum of all registered subscribers who have a DIAMOND account type
   
    * @return ActiveDIAMOND String,string of total sum of subscribers of type DIAMOND
    */
	public String infoDIAMOND(){
		
		int ActiveDIAMOND=0;
		for(int x=0;x<50;x++){
			if(subscribers[x]!=null){
				if(subscribers[x].getStatus()==Status.ACTIVE){
					if(subscribers[x].getType()==CustomerType.DIAMOND){
						ActiveDIAMOND+=1;
					}
				}
			}
			
		}
		return "-The number of active and DIAMOND subscribers:"+ActiveDIAMOND+"\n";
	}
	/**
    * This method is responsible for finding and returning in a chain to the underage subscriber with the longest hours willing to consume

    * @return subscriberMayorWillConsume String
    */
	public String subscriberMayorWillConsume(){
		
		int numSubscriber=0;
		int biggerNumber=0;
		for(int x=0;x<50;x++){
			if(subscribers[x]!=null){
				if(subscribers[x].getAge()<18){
					if(subscribers[x].getStatus()==Status.ACTIVE){
						if(subscribers[x].getHoursWillingConsume()>biggerNumber){ 
							biggerNumber = subscribers[x].getHoursWillingConsume();
							numSubscriber=x;
						}
					}
				}
			}
		}
		return"The youngest subscriber of age who has the highest number of hours willing to consume is:"+subscribers[numSubscriber].toString();
		
	}
	

}