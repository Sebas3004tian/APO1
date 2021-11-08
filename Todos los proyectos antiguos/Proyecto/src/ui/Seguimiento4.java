/*Sebastian Lopez Garcia
Este programa permitira al usuario saberel valor de la cuota extraordinaria que debe pagar por 
su apartamento,a continuacion se crea un metodo diferentea para calcular el descuento o incremento de
la cuota total a pagar.Se calcula cada uno de los descuentos o incrementos y se le suman o restan al valor de cuota inicial 
el cual es de 50000.

Entradas:
-Edad
-Tipo de apartamento-Periodicidad con la que utilizara el gimnacio
Salida:
Valor de cuota extraordinaria

Ejemplo:
Miguel con 55 años,apartamento de tipo familiar,periodicidad de 5 dias,y numero de habitantes
de 4 personas.
 
Miguel como tiene 55 es menor de 65 no tiene descuento por edad
al ser apartamento tipo familiar tiene un incremento del 15% sobre la cuota basica teniendo 
un incremento de 7500.
Al tener una periodicidad de 5 dias a la semana tiene un incremento de 7% osea 3500 de incremento
Al vivir 4 habitantes en el apartamento tiene un incremento de 2%  por persona lo que daria un incremento de 4000 */


import java.util.Scanner;
public class Seguimiento4{
	
	public static void main(String[]args){
		double CuotaTotal=0;
		double Cuota = 50000;
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite edad");
		int Edad = sc.nextInt();
	
	
		System.out.println("Digite el tipo de apartamento (Apartaestudio(1),Familiar(2),Duplex(3),Penthouse(4))");
		int Apartamento = sc.nextInt();
	
		
		
		System.out.println("Periodicidad(dias a la semana) con la que utilizara el gim");
		int Dias = sc.nextInt();
		
		
		System.out.println("Digite el numero de habitantes en el apartamento");
		int Habitantes = sc.nextInt();
		
		
		
		CuotaTotal=Cuota-DesEdad(Edad,Cuota)+DesApartamento(Apartamento,Cuota)+DesDias(Dias,Cuota)+DesHabitantes(Habitantes,Cuota);
		System.out.println("La cuota total a pagar es de "+CuotaTotal);
		if (DesEdad(Edad,Cuota)<0){
			System.out.println("Con un descuento de "+DesEdad(Edad,Cuota)+" por la edad.");
		}
		
		if (DesDias(Dias,Cuota)<0){
			System.out.println("Y con un descuento de "+DesDias(Dias,Cuota)+" por los dias.");
		}
		
	}
	/*Este metodo cumple la funcion de encontrar si hay descuento por edad(DesEdad), mirando si la edad
	es mayor a 65 se le aplica el descuento si no el descuento por edad queda en 0*/
	public static double DesEdad(int Edad,double Cuota){
		double DesEdad=0;
		if (Edad>65){
			DesEdad=(Cuota*0.4);
			return DesEdad;
		}
		return DesEdad;
	}
	/*Este metodo calcula el incremento por tipo de apartamento dependiendo del tipo de apartamento ingresado por el ususario*/
	public static double DesApartamento(int Apartamento,double Cuota){
		double DesApartamento=0;
		if (Apartamento==1){
			DesApartamento=(Cuota*0.1);
			return DesApartamento;
		}else
		if (Apartamento==2){
			DesApartamento=(Cuota*0.15);
			return DesApartamento;
		}else
		if (Apartamento==3){
			DesApartamento=(Cuota*0.2);
			return DesApartamento;
		}else
		if (Apartamento==4){
			DesApartamento=(Cuota*0.25);
			return DesApartamento;
		}else{
			System.out.println("No seleccionaste un Apartamento");
			System.exit(0);
		}
		return DesApartamento;
	}
	public static double DesDias(int Dias,double Cuota){
		double DesDias=0;
		if (Dias==0){
			DesDias=((Cuota*0.2)*(-1));
			return DesDias;
		}else
		if ((Dias==1)||(Dias==2)){
			DesDias=0;
			return DesDias;
		}else
		if ((Dias==3)||(Dias==4)){
			DesDias=(Cuota*0.05);
			return DesDias;
		}else
		if ((Dias==5)||(Dias==6)){
			DesDias=(Cuota*0.07);
			return DesDias;
		}else
		if (Dias>=7){
			DesDias=(Cuota*0.1);
			return DesDias;
		}else{
			System.out.println("No seleccionaste una periodicidad");
			System.exit(0);
		}
		
		return DesDias;
	}
		public static double DesHabitantes(int Habitantes,double Cuota){
		double DesHabitantes=0;
		if ((Habitantes==1)||(Habitantes==2)){
			DesHabitantes=0;
			return DesHabitantes;
		}else
		if ((Habitantes==3)||(Habitantes==4)){
			DesHabitantes=((Cuota*0.02)*Habitantes);
			return DesHabitantes;
		}else
		if (Habitantes>=5){
			DesHabitantes=((Cuota*0.05)*Habitantes);
			return DesHabitantes;
		}else{
			System.out.println("No seleccionaste una periodicidad");
			System.exit(0);
		}
		
		return DesHabitantes;
	}
}
		
		