package assignment;
import java.util.Scanner;

public class Conversion {
	 public static void main(String[] args) 
	 {
	    Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
	    String arr[] = s.split(" ");
	    for(String i: arr) {
	      if( i.equals("one")) {
	        System.out.print(1);
	      }
	      else if (i.equals("two")) {
	        System.out.print(2);
	      }
	      else if (i.equals("three")) {
	        System.out.print(3);
	      }
	      else if (i.equals("four")) {
	        System.out.print(4);
	      }
	      else if (i.equals("five")) {
	        System.out.print(5);
	      }
	      else if (i.equals("six")) {
	        System.out.print(6);
	      }
	      else if (i.equals("seven")) {
	        System.out.print(7);
	      }
	      else if (i.equals("eight")) {
	        System.out.print(8);
	      }
	      else if (i.equals("nine")) {
	        System.out.print(9);
	      }
	      else {
	        System.out.println(10);
	      }
	    }
	  }
	  
	}



