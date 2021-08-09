package thread;
import java.io.FilterReader;
import java.io.Reader;
import java.io.StringReader;

public class FilterReader1 {
	public static void main(String[] args) 
			throws Exception {
	      FilterReader fr = null;
	      Reader r = null;      
	      int i = 0;
	      char c;
	      
	      try {
	   
	         r = new StringReader("Karthik");
	          
	        
	         fr = new FilterReader(r) {
	         };
	         
	     
	         while((i = fr.read())!=-1) {
	      
	            c = (char)i;
	            System.out.println("Character read: "+c);
	         }
	         
	      } 
	      catch(Exception e)
	      {
	         e.printStackTrace();
	      }
	      finally {
	         if(r!=null)
	            r.close();
	         if(fr!=null)
	            fr.close();
	      }
	   }

}
