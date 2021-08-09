package assignment;
import java.util.Map;
import java.util.HashMap;


public class Hashmap1 {
	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
	    hashmap.put(1, "mani");
	    hashmap.put(2, "lokesh");
	    hashmap.put(3, "subbu");
	    hashmap.put(4, "karthik");
	    System.out.println(hashmap);
	    System.out.println(hashmap.keySet());
	    System.out.println(hashmap.values());
	    System.out.println(hashmap.containsKey(2));
	    System.out.println(hashmap.containsKey(5));	
	    System.out.println("removing  "+hashmap.remove(4));
	    System.out.println(hashmap);
	    HashMap<Integer, String> hashmap2 = new HashMap<Integer, String>();
	    hashmap2.putAll(hashmap);
	    System.out.println("hashmap2 "+hashmap2);
	    System.out.println(hashmap.replace(4,"Karthik","Koganti"));
	    System.out.println(hashmap);
	    for(String str:hashmap.values())
	    {
	    	System.out.println(str);
	    }
	    for(Map.Entry kv:hashmap.entrySet())
	    {
	    	System.out.print(kv.getKey()+" "+kv.getValue());
	    }
	   
	}


}
