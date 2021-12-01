package model;

public class DataCenter {
	
	private double valorAlquilerGeneral;
	
	private MiniCuartos rooms[][];
	
	public DataCenter(double valorAlquilerGeneral) {
		this.valorAlquilerGeneral = valorAlquilerGeneral;
		rooms=new MiniCuartos[50][8];
		
	}
	public String cambiarStringNumero(int j,int i){
		j=j+1;
		String [] numerosLetras= {"A","B","C","D","E","F","G","H"};
		String numero=numerosLetras[i]+"";
		if(j<10){
			numero=numero+"0"+j+"";
		}else{
			numero=numero+j+"";
		}
		return numero;

	}
	public String showListRooms(double valorAlquiler){
		//rooms[j][i] = new MiniCuartos(numero);
		String print ="";
		String numero="";
		boolean ventanaSIoNO=false;
		String ventana="No";
		for (int i=0; i< 8; i++ ) { // filas numbers.length
			for (int j = 0; j < 50; j++) { //columnas numbers[0].length
				if(rooms[j][i]==null){
					ventanaSIoNO=false;
					
					if(i==0 || i==7){
						ventanaSIoNO=true;
					}else if(j==0 || j==49){
						ventanaSIoNO=true;
					}
					if(ventanaSIoNO==true){
						ventana="Si";
					}else{
						ventana="No";
					}
					
					numero=cambiarStringNumero(j,i);
					valorAlquiler=calcularDescuentos(i,valorAlquilerGeneral,ventanaSIoNO);
					
					print +="Cuarto numero: "+numero+" - Corredor: "+(i+1)+" - Posicion/Columna: "+(j+1)+" - Ventana: "+ventana+" - Valor de alquiler: "+valorAlquiler+" pesos.";
					print += "\n";
				}	
			}
			
		}
		return print;
	}
	public double calcularDescuentos(int i,double valorAlquilerGeneral,boolean ventanaSIoNO){
		double valorAlquiler=valorAlquilerGeneral;
		
		/*Minicuarto ubicado en Ventana: tiene un descuento del 10%
		Minicuarto ubicado en el séptimo corredor: tiene un descuento del 15%
		Minicuarto ubicado entre el segundo y sexto corredor, tiene un recargo del 25%*/
		
		if(ventanaSIoNO==true){
			valorAlquiler=valorAlquiler-(valorAlquiler*0.1);
		}
		if(i==6){
			valorAlquiler=valorAlquiler-(valorAlquiler*0.15);
		}
		if(i>0 && i<5){
			valorAlquiler=valorAlquiler+(valorAlquiler*0.25);
		}

		return valorAlquiler;
	}
	public double getValorAlquilerGeneral() {
		return valorAlquilerGeneral;
	}

	public void setValorAlquilerGeneral(double valorAlquilerGeneral) {
		this.valorAlquilerGeneral = valorAlquilerGeneral;
	}
	

	
}