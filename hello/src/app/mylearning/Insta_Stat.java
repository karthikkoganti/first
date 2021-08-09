package app.mylearning;

public class Insta_Stat {
	static void show() {
	System.out.println("static method");
	add();//to call instance method compulsary we need object.
	//we cannot call instance method inside static method.
}
 void add(int a,int b) {
	 System.out.println(" addition of a and b in instance method"+(a+b));
	 
}
public static void main(String args[]) {
	Insta_Stat i=new Insta_Stat();
 
		 show();
		 

}

}
