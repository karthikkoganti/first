package assignment;
import java.util.*;  
public class LinkedHashMap1 {
	public static void main(String[] args)
	{
	LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>(); 
		map.put(18,"virat");
		map.put(17, "Abraham");
		map.put(3, "Triven");
		
		
		System.out.println("Keys:"+map.keySet());
		System.out.println("value contains :"+map.containsValue("Triven"));
		System.out.println("values:"+map.values());
		System.out.println("Key-set:"+map.entrySet());
		
		map.remove(17);
		System.out.println("Removing key:"+map);
		
		System.out.println("Removing key:"+map.remove(18));
		System.out.println("Key-set:"+map.entrySet());

	
}
}
