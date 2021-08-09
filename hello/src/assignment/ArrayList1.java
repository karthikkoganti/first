package assignment;
import java.util.*;

public class ArrayList1 {
	public static void main(String args[]){  
		  ArrayList<String> cars=new ArrayList<String>();   
		      cars.add("Thar");   
		      cars.add("Kia");    
		      cars.add("Mg Hector");    
		      cars.add("Audi"); 
		      cars.add("Benz");
		      cars.add("Bmw");
		     
		      System.out.println(cars); 
		      cars.remove("Benz");
		      System.out.println("After removing the specific object\n"+cars);
		      cars.remove(1);
		      System.out.println("After removing the element by the index position\n"+cars);
		      
		      ArrayList<Integer> Id=new ArrayList<Integer>();
		      Id.add(18);
		      Id.add(17);
		      Id.add(3);
		      Id.add(409);
		      
		      Collections.sort(Id);
		      
		      System.out.println(Id); 

}
}
