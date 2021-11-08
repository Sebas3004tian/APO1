import java.util.Scanner;
public class Repaso1{
	public static void main(String[]args){
		Scanner sc = new Scanner (System.in);
		System.out.println("digite la base");
		double Base = sc.nextDouble();
		
		System.out.println("digite el exponente");
		int Exponente = sc.nextInt();
		
		double Total=1;
	
		
	
		for (int veces = 0;Exponente>veces;veces++){
			
			
			
			Total=Total*Base;
		
			
			
		}
		System.out.println("el total es " + Total);
		
	}
}
