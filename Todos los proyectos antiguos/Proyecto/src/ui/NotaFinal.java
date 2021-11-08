import java.util.Scanner;
public class NotaFinal{
	public static void main(String[] a){
		
		System.out.println("Nota final");
		double resultado = notaFinal(4.5, 3.5, 5);
		System.out.println("La nota final es: " + resultado);
	}
	public static double notaFinal( double p1, double p2, double tareas){
		
		double nota = p1* 0.4 + p2* 0.4 + tareas* 0.2;
		
		return nota;
	}
		
		
	
}
	