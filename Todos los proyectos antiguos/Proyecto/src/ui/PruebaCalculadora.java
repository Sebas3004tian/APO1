import java.util.Scanner;
public class PruebaCalculadora{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Digita 2 numeros enteros");
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println("A continuacion selecciona la operacion que quieres realizar ");
		System.out.println("Suma(1),Resta(2),Multiplicacion(3),Divicion(4),Modulo(5).");
		int simbolo = sc.nextInt();
		System.out.println("El resultado es : ");
		
		
		suma(A, B, simbolo);
		resta(A, B, simbolo);
		multiplicacion(A, B, simbolo);
		divicion(A, B, simbolo);
		modulo(A, B, simbolo);
	}
	public static void suma(int A, int B, int simbolo){
		int resultadoSuma = (A+B);
		if (simbolo==1){
			System.out.println(resultadoSuma);
		}
	}

	
	public static void resta(int A, int B, int simbolo){
		int resultadoResta = (A-B);	
		if (simbolo==2){
			System.out.println(resultadoResta);
		}
	}
	public static void multiplicacion(int A, int B, int simbolo){
		int resultadoMultiplicacion = (A*B);
		if (simbolo==3){
			System.out.println(resultadoMultiplicacion);
		}
		
	}
	public static void divicion(double A, double B, int simbolo){
		double resultadoDivicion = (A/B);
		if (simbolo==4){
			System.out.println(resultadoDivicion);
		}
		
	}
	public static void modulo(double A, double B, int simbolo){
		double resultadoModulo = (A%B);
		if (simbolo==5){
			System.out.println(resultadoModulo);
		}
		
	}
	
}