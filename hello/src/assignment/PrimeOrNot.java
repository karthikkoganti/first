package assignment;

public class PrimeOrNot {
	static void pri(int n) {
		int i,m=0,flag=0;
		m=n/2;
		if(n==0||n==1) {
			System.out.println("It is not a prime number");
		}
		else {
			for(i=2;i<=m;i++) {
				if(n%i==0) {
					System.out.println("It is not a prime number");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println("It is a prime number");
			}
		}
			
		}
		public static void main(String[] args) {
			pri(1);
			pri(3);
			pri(10);
			pri(997);
			pri(409);
			
		}
		
	}


