package assignment;
import java.util.Scanner;

public class ReversingString {
	public static void main(String args[])  
	{  
	String s;  
	Scanner st=new Scanner(System.in);  
	System.out.print("Enter a String: ");  
	s=st.nextLine(); //taking string input from the user
	System.out.print("After reversing the String: ");
	for(int i=s.length();i>0;--i) // Here i is the length of the string
	{
		System.out.print(s.charAt(i-1));
	}
	}

}
