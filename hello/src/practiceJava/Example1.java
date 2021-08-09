package practiceJava;

public class Example1 {
	 void add(int a,int b) {
		
		System.out.println((a+b));
	}
	 int add2(int x,int y) {
		 return 2;
	 }
	public static void main(String[] args) {
		Example1 a= new Example1(); 
		a.add(1,2);
		a.add2(10,20);
		System.out.println(a.add2(10, 20));
		

}
}
