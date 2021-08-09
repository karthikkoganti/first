package thread;

public class Thread2 extends Thread{
	 public void run()  
	    {    
	    System.out.println("First thread running...");    
	    }
	 
	    public static void main(String args[])  
	    {    
	    	Thread2 th=new Thread2();
	    	//th.start();
	    	//th.start();//starting the same thread second time.
	    	// It will Throw an error because we already started the thread. 
	    	th.run();
	    }

}
