package thread;
import java.io.FileOutputStream; 

public class FileOutputStream1 {
	 public static void main(String args[]){    
         try{    
           FileOutputStream fout=new FileOutputStream("H:\\example.txt");    
           String s="Welcome to my world";    
           byte b[]=s.getBytes();   
           fout.write(b);    
           fout.close();    
           System.out.println("Text is inserted in to the file");    
          }
         catch
         (Exception e)
         {
        	 System.out.println(e);
        	 }    
    }    
}  


