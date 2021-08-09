package assignment;
import java.util.*;

public class TreeMap1 {
	 public static void main(String args[]) {  
		 TreeMap<Integer,String> map=new TreeMap<Integer,String>();       
		      map.put(111,"Mahesh");    
		      map.put(222,"Pawan");    
		      map.put(333,"Tarak");    
		      map.put(444,"Ravi");  
		      map.put(555,"Nani"); 
		      System.out.println("Before using remove() method");  
		      for(Map.Entry m:map.entrySet())  
		      {  
		          System.out.println(m.getKey()+" "+m.getValue());      
		      } 
		      
		      map.remove(222);      
		      System.out.println("After Using remove() method");  
		      for(Map.Entry m:map.entrySet())  
		      {  
		          System.out.println(m.getKey()+" "+m.getValue());      
		      } 
		     
		      System.out.println("DescendingOrder: "+map.descendingMap());
		      System.out.println("headMap: "+map.headMap(333,false));  
		      System.out.println("headMap: "+map.headMap(333,true));
		      System.out.println("TailMap: "+map.tailMap(444));
		      System.out.println("SubMap: "+map.subMap(111, false, 555, false));
		      }  

}
