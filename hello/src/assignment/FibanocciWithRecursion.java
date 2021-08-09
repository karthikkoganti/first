package assignment;

public class FibanocciWithRecursion {
	static int m=0,n=2,p=0;
	static void fib(int count) {
		if(count>0) {
			p=m+n;
			m=n;
			n=p;
			System.out.println(p);
			fib(count-1);
		}
		
		
	}
	public static void main(String args[]) {
		 int count=20;    
		  System.out.print(m+" "+n);
		  fib(count-2);
		
	}

}
