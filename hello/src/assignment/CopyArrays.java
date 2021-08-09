package assignment;

public class CopyArrays {
	 public static void main(String[] args) 
	    { 
	         int intArray[] = {18,17,3}; 
	 
	       
	        System.out.println("Elements in the array before assignment:"); 
	        for (int i=0; i<intArray.length; i++) 
	             System.out.print(intArray[i] + " "); 
	        int copyArray[] = new int[intArray.length]; 
	        copyArray = intArray;     
	        copyArray[1]=100;
	        System.out.println("\nChanging index copyArray[1] by assigning value:");
            for (int i=0; i<intArray.length; i++) 
	        System.out.print(intArray[i] + " "); 
	        System.out.println("\nCopy array after assignment:"); 
	        for (int i=0; i<copyArray.length; i++) 
	        System.out.print(copyArray[i] + " "); 
	    } 

}
