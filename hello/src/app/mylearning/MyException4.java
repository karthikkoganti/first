package app.mylearning;

public class MyException4 {
	public static void main(String[] args)
	 {
	try {
		 int[] myArray= {4,5,6,7,8,9};
		 int length= myArray[myArray.length+1]/0;
	}
	catch(Exception ex) {
		 System.out.println("Exception"+ex.getMessage());
		 throw ex;
	 }

}
}
