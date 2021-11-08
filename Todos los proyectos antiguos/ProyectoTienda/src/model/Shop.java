package model;

public class Shop{
	private String owner;
	private double totalSales;
	
	
	private Product product1;
	private Product product2;
	private Product product3;
	
	public Shop(String pOwner){
		owner=pOwner;
		totalSales=0;
		
	}
	public String getOwner(){
		return owner;
		
	}
	public void setOwner(String pOwner){
		owner=pOwner;
		
	}
	public double getTotalSales(){
		return totalSales;
		
	}
	public void setTotalSales(double pTotalSales){
		totalSales=pTotalSales;
		
	}	
	public Product getProduct1(){
		return product1;
		
	}
	public void setProduct1(Product pProduct1){
		product1=pProduct1;
		
	}	
	public Product getProduct2(){
		return product2;
		
	}
	public void setProduct2(Product pProduct2){
		product2=pProduct2;
		
	}	
	public Product getProduct3(){
		return product3;
		
	}
	public void setProduct3(Product pProduct3){
		product3=pProduct3;
		
	}
	public String toString(){
		double totalMoney=((product1.getPrice()*product1.getNumProductsSold())+(product2.getPrice()*product2.getNumProductsSold())+(product3.getPrice()*product3.getNumProductsSold()));
		totalSales=((product1.getNumProductsSold())+(product2.getNumProductsSold())+(product3.getNumProductsSold()));
		
		return "**** Datos de la tienda ****"+
		"\n"+"nombre del dueño: "+owner+
		"\n"+"cantidad de dinero en caja: "+totalMoney+
		"\n"+"cantidad de productos vendidos: "+totalSales;
		
	}
}