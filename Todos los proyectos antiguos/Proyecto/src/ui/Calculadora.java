import java.util.Scanner;
public class Calculadora{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Digita 2 numeros enteros");
		int A = sc.nextInt();
		int B = sc.nextInt();

		suma(A, B);
		resta(A, B);
		multiplicacion(A, B);
		divicion(A, B);
		modulo(A, B);
		
	}
	public static void suma(int A, int B){
		int resultadoSuma = (A+B);
		System.out.println(resultadoSuma);

	}
	public static void resta(int A, int B){
		int resultadoResta = (A-B);	
		System.out.println(resultadoResta);
	}
	public static void multiplicacion(int A, int B){
		int resultadoMultiplicacion = (A*B);
		System.out.println(resultadoMultiplicacion);
	}
	public static void divicion(int A, int B){
		double resultadoDivicion = (A/B);
		System.out.println(resultadoDivicion);
	}
	public static void modulo(int A, int B){
		double resultadoModulo = (A%B);
		System.out.println(resultadoModulo);
	}
	
}