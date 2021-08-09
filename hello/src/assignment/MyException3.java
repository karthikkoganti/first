package assignment;

public class MyException3 {
	 public static void main(String[] args)
	 {
		 try {
			 int[] myArray= {4,5,6,7,8,9};
			// int length= myArray[myArray.length+1]/0;
			 String str=null;
			 System.out.println(str.length());
			 
		 }
		 catch(Exception ex) {
			 System.out.println("Exception"+ex.getMessage());
		 }
		 //catch(ArrayIndexOutOfBoundsException aio) {
			// System.out.println("array out of bounds"+aio.getMessage());
		 //}
		 catch(ArithmeticException ae) {
			 System.out.println("arithmetic exception"+ae.getMessage());
		 }
		 catch(ArrayIndexOutOfBoundsException aio) {
			 System.out.println("array out of bounds"+aio.getMessage());
		 }
		 catch(NullPointerException npe) {
			 System.out.println("null pointer"+npe.getMessage());
		 }
		 catch(Exception ex) {
			 System.out.println("Exception"+ex.getMessage());
		 }

}
}
