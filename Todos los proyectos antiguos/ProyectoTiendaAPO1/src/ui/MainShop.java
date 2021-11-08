package ui;

import java.util.Scanner;

import model.Shop;



/**
 * Clase principal del proyecto candyShop.
 * Desarrollada para el 
 * @author angievig
 * @version 1.0
 * @since October 2021
 */
public class MainShop {

	
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
			venderProducto();
			break;
		case 2:
			mostrarCaja();
			break;
		case 3: 
			disponibilidadProducto();
			break;
		case 4: 
			registrarProducto();
			break;
		case 5: 
			System.out.println("La informacion de la tienda es la siguiente:");
			System.out.println(store);
			System.out.println(store.AllProducts());
			

			
			break;
		}
		
		
	}
	/**
    * Descripción:Metodo encargado de revisar si hay disponibilidad de un producto que el usuario quiere,si hay disponibilidad el sistema tambien muestra el numero de unidades disponibles</br>

    */
	public void disponibilidadProducto(){
		boolean salir = false;
		do{
			System.out.println("Ingresaste a la parte de verificar la disponibilidad de un producto para esto deberas introducir "+
			"el numero de identificacion del producto.");
			System.out.println(" ");
			System.out.println("Ingresa el numero de registro del producto: ");
			int registeredNumberToSell= sc.nextInt();
			if(store.verifyProductToSell(registeredNumberToSell)){
				System.out.println("Recuerda que el producto tiene que estar registrado!!");
				System.out.println("VUELVE A INTENTARLO");
				salir=true;
			}
			if(!salir){
				if(store.verifyDisponibilidad(registeredNumberToSell)){
					System.out.println("Lo lamento pero el producto que selecciono ya no se encuentra disponible.");
					salir=true;
				}
				if(!salir){
					System.out.println("Su producto si se encuentra disponible y quedan "+store.disponibilidad(registeredNumberToSell)+" unidades.");
				}
			}
			salir=true;
		}while(!salir);
		
	}
	/**
    * Descripción: Este metodo se encarga de mostrar el dinero que hay en caja actualmente</br>

    */
	public void mostrarCaja(){
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("");
		System.out.println("El dinero actual en la caja es "+store.dineroCaja()+"$ pesos.");
		System.out.println("");
		System.out.println("---------------------------------------------------------------------------------------");
	}
	/**
    * Descripción:Este metodo se encarga de recibir 2 entradas,llama a metodos de validacion en la class Shop si todo esta bien llama al metodo en class Shop encargado de modificar valores de inventario y dinero en caja </br>

    */
	public void venderProducto(){
		boolean salir = false;
		do{
			System.out.println("Ingresaste a la parte de vender un producto para esto deberas introducir "+
			"el numero de identificacion del producto y cuantas unidades quieres vender de este");
			System.out.println(" ");
			System.out.println("Ingresa el numero de registro del producto: ");
			int registeredNumberToSell= sc.nextInt();
			if(store.verifyProductToSell(registeredNumberToSell)){
				System.out.println("Recuerda que el producto tiene que estar registrado!!");
				System.out.println("VUELVE A INTENTARLO");
				salir=true;
			}
			if(!salir){
				System.out.println("Ahora ingresa cuantas unidades quieres vender del producto: ");
				int amountProductToSell= sc.nextInt();
				if(store.verifyAmountToSell(registeredNumberToSell,amountProductToSell)){
					System.out.println("Recuerda que la cantidad de unidades que quieres vender debe ser mayor a 0 y menor que el inventario disponible.");
					System.out.println("VUELVE A INTENTARLO");
					salir=true;
				}
				if(!salir){
					//Aqqui va el metodo para hacer la venta del producto.
					store.sellProduct(registeredNumberToSell,amountProductToSell);
					System.out.println("El numero de unidades "+amountProductToSell+"  del producto numero "+registeredNumberToSell+" se han vendido con exito.");
					
				}
			}
			
			salir=true;
		}while(!salir);
	}
	/**
    * Descripción:Este metodo se encarga de registrar productos pidiendo 4 entradas,las valida con metodos de class Shop y si todo esta bien llama a un metodo en Shop para registrar los valores</br>

    */
	public void registrarProducto(){
		boolean salir = false;
		

		do{
			
			System.out.println("A continuacion digita el numero de registro del producto ");
			int selectProduct= sc.nextInt();
			


			if(!salir){

				System.out.println("Digita el nombre del producto");
				String name= sc.next();
				System.out.println("Digita el numero de productos que se tiene de inventario");
				int numProductsForSale= sc.nextInt();
				if(numProductsForSale<=0){
					
					System.out.println("-------------------Tienen que haber mas de 0 productos de inventario-------------------");
					System.out.println("VUELVE A INTENTARLO");
					salir=true;
				}
				if(!salir){
					System.out.println("Digita el precio del producto");
					double price= sc.nextDouble();
					if(price<=0){
						
						System.out.println("-------------------El precio tiene que ser mayor a 0-------------------");
						System.out.println("VUELVE A INTENTARLO");
						salir=true;
					}
					

					
					
					
					if(!salir){


						if (store.verifyProduct(selectProduct)){
						System.out.println("El producto ya esta registrado,quiere sobre escribir?(si/no)");
						String selectYesNo= sc.next();
						
						
							if (selectYesNo.equals("si")){
								store.addProduct(selectProduct,name,numProductsForSale,price);
							}
						
						
						}else{
							
							store.addProduct(selectProduct,name,numProductsForSale,price);
							salir=true;
						}
						
					}

					salir=true;
				}			
			}
			
			
				
			
		}while(!salir);
	}

	/**
	 * Metodo que permite crear instancias de los objetos con informaciOn ingresada
	 * por el usuario
	 */
	public void initShop() {
		System.out.println("Bienvenido a la tienda de APO1, digite el nombre del  dueño");
		String name= sc.nextLine();
		
		System.out.println("Digite el numero de productos:");
		int productsAmount= sc.nextInt();
		store = new Shop(name,productsAmount);
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
		                    "(0) Para salir\n"
	
		);
		input = sc.nextInt();
		sc.nextLine();
		return input;
	}

}
