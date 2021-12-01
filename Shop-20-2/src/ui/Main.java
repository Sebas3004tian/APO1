package ui;
import model.Shop;
import java.util.Scanner;
public class Main {

	private Shop shop;
	private Scanner sc;
	
	public Main() {
		sc= new Scanner(System.in);
	}
	public static void main(String[] args) {
		Main menu = new Main();
		
		
		
		int respuestaMenuInicial= 0;
		
		
		do {
		    respuestaMenuInicial =menu.MenuInicial();
		    menu.opcionMenuInicial(respuestaMenuInicial);
		}while (respuestaMenuInicial !=0);
		
	}
	public int MenuInicial(){
		System.out.println("Bienvenido a ");
		System.out.println("Selecciona lo que deseas hacer");
		System.out.println("(1).Agregar un Producto");
		System.out.println("(2).Informacion de los productos");
		System.out.println("(0).Salir de la aplicacion");
		int respuesta=sc.nextInt();

		return respuesta;
	}
	public void opcionMenuInicial(int respuestaMenuInicial) {
		if(respuestaMenuInicial!=0&&respuestaMenuInicial!=1&&respuestaMenuInicial!=2){
			System.out.println("///////RECUERDA SELECCIONAR un numero del menu/////////");
		}
		switch(respuestaMenuInicial) {
		case 0: 
			System.out.println("Se cierra la aplicacion,gracias...");
			break;
		case 1:
			addProduct();
			break;
		case 2:
			infoProduct();
			break;
		}
		
	}
	public void addProduct(){
		
		boolean salir = false;
		do{
			System.out.println("");
		}while(!salir);
	}
	public void infoProduct(){
		
	}
}
