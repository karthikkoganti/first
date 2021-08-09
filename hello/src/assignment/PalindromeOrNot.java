package assignment;

public class PalindromeOrNot {
	public static void main(String[] args) {
		int num=121,ReversedNumber=0,remainder=0;
		int orginalnumber=num;
		while(num!=0)
		{
			remainder=num%10;
			ReversedNumber=ReversedNumber*10+remainder;
			num=num/10;
		}
		if(orginalnumber==ReversedNumber) {
			System.out.println("The number is palindrome");
		}
		else {
			System.out.println("The number is Not palindrome");
		}
	}
	

}
