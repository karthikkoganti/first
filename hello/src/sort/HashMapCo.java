package sort;

import java.util.HashMap;

public class HashMapCo {
	public static void main(String[] args) {
	     HashMap<Integer, String> hmap = new HashMap<Integer, String>();
	     hmap.put(18, "virat");
	     hmap.put(3, "karthik");
	     hmap.put(75, "Mahesh");
	     hmap.put(17, "Abraham");
	     
	     HashMap<Integer, String> hmap1 = new HashMap<Integer, String>();
	     hmap1.put(1, "cricketer");
	     hmap1.put(2,"actor");
	     hmap1.putAll(hmap);
	     System.out.println("Second hash map contains "+ hmap1);
	}

}
