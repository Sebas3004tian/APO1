import java.util.Scanner;
import java.lang.Math;

public class Pruebitas{
	static Scanner sc = new Scanner (System.in);
	public static void main(String[]args){
		int decimal=sc.nextInt();
		decimalAHexadecimal(decimal);
		System.out.println(decimalAHexadecimal(decimal));
	}
	public static String decimalAHexadecimal(int decimal) {
    int residuo;
    String hexadecimal = "";
    char[] caracteresHexadecimales = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    while (decimal > 0) {
        residuo = decimal % 16;
        char caracterHexadecimal = caracteresHexadecimales[residuo];
        hexadecimal = caracterHexadecimal + hexadecimal;
        decimal = decimal / 16;
    }
    return hexadecimal;
}
/*
		static String [] hexadecimal = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
		static String [] hexa;
		
		static Scanner sc = new Scanner (System.in);
	 
	public static void main(String[]args){
		String numerohexa = sc.nextLine().toUpperCase();
		
		int NumeroCaracteres = numerohexa.length();
		System.out.println(numerohexa);
		System.out.println(NumeroCaracteres);
		for (int x=0;x<numerohexa.length();x++){
			hexa[x]=numerohexa.substring(x-1,x+1);
			System.out.println(hexa[x]);
			
		}
		
		//validarHexadecimal();
	}
	public static boolean validarHexadecimal(){
		boolean correcto = false;
		boolean respuestaFinal= true;

		
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
    }*/
}