
/*
PS D:\Usuarios\1034776737\Proyecto\ProyectoIntegradora1> javac -cp src src\ui\Integradora1.java -d bin
PS D:\Usuarios\1034776737\Proyecto\ProyectoIntegradora1> java -cp bin ui.Integradora1

Funcionalidades
Al iniciar,  el programa debe ofrecerle al usuario la opción de usar la calculadora de binarios o el conversor entre sistemas de numeración.

El conversor de Sistemas de numeración.
El conversor le permite al usuario transformar un número y conocer su representación en distintos sistemas de numeración, los sistemas de numeración disponibles son: binario, decimal y hexadecimal. 
El conversor funciona así:
Al iniciar, el conversor le pregunta al usuario el sistema de numeración que desea usar y la cantidad de dígitos que va a ingresar.  
Al leer los dígitos, el programa debe validar que los dígitos ingresados correspondan al sistema de numeración elegido por el usuario.,  0, 1 en binario,  0..9 en decimal y 0..9, A..F en hexadecimal. 
Al finalizar la lectura, el conversor le muestra al usuario el número leído y su representación en los otros dos sistemas de numeración. 


Calculadora de números binarios.
La calculadora le permite al usuario ingresar dos números en base 2 y escoger una operación aritmética (suma resta, multiplicación y división).  La calculadora funciona así:
Al iniciar,  la calculadora le pregunta al usuario los dos números así:
Se pregunta la cantidad de dígitos del primer número y se leen esos dígitos.
Se pregunta la cantidad de dígitos del segundo número y se leen esos dígitos.
Al leer los dígitos, el programa debe validar que los dígitos ingresados sean 0, 1
Al finalizar la lectura de los números, el programa le pregunta al usuario la operación que desea aplicar.
Al  finalizar la lectura el programa le muestra al usuario la respuesta así:
El número resultante en sistema base 2, luego muestra los dos números ingresados y el resultado en base 10*/
package ui;
import java.util.Scanner;

public class Integradora1{
	
	public static void main(String[]args){
		menuPrincipal();
	}
	public static void menuPrincipal(){
		Scanner sc = new Scanner (System.in);
		
		boolean salir = false;
		while (!salir){
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("A continuacion selecciona que quieres hacer:");
			System.out.println(" ");
			System.out.println("1.Seleccionar la calculadora de binarios");
			System.out.println("2.Seleccionar el conversor entre sistemas de enumeracion");
			System.out.println("0.salir");
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
			int respuestaMenu = sc.nextInt();
			if(respuestaMenu==1){
				menuConversor();
			}
			if(respuestaMenu==2){
				menuCalculadora();
			}
			if (respuestaMenu==0){
				salir=true;
			}	
		}	
	}
	public static void menuConversor(){
		Scanner sc = new Scanner (System.in);
		boolean salir = false;
		while (!salir){
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("A continuacion selecciona que tipo de sistema deseas usar:");
			System.out.println(" ");
			System.out.println("1.Binario");
			System.out.println("2.Decimal");
			System.out.println("3.Hexadecimal");
			System.out.println("0.volver");
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
			int respuestaMenu = sc.nextInt();
			if (respuestaMenu==1 || respuestaMenu==2 || respuestaMenu==3){
				System.out.print("Digita la cantidad de digitos que vas a ingresar:");
				int cantDigitos = sc.nextInt();
				System.out.println("Digita el primer numero");
				int numero = sc.nextInt();
			}
			if (respuestaMenu==0){
				salir=true;
			}	
		}	
	}
		public static void menuCalculadora(){
		Scanner sc = new Scanner (System.in);
		System.out.print("Digita la cantidad de dígitos del primer número:");
		int cantDigitos1 = sc.nextInt();
		System.out.println("Digita el primer numero");
		int numero1 = sc.nextInt();
		System.out.print("Digita la cantidad de dígitos del segundo número:");
		int cantDigitos2 = sc.nextInt();
		System.out.println("Digita el segundo numero");
		int numero2 = sc.nextInt();
		
	}
	
	
}