package assignment;
import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number");
		int number=obj.nextInt();
		if(number%2==1) {
			System.out.println("The number you entered is an odd number");
		}
		else {
			System.out.println("The number you entered is an even number");
		}
		
	}

}
