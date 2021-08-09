package assignment;

import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String args[]){  
		LinkedList<String> lla=new LinkedList<String>();
		lla.add("first");
		lla.add("second");
		lla.add("Third");
		lla.add("four");
		lla.add("five");
		System.out.println(lla);
		
		lla.add(1,"karthik");
		System.out.println("adding the name at index position 1\n "+lla);
		lla.add("koganti");
		System.out.println("at last position my string is added by default\n"+lla);
		
		lla.remove(0);
		System.out.println("Deleting is happen at index position 0 \n "+lla);
		
		lla.remove("second");
		System.out.println("Deleting the specific item \n "+lla);
	}

}
