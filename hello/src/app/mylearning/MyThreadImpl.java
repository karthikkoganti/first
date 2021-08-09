package app.mylearning;

class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
	}
	public void run() {
		System.out.println("Current Thread"+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			processDBRecords();
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("end of Thread Processers"+Thread.currentThread().getName());
	}
	private void processDBRecords() throws InterruptedException{
		Thread.sleep(6000);
	}
}

 public class MyThreadImpl {
	 public static void main(String[] args) {
		 Thread t1=new MyThread("t1");
		 Thread t2=new MyThread("t2");
		 t1.start();
		 t2.start();
		 System.out.println("Threads started running");
		 Thread t3=new MyThread("t3");
		 Thread t4=new MyThread("t4");
		 t3.start();
		 t4.start();
		 System.out.println("My New Threads started running");
	 }
	
 }

