package thread;
import java.io.StringReader;  

public class StringReader1 {
	  public static void main(String[] args) throws Exception {  
	        String srg = "Hello Freshers.. \n Welcome to Sagarsoft";  
	        StringReader reader = new StringReader(srg);  
	        int k=0;  
	            while((k=reader.read())!=-1){  
	                System.out.print((char)k);  
	            }  
	        }  

}
