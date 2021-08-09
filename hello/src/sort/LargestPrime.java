package sort;

public class LargestPrime {
	public static int largestPrimeFactor(int n)
	{
		int i;
		for(i=2;i<=n;i++) {
			if(n%i==0) {
				n=n/i;
				i--;
			}
		}
		return i;
	}
	public static void main(String[] args) {
		System.out.println(LargestPrime.largestPrimeFactor(5));
	}

}
