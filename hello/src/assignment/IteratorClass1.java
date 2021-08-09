package assignment;
import java.util.Iterator;  
import java.util.LinkedList;  
import java.util.List;  

public class IteratorClass1 {
	 public static void main(String[] args) {  
		  List<String> greet = new LinkedList<>();
		  greet.add("Hello");
		  greet.add("All");
		  greet.add("Good");
		  greet.add("Afternoon");
		  
		  System.out.println("Initial elements\n"+greet);
		  
		  Iterator<String> it = greet.iterator(); 
		  while(it.hasNext()) {
			  System.out.println(it.next());
		  }
		  it.remove();
		  System.out.println("after removing"+greet);

}
}