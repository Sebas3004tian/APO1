import java.util.Scanner;
public class HorasTotales{
	public static void main(String[] args){
		Scanner lector = new Scanner (System.in);
		System.out.print("Sus horas totales son   ");
		
		
		
		int horasT = lector.nextInt();
		int sem =  ( horasT ) / 168;
		int dias = ( ( horasT ) % 168) / 24;
		int horas = ( (horasT ) % 24);
		System.out.print("Teniendo " + horas + " horas en total.");
		System.out.print("Se tienen "+ sem + " semanas");
		System.out.print(" " + dias + " dias");
		System.out.print(horas + " horas");
	}
}	