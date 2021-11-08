package model;

public class BlackSnail {
	

	private int nit;
	private String address;
	private String website;
	
	private Subscriber [] subscribers;
	private int Subscriber []=new int [50];
	
	/*private Product product1;
	private Product product2;
	private Product product3;
	private Product product4;
	private Product product5;*/
	
	private Product [] products;
	private int Product []=new int [85];

	
	/**
    * This is the constructor method of the Blacksnail class</br>
   
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
	/*public Product getProduct1() {
		return product1;
	}

	public void setProduct1(Product product1) {
		this.product1 = product1;
	}

	public Product getProduct2() {
		return product2;
	}

	public void setProduct2(Product product2) {
		this.product2 = product2;
	}

	public Product getProduct3() {
		return product3;
	}

	public void setProduct3(Product product3) {
		this.product3 = product3;
	}
	public Product getProduct4() {
		return product4;
	}

	public void setProduct4(Product product4) {
		this.product4 = product4;
	}

	public Product getProduct5() {
		return product5;
	}

	public void setProduct5(Product product5) {
		this.product5 = product5;
	}*/
	
	
	
	
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
    * This method validates if the ID entered by the user is already registered</br>
   
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
	//------------------------------------------------------------------------------------------------SEGUIMIENTO12---------------------------------------
	public String mostrarMovie(){
		String peliculas="";
		for(int x=0;x<85;x++){
			if(products[x]!=null){
				if(products[x] instanceof Movie){
					peliculas="\n"+products[x].toString()+"\n";
				}
			}
			
		}
		return peliculas;
	}
	public String mostrarSerie(){
		String series="";
		for(int x=0;x<85;x++){
			if(products[x]!=null){
				if(products[x] instanceof Serie){
					series="\n"+products[x].toString()+"\n";
					//series="\n"+products[x].todasTemporadas()+"\n";
				}
			}
			
		}
		return series;
	}
	public boolean SpaceForMoreProducts(){
		/*boolean thereIsNot=false;
		for(int x=0;x<85;x++){
			if(products[x]!=null){
				thereIsNot=true;
			}
		}
		return thereIsNot;*/
		
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
	
	public String listarSerie(){
		String listaSeries="";
		int contador=1;
		for(int x=0;x<85;x++){
			if(products[x]!=null){
				if(products[x] instanceof Serie){
					listaSeries=listaSeries+"\n"+"............................................................................................."+"\n"+((Serie)products[x]).serieUltimaTemporada();
				}
			}
		}
		return listaSeries;
	}
	public String listarPeliculasCategoria(int categoria){
		int contador=1;
		String listadoPeliculas="";
		String tipoCategoria="";
		Category categoriaLista=Category.ROMANTICA;
		
		if(categoria==1){
			categoriaLista=Category.ROMANTICA;
			tipoCategoria="ROMANTICA";
		}
		if(categoria==2){
			
			categoriaLista=Category.ACCION;
			tipoCategoria="ACCION";
		}
		if(categoria==3){
			
			categoriaLista=Category.SUSPENSO;
			tipoCategoria="SUSPENSO";
		}
		if(categoria==4){
			
			categoriaLista=Category.TERROR;
			tipoCategoria="TERROR";
		}
		if(categoria==5){
			
			categoriaLista=Category.COMEDIA;
			tipoCategoria="COMEDIA";
		}
		listadoPeliculas="\n"+"LISTA PELICULAS TIPO "+tipoCategoria+" : "+"\n";
		for(int x=0;x<85;x++){
			if(products[x]!=null){
				if(products[x] instanceof Movie){
					
					if(((Movie)products[x]).getGenero()==categoriaLista){
						listadoPeliculas=listadoPeliculas+"\n";
						listadoPeliculas=listadoPeliculas+"("+contador+"). ";
						listadoPeliculas=listadoPeliculas+products[x].getNombreProducto();
						listadoPeliculas=listadoPeliculas+"\n";
						contador++;
					}
				}
			}
			
		}
	
		return listadoPeliculas;
	}
	public void crearOtraTemporada(String nombreSerie,int cantEpiPro,int cantEpiPub,int dia,int mes,int ano,String trailer){
	String sinopsis;
	String nameDirector;
		for(int x=0;x<85;x++){
			if(products[x]!=null){
				if(products[x] instanceof Serie){
					
					if(products[x].getNombreProducto().equals(nombreSerie)){
						/*nameDirector=products[x].getNameDirector();
						sinopsis=products[x].getSinopsis();*/
						((Serie)products[x]).addTemporada(cantEpiPro,cantEpiPub,dia,mes,ano,trailer);
						//products[x]= new Serie(nombreSerie,nameDirector,sinopsis,cantEpiPro,cantEpiPub,dia,mes,ano,trailer);
					}
				}
			}
			
		}
		
	}
	public boolean validarNombreSerie(String nombreSerie){
		boolean registrado=false;
		for(int x=0;x<85;x++){
			if(products[x]!=null){
				if(products[x] instanceof Serie){
					
					if(products[x].getNombreProducto().equals(nombreSerie)){
						registrado=true;
					}
				}
			}
			
		}
		
		
		return registrado;
	}
	public boolean validarNombreProducto(String nombreProducto){
		boolean registrado=false;
		for(int x=0;x<85;x++){
			if(products[x]!=null){
				if(products[x] instanceof Movie){
					
					if(products[x].getNombreProducto().equals(nombreProducto)){
						registrado=true;
					}
				}
				if(products[x] instanceof Serie){
					
					if(products[x].getNombreProducto().equals(nombreProducto)){
						registrado=true;
					}
				}
			}
			
		}
		
		
		return registrado;
	}
	
	public String buscarProducto(String nombreProducto){
		String informacionProducto="";
		for(int x=0;x<85;x++){
			if(products[x]!=null){
				if(products[x] instanceof Movie){
					
					if(products[x].getNombreProducto().equals(nombreProducto)){
						informacionProducto=products[x].toString();
					}
				}
				if(products[x] instanceof Serie){
					
					if(products[x].getNombreProducto().equals(nombreProducto)){
						informacionProducto=products[x].toString();
					}
				}
			}
			
		}
		if(informacionProducto.equals("")){
			
			informacionProducto="El producto que esta buscando probablemente no se ecuentra registrado(o verifique si escribio bien el nombre)";
		}
		return informacionProducto;
		
	}
	
	
	
	//public void addProduct(int tipoProducto,String nameDirector,String sinopsis,int dia,int mes,int ano,String tituloOriginal,String productora,int edadMinima,int categoria,String trailer,String todosProtagonistas,int censurada,String motivo,int numTemporadasSerie,int numTemporada,int cantEpiPro,int cantEpiPub,int [] cantEpiProgramados){
	//public void addProduct(int tipoProducto,String nameDirector,String sinopsis,int dia,int mes,int ano,String nombreProducto,String productora,int edadMinima,int categoria,String trailer,String todosProtagonistas,int censurada,String motivo,int numTemporadasSerie,int numTemporada,int cantEpiPro,int cantEpiPub,int [] cantEpiProgramados,int [] cantEpiPublicados,int [] diaArray,int [] mesArray,int [] anoArray,String [] trailerArray){
	public void addProduct(int tipoProducto,String nameDirector,String sinopsis,int dia,int mes,int ano,String nombreProducto,String productora,int edadMinima,int categoria,String trailer,String todosProtagonistas,int censurada,String motivo,int cantEpiPro,int cantEpiPub){
		if(tipoProducto==1){
			for(int x=0;x<85;x++){
				if(products[x]==null){
					products[x] = new Movie(nameDirector,productora,sinopsis,dia, mes, ano,nombreProducto,edadMinima,trailer,categoria);
					/*if(products[x] instanceof Movie){
						if(categoria==1){
							products[x].setGenero(Category.ROMANTICA);
						}
						if(categoria==2){
							products[x].setGenero(Category.ACCION);
						}
						if(categoria==3){
							products[x].setGenero(Category.SUSPENSO);
						}
						if(categoria==4){
							products[x].setGenero(Category.TERROR);
						}
						if(categoria==5){
							products[x].setGenero(Category.COMEDIA);
						}
					}*/
					x=85;
				}
			}
		}
		if(tipoProducto==2){
			for(int x=0;x<85;x++){
				if(products[x]==null){
					products[x] = new Serie(nombreProducto,nameDirector, sinopsis,todosProtagonistas, censurada,motivo, dia, mes, ano,cantEpiPro,cantEpiPub,trailer);
					x=85;
				}
			}
		}
		
		
	}
	public void addSeason(int numTemporada,int cantEpiPro,int cantEpiPub,int dia,int mes,int ano,String trailer){
		
	}
	
	/*public void addProduct(int productType,String nameDirector, String productora, String sinopsis,int day,int month,int year,String tituloOriginal,int edadMinima,int categoria,String trailer,String sinopsis,String motivo){
		boolean saved=false;
		int savedPosition=-1;
		if(productType=2){
			if(product1==null){
				Product product1 = new Movie(nameDirector,productora,sinopsis,day, month, year,tituloOriginal,edadMinima,categoria,trailer);
				if(categoria==1){
					product1.setGenero(Category.ROMANTICA);
				}
				
			}else if(product2==null){
				Product product2 = new Movie(nameDirector,productora,sinopsis,day, month, year,tituloOriginal,edadMinima,categoria,trailer);
				
			}else if(product3==null){
				Product product3 = new Movie(nameDirector,productora,sinopsis,day, month, year,tituloOriginal,edadMinima,categoria,trailer);
				
			}else if(product4==null){
				Product product4 = new Movie(nameDirector,productora,sinopsis,day, month, year,tituloOriginal,edadMinima,categoria,trailer);
				
			}else if(product5==null){
				Product product5 = new Movie(nameDirector,productora,sinopsis,day, month, year,tituloOriginal,edadMinima,categoria,trailer);
				
			}
		}
		if(productType=1){
			if(product1==null){
				Product product1 = new Serie(nameDirector, sinopsis,nombresProtagonistas, censurada, day, month, year);
				if(categoria==1){
					product1.setGenero(Category.ROMANTICA);
				}
				
			}else if(product2==null){
				Product product2 = new Serie(nameDirector, sinopsis,nombresProtagonistas, censurada, day, month, year);
				
			}else if(product3==null){
				Product product3 = new Serie(nameDirector, sinopsis,nombresProtagonistas, censurada, day, month, year);
				
			}else if(product4==null){
				Product product4 = new Serie(nameDirector, sinopsis,nombresProtagonistas, censurada, day, month, year);
				
			}else if(product5==null){
				Product product5 = new Serie(nameDirector, sinopsis,nombresProtagonistas, censurada, day, month, year);
				
			}
		}*/
		/*for(int x=0;x<5;x++){
			if(movie[x]==null){
				
				movie[x] = new Movie(nameDirector,productora,sinopsis,day, month, year,tituloOriginal,edadMinima,categoria,trailer);
				if(categoria==1){
					movie[x].setGenero(Category.ROMANTICA);
				}
				if(categoria==2){
					movie[x].setGenero(Category.ACCION);
				}
				if(categoria==3){
					movie[x].setGenero(Category.SUSPENSO);
				}
				if(categoria==4){
					movie[x].setGenero(Category.TERROR);
				}
				if(categoria==4){
					movie[x].setGenero(Category.COMEDIA);
				}
				
				saved=true;
			}
			if(saved){
				
				savedPosition=x;
				x=5;
			}
			
			
		}
	}*/
	//---------------------------------------------------------------------------------------------------------------------------------------
	/**
    *This method is in charge of validating if there is space to register more subscribers</br>
  
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
	
	//Metodo para ver informacion---------------------------------------------------------------------------------------------------------------------
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
	//----------------------------------------------------------------------------------------------------------------------------------------------
	/**
    *This method is responsible for saving the information in the subscriber object, it also adds the enumerations</br>
   
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
    * This method is in charge of validating if the subscriber to be deactivated already exists</br>

    * @param numberDisable int
    * @returnyesExists boolean, if true it means that this subscriber is registered
    */
	public boolean numDeactivateExists(int numberDisable){
		boolean yesExists=false;
		if(subscribers[numberDisable-1]!=null){
			yesExists=true;
		}

		return yesExists;
	}
	/**
    * This method is responsible for deactivating the selected subscriber</br>
  
    * @param numberDisable int
   
    */
	public void disableSubscriberNumber(int numberDisable){
		subscribers[numberDisable-1].setStatus(Status.INACTIVE);
		subscribers[numberDisable-1].setType(CustomerType.NORMAL);
	}
	/**
    * This method is responsible for validating that the id entered to disable a subscriber, is already registered</br>
   
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
    * This method is responsible for deactivating the subscriber, and modifying their information</br>
   
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
    * this method adds each registered subscriber of type ACTIVE to have a total</br>
   
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
    * this method takes the sum of all registered subscribers who have a NORMAL account type</br>
   
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
    * this method takes the sum of all registered subscribers who have a PLATINUM account type</br>
   
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
    * this method takes the sum of all registered subscribers who have a GOLD account type</br>
   
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
    * this method takes the sum of all registered subscribers who have a DIAMOND account type</br>
   
    * @return 
		int ActiveDIAMOND String,string of total sum of subscribers of type DIAMOND
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
    * This method is responsible for finding and returning in a chain to the underage subscriber with the longest hours willing to consume</br>

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