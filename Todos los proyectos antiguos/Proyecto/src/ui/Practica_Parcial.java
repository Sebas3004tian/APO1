import java.util.Scanner;
public class Practica_Parcial{
	public static double suma(double A, double B ){
		return (A+B);
	}
	public static double resta(double A, double B ){
		return (A-B);
	}
	public static double multiplicacion(double A, double B ){
		return (A*B);
	}
	public static double division(double A, double B ){
		return (A/B);
	}
	public static double modulo(double A, double B ){
		return (A%B);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Digita 2 numeros ");
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println("A continuacion selecciona la operacion que quieres realizar ");
		System.out.println("Suma(1),Resta(2),Multiplicacion(3),Divicion(4),Modulo(5).");
		int simbolo = sc.nextInt();
		
		if (simbolo==1){
			System.out.println("El resultado es : " + suma(A, B));
		}else{
			if (simbolo==2){
				System.out.println("El resultado es : " + resta(A, B));
			}else{
				if (simbolo==3){
					System.out.println("El resultado es : " + multiplicacion(A, B));
				}else{
					if (simbolo==4){
						System.out.println("El resultado es : " + division(A, B));
					}else{
						if (simbolo==5){
							System.out.println("El resultado es : " + modulo(A, B));
						}else{
							System.out.println("No seleccionaste una operacion");
						}
					}
				}
			}
					
			
		}
	}
	
		
		
		

	
}