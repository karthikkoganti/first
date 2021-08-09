package assignment;
import java.util.*; 

public class Deque1 {
	public static void main(String[] args) {  
	    Deque<String> de=new ArrayDeque<String>();
	    de.add("Lucifer");
	    de.offer("Klaus");
	    de.offer("damon");
	    de.offerFirst("Ellijah");
	    de.offerLast("Stefhan");
	    System.out.println("after offer first"+de);
	    for(String s:de){  
	        System.out.println(s);  
	    }  
	    de.poll();
	    System.out.println(de);
	    de.pollFirst();
	    System.out.println("After poll the first element\n"+de);
	    de.pollLast();
	    System.out.println("After poll the Last element\n"+de);
	    de.peekFirst();
	    System.out.println(de);
	    
	    
	    
	    

}
}

