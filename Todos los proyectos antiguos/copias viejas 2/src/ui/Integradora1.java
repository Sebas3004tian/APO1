/*

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
import java.lang.Math;

public class Integradora1{
	
		/*public final static int BI = 2;
		public final static int DE = 10;
		public final static int HD = 16;*/
		
		static int [] Binario;
		static int [] Decimal;
		static String [] HexaDecimal;
		
		
		static Scanner sc = new Scanner (System.in);
	 
	public static void main(String[]args){
		menuPrincipal();
	}
	public static void menuPrincipal(){
		
		

		
		boolean salir = false;
		while (!salir){
			System.out.println("------------------------------------------------------------------------------------------------------------------------");
			System.out.println("CALCULADORA O CONVERSOR DE SISTEMAS DE ENUMERACION");
			System.out.println(" ");
			System.out.println("A continuacion selecciona que quieres hacer:");
			System.out.println(" ");
			System.out.println("1.Seleccionar la calculadora de binarios");
			System.out.println("2.Seleccionar el conversor entre sistemas de enumeracion");
			System.out.println("0.salir");
			System.out.println("------------------------------------------------------------------------------------------------------------------------");
			int respuestaMenu = sc.nextInt();
			if(respuestaMenu==1){
				menuCalculadora();
			}
			if(respuestaMenu==2){
				menuConversor();
			}
			if (respuestaMenu==0){
				salir=true;
			}	
			if (respuestaMenu!=0 && respuestaMenu!=1 && respuestaMenu!=2){
				System.out.println("!Por favor ingresa un numero que aparece en pantalla¡");
			}
		}	
	}
	public static void menuConversor(){
		Scanner sc = new Scanner (System.in);
		boolean salir = false;
		while (!salir){
			System.out.println("------------------------------------------------------------------------------------------------------------------------");
			System.out.println("A continuacion selecciona que tipo de sistema deseas usar:");
			System.out.println(" ");
			System.out.println("1.Binario");
			System.out.println("2.Decimal");
			System.out.println("3.Hexadecimal");
			System.out.println("0.volver");
			System.out.println("------------------------------------------------------------------------------------------------------------------------");
			int respuestaMenu = sc.nextInt();
			if (respuestaMenu==1){
				System.out.print("Digita la cantidad de digitos que vas a ingresar:");
				int cantDigitos = sc.nextInt();
				Binario = new int[cantDigitos];
				
				for (int veces = 0;veces<cantDigitos;veces++){
					
					System.out.println("Digita el digito");
					int numero = sc.nextInt();
					validarBinario(numero);
					if (validarBinario(numero)==false){
						System.out.println("Te has equivocado digitando los numeros, recuerda no puedes meter numeros que no sean o 1 o 0 asi es el sistema binario.");
						System.out.println("Tambien recuerda digito por digito lento pa.");
						System.out.println("");
						System.out.println("");
						System.out.println("------------------------------------------------------------------------------------------------------------------------");
						System.out.println("DEVUELTA EN EL MENU INICIAL");
						System.out.println("------------------------------------------------------------------------------------------------------------------------");
						veces=cantDigitos;
						salir=true;
					}
					if (validarBinario(numero)==true){
						Binario[veces]=numero;
					}
					
					
				}
				numeroBinario(cantDigitos);
				/*for (int x = 0;x<cantDigitos;x++){
					System.out.print(Binario[x]);
				}*/
				
			}
			if (respuestaMenu==2){
				System.out.print("Digita la cantidad de digitos que vas a ingresar:");
				int cantDigitos = sc.nextInt();
				Decimal = new int[cantDigitos];
				for (int veces = 0;veces<cantDigitos;veces++){
					
					System.out.println("Digita el digito");
					int numero = sc.nextInt();
					validarDecimal(numero);
					if (validarDecimal(numero)==false){
						System.out.println("Te has equivocado digitando los numeros, recuerda no puedes meter numeros que no sean del 0 al 9 asi es el sistema decimal.");
						System.out.println("Tambien recuerda digito por digito lento pa.");
						System.out.println("");
						System.out.println("");
						System.out.println("------------------------------------------------------------------------------------------------------------------------");
						System.out.println("DEVUELTA EN EL MENU INICIAL");
						System.out.println("------------------------------------------------------------------------------------------------------------------------");
						veces=cantDigitos;
						salir=true;
					}
					if (validarDecimal(numero)==true){
						Decimal[veces]=numero;
					}
				}
				numeroDecimal(cantDigitos);
				/*for (int x = 0;x<cantDigitos;x++){
					System.out.print(Decimal[x]);
				}
				System.out.println(" ");*/
			}
			if (respuestaMenu==3){  
				System.out.print("Digita la cantidad de digitos que vas a ingresar:");
				int cantDigitos = sc.nextInt();
				HexaDecimal = new String [cantDigitos];
				
				for (int veces = 0;veces<cantDigitos;veces++){
					
					System.out.println("Digita el digito");
					
					String numero = sc.next().toUpperCase();
					/*char numero = sc.next().charAt(0);
					if (numero=='a' || numero=='b' || numero=='c' || numero=='d' || numero=='e' || numero=='f'){
						numero = Character.toUpperCase(numero);
					}*/
					
					validarHexadecimal(numero);
					
					if (validarHexadecimal(numero)==false){
						System.out.println("Te has equivocado digitando los numeros, recuerda no puedes meter numeros que no sean del 0 al 9 o de A a F asi es el sistema hexadecimaldecimal.");
						System.out.println("Tambien recuerda digito por digito lento pa.");
						System.out.println("");
						System.out.println("");
						System.out.println("------------------------------------------------------------------------------------------------------------------------");
						System.out.println("DEVUELTA EN EL MENU INICIAL");
						System.out.println("------------------------------------------------------------------------------------------------------------------------");
						veces=cantDigitos;
						salir=true;
					}
					if (validarHexadecimal(numero)==true){
						HexaDecimal[veces]=numero;

					}
					
				}
				numeroHexaDecimal(cantDigitos);
				/*for (int x = 0;x<cantDigitos;x++){
					System.out.print(HexaDecimal[x]);
				}
				System.out.println(" ");*/
				
				
			}
			if (respuestaMenu==0){
				salir=true;
			}	
			if (respuestaMenu!=0 && respuestaMenu!=1 && respuestaMenu!=2 && respuestaMenu!=3){
				System.out.println("!Por favor ingresa un numero que aparece en pantalla¡");
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
	
	
	//---------------------------------------------------------------------------VALIDADORES----------------------------------------------------------------------------------
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//--------------------VALIDA BIN---------------------------------------------------------------------------------------------------------------------------------------------------------
	public static boolean validarBinario(int numero){
		if (numero/10!=0){
			return false;
			}
		if (numero!=0 && numero!=1){
			return false;
		}
		return true;
	}
	//-----------------------VALIDA DECI------------------------------------------------------------------------------------------------------------------------------------------------------
	public static boolean validarDecimal(int numero){
		if (numero/10!=0){
			return false;
			}
		return true;
	}
	//------------------------VALIDA HEXA-----------------------------------------------------------------------------------------------------------------------------------------------------
	public static boolean validarHexadecimal(String numero){
		boolean correcto = false;
		
		
		String [] hexadecimalNumeros = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
		for(int j=0;j<16 && !correcto;j++){
			if(numero.equals(hexadecimalNumeros[j])){
				correcto=true;
			}
			
		}
		
		return correcto;
		
		
		
		
		
		/*for (int x=0;1<HD;x++){
			
		}*/
		/*if (numero.length()>1){
			return false;
			
		}
		if (numero.equals('0')  || numero.equals('1')  || numero.equals('2') || numero.equals('3') || numero.equals('4') || numero.equals('5') || numero.equals('6') || numero.equals('7')|| numero.equals('8')|| numero.equals('9') || numero.equals('A') || numero.equals('B') || numero.equals('C') || numero.equals('D') || numero.equals('E') || numero.equals('F')){
			return true;
		}
		if (numero!='0'  && numero!='1'  && numero!='2'  && numero!='3'  && numero!='4'  && numero!='5'  && numero!='6'  && numero!='7'  && numero!='8'  && numero!='9' && numero!='A' && numero!='B' && numero!='C' && numero!='D' && numero!='E' && numero!='F'){
			return false;
		}
		System.out.println("HOla no se que haces aqui");
		return false; 
		*/
		
		
	}
	//---------------------------------------------------------------------------------CONVERSORES---------------------------------------------------------------------------------
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//-------------------DE BINARIO A HEXA Y DECI----------------------------------------------------------------------------------------------------------------------------------------------------------
	public static void numeroBinario(int cantDigitos){
		int contador = 0;
		int TotalNumeroBinario=0;
		int NumeroBinario=0;
		int potencia;
		int pocision = cantDigitos;
		for (int e = 0;e<cantDigitos;e++){
			potencia= (int) Math.pow(2,e);
			NumeroBinario = Binario[pocision-1]*potencia;
			TotalNumeroBinario+=NumeroBinario;
			pocision--;
			
		}
		System.out.println("RESULTADOS:");
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("EN DECIMAL->");
		System.out.print("El numero: ");
		for (int e=0;e<cantDigitos;e++){
			System.out.print(Binario[e]);
		}
		System.out.print(" al pasarse a decimal es " + TotalNumeroBinario);
		System.out.println(" ");
		//--------------------------------------------------------------------------------------
		int totalmodulo;
		String hexadecimal = "";
		char[] Hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		while (TotalNumeroBinario > 0) {
			totalmodulo = TotalNumeroBinario % 16;
			char caracterHexadecimal = Hexa[totalmodulo];
			hexadecimal = caracterHexadecimal + hexadecimal;
			TotalNumeroBinario = TotalNumeroBinario / 16;
		}
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("EN HEXADECIMAL->");
		System.out.println("y al pasarse a hexadecimal es " + hexadecimal);
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
	}
	//-------------------DE DECI A BIN Y A HEXA----------------------------------------------------------------------------------------------------------------------------------------------------------
	public static void numeroDecimal(int cantDigitos){
		int TotalNumeroDecimal=0;
		int NumeroDecimal=0;
		int potenciade10;
		int pocision = cantDigitos;
		for(int e=0;e<cantDigitos;e++){
			potenciade10= (int) Math.pow(10,e);
			NumeroDecimal=Decimal[pocision-1]*potenciade10;
			TotalNumeroDecimal+=NumeroDecimal;
			
			pocision--;
		}
		System.out.println(TotalNumeroDecimal);
		//Lo de arriba era pa convertir cada digito a una cadena
		//--------------------------------------------------------
		//int TotalNumeroDecimal1=TotalNumeroDecimal;
		//int TotalNumeroDecimal2=TotalNumeroDecimal;
		//--------------------------------------------------------
		int totalmodulo;
		String hexadecimal = "";
		char[] Hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		while (TotalNumeroDecimal > 0) {
			totalmodulo = TotalNumeroDecimal % 16;
			char caracterHexadecimal = Hexa[totalmodulo];
			hexadecimal = caracterHexadecimal + hexadecimal;
			TotalNumeroDecimal = TotalNumeroDecimal / 16;
		}
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("EN HEXADECIMAL->");
		System.out.println("y al pasarse a hexadecimal es " + hexadecimal);
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		//------------------------------------------------------------------
		TotalNumeroDecimal=0;
		NumeroDecimal=0;
		potenciade10=0;
		pocision = cantDigitos;
		for(int e=0;e<cantDigitos;e++){
			potenciade10= (int) Math.pow(10,e);
			NumeroDecimal=Decimal[pocision-1]*potenciade10;
			TotalNumeroDecimal+=NumeroDecimal;
			
			pocision--;
		}
		System.out.println(TotalNumeroDecimal);
		//--------------------------------------------------------------------
		String binario = "";
		while (TotalNumeroDecimal > 0) {
			binario = TotalNumeroDecimal % 2 + binario;
			TotalNumeroDecimal = TotalNumeroDecimal / 2;
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("EN BINARIO->");
		System.out.println("y al pasarse a binario es " + binario);
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		
		
	}
	//---------------------------DE HEXA A BIN Y DECI--------------------------------------------------------------------------------------------------------------------------------------------------
	public static void numeroHexaDecimal(int cantDigitos){
		int contador = 0;
		int TotalNumeroHexadecimal=0;
		int NumeroHexadecimal=0;
		int potencia;
		int pocision = cantDigitos;
		int numeroDELHEXA=0;
		for (int e = 0;e<cantDigitos;e++){
			potencia= (int) Math.pow(16,e);
			if (HexaDecimal[pocision-1].equals("0")){
				numeroDELHEXA=0;
			}
			if (HexaDecimal[pocision-1].equals("1")){
				numeroDELHEXA=1;
			}
			if (HexaDecimal[pocision-1].equals("2")){
				numeroDELHEXA=2;
			}
			if (HexaDecimal[pocision-1].equals("3")){
				numeroDELHEXA=3;
			}
			if (HexaDecimal[pocision-1].equals("4")){
				numeroDELHEXA=4;
			}
			if (HexaDecimal[pocision-1].equals("5")){
				numeroDELHEXA=5;
			}
			if (HexaDecimal[pocision-1].equals("6")){
				numeroDELHEXA=6;
			}
			if (HexaDecimal[pocision-1].equals("7")){
				numeroDELHEXA=7;
			}
			if (HexaDecimal[pocision-1].equals("8")){
				numeroDELHEXA=8;
			}
			if (HexaDecimal[pocision-1].equals("9")){
				numeroDELHEXA=9;
			}
			if (HexaDecimal[pocision-1].equals("A")){
				numeroDELHEXA=10;
			}
			if (HexaDecimal[pocision-1].equals("B")){
				numeroDELHEXA=11;
			}
			if (HexaDecimal[pocision-1].equals("C")){
				numeroDELHEXA=12;
			}
			if (HexaDecimal[pocision-1].equals("D")){
				numeroDELHEXA=13;
			}
			if (HexaDecimal[pocision-1].equals("E")){
				numeroDELHEXA=14;
			}
			if (HexaDecimal[pocision-1].equals("F")){
				numeroDELHEXA=15;
			}
			
			NumeroHexadecimal = numeroDELHEXA*potencia;
			TotalNumeroHexadecimal+=NumeroHexadecimal;
			pocision--;
			
		}
		System.out.println("RESULTADOS:");
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("EN DECIMAL->");
		System.out.print("El numero: ");
		for (int e=0;e<cantDigitos;e++){
			System.out.print(HexaDecimal[e]);
		}
		System.out.print(" al pasarse a decimal es " + TotalNumeroHexadecimal);
		System.out.println(" ");
		//---------------------------------------------------------------------------------------------
		
		String binario = "";
		while (TotalNumeroHexadecimal > 0) {
			binario = TotalNumeroHexadecimal % 2 + binario;
			TotalNumeroHexadecimal = TotalNumeroHexadecimal / 2;
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("EN BINARIO->");
		System.out.println("y al pasarse a binario es " + binario);
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
	}
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
}