package model;
import java.util.ArrayList;

//.equalsIgnoreCase()
//.setStatus(Status.INACTIVE)

public class SantaApp{
	//private Child goodChildsList;
	private ArrayList<Child> goodChildsList ;
	private ArrayList<Child> naughtyChildsList ;
	private Child otherChild;
	
	public SantaApp(){
		
		goodChildsList = new ArrayList <Child>();
		naughtyChildsList = new ArrayList <Child>();
		
	}
	public void addChild(String nombre,String apellido,int edad,String direccion,String ciudad,String pais,String deseo,String comportamiento){
		//System.out.println(goodChildsList.size());
		String dirrecionTotal=direccion+" de "+ciudad+", "+pais;
		System.out.println(goodChildsList.size()+" el tamaño del arry");
		if(comportamiento.equalsIgnoreCase("GOOD")){
			
			if(goodChildsList.size()>0){
				for(int x=0;x<goodChildsList.size();x++){
					otherChild=new Child(nombre,apellido,edad,dirrecionTotal,deseo);
					if(goodChildsList.get(x).compareTo(otherChild)<=0){
						
						goodChildsList.add(x,otherChild);
					}
					if(goodChildsList.get(x).compareTo(otherChild)>=0){
						goodChildsList.add(new Child(nombre,apellido,edad,dirrecionTotal,deseo));
						
					}
					/*if(goodChildsList.get(x).getEdad()>edad){
						
						System.out.println(goodChildsList.get(x).getEdad());
						System.out.println(edad);
						//goodChildsList.add(x,new Child(nombre,apellido,edad,direccion,ciudad,pais,deseo));
					}*/
				}
				
			}
			//goodChildsList.add(new Child(nombre,apellido,edad,dirrecionTotal,deseo));
		}
		if(comportamiento.equalsIgnoreCase("NAUGHTY")){
			naughtyChildsList.add(new Child(nombre,apellido,edad,dirrecionTotal,deseo));
		}
		if(goodChildsList.size()==0){
			goodChildsList.add(new Child(nombre,apellido,edad,dirrecionTotal,deseo));
		}
		System.out.println(goodChildsList.size()+" el tamaño del arry  2" );
		
		
		
	}
	public String showList(String tipoLista){
		String lista="";
		
		if(tipoLista.equalsIgnoreCase("GOOD")){
			
			for(int x=0;x<goodChildsList.size();x++){
				
				lista+=goodChildsList.get(x).toString();
			}
		}
		if(tipoLista.equalsIgnoreCase("NAUGHTY")){
			
		}
		return lista;
	}
	
}