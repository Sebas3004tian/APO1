/*Cree un programa para un supermercado que le solicite al usuario la cantidad de items a comprar, 
posteriormente pida el valor de cada uno de esos elementos y finalmente arroje en pantalla el valor total a pagar.
 MISMO PROGRAMA SOLO QUE CON FOR PA*/
 /*import java.util.Scanner;
public class EjercicioCondicionales1{
	public static void main(String[]args){
		Scanner sc = new Scanner (System.in);
		System.out.println("digite cantidad de items a comprar");
		int CantItems = sc.nextInt();
		
		double Valor = 0;
		double Total=0;
	
		
	
		for (int veces = 0;CantItems>veces;veces++){
			
			System.out.println("Introduzca el valor");
			Valor = sc.nextInt();
			
			Total+=Valor;
			
			
			
		}
		System.out.println("el total es " + Total);
		
	}
}
*/
import java.util.Scanner;
public class EjercicioCondicionales1{
	public static void main(String[]args){
		Scanner sc = new Scanner (System.in);
		System.out.println("digite cantidad de items a comprar");
		int CantItems = sc.nextInt();
		int veces = 0;
		double Valor = 0;
		double Total=0;
	
		
	
		while (CantItems>veces){
			
			System.out.println("Introduzca el valor");
			Valor = sc.nextInt();
			
			Total+=Valor;
			veces++;
			
			
		}
		System.out.println("el total es " + Total);
		
	}
}
