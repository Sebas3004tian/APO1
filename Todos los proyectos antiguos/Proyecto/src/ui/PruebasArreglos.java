/*Diseñe un programa que permita al usuario realizar las siguientes acciones sobre un arreglo de enteros. Use tantos métodos como requiera.

1.Crear un arreglo
2.Imprimir un arreglo almacenado
3.Buscar si un número dado se encuentra almacenado en alguna de las posiciones del arreglo
import java.util.Scanner;
public class Arreglo1{
	
	public static void main(String[]args){
		Scanner sc = new Scanner (System.in);
		int [] arreglo = {2,10,4,3,5,6};
		
		System.out.println("Digita un numero ");
		int numero = sc.nextInt();
		int i = 0;
		for (int veces = 0;veces<6;veces++){
		
			if (numero==arreglo[0+i]){
				System.out.println("el numero "+numero+" es igual a "+arreglo[0+i]);
			}
			i++;
		}
		
		
		
	
		
	}
	
}
4.Imprimir el mayor o menor elemento almacenado en el arreglo
5.Modificar todos los elementos de un arreglo dado un valor
6.Modificar algunos de los elementos de un arreglo de acuerdo a unos valores y posiciones dados por el usuario*/
import java.util.Scanner;
public class PruebasArreglos{
	static int [] arreglo;
	public static void main(String[]args){
		Scanner sc = new Scanner (System.in);

		int ARR = sc.nextInt();
		arreglo = new int[ARR];
		int i = 0;
		for (int veces = 0;veces<ARR;veces++){
			arreglo[veces]=sc.nextInt();
			System.out.println("el numero es "+arreglo[0+i]);
			i++;
			
			
		}

	}
	
}