package assignment;
import java.util.*; 

public class VectorClass1 {
	 public static void main(String args[]) {  
          
         Vector<String> v = new Vector<String>(4);  
 
         v.add("Karthik");  
         v.add("Manidar");  
         v.add("subbu");  
         v.add("Lokesh"); 
         v.add("koganti");
         System.out.println("Initial elements "+v);  
         System.out.println("Size is: "+v.size());  
         System.out.println("capacity is: "+v.capacity());  
          
         v.addElement("Madhu");  
         v.addElement("Priyanka");  
         v.addElement("sai"); 
         v.addElement("Srikanth"); 
         System.out.println("Size after adding some elements: "+v.size());
         System.out.println("capacity after adding some elements: "+v.capacity());
         System.out.println("Total elements after addition \n"+v); 
         
         System.out.println("The first person of the vector is = "+ v.firstElement());   
         System.out.println("The last person of the vector is = "+v.lastElement());
         
          
          
           
      }  
}  


