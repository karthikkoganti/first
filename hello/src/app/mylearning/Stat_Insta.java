package app.mylearning;

public class Stat_Insta {
		static void show() {
			System.out.println("static method");
		}
		 void add(int a,int b) {
			 System.out.println(" addition of a and b in instance method"+(a+b));
			show();
		}
 

	 public static void main(String args[]) {
		 Stat_Insta a= new Stat_Insta();
				 a.add(10,15);
	 
 }
}
			


