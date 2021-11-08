package model;

public class Product{
	
	private String name;
	private int numProductsForSale;
	private int numProductsSold;
	private double price;
	
	public Product(String name,int numProductsForSale,double price){
		this.name=name;
		this.numProductsForSale=numProductsForSale;
		this.price=price;
		numProductsSold=0;
	}
	public String getName(){
		return name;
		
	}
	public void setName(String name){
		this.name=name;
		
	}
	public double getPrice(){
		return price;
		
	}
	public void setPrice(double price){
		this.price=price;
		
	}
	public int getNumProductsForSale(){
		return numProductsForSale;
		
	}
	public void setNumProductsForSale(int numProductsForSale){
		this.numProductsForSale=numProductsForSale;
		
	}
	public int getNumProductsSold(){
		return numProductsSold;
		
	}
	public void setNumProductsSold(int numProductsSold){
		this.numProductsSold=numProductsSold;
		
	}
	public String toString(){
		int totalInvent=numProductsForSale-numProductsSold;
		
		return "\n"+"**** Datos del Producto ****"+
		"\n"+"nombre: "+name+
		"\n"+"cantidad de productos en el inventario: "+totalInvent+
		"\n"+"precio del producto: "+price+
		"\n"+"cantidad de productos vendidos: "+numProductsSold+"\n";

	}
}