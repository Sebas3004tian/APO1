/*Diseña y codifica un programa que pida al usuario que digite números hasta que el usuario
 introduzca un cero. Debe imprimir la suma y la media de todos los números introducidos.*/
import java.util.Scanner;
public class Repaso3{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("A continuacion podra digitar la cantidad de numeros que desee y luego obtendra la suma y media de todos.");
		System.out.println("PSTT:si quiere dejar de poner numeros digite un 0");
		double Total = 0;
		double Numero = 1;
		double CantTotal=0;
		
		for (int CantNumeros=0;Numero!=0;CantNumeros++){
			
			System.out.println("Digite el numero");
			Numero = sc.nextDouble();
			
			Total+=Numero;
			
			CantTotal=CantNumeros;
			
		}
		System.out.println("La suma de todos los numeros es : "+Total);
		double Media = (Total/CantTotal);
		System.out.println("La media es : " + Media);
		
	}
}
		
	
		