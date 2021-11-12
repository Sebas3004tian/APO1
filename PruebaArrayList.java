import java.util.ArrayList;

public class PruebaArrayList {
   public static void main(String[] args) {

      // create an empty array list with an initial capacity
      ArrayList<Integer> str = new ArrayList<Integer>(5);

		str.add(0);
		str.add(1);
		str.add(2);
		str.add(3); 
		
		//Result = [0, 11, 12, 1, 2, 3

      // let us print all the elements available in list
	  for(int x=0;x<str.size();x++){
		 System.out.println(x+". "+"Number = " + str.get(x));
	  }  
	  System.out.println("---------------------------------------------------------");
		str.add(1, 11);
		str.add(2, 12);
		for(int x=0;x<str.size();x++){
			System.out.println(x+". "+"Number = " + str.get(x));
		}  
   }
}