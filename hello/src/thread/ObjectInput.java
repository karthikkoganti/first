package thread;
import java.io.DataInputStream;  
import java.io.DataOutputStream;  
import java.io.FileInputStream;  
import java.io.FileOutputStream;  
import java.io.IOException;  
import java.io.InputStream;  

public class ObjectInput {
	 public static void main(String[] args) throws IOException {  
	       
	      short[] sb = {1,18,17,3,409,35};  	      
	      try { 
	       FileOutputStream   fos = new FileOutputStream("file1.txt");  	           
	        DataOutputStream dos = new DataOutputStream(fos);  
	         for (short b:sb) {   
	            dos.writeShort(b);  
	         }   
	         dos.flush();  
	         InputStream inpstream = new FileInputStream("file1.txt");  
	        DataInputStream datainpstream = new DataInputStream(inpstream);   
	         while(datainpstream.available()>0) {  
	            short c = datainpstream.readShort();  
	            System.out.print(" "+c);  
	         }  
	      } catch(Exception e) {   
	         e.printStackTrace();  
	      }   
	   }  

}
