package assignment;

public class FactorialWithRecursion {
	 public static void main(String[] args) {
	        int num = 18;
	        long factorial = multiplyNumbers(num);
	        System.out.println("Factorial of number" + factorial);
	    }
	    public static long multiplyNumbers(int num)//called from the main function
	    {
	        if (num >= 1)
	            return num * multiplyNumbers(num - 1);
	        else
	            return 1;
	    }

}
