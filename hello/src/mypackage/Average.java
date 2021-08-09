package mypackage;

public class Average {
	public static void main(String[] args)
	{
		int[] numbers= {1,2,3,4,5,6};
		int sum=0;
		for(int i=0; i < numbers.length ; i++)
	        sum = sum + numbers[i];
		   int average = sum / numbers.length;
		    System.out.println("Average value " + average);
		    System.out.println("sum value " + sum);
	}

}
