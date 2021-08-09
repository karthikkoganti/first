package sort;

import java.util.Arrays;

public class SecondLargest {
	public static int getSecondLargest(int[] k, int total){ 
		Arrays.sort(k);
		return k[total-2];
		
	}
	public static void main(String[] args) {
		int b[]= {10,11,15,25,18,17};
		System.out.println("Second largest number in the array is"+getSecondLargest(b,2));
	}
	

}
