package app.mylearning;

public class MyNewThreadR implements Runnable{
	public void run() {
		System.out.println("Thread running via runnable");
	}
	 public static void main(String[] args) {
		 MyNewThreadR mntr=new MyNewThreadR();
		 Thread th1=new Thread(mntr);
		 th1.start();
	 }

}
