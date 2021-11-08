/*Diseña y codifica un programa que muestre la tabla de multiplicar de un número introducido por teclado.*/
import java.util.Scanner;
public class Repaso4{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("A continuacion digite el numero del cual quiere obtener tabla de multiplicar: ");
		int Numero = sc.nextInt();
		int Veces = 13;
		
		
		for (int Tabla=1;Veces!=Tabla;Tabla++){
			
			int Respuesta = Numero*Tabla;
			System.out.println("El numero "+Numero+" * "+Tabla+" = "+Respuesta);
			
			
		
			
		}

		
	}
}
		
	
		