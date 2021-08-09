package thread;

public class Thread1 extends Thread  {
	public void run() {
		Thread t = Thread.currentThread();
		 System.out.println("Thread started: "+t.getName());
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
				
			}
			System.out.println("Thread Ended: "+t.getName());
		}
			
		
		public static void main(String[] args) {
			Thread1 mtst = new Thread1();
			Thread1  mtst1 = new Thread1();
			mtst.start();  
			//mtst.start();//Started same thread second time
			mtst1.start();
			mtst.run();//Main thread starts and ends.
			
		}
	}
	


