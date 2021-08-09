package thread;

public class LambdaThread {
	  public static void main(String[] args) {  
 	        Runnable k1=new Runnable(){  
	            public void run(){  
	                System.out.println("Thread1 is running successfully");  
	            }  
	        };  
	        Thread t1=new Thread(k1);  
	        t1.start();  
	        
	        //////////////////////////////
	        
	        Runnable k2=()->{  
	                System.out.println("Thread2 is running successfully");  
	        };  
	        Thread t2=new Thread(k2);  
	        t2.start();  
	    }  

}
