/*Sebastian Lopez Garcia
Un programa que dada la cantidad de palabras que tenga un documento y el numero de horas al dia que trabaja el digitador,
se imprimira el costo de transcripcion y de impresion por separado,tambien el tiempo en dias que este tardara en estar listo.
Entradas:
-Cantidad de palabras que tiene el documento (C_palabras)
-Cantidad de horas al dia que trabaja el digitador (C_horas)
Salidas:
-Costo de transcribir (costoT)
-Costo de imprimir  (costoI)
-Tiempo en dias que tardara en estar listo el documento  (T_dias)
*/
import java.util.Scanner;
public class DigitadoresPaga{
	public static double costoT(double C_palabras){
		return ((C_palabras/1000)*10000);
	}
	public static double costoI(double C_palabras){
		return ((C_palabras/800)*500);
	}
	public static double costoTotal(double C_palabras){
		return (((C_palabras/1000)*10000) + ((C_palabras/800)*500));
	}
	public static double T_dias(double C_palabras, double C_horas){
		return (((C_palabras/4980)-((C_palabras/4980)%C_horas))/C_horas);
		
	}
	public static double T_horasSobrantes(double C_palabras, double C_horas){
		return ((C_palabras/4980)%C_horas);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Hola a continuacion podras calcular el costo de transcripcion y el de impresion,");
		System.out.println("tambien te dare los dias que tardara en estar listo");
		System.out.println("Digita la cantidad de palabras que tiene el documento: ");
		int C_palabras = sc.nextInt();
		System.out.println("Digita la cantidad de horas al dia ,que trabajara el digitador : ");
		int C_horas = sc.nextInt();
		
		System.out.println("El costo de transcripcion es de $" + costoT(C_palabras) + " pesos");
		System.out.println("El costo de impresion es de $" + costoI(C_palabras) + " pesos");
		System.out.println("EL costo total de la transcripcion y la impresion es de $" + costoTotal(C_palabras) + " pesos");
		System.out.println("EL numero de dias que durara en estar listo es :" + T_dias(C_palabras, C_horas));
		if ((T_horasSobrantes(C_palabras, C_horas))>=1){
			System.out.println("Mas el ultimo dia que solo tardara " + T_horasSobrantes(C_palabras, C_horas) + " horas.");
			}else{
				if ((T_dias(C_palabras, C_horas))==0){
					System.out.println("El trabajador solo necesitara " + T_horasSobrantes(C_palabras, C_horas) + " horas en un dia para terminar.");
				}
			}
		}
	}
	

