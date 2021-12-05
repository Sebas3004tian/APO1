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
		i=i+1;
		//String [] numerosLetras= {"A","B","C","D","E","F","G","H"};
		String numero=i+"";
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
	public boolean miniRoomDisponible(String numeroCuarto){
		boolean miniRoomEncontrada=false;
		
		String fila=numeroCuarto.substring(0,1);
		String columna=numeroCuarto.substring(1,3);
		
		int intFila=Integer.parseInt(fila);
		int intColumna=Integer.parseInt(columna);
		
		//System.out.println("fila:"+intFila+"columna:"+intColumna);
		if(intFila>0 && intFila<9 && intColumna>0 && intColumna<51){
			if(rooms[intColumna-1][intFila-1]==null){
				miniRoomEncontrada=true;
			}
		}
		
		
		return miniRoomEncontrada;
		
	}
	public void alquilarRoomProyecto(String numeroCuarto,int day,int month,int year,int numeroServidores,int numRegistroProyecto){
		boolean ventanaSIoNO=false;
		String fila=numeroCuarto.substring(0,1);
		String columna=numeroCuarto.substring(1,3);
		
		int intFila=Integer.parseInt(fila);
		int intColumna=Integer.parseInt(columna);
		int i=intFila-1;
		int j=intColumna-1;
		if(i==0 || i==7){
			ventanaSIoNO=true;
		}else if((intColumna-1)==0 || (intColumna-1)==49){
			ventanaSIoNO=true;
		}
		double precio=calcularDescuentos(i,valorAlquilerGeneral,ventanaSIoNO);
		if(numeroServidores<4){
			precio=precio+(precio*0.15);
		}
		
		
	}
	public void alquilarRoomEmpresa(String numeroCuarto,int day,int month,int year,int numeroServidores,String nit,String nombreEmpresa,int numRegistroProyecto,int asignadoMiniRoom){
		boolean ventanaSIoNO=false;
		String fila=numeroCuarto.substring(0,1);
		String columna=numeroCuarto.substring(1,3);
		
		int intFila=Integer.parseInt(fila);
		int intColumna=Integer.parseInt(columna);
		int i=intFila-1;
		int j=intColumna-1;
		if(i==0 || i==7){
			ventanaSIoNO=true;
		}else if((intColumna-1)==0 || (intColumna-1)==49){
			ventanaSIoNO=true;
		}
		double precio=calcularDescuentos(i,valorAlquilerGeneral,ventanaSIoNO);
		if(numeroServidores<4){
			precio=precio+(precio*0.15);
		}
		
		
		rooms[j][i] = new MiniCuartos(precio,numeroCuarto,day,month,year,numeroServidores,numRegistroProyecto,i,j,ventanaSIoNO);
		
		rooms[j][i] = new MiniCuartos(precio,numeroCuarto,day,month,year,numeroServidores,nit,nombreEmpresa,i,j,ventanaSIoNO);
	}
	public double getValorAlquilerGeneral() {
		return valorAlquilerGeneral;
	}

	public void setValorAlquilerGeneral(double valorAlquilerGeneral) {
		this.valorAlquilerGeneral = valorAlquilerGeneral;
	}
	

	
}