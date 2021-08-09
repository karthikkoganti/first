package app.mylearning;

public class MyCalc {
	static int add(int a,int b) {
		return a+b;
		
	}
	static int sub(int a,int b) {
		return a-b;
	}
	static int mul(int a,int b) {
		return a*b;
	}
	public static void main(String[] args) {
	
		int add=MyCalc.add(18, 17);
		System.out.println(add);
		int sub=MyCalc.sub(18, 17);
		System.out.println(sub);




	}
}
