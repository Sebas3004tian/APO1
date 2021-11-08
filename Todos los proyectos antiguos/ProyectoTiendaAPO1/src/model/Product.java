package model;

public class Product{
	
	private String name;
	private int numProductsForSale;
	private int numProductsSold;
	private double price;
	/**
    * Descripción:Metodo constructor de la class Product</br>
	* @param name String
	* @param numProductsForSale int
	* @param price double
	
    */
	public Product(String name,int numProductsForSale,double price){
		this.name=name;
		this.numProductsForSale=numProductsForSale;
		this.price=price;
		numProductsSold=0;
	}
	/**
    * Descripción:Metodo get de la variable name</br>
	* @return name String, retorna el valor de name
    */
	public String getName(){
		return name;
		
	}
	/**
    * Descripción:Metodo set de la variable name</br>
	* @param name String
    */
	public void setName(String name){
		this.name=name;
		
	}
	/**
    * Descripción:Metodo get de la variable price</br>
	* @return price double, retorna el valor de price
    */
	public double getPrice(){
		return price;
		
	}
	/**
    * Descripción:Metodo set de la variable price</br>
	* @param price double
    */
	public void setPrice(double price){
		this.price=price;
		
	}
	/**
    * Descripción:Metodo get de la variable numProductsForSale</br>
	* @return numProductsForSale int, retorna el valor de numProductsForSale
    */
	public int getNumProductsForSale(){
		return numProductsForSale;
		
	}
	/**
    * Descripción:Metodo set de la variable numProductsForSale</br>
	* @param numProductsForSale int
    */
	public void setNumProductsForSale(int numProductsForSale){
		this.numProductsForSale=numProductsForSale;
		
	}
	/**
    * Descripción:Metodo get de la variable numProductsSold</br>
	* @return numProductsSold int, retorna el valor de numProductsSold
    */
	public int getNumProductsSold(){
		return numProductsSold;
		
	}
	/**
    * Descripción:Metodo set de la variable numProductsSold</br>
	* @param numProductsSold int
    */
	public void setNumProductsSold(int numProductsSold){
		this.numProductsSold=numProductsSold;
		
	}
	/**
    * Descripción:Metodo encargado de tener el valor de inventario que tiene un producto)</br>
    * @param numProductsForSale int
	* @param numProductsSold int
    * @return totalInvent int, retorna el valor de totalInvent osea las unidades totales que quedan del producto
    */
	public int totalInvent(int numProductsForSale,int numProductsSold){
		int totalInvent;
		return totalInvent=numProductsForSale-numProductsSold;
	}

	/**
    * Descripción:Metodo to String de la clase</br>
    */
	public String toString(){
	
		
		return "\n"+"**** Datos del Producto ****"+
		"\n"+"nombre: "+name+
		"\n"+"cantidad de productos en el inventario: "+totalInvent(numProductsForSale,numProductsSold)+
		"\n"+"Precio por unidad: "+price+"$ pesos."+
		"\n"+"cantidad de productos vendidos: "+numProductsSold+"\n"
		+"--------------------------------------------------------------"+"\n";

	}
}