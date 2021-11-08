import java.util.Scanner;
public class Horas{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite las  horas totales   ");
		int horas_totales = sc.nextInt();
		int semanas = horas_totales / 168;
		int dias = (horas_totales % 168) / 24;
		int horas = (horas_totales % 24);
		System.out.print("Teniendo " + horas_totales + " horas en total.");
		System.out.print("Se tienen "+ semanas + " semanas, " + dias + " dias y " + horas + " horas.");
	}
	
}	