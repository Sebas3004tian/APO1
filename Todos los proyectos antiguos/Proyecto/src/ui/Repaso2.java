/*Diseña y codifica un programa que toma como entrada dos números M y N 
y  calcule la suma de los números divisibles por 5 entre M y N (incluídos)*/
import java.util.Scanner;
public class Repaso2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Digita el primer numero: ");
		int M = sc.nextInt();
		System.out.println("Digita el segundo numero: ");
		int N = sc.nextInt();
		int Total = 0;
		
		if (M>N){
			int Inicio;
			System.out.println("Los numeros divisibles entre "+M+" y "+N+" son:");
			for (Inicio = N;Inicio<=M;Inicio++){
				if (Inicio%5==0){					Total+=Inicio;
					System.out.print(Inicio+", ");
				}
				
			}
			System.out.println(" ");
			System.out.println("La suma de estos numeros entre "+M+" y "+N+" es: "+Total);
		}else{
		if (M<=N){
			int Inicio;
			System.out.println("Los numeros divisibles entre "+N+" y "+M+" son:");
			for (Inicio = M;Inicio<=N;Inicio++){
				if (Inicio%5==0){
					Total+=Inicio;
					System.out.print(Inicio+", ");
				}    
				
			}
			System.out.println(" ");
			System.out.println("La suma de estos numeros entre "+N+" y "+M+" es: "+Total);
		}
		}
		
		
	}
}
		
	
			
			
		
