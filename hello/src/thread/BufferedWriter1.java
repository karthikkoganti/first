package thread;
import java.io.*;  

public class BufferedWriter1 {
	public static void main(String[] args) throws Exception {     
	    FileWriter writer = new FileWriter("H:\\file2.txt");  
	    BufferedWriter buffer = new BufferedWriter(writer);  
	    buffer.write("Welcome to sagarsoft");  
	    buffer.close();  
	    System.out.println("Added to the file");  
	    }  

}
