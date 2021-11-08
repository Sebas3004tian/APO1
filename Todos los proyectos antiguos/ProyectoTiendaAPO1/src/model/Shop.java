package model;

public class Shop{
	private String owner;
	private double totalSales;
	
	private Product [] products;
	
	private int productsAmount;
	private int totalProductSold; 

	/**
    * Descripción:Metodo constructor de la class Shop</br>
	* @param owner String
	* @param productsAmount int
   
    */
	public Shop(String owner,int productsAmount){
		
		this.owner=owner;
		this.productsAmount=productsAmount;
		totalSales=0;
		products=new Product[this.productsAmount];
		
	}
	/**
    * Descripción:Metodo get de la variable owner</br>
	* @return getOwner String, retorna el valor de owner
    */
	public String getOwner(){
		return owner;
		
	}
	/**
    * Descripción:Metodo set de la variable owner</br>
	* @param owner String
    */
	public void setOwner(String owner){
		this.owner=owner;
		
	}
	/**
    * Descripción:Metodo get de la variable totalSales</br>
	* @return totalSales double, retorna el valor de totalSales
    */
	public double getTotalSales(){
		return totalSales;
		
	}
	/**
    * Descripción:Metodo set de la variable totalSales</br>
	* @param totalSales double
    */
	public void setTotalSales(double totalSales){
		this.totalSales=totalSales;
		
	}	
	/**
    * Descripción:Este metodo se encarga de agrupar en una cadena toda la informacion de los productos registrados</br>
    * <b> pre:</b> Se utilizo la variable productsAmount para finalizar el ciclo for. </br>
    * @return allProductsRegistered String,Es una cadena que se utiliza para imprimir la informacion de todos los productos que se registraron
    */
	public String AllProducts(){
		String allProductsRegistered="";

		for(int x=0; x<productsAmount; x++ ){

			if(products[x]!=null){
				allProductsRegistered+="Producto "+(x+1)+ " \n";
				allProductsRegistered+=products[x].toString();
				allProductsRegistered+="\n";
			}
			
		}
		
		return allProductsRegistered;
	}
	
	
	/**
    * Descripción:Este metodo añade la informacion de un producto en products[selectProduct-1] siendo selectProduct el numero de registro  </br>
    * @param selectProduct int
	* @param name String
	* @param numProductsForSale int
	* @param price double
    */
	public void addProduct(int selectProduct,String name,int numProductsForSale,double price){
		
		products[selectProduct-1] = new Product(name, numProductsForSale, price);
	}
	/**
    * Descripción:Metodo encargado de verificar si el numero de registro del producto ya se encuentra registrado con otro producto</br>
    * @param selectProduct int
    * @return products[selectProduct-1]!=null boolean, condicion de si el arreglo en posicion selectProduct-1 es distinto a null osea si ya esta registrado
    */
	public boolean verifyProduct(int selectProduct){
		return products[selectProduct-1]!=null;
	
	}
	/**
    * Descripción:Metodo encargado de verificar si el producto que se quiere vender ya esta registrado</br>
    * @param registeredNumberToSell int
    * @return out boolean, variable encargada de si se cumple o no la condicion
    */
	public boolean verifyProductToSell(int registeredNumberToSell){
		boolean out=false;
		if (products[registeredNumberToSell-1]==null || registeredNumberToSell<=0 || registeredNumberToSell>productsAmount){
			out=true;
		}
		return out;
		
	}
	/**
    * Descripción:Metodo encargado de verificar si las unidades del producto que se quiere vender son mayores a 0 y menores o iguales al numero de unidades disponibles en el inventario</br>
    * @param registeredNumberToSell int
	* @param amountProductToSell int
    * @return out boolean, variable encargada de si se cumple o no la condicion
    */
	public boolean verifyAmountToSell(int registeredNumberToSell,int amountProductToSell){
		boolean out=false;
		int totalInvent=0;
		if(amountProductToSell<=0 || amountProductToSell>(products[registeredNumberToSell-1].getNumProductsForSale()-products[registeredNumberToSell-1].getNumProductsSold())){
			out=true;
		}
		return out;
	}
	/**
    * Descripción:Metodo que se encarga de realizar operaciones y modificar el valor de numero de productos vendidos del producto,numero total de productos vendidos en la tienda, y cantidad de dinero en caja o dinero total de ventas</br>
    
    * <b> pos:</b> Se modifica el valor de las variables globales totalSales y totalProductSold.
	
    * @param registeredNumberToSell int
	* @param amountProductToSell int
    * @return totalProductSold int,se modifica el valor de la variable global 
    */
	public double sellProduct(int registeredNumberToSell,int amountProductToSell){
		
		products[registeredNumberToSell-1].setNumProductsSold(products[registeredNumberToSell-1].getNumProductsSold()+amountProductToSell);
		
		totalProductSold+=amountProductToSell;
		totalSales+=products[registeredNumberToSell-1].getPrice()*amountProductToSell;
		return totalProductSold;
	}
	/**
    * Descripción:Metodo encargado de verificar la disponibilidad de un porducto</br>
    * @param registeredNumberToSell int
    * @return out boolean, variable encargada de si se cumple o no la condicion
    */
	public boolean verifyDisponibilidad(int registeredNumberToSell){
		boolean out=false;
		if (products[registeredNumberToSell-1].getNumProductsForSale()==0){
			out=true;
		}
		return out;
	}
	/**
    * Descripción:Metodo encargado de retornar las unidades disponibles del producto que el usuario selecciono</br>
	* @param registeredNumberToSell int
    * @return disponible int,retorna las unidades disponibles.
    */
	public int disponibilidad(int registeredNumberToSell){
		int disponible=products[registeredNumberToSell-1].getNumProductsForSale()-products[registeredNumberToSell-1].getNumProductsSold();

		return disponible;
	}
	/**
    * Descripción:Metodo encargado de retornar el total de dinero en caja</br>
    * @return totalSales double,retorna la variable global de total de dinero en caja actualmente.
    */
	public double dineroCaja(){
		
		return totalSales;
		
	}
	/**
    * Descripción:Metodo to String de la clase</br>
    */
	public String toString(){

		return "\n"+"**** Datos de la tienda ****"+
		"\n"+"nombre del dueño: "+owner+
		"\n"+"cantidad de dinero en caja: "+totalSales+"$ pesos."+
		"\n"+"cantidad de productos vendidos: "+ totalProductSold+"\n"
		+"--------------------------------------------------------------"+"\n";
		
	}
}