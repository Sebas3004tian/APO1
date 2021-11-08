package ui;

import java.util.Scanner;


import model.Collection;



public class PokeCollector {
	private Collection myCollection;
	private Scanner sc; 
	
	
	public PokeCollector() {
		sc= new Scanner(System.in);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PokeCollector pc= new PokeCollector();
		
	
		System.out.println("Iniciando la aplicación");
		
		int option=0;
		
		do{
			
			option= pc.showMenu();
			pc.executeOperation(option);
			
		}while (option!=0);
		
	}
	
	public int showMenu() {
		int option=0;

		System.out.println(
				"Menú principal, seleccione una opción\n" +
				"(1) Para crear una colección \n" +
				"(2) Para crear, editar o eliminar un álbum \n" +
				"(3) Para mostrar la información de los albums en la colección \n"+
				"(4) Para agregar un pokemon un álbum\n"+
				"(0) Para salir"
				);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}
	
	public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1:
			createCollection() ;
			break;
		case 2:
			showMenuAlbum() ;
			break;
		case 3:
			System.out.println(myCollection.showAlbums());
			break;
	
		case 4:
			addPokeInAlbum();
			break;


		
		default:
			System.out.println("Error, opción no válida");
		
		}
	}

	private void createCollection() { // 
		System.out.println("Ingrese los datos de una colección");
		String nom;
		int day, month, year;

		System.out.println("nombre");
		nom= sc.nextLine();

		System.out.println("fecha");
		

		System.out.println("dia");
		day= sc.nextInt();
		sc.nextLine();

		System.out.println("mes");
		month= sc.nextInt();
		sc.nextLine();

		System.out.println("año");
		year= sc.nextInt();
		sc.nextLine();


		//myCollection = new Collection(nom, new Date(day, month, year));

		myCollection = new Collection(nom, day, month, year);

		System.out.println("La Colección  "+ nom + " fue creada");





		
	}



	private void addPokeInAlbum() {
		// en que album quiere añadir el poemon(que exista el album)
		//preguntar el nombre del pokemono , tamboen preguntar el tipo
		System.out.println("Preguntar el numero de album");
		System.out.println("Preguntar el numero de album");
		//
	}

	private void showMenuAlbum() {
		int option=0;
		System.out.println(
				"Menú Album\n" +
				"(1) Para crear un álbum\n" +
				"(2) Para editar un álbum\n"+
				"(3) Para eliminar un álbum\n"+
				"(0) Para volver"
				);
		option= sc.nextInt();
		sc.nextLine();
		
		switch(option) {
		case 1:
			createAlbum();
			break;
		case 2:
			editAlbum();
			break;
		case 3: 
			deleteAlbum();
			break;
		
		}
		
	}
	private void deleteAlbum() {
		boolean salir=false;
		while(!salir){
			
			System.out.println("Digite el numero del album que quiere eliminar ");
			int numEdit= sc.nextInt();
			if(numEdit!=1 || numEdit!=2 || numEdit!=3){
				System.out.println("error");
				salir=true;
			}
			if(!salir){
				myCollection.deleteAlbum(numEdit);
			}
			salir=true;
			/*do{
				System.out.println("Digite el numero del album que quiere eliminar ");
				numEdit= sc.nextInt();
				
				if(numEdit!=1 || numEdit!=2 || numEdit!=3){
					System.out.println("error");
				}
			}while(numEdit!=1 || numEdit!=2 || numEdit!=3);
			myCollection.deleteAlbum(numEdit);*/
		}
	}
	private void editAlbum() {
		boolean salir=false;
		while(!salir){
		
			System.out.println("Digite el numero del album a editar ");
			int numEdit= sc.nextInt();
			if(numEdit!=1 || numEdit!=2 || numEdit!=3){
				System.out.println("error");
				salir=true;
			}
			/*do{
				
				System.out.println("Digite el numero del album a editar ");
				numEdit= sc.nextInt();
				if(numEdit!=1 || numEdit!=2 || numEdit!=3){
					System.out.println("error");
				}
			}while(numEdit!=1 || numEdit!=2 || numEdit!=3);*/
			if(!salir){
				System.out.println("Nombre de la región del album:");
				String nom= sc.nextLine();
				System.out.println("Cantidad de pokemones de la región");
				int num = sc.nextInt();
				sc.nextLine();
				if(!salir){
					myCollection.editAlbum(numEdit,nom,num);
				}
				
			}
			salir=true;
		}
	
		/*System.out.println("Cantidad de pokemones de la región");
		int num = sc.nextInt();
		sc.nextLine();
		myCollection.editAlbum(numEdit,nom,num);*/
	}
	private void createAlbum() {

		if(myCollection.hasAlbums()) {

			System.out.println("Digite los datos del album a crear ");


			System.out.println("Nombre de la región del album:");
			String nom= sc.nextLine();

		
			System.out.println("Cantidad de pokemones de la región");
			int num = sc.nextInt();
			sc.nextLine();
			

			//myCollection.addAlbum(nom, num);

			System.out.println("El album \""+ nom +"\" ha sido creado con éxito\n");
			System.out.println("-------------------------------------------------");
			System.out.println(myCollection.addAlbum(nom, num));
			System.out.println("-------------------------------------------------");

			
		}else {
			System.out.println("No puede crearse el álbum porque se llegó al límite\n");
		}
		
	}

		

	}
	

	
	
	


