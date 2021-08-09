package thread;
import java.io.*;

public class PipedInOut {
	public static void main(String args[])throws Exception{  
		final PipedOutputStream po=new PipedOutputStream();  
		final PipedInputStream  pi=new PipedInputStream();  
		  
		po.connect(pi); 
		Thread t1=new Thread()
		{  
		public void run()
		{  
		for(int i=1;i<=20;i++)
		{  
		try
		{  
		po.write(i);  
		Thread.sleep(500);  
		}
		catch(Exception e)
		{
			
		}  
		}  
		}  
		};   
		Thread t2=new Thread(){  
		public void run(){  
		try{   
		for(int i=1;i<=10;i++)  
		System.out.println(pi.read());  
		}
		catch(Exception e)
		{
		}  
		}  
		};  
		t1.start();  
		t2.start();  
		}

}
