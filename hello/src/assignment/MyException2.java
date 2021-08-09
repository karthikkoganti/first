package assignment;

public class MyException2 {
	 public static void main(String[] args)
	 {
		 try {
			 int num=45/0;
		 }
		 catch(Exception ex) {
			 System.out.println("ArthimeticException"+ex.getMessage());
		 }

}
}
