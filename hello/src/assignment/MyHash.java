package assignment;
import java.util.*;
public class MyHash {
public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Karthik");
		hashSet.add("Lokesh");
		hashSet.add("Mani");
		hashSet.add("subbu");
		System.out.println(hashSet.contains("Lokesh"));
		System.out.println(hashSet);
		hashSet.remove("Mani");
		for(String i: hashSet) {
			System.out.println(i);
		}
		
		
	}


}
