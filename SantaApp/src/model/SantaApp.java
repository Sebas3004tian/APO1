package model;
import java.util.ArrayList;

//.equalsIgnoreCase()
//.setStatus(Status.INACTIVE)

public class SantaApp{
	//private Child goodChildsList;
	private ArrayList<Child> goodChildsList ;
	private ArrayList<Child> naughtyChildsList ;
	private Child otherChild;
	private Child childToChange;
	/**
    * Metodo constructor de la clase
    */
	public SantaApp(){
		
		goodChildsList = new ArrayList <Child>();
		naughtyChildsList = new ArrayList <Child>();
		
	}
	/**
    * Este metodo se encarga de crear un objeto Child en una lista de good o naughty dependiendo del usuario
    * @param nombre String
	* @param apellido String
	* @param edad int
	* @param dirrecionTotal String
	* @param deseo String
	* @param comportamiento String
    */
	public void addChild(String nombre,String apellido,int edad,String dirrecionTotal,String deseo,String comportamiento){
		//System.out.println(goodChildsList.size());
		//String dirrecionTotal=direccion+" de "+ciudad+", "+pais;
		int sizeArray=0;
		int contador=0;
		//System.out.println(goodChildsList.size()+" el tamaño del arry");
		if(comportamiento.equalsIgnoreCase("GOOD")){
			
			if(goodChildsList.size()>0){
				sizeArray=goodChildsList.size();
				for(int x=0;x<sizeArray;x++){
					otherChild=new Child(nombre,apellido,edad,dirrecionTotal,deseo);
					/*if(goodChildsList.get(x).compareTo(otherChild)<0){
						
						goodChildsList.add(new Child(nombre,apellido,edad,dirrecionTotal,deseo));
					}*/
					if(goodChildsList.get(x).compareTo(otherChild)>=0){
						
						goodChildsList.add(x,otherChild);
						contador=1;
					}
					if(contador==1){
						x=sizeArray;
					}
					
				}
				if(contador==0){
					goodChildsList.add(new Child(nombre,apellido,edad,dirrecionTotal,deseo));
				}
				
				
			}
			//goodChildsList.add(new Child(nombre,apellido,edad,dirrecionTotal,deseo));
			if(goodChildsList.size()==0){
				goodChildsList.add(new Child(nombre,apellido,edad,dirrecionTotal,deseo));
			}
		}
		if(comportamiento.equalsIgnoreCase("NAUGHTY")){
			if(naughtyChildsList.size()>0){
				sizeArray=naughtyChildsList.size();
				for(int x=0;x<sizeArray;x++){
					otherChild=new Child(nombre,apellido,edad,dirrecionTotal,deseo);
					/*if(naughtyChildsList.get(x).compareTo(otherChild)<0){
						
						naughtyChildsList.add(new Child(nombre,apellido,edad,dirrecionTotal,deseo));
					}*/
					if(naughtyChildsList.get(x).compareTo(otherChild)>=0){
						
						naughtyChildsList.add(x,otherChild);
						contador=1;
					}
					if(contador==1){
						x=sizeArray;
					}
					
				}
				if(contador==0){
					naughtyChildsList.add(new Child(nombre,apellido,edad,dirrecionTotal,deseo));
				}
				
				
			}
			if(naughtyChildsList.size()==0){
				naughtyChildsList.add(new Child(nombre,apellido,edad,dirrecionTotal,deseo));
			}
			
		}
		
		
		//System.out.println(goodChildsList.size()+" el tamaño del arry  2" );
		
		
		
	}
	/**
    * DMetodo encargado de mostrar la lista que quiere el usuarion pór medio de una cadena
    * @param tipoLista String
    * @return lista String
    */
	public String showList(String tipoLista){
		String lista="";
		
		if(tipoLista.equalsIgnoreCase("GOOD")){
			lista+="        GOOD         "+"\n";
			
			lista+="------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"+"\n";
			if(goodChildsList.size()==0){
				lista="UPS .. looks like there are no childs on this list.";
			}
			for(int x=0;x<goodChildsList.size();x++){
				
				lista+=goodChildsList.get(x).toString();
			}
		}
		if(tipoLista.equalsIgnoreCase("NAUGHTY")){
			lista+="        NAUGHTY         "+"\n";
			lista+="------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"+"\n";
			if(naughtyChildsList.size()==0){
				lista="UPS .. looks like there are no childs on this list.";
			}
			for(int i=0;i<naughtyChildsList.size();i++){
				
				lista+=naughtyChildsList.get(i).toString();
			}
		}
		return lista;
	}
	/**
    * Metodo encargado de verificar si hay el child existe en alguna lista
	* @param nombreChild String
	* @param apellidoChild String
	* @param edadChild int
	* @param tipoLista String
    * @return existe int,Si es -1 no encontro al child,y si es cualquier otro numero es la posicion del child en el arraylist
    */
	public int verificarChild(String nombreChild,String apellidoChild,int edadChild,String tipoLista){
		int existe=-1;
		if(tipoLista.equalsIgnoreCase("GOOD")){
			for(int x=0;x<goodChildsList.size();x++){
				if(nombreChild.equalsIgnoreCase(goodChildsList.get(x).getNombre())){
					if(apellidoChild.equalsIgnoreCase(goodChildsList.get(x).getApellido())){
						if(edadChild==goodChildsList.get(x).getEdad()){
							existe=x;
						}
					}
				}
			}
		}
		if(tipoLista.equalsIgnoreCase("NAUGHTY")){
			for(int x=0;x<naughtyChildsList.size();x++){
				if(nombreChild.equalsIgnoreCase(naughtyChildsList.get(x).getNombre())){
					if(apellidoChild.equalsIgnoreCase(naughtyChildsList.get(x).getApellido())){
						if(edadChild==naughtyChildsList.get(x).getEdad()){
							existe=x;
						}
					}
				}
			}
		}
		return existe;
	}
	/**
    * Metodo encargado de cambiar a un CHild de una lista a otra 
	* @param nombreChild String
	* @param apellidoChild String
	* @param edadChild int
	* @param tipoLista String
	* @param pocision int
    */
	public void cambiarLista(String nombreChild,String apellidoChild,int edadChild,String tipoLista,int pocision){
		String nombre="";
		String apellido="";
		int edad=0;
		String dirrecionTotal="";
		String deseo="";
		String comportamiento="";
		if(tipoLista.equalsIgnoreCase("GOOD")){
			childToChange=goodChildsList.get(pocision);
			nombre=childToChange.getNombre();
			apellido=childToChange.getApellido();
			edad=childToChange.getEdad();
			dirrecionTotal=childToChange.getDirrecionTotal();
			deseo=childToChange.getDeseo();
			comportamiento="NAUGHTY";
			goodChildsList.remove(pocision);
		}
		if(tipoLista.equalsIgnoreCase("NAUGHTY")){
			childToChange=naughtyChildsList.get(pocision);
			nombre=childToChange.getNombre();
			apellido=childToChange.getApellido();
			edad=childToChange.getEdad();
			dirrecionTotal=childToChange.getDirrecionTotal();
			deseo=childToChange.getDeseo();
			comportamiento="GOOD";
			naughtyChildsList.remove(pocision);
		}
		addChild(nombre,apellido,edad,dirrecionTotal,deseo,comportamiento);
		
		
	}
	
}