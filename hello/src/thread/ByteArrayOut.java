package thread;
import java.io.*;

public class ByteArrayOut {
	public static void main(String args[])throws Exception{    
	      FileOutputStream ft1=new FileOutputStream("H:\\file1.txt");    
	      FileOutputStream ft2=new FileOutputStream("H:\\file2.txt");    
	        
	      ByteArrayOutputStream bt=new ByteArrayOutputStream();    
	      bt.write(100);    
	      bt.writeTo(ft1);    
	      bt.writeTo(ft2);    
	        
	      bt.flush();    
	      bt.close();   
	      System.out.println("data inserted in to multiple files");    
	     }    

}
