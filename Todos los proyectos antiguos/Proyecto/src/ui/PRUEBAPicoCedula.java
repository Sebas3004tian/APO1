/*import java.util.Scanner; 

public class PicoCedula{
	
	public static void main (String[] args){
	
		System.out.println("Digite su numero de cedula: ");
		Scanner sc = new Scanner(System.in);
		String cc = sc.nextLine();
		System.out.println("Digite su año de nacimiento: ");
		int nac = sc.nextInt();
	
		int anio = sc.nextInt();
		int tamanio = cc.length();
	
		String ulpal = cc.substring(tamanio-1,tamanio);
		String penpal = cc.substring(tamanio-2,tamanio);
	
		System.out.println(ulpal);
		System.out.println(penpal);
	
		horas(int nac);
	}
	
	public static int horas(int age){
		int anio = 2021 - age
		if else (anio < 18){  
			System.out.println("su actividad es de 9pm a 12 pm")
		}else if (anio < 40){
			System.out.println("su actividad es de 10pm a 3am")
		}else if (anio < 65){
			System.out.println("su actividad es de 9pm a 12pm")
		}else if (anio > 65){
			System.out.println("su actividad es de 12am a 6am")
		}
	}
	

}*/
import java.util.Scanner; 

public class PRUEBAPicoCedula{
	public static void main (String[] args){
	
		System.out.println("Digite su numero de cedula: ");
		Scanner sc = new Scanner(System.in);
		String cc = sc.nextLine();
		int nac = sc.nextInt();
		System.out.println("Digite su año de nacimiento: ");

	
		int age = sc.nextInt();
		int tamanio = cc.length();//y tampoco se para que es esta entrada mano-----------------
	
		String ulpal = cc.substring(tamanio-1,tamanio);//ve explicame pa que es ulpal sjsjsjs------------
		String penpal = cc.substring(tamanio-2,tamanio);
	
		System.out.println(ulpal);//socio esto no se pa que es-------------
		System.out.println(penpal);//ultimas 2 cifras
		int Cifras = Integer.parseInt (penpal);//esta es la nea que le cambia de String a int lo de (penpal) qeu segun entiendo son las 2 cifras de la cedula
		int anio = 2021 - age;
		System.out.println(anio); //edad en años
		System.out.println(DiadeDiciembre(Cifras));
		
		
	
	}
	public static String horas(int anio){ /*perdoname aqui puse esto de int a String pa que podas sacar pues lo que se dice seria solo nombrar en un
	System.out.print(horas(anio) pa sacarlo)*/
		String horas = "";
		
		if(anio < 18){  
			horas = "su actividad es de 9pm a 12 pm";
		
		}else if (anio>=18 && anio <= 40){
			horas = "su actividad es de 10pm a 3am";
		
		}else if (anio>40 && anio < 65){
			horas = "su actividad es de 9pm a 12pm";
		
		}else if (anio >= 65){
			horas = "su actividad es de 12am a 6am";
	
		}
		return horas;
	}
	public static int DiadeDiciembre(int Cifras){
		int DiadeDiciembre = 1; 
		int Mod = Cifras%6;
		if (Mod==0){
			return DiadeDiciembre = 25;
			
		}else if (Mod==1){
			return DiadeDiciembre = 26;
			
		}else if (Mod==2){
			return DiadeDiciembre = 27;
			
		}else if (Mod==3){
			return DiadeDiciembre = 28;
			
		}else if (Mod==4){
			return DiadeDiciembre = 29;
			
		}else if (Mod==5){
			return DiadeDiciembre = 30;
			 
		}

		return Mod;
		
		
	}
	
	
	
	
	

}
/*if (Mod==0){
			DiadeDiciembre = 25;
			return Mod;
		}else if (Mod==1){
			DiadeDiciembre = 26;
			return Mod;
		}else if (Mod==2){
			DiadeDiciembre = 27;
			return Mod;
		}else if (Mod==3){
			DiadeDiciembre = 28;
			return Mod;
		}else if (Mod==4){
			DiadeDiciembre = 29;
			return Mod;
		}else if (Mod==5){
			DiadeDiciembre = 30;
			return Mod;
		}*/