package sort;

public class AnonymousClass1 {
	 public static void main(String[] args) {  
		try { 
	 
	        Runnable k1=new Runnable(){  
	            public void run(){  
	                System.out.println(" running successfully");  
	            }  
	        };
	        Runnable k2=()->
	        System.out.println(" not running successfully");
	        k1.run();
	        k2.run();
		}
		catch(Exception e) {
			System.out.println(e);
		}
			
		}
		
	 }
	 
