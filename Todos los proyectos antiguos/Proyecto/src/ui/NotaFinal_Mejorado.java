import java.util.Scanner;
public class NotaFinal_Mejorado{
	public static void main(String[] args){
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Con esto puedes sacar el promedio de tu materia.");
		System.out.println("Digita la nota de parcial 1:");
		double p1 = sc.nextDouble();
		System.out.println("Digita la nota de parcial 2:");
		double p2 = sc.nextDouble();
		System.out.println("Digita la nota de las tareas:");
		double tareas = sc.nextDouble();
	
		double resultado = notaFinal(p1, p2, tareas);
		System.out.println("El promedio final es: " + resultado);
	}
	public static double notaFinal( double p1, double p2, double tareas){
		
		double nota = p1* 0.4 + p2* 0.4 + tareas* 0.2;
		
		return nota;
	}
}
	 