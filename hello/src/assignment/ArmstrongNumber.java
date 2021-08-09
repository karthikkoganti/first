package assignment;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int num=153,temp,number,rem=0;

        number = num;
        while (number != 0)
        {
            temp = number % 10;
            rem = rem + temp*temp*temp;
            number = number/10;
        }
        if(rem==num) {
        	System.out.println("The number is Arm strong");
        	
        }
        else {
        	System.out.println("The number is not an Arm strong");
        }
	}

}
