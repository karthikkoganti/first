package thread;

public class DaemonThread extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon thread is running");
		}
		else
		{
			System.out.println("user thread is running");
		}
	}
	
	public static void main(String[] args) {
		DaemonThread dt=new DaemonThread();
		DaemonThread dt1=new DaemonThread();
		dt.setDaemon(true);
		dt.start();
		dt1.start();
	}

}
