import java.util.Scanner;
public class Menu{
	Scanner sc = new Scanner (System.in);
	public static void main(String[]args){
	
		menu();
	}
	public static void menu(){
		
		boolean salir = false;
		while (!salir){
			System.out.println(".");
			string entrada1 = sc.nextline();
			if (entrada1=="salir"){
				salir=true;
			}
			
		}
		
	}	
}