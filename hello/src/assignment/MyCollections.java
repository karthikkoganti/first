package assignment;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;


public class MyCollections {
	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("Karthik");
		list.add("Lokesh");
		list.add("subbu");
		list.add("Manidhar");
		System.out.println("before adding new:"+list);
		Collections.addAll(list,"Srikanth", "Priyanka");
				String[] strArray = {"Maduparna", "Sailahari"};
				Collections.addAll(list,strArray);
				System.out.println("new list:"+list);	
		
	}

}
