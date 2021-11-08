import java.util.Scanner;

public class NuevaIntegradora{
	
		public final static int BI = 2;
		public final static int DE = 10;
		public final static int HD = 16;
		
		static int [] Binario = new int[BI];
		static int [] Decimal = new int[DE];
		static String [] Hexa;
		
		
		static Scanner sc = new Scanner (System.in);
	 
	public static void main(String[]args){
		menuPrincipal();
	}
	public static void menuPrincipal(){
		
		

		
		boolean salir = false;
		while (!salir){
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("CALCULADORA O CONVERSOR DE SISTEMAS DE ENUMERACION");
			System.out.println(" ");
			System.out.println("A continuacion selecciona que quieres hacer:");
			System.out.println(" ");
			System.out.println("1.Seleccionar la calculadora de binarios");
			System.out.println("2.Seleccionar el conversor entre sistemas de enumeracion");
			System.out.println("0.salir");
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
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
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("A continuacion selecciona que tipo de sistema deseas usar:");
			System.out.println(" ");
			System.out.println("1.Binario");
			System.out.println("2.Decimal");
			System.out.println("3.Hexadecimal");
			System.out.println("0.volver");
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
			int respuestaMenu = sc.nextInt();
			if (respuestaMenu==1){
				System.out.print("Digita la cantidad de digitos que vas a ingresar:");
				int cantDigitos = sc.nextInt();
				for (int veces = 0;veces<cantDigitos;veces++){
					
					System.out.println("Digita el digito");
					int numero = sc.nextInt();
					validarBinario(numero);
					if (validarBinario(numero)==false){
						System.out.println("Te has equivocado digitando los numeros, recuerda no puedes meter numeros que no sean o 1 o 0 asi es el sistema binario.");
						System.out.println("Tambien recuerda digito por digito lento pa.");
						System.out.println("");
						System.out.println("");
						System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
						System.out.println("DEVUELTA EN EL MENU INICIAL");
						System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
						veces=cantDigitos;
						salir=true;
					}
					
				}
				
			}
			if (respuestaMenu==2){
				System.out.print("Digita la cantidad de digitos que vas a ingresar:");
				int cantDigitos = sc.nextInt();
				for (int veces = 0;veces<cantDigitos;veces++){
					
					System.out.println("Digita el digito");
					int numero = sc.nextInt();
					validarDecimal(numero);
					if (validarDecimal(numero)==false){
						System.out.println("Te has equivocado digitando los numeros, recuerda no puedes meter numeros que no sean del 0 al 9 asi es el sistema decimal.");
						System.out.println("Tambien recuerda digito por digito lento pa.");
						System.out.println("");
						System.out.println("");
						System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
						System.out.println("DEVUELTA EN EL MENU INICIAL");
						System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
						veces=cantDigitos;
						salir=true;
					}
					
				}
			}
			if (respuestaMenu==3){  
				System.out.print("Digita la cantidad de digitos que vas a ingresar:");
				int cantDigitos = sc.nextInt();
				for (int veces = 0;veces<cantDigitos;veces++){
					
					System.out.println("Digita el digito");
					char numero = sc.next().charAt(0);
					if (numero=='a' || numero=='b' || numero=='c' || numero=='d' || numero=='e' || numero=='f'){
						numero = Character.toUpperCase(numero);
					}
					
					validarHexadecimal(numero);
					if (validarHexadecimal(numero)==false){
						System.out.println("Te has equivocado digitando los numeros, recuerda no puedes meter numeros que no sean del 0 al 9 asi es el sistema decimal.");
						System.out.println("Tambien recuerda digito por digito lento pa.");
						System.out.println("");
						System.out.println("");
						System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
						System.out.println("DEVUELTA EN EL MENU INICIAL");
						System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
						veces=cantDigitos;
						salir=true;
					}
					
				}
				
				
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
	public static boolean validarDecimal(int numero){
		if (numero/10!=0){
			return false;
			}
		return true;
	}
	
	
	public static boolean validarHexadecimal(char numero){
		
		/*for (int x=0;1<HD;x++){
			
		}*/
		if (numero!='0'  && numero!='1'  && numero!='2'  && numero!='3'  && numero!='4'  && numero!='5'  && numero!='6'  && numero!='7'  && numero!='8'  && numero!='9' && numero!='A' && numero!='B' && numero!='C' && numero!='D' && numero!='E' && numero!='F'){
			return false;
		}
		return true;
		
	}
	public static boolean validarBinario(int numero){
		if (numero/10!=0){
			return false;
			}
		if (numero!=0 && numero!=1){
			return false;
		}
		return true;
	}
	public static boolean validarHexadecimal(String[]hexa){
		boolean correcto = false;
		boolean respuestaFinal= true;

		String [] hexadecimal = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
		for(int i = 0; i < hexa.length && respuestaFinal ;i++){
			correcto = false;
			for(int j = 0; j < hexadecimal.length && !correcto;j++){
				if(hexa[i].equals(hexadecimal[j])){
					correcto = true;
				}
			}
			respuestaFinal = respuestaFinal && correcto;
		}
        
      
      return respuestaFinal;
    }
}