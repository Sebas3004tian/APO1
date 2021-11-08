package ui;

import java.util.Scanner;
import model.Product;
import model.Shop;



/**
 * Clase principal del proyecto candyShop.
 * Desarrollada para el 
 * @author angievig
 * @version 1.0
 * @since October 2021
 */
public class MainShop {
	int availableProduct1=0;
	int availableProduct2=0;
	int availableProduct3=0;
	
	/**
	 * store es la conexiOn con la clase Shop en el paquete model
	 */
	private Shop store;
	/**
	 * sc es el objeto que permite leer informaciOn digitada por el usuario
	 */
	private Scanner sc;
	
	/**
	 * Constructor de la clase, no recibe prametros.  
	 * El mEtodo inicializa el objeto lector 
	 */
	public MainShop() {
		sc= new Scanner(System.in);
	}
	

	public static void main (String[] a){
		// creando un objeto de la clase principal
		MainShop obPpal = new MainShop();
		obPpal.initShop();
		
		// variable para leer la entrada
		int option= 0;
		
		//ciclo para ejecutar el menu mientras que el usuario no
		// elija la opciOn para salir (0)
		do {
		    option =obPpal.showMenuAndGetOption();
		    obPpal.answerOption(option);
		}while (option !=0);


	}


	/**
	 * Metodo que se encarga de llamar a los mEtodos que resuelven cada uno de los 
	 * requerimientos de la aplicaciOn 
	 * @param userOption, int es el nUmero ingresado por el usuario (no ha sido validado) 
	 */
	public void answerOption(int userOption) {
		if(userOption!=0&&userOption!=1&&userOption!=2&userOption!=3&&userOption!=4&&userOption!=5){
			System.out.println("///////RECUERDA SELECCIONA un numero del menu/////////");
		}
		switch(userOption) {
		case 0: 
			System.out.println("cerrando la aplicaciOn, bye");
			break;
		case 1:
			break;
		case 2:
			break;
		case 3: 
			break;
		case 4: 
			registrarProducto();
			break;
		case 5: 
			System.out.println("La informacion de la tienda es la siguiente:");
			System.out.println(store);
		}
		
		
	}
	public void registrarProducto(){
		boolean salir = false;
		do{
			
			System.out.println("A continuacion digita el numero del producto, 1,2 o 3.");
			int selectProduct= sc.nextInt();
			
			
			if (store.verifyProduct(selectProduct)){
				System.out.println("El producto ya esta registrado,quiere sobre escribir?");
				String selectYesNo= sc.next();
				
				
				if (selectYesNo.equals("si")){
					/*if(selectProduct==1){
						if(availableProduct1==1){
							System.out.println("El producto numero "+selectProduct+" ya ha sido registrado por favor ingrese otro numero de producto para registrar");
							salir=true;
						}
					}
					if(selectProduct==2){
						if(availableProduct2==1){
							System.out.println("El producto numero "+selectProduct+" ya ha sido registrado por favor ingrese otro numero de producto para registrar");
							salir=true;
						}
					}
					if(selectProduct==3){
						if(availableProduct3==1){
							System.out.println("El producto numero "+selectProduct+" ya ha sido registrado por favor ingrese otro numero de producto para registrar");
							salir=true;
						}
					}*/
					if(!salir){
						System.out.println("Digita el nombre del producto");
						String nameProductReusable= sc.next();
						System.out.println("Digita el numero de productos que se tiene de inventario");
						int inventProductReusable= sc.nextInt();
						if(inventProductReusable<=0){
							
							System.out.println("-------------------Tienen que haber mas de 0 productos de inventario-------------------");
							salir=true;
						}
						if(!salir){
							System.out.println("Digita el precio del producto");
							double priceProductReusable= sc.nextDouble();
							if(priceProductReusable<=0){
								
								System.out.println("-------------------El precio tiene que ser mayor a 0-------------------");
								salir=true;
							}
							store.addProduct(selectProduct,nameProductReusable,inventProductReusable,priceProductReusable);
							if(selectProduct==1){
								availableProduct1=1;
							}
							if(selectProduct==2){
								availableProduct2=1;
							}
							if(selectProduct==3){
								availableProduct3=1;
							}
							
							//System.out.println("Llega al final");
							salir=true;
						}
					}
				}
				
				
			}else{
				if(!salir){
				
					if(selectProduct==1){
						if(availableProduct1==1){
							System.out.println("El producto numero "+selectProduct+" ya ha sido registrado por favor ingrese otro numero de producto para registrar");
							salir=true;
						}
					}
					if(selectProduct==2){
						if(availableProduct2==1){
							System.out.println("El producto numero "+selectProduct+" ya ha sido registrado por favor ingrese otro numero de producto para registrar");
							salir=true;
						}
					}
					if(selectProduct==3){
						if(availableProduct3==1){
							System.out.println("El producto numero "+selectProduct+" ya ha sido registrado por favor ingrese otro numero de producto para registrar");
							salir=true;
						}
					}
					if(!salir){
						System.out.println("Digita el nombre del producto");
						String nameProductReusable= sc.next();
						System.out.println("Digita el numero de productos que se tiene de inventario");
						int inventProductReusable= sc.nextInt();
						if(inventProductReusable<=0){
							
							System.out.println("-------------------Tienen que haber mas de 0 productos de inventario-------------------");
							salir=true;
						}
						if(!salir){
							System.out.println("Digita el precio del producto");
							double priceProductReusable= sc.nextDouble();
							if(priceProductReusable<=0){
								
								System.out.println("-------------------El precio tiene que ser mayor a 0-------------------");
								salir=true;
							}
							store.addProduct(selectProduct,nameProductReusable,inventProductReusable,priceProductReusable);
							if(selectProduct==1){
								availableProduct1=1;
							}
							if(selectProduct==2){
								availableProduct2=1;
							}
							if(selectProduct==3){
								availableProduct3=1;
							}
							
							//System.out.println("Llega al final");
							salir=true;
						}
					}
				}
			}
				
			/*
			if(selectProduct!=1&&selectProduct!=2&&selectProduct!=3){
				
				System.out.println("-------------------Solo puedes seleccionar 1,2 o 3 de numero de producto-------------------");
				salir=true;
				//System.out.println("El valor de salir es: " +salir);
			}
			
			if(!salir){
			
				if(selectProduct==1){
					if(availableProduct1==1){
						System.out.println("El producto numero "+selectProduct+" ya ha sido registrado por favor ingrese otro numero de producto para registrar");
						salir=true;
					}
				}
				if(selectProduct==2){
					if(availableProduct2==1){
						System.out.println("El producto numero "+selectProduct+" ya ha sido registrado por favor ingrese otro numero de producto para registrar");
						salir=true;
					}
				}
				if(selectProduct==3){
					if(availableProduct3==1){
						System.out.println("El producto numero "+selectProduct+" ya ha sido registrado por favor ingrese otro numero de producto para registrar");
						salir=true;
					}
				}
				if(!salir){
					System.out.println("Digita el nombre del producto");
					String nameProductReusable= sc.next();
					System.out.println("Digita el numero de productos que se tiene de inventario");
					int inventProductReusable= sc.nextInt();
					if(inventProductReusable<=0){
						
						System.out.println("-------------------Tienen que haber mas de 0 productos de inventario-------------------");
						salir=true;
					}
					if(!salir){
						System.out.println("Digita el precio del producto");
						double priceProductReusable= sc.nextDouble();
						if(priceProductReusable<=0){
							
							System.out.println("-------------------El precio tiene que ser mayor a 0-------------------");
							salir=true;
						}
						store.addProduct(selectProduct,nameProductReusable,inventProductReusable,priceProductReusable);
						if(selectProduct==1){
							availableProduct1=1;
						}
						if(selectProduct==2){
							availableProduct2=1;
						}
						if(selectProduct==3){
							availableProduct3=1;
						}
						
						//System.out.println("Llega al final");
						salir=true;
					}
				}
			}*/
		}while(!salir);
	}

	/**
	 * Metodo que permite crear instancias de los objetos con informaciOn ingresada
	 * por el usuario
	 */
	public void initShop() {
		System.out.println("Bienvenido a la tienda de APO1, digite el nombre del  dueño");
		String name= sc.nextLine();
		store = new Shop(name);
		/*
		// variables para leer las entradas
		String nameProduct;
	    int numProducts;
		double price;
		
		// mensajes al usuario para pedir los datos y crear el producto 1
		System.out.println("a continuación registraremos los productos");
		System.out.println("Producto 1");
		
		System.out.println("Digite el nombre del producto 1");
		nameProduct= sc.nextLine();
		
		System.out.println("Digite la cantidad de items disponibles");
		numProducts= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite el precio del producto 1");
		price=sc.nextDouble(); 
		sc.nextLine();
		
		//llamada al constructor de Producto 
		Product product= new Product(nameProduct, numProducts, price);
		store.setProduct1(product);
		
		
		// mensajes al usuario para pedir los datos y crear el producto 2
		
		System.out.println("Producto 2");
		
		System.out.println("Digite el nombre del producto 2");
		nameProduct= sc.nextLine();
		
		System.out.println("Digite la cantidad de items disponibles");
		numProducts= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite el precio del producto 2");
		price=sc.nextDouble(); 
		sc.nextLine();
		
		//llamada al constructor de Producto 
		product= new Product(nameProduct, numProducts, price);
		store.setProduct2(product);
		
		// mensajes al usuario para pedir los datos y crear el producto 3
		
		System.out.println("Producto 3");
		
		System.out.println("Digite el nombre del producto 3");
		nameProduct= sc.nextLine();
		
		System.out.println("Digite la cantidad de items disponibles");
		numProducts= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite el precio del producto 3");
		price=sc.nextDouble(); 
		sc.nextLine();
		
		//llamada al constructor de Producto 
		product= new Product(nameProduct, numProducts, price);
		store.setProduct3(product);
		
		
		System.out.println("La tienda ha sido configurada y su información inicial es la siguiente:");
		System.out.println(store);
		System.out.println(store.getProduct1());
		System.out.println(store.getProduct2());
		System.out.println(store.getProduct3());
		*/
		
		
	}
	/**
	 * Metodo que muestra el menu de la aplicaciOn, a este metod hace falta implementar la validaciOn
	 * del valor ingresado por el usuario
	 * @return input, int es la opciOn elegida por el usuario
	 */
	public int showMenuAndGetOption() {
		int input;
		System.out.println("\n\nMenu de la Tienda, digite una opciOn\n"+ 
		                    "(1) Vender Producto\n" +
		                    "(2) Mostrar la cantidad de dinero en caja\n" +
		                    "(3) Consultar la disponibilidad de un product\n"+
							"(4) Registrar un producto\n"+
							"(5) Mostrar los datos de la tienda\n"+
		                    "(0) Para salir"
	
		);
		input = sc.nextInt();
		sc.nextLine();
		return input;
	}

}
