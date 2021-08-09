package app.mylearning;

import java.util.stream.Stream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Repeated1 {
	
	    public static void main(String[] args) {
	        
	        String st = "";
	        System.out.println(st.isBlank()); // Returns true if the string is blank or else false
	        
	        String st1 = " This is lokeshwar";
	        
	        System.out.println(st1.isBlank()); // Returns false because string is not empty
	        
	        String line = "This is goku \nfrom dragon ball z";
	        
	        // Using lines we can print lines in line by line
	        Stream<String> lin = line.lines();
	        
	        lin.forEach(System.out::println);
	        
	        // Repeat
	        System.out.println();
	        String str = " lokeshwar lokeshwar lokeshwar  ";
	        System.out.println(str.repeat(1)); // It is used to repeat a word number of times
	        
	        //Strip 
	        
	        System.out.println(str.strip()); // removes all leading and trailing spaces
	        
	        System.out.println(str.stripLeading()); // removes all leading spaces
	        
	        
	        System.out.println(str.stripTrailing()); // Removes all trailing spaces
	}
	

}
