/*Sebastian Lopez Garcia
El programa necesita el numero de cedula y año de nacimiento del usuario para calcular que dia y en que horario podra
asistir a la feria,el programa toma los datos introducidos por el usuario y para tomar
los ultimos 2 digitos del numero de cedula(NumerosFinales) y la edad en años (edad).
-hora(edad):
El programa utiliza la edad en años del usuario para determinar dependiendo de su edad en que plazo de hora
puede asistir a la feria de cali.
-dia(Numerosfinales):
El programa utiliza los ultimos 2 digitos de la cedula introducida por el usuario para determinar que dia podra
asistir a la feria de cali. 

Entradas:
-Numero de cedula (cedula)
-Año de nacimiento (nacimiento)
Salidas:
-Dia en el que puede ir a la feria de cali (dia)
-Horario en el que puede ir a la feria de cali (hora)
*/
import java.util.Scanner;

public class FeriaPresencial{
	public static void main(String []args){
		Scanner sc = new Scanner (System.in);

		System.out.println("Inserte su numero de cedula: ");
		
		int cedula = sc.nextInt();
		

		System.out.println("Inserte su año de nacimiento: ");
		int nacimiento = sc.nextInt();
		int edad = (2021-nacimiento);
		int NumerosFinales = cedula%100;
	
		System.out.println("Tu edad es de " + edad + " años.");
		
		System.out.println("Te toca el dia " + dia(NumerosFinales) + " de diciembre. ");
	
		System.out.println("Y el horario en el que te toco es " + hora(edad));

		}
	public static String hora(int edad){
		String hora = " ";
		if (edad<18){
			hora = "entre las 9:00am y las 12:00pm";
		}else
		if (edad>=18 && edad<=40){
			hora = "entre las 10:00pm y las 3:00am";
		}else
		if (edad>40 && edad<65){
			hora = "entre las 4:00pm y las 12:00am";
		}else
		if (edad>=65){
			hora = "entre las 12:00pm y las 4:00pm";
		}
		return hora;
		
	}

	public static int dia(int NumerosFinales){
		int ModDias = NumerosFinales%6;
		int dia = 0;
		if (ModDias==0){
			return dia = 25;
		}else
		if (ModDias==1){
			return dia = 26;
		}else
		if (ModDias==2){
			return dia = 27;
		}else
		if (ModDias==3){
			return dia = 28;
		}else
		if (ModDias==4){
			return dia = 29;
		}else
		if (ModDias==5){
			return dia = 30;
		}

		return dia;
	}







}