package thread;

public class JoinThread extends Thread{
	public void run() {
		Thread th = Thread.currentThread();
        System.out.println("Thread started: "+th.getName());
        try {
            Thread.sleep(1000);
        } 
        catch (InterruptedException ie) 
        {
            ie.printStackTrace();
        }
        System.out.println("Thread ended: "+th.getName());
        
    
	}
	public static void main(String[] args) {
		JoinThread jt=new JoinThread();
		JoinThread jt2=new JoinThread();
		JoinThread jt3=new JoinThread();
		JoinThread jt4=new JoinThread();
		jt.start();
		try {
	          jt.join();
	      } 
		catch (InterruptedException ie) 
		{
	          ie.printStackTrace();
	        }
		System.out.println("Thread 0 running completed:");
		jt2.start();
		try {
	          jt2.join();
	      } 
		catch (InterruptedException ie) 
		{
	          ie.printStackTrace();
	        }
		System.out.println("Thread 1 running completed:");
		jt3.start();
		try {
	          jt3.join();
	      } 
		catch (InterruptedException ie) 
		{
	          ie.printStackTrace();
	        }
		System.out.println("Thread 2 running completed:");
		jt4.start();
		try {
	          jt4.join();
	      } 
		catch (InterruptedException ie) 
		{
	          ie.printStackTrace();
	        }
		System.out.println("Thread 3 running completed:");
		
		

	}

}
