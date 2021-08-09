package thread;
import java.io.*;  
public class ByteArrayIn {
	 public static void main(String[] args) throws IOException {  
		    byte[] bu = { 40, 51, 48, 47 };  
		    ByteArrayInputStream by = new ByteArrayInputStream(bu);  
		    int i = 0;  
		    while ((i = by.read()) != -1)
		    {   
		      char c = (char) i;  
		      System.out.println("ASCII value of Character is:" + i + "; Special character is: " + c);  
		    }  
		  }  
		

}
