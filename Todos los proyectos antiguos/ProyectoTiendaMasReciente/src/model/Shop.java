package model;

public class Shop{
	private String owner;
	private double totalSales;
	
	
	private Product product1;
	private Product product2;
	private Product product3;
	
	public Shop(String owner){
		this.owner=owner;
		totalSales=0;
		
	}
	
	public String getOwner(){
		return owner;
		
	}
	public void setOwner(String owner){
		this.owner=owner;
		
	}
	public double getTotalSales(){
		return totalSales;
		
	}
	public void setTotalSales(double totalSales){
		this.totalSales=totalSales;
		
	}	
	public Product getProduct1(){
		return product1;
		
	}
	public void setProduct1(Product product1){
		this.product1=product1;
		
	}	
	public Product getProduct2(){
		return product2;
		
	}
	public void setProduct2(Product product2){
		this.product2=product2;
		
	}	
	public Product getProduct3(){
		return product3;
		
	}
	public void setProduct3(Product product3){
		this.product3=product3;
		
	}
	
	public void addProduct(int selectProduct,String name,int numProductsForSale,double price){
		
		if(selectProduct==1){
			product1= new Product(name,numProductsForSale,price);
		}
		if(selectProduct==2){
			product2= new Product(name,numProductsForSale,price);
		}
		if(selectProduct==3){
			product3= new Product(name,numProductsForSale,price);
		}
	}
	public boolean verifyProduct(int selectProduct){
		boolean out=false;
		if(selectProduct==1){
			if(product1!=null){
				out=true;
			}
		}
		if(selectProduct==2){
			if(product2!=null){
				out=true;
			}
		}
		if(selectProduct==3){
			if(product3!=null){
				out=true;
			}
		}
		/*
		switch (selectProduct){
			case 1:
				out=product1!=null;
				out=true;
				break;
			case 2:
				out=product2!=null;
				out=true;
				break;
			case 3:
				out=product3!=null;
				out=true;
				break;
		}*/
		return out;
	}
	
	
	public String toString(){
		
		if(product1!=null){
			totalSales+=product1.getPrice()*product1.getNumProductsSold();
		}
		if(product2!=null){
			totalSales+=product2.getPrice()*product2.getNumProductsSold();
		}
		if(product3!=null){
			totalSales+=product3.getPrice()*product3.getNumProductsSold();
		}
		//totalSales=((product1.getPrice()*product1.getNumProductsSold())+(product2.getPrice()*product2.getNumProductsSold())+(product3.getPrice()*product3.getNumProductsSold()));
		
		int totalProductSold=0;
		if(product1!=null){
			totalProductSold+=product1.getNumProductsSold();
		}
		if(product2!=null){
			totalProductSold+=product2.getNumProductsSold();
		}
		if(product3!=null){
			totalProductSold+=product3.getNumProductsSold();
		}
		
		//int totalProductSold=((product1.getNumProductsSold())+(product2.getNumProductsSold())+(product3.getNumProductsSold()));
		
		return "\n"+"**** Datos de la tienda ****"+
		"\n"+"nombre del dueño: "+owner+
		"\n"+"cantidad de dinero en caja: "+totalSales+
		"\n"+"cantidad de productos vendidos: "+totalProductSold+"\n";
		
	}
}