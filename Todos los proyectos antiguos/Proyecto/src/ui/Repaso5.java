/*Diseñe y codifique un programa que permita adivinar un número. La aplicación genera un número aleatorio del 1 al 100. 
A continuación va pidiendo números y va respondiendo si el número a adivinar es mayor o menor que el introducido, 
además de los intentos que te quedan (tienes 10 intentos para acertarlo). El programa termina cuando:

Se acierta el número (además muestra el número de intentos en los que se ha acertado)

Se llega al límite de intentos, entonces el programa muestra el número que había generado.
*/
import java.util.Scanner;
public class Repaso5{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("A continuacion tendras que intentar adivinar cual es el numero");
		System.out.println("Tendras pistas como si el numero que escribiste es mayor o menor al que es la respuesta");
		
		int Aleatorio = (int)(Math. random()*100+1);
		int NumeroIntentos = 10;
		//System.out.println(Aleatorio);
		System.out.println("Intenta colocar ir colocando el numero que crees es la respuesta (Recuerda tienes 10 intentos)");
		
		for (int Intentos = 0;NumeroIntentos>Intentos;Intentos++){
			int Numero = sc.nextInt();
			if (Intentos==9){
				System.out.println("Perdiste, ya no tienes mas intentos, el numero acertado era :"+Aleatorio);
				Intentos=10;
			}
			if (Numero==Aleatorio){
				Intentos++;
				System.out.println("Felicidades lo lograste en "+Intentos+" intentos.");
				
				Intentos = 10;
			}
			if (Numero<Aleatorio){
				System.out.println("El numero es mayor que el que colocaste");
			}
			if (Numero>Aleatorio){
				System.out.println("El numero es menor que el que colocaste");
			}
			
	
		}
		
				
				
			

	}
}