package thread;

public class ThreadGroup1 implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		}
	public static void main(String[] args) {  
	    ThreadGroup1 runnable = new ThreadGroup1();
		
	    ThreadGroup tg1 = new ThreadGroup("Main Thread-group");  
       
	    Thread t1 = new Thread(tg1, runnable,"Karthik");  
        t1.start();  
        Thread t2 = new Thread(tg1, runnable,"Subbu");  
        t2.start();  
        Thread t3 = new Thread(tg1, runnable,"Lokesh");  
        t3.start();  
        Thread t4 = new Thread(tg1, runnable,"Manidar");  
        t4.start(); 
        System.out.println("Thread Group Name: "+tg1.getName());  
        tg1.list();  

	}

}
