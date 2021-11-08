import java.util.Scanner;
import java.lang.Math;
public class Punto11{
	public static int numeroA(int NumeroCaracteres){
		return NumeroCaracteres/2 ;
	}
		public static int numeroB(int NumeroCaracteres){
		return NumeroCaracteres-1 ;
	}
	
	public static String igual(String palabra){
		return (palabra=="ALGORITMOS1-G1")?"Si es igual":"No es igual";
	}
	public static void main(String []args){
	
		
		String palabra = "Las tazas sobre el mantel,La lluvia derramada";
		int NumeroCaracteres = palabra.length();
		System.out.println(numeroA(NumeroCaracteres));

		System.out.println(NumeroCaracteres);
		String Mitad = palabra.substring(numeroA(NumeroCaracteres),numeroA(NumeroCaracteres)+1);
		String Letra1 = palabra.substring(0,1);
		String Letra2 = palabra.substring(numeroB(NumeroCaracteres));
		
		System.out.println("El caracter inicial es " + Letra1);
		System.out.println("El caracter final es " + Letra2);
		System.out.println("El caracter medio es " + Mitad);
		System.out.println("La cadena " + palabra + " " + igual(palabra) + " a la cadena ALGORITMOS1-G1."  );
		

	}
}