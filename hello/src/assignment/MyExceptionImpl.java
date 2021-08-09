package assignment;

public class MyExceptionImpl {
	 public static void main(String[] args)
	 {
		 try {
			 int num=45/0;
		 }
		 catch(ArithmeticException ae) {
			 System.out.println("ArthimeticException"+ae.getMessage());
		 }
		 finally{
			 System.out.println("this is finally block,execution has come here");
			 
		 }
	 }

}
