package thread;

import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors; 

class MyWorkerThread implements Runnable {
	private String msg;
	public MyWorkerThread(String str) {
		this.msg=str;
	}
	public void run() {
		System.out.println(Thread.currentThread().getName()+"This message is "+msg);
		processMsg();
		System.out.println(Thread.currentThread().getName()+"This message is "+msg);
		
	}
	private void processMsg() {
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
}

public class MyWorkerThreadImpl {
	public static void main(String [] args) {
		ExecutorService es=Executors.newFixedThreadPool(6);
		for(int i=0;i<10;i++) {
			Runnable MyWorkerThread= new MyWorkerThread("WT"+i);
			es.execute(MyWorkerThread);
		}
		es.shutdown();
		while(!es.isTerminated()) {
			
		}
		System.out.println("Threads ran to completion");
	}

}

