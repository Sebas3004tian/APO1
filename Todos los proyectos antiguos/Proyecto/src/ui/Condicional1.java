import java.util.Scanner;
import java.lang.Math;
public class Condicional1{
	
	public static String menor(int A,int B){
		return (A<B)?"Si":"No";
	
	}
	public static String mayor(int A,int B){
		return (A>B)?"Si":"No";
	
	}
	public static String mayoroigual(int A,int B){
		return (A>=B)?"Si":"No";
	
	}
		public static String menoroigual(int A,int B){
		return (A<=B)?"Si":"No";
	
	}
		public static String igual(int A,int B){
		return (A==B)?"Si":"No";
	
	}
		public static String noigual(int A,int B){
		return (A!=B)?"Si":"No";
	
	}
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Digita 2 numeros enteros");
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println("el numero " + A + " " + menor(A,B) + " es menor que B");
		System.out.println("el numero " + A + " " + mayor(A,B) + " es mayor que B");
		System.out.println("el numero " + A + " " + mayoroigual(A,B) + " es mayor o igual que B");
		System.out.println("el numero " + A + " " + menoroigual(A,B) + " es menor o igual que B");
		System.out.println("el numero " + A + " " + igual(A,B) + " es igual a B");
		System.out.println("el numero " + A + " " + noigual(A,B) + " es desigual a B");
		
	}
	
}