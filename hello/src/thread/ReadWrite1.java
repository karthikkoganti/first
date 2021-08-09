package thread;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class ReadWrite1 {
	public static void main(String [] args) {	        
	        Path filenew = Paths.get("G:\text1.txt");
	        try {
	            String content = Files.readString(filenew);
	            System.out.println(content);
	        }
	        catch(Exception e) {
	            System.out.println(e);
	        }
	        
	        // Write String
	        
	        try {
	            Path content = Files.writeString(filenew, "Hi Welcome to the sagarsoft", StandardOpenOption.APPEND);
	            System.out.println(content);
	        }
	        catch(Exception e) {
	            System.out.println(e);
	        }
	        
	        
	    }
	}


