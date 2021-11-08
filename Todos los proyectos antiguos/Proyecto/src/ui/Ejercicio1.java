import java.util.Scanner;
import java.lang.Math;
public class Ejercicio1{
	public static void main(String[] args){
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digita 2 numeros enteros");
		System.out.print("Digita el primer numero:");
		int A = sc.nextInt();
		System.out.print("Digita el segundo numero:");
		int B = sc.nextInt();
		numeros(A, B);
		Cuadrado(A, B);
		Catetos(A, B);
	}	
	
	public static void numeros(int A, int B){
		
		if (A<B) {
			System.out.println("El numero menor es " + A);
			int menor = A;
		}else{
			if (B<A) {
				System.out.println("El numero menor es " + B);
				int menor = B;
			}else{
				if (A==B){
					System.out.println("Los 2 numeros son iguales");
				}
			}
		}
		
	}
	public static void Cuadrado(double A, double B){
		double CuadradoA = Math.sqrt(A);
		double CuadradoB = Math.sqrt(B);
		System.out.println("La raiz cuadrada de " + A + " es " + CuadradoA );
		System.out.println("Y la raiz cuadrada de " + B + " es " + CuadradoB );
		
		
	}
	public static void Catetos(int A,int B){
		double Hipotenusa = Math.sqrt((A*A) + (B*B));
		System.out.println("La hipotenusa es " + Hipotenusa);
		
	}
} 