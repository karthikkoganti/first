package app.mylearning;
import java.util.*; 

import java.util.Map;

public class MyMapImpl {
	public static void main(String args[])   
	{  
		Map myMap=new HashMap();
		myMap.put("rollno", 12345);
		myMap.put("Name", "Karthik");
		System.out.println("My Map"+myMap);
		myMap.keySet();
		myMap.values();
		myMap.entrySet();
		
	}

}
