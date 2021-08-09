package thread;

public class PriorityThread extends Thread {
	public void run() {
		System.out.println("Priority Thread:");
	}
	public static void main(String[] args) {
		PriorityThread pt=new PriorityThread();
		PriorityThread pt1=new PriorityThread();
		PriorityThread pt2=new PriorityThread();
		System.out.println("Priority for Thread1:"+pt.getPriority());
		System.out.println("Priority for Thread2:"+pt1.getPriority());
		System.out.println("Priority for Thread3:"+pt2.getPriority());
		pt.setPriority(10);
		pt1.setPriority(9);
		pt2.setPriority(8);
		System.out.println("Priority for Thread1 after setting:"+pt.getPriority());
		System.out.println("Priority for Thread2 after setting:"+pt1.getPriority());
		System.out.println("Priority for Thread3 after setting:"+pt2.getPriority());
		
		 pt1.setPriority(Thread.MIN_PRIORITY); 
		 pt1.start();
		
		
	}

}
