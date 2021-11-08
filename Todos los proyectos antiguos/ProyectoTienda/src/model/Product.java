package model;

public class Product{
	
	private String name;
	private int numProductsForSale;
	private int numProductsSold;
	private double price;
	
	public Product(String pName,int pNumProductsForSale,double pPrice){
		name=pName;
		numProductsForSale=pNumProductsForSale;
		price=pPrice;
		numProductsSold=0;
	}
	public String getName(){
		return name;
		
	}
	public void setName(String pName){
		name=pName;
		
	}
	public double getPrice(){
		return price;
		
	}
	public void setPrice(double pPrice){
		price=pPrice;
		
	}
	public int getNumProductsForSale(){
		return numProductsForSale;
		
	}
	public void setNumProductsForSale(int pNumProductsForSale){
		numProductsForSale=pNumProductsForSale;
		
	}
	public int getNumProductsSold(){
		return numProductsSold;
		
	}
	public void setNumProductsSold(int pNumProductsSold){
		numProductsSold=pNumProductsSold;
		
	}
	public String toString(){
		int totalInvent=numProductsForSale-numProductsSold;
		
		return "**** Datos del Producto ****"+
		"\n"+"nombre: "+name+
		"\n"+"cantidad de productos en el inventario: "+totalInvent+
		"\n"+"precio del producto: "+price+
		"\n"+"cantidad de productos vendidos: "+numProductsSold;

	}
}