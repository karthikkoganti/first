package poly;

public class overloading {
	public void area(int a)
	{
		System.out.println("Area of square=="+(a*a));
	}
	public void area(int a,int b)
	{
		System.out.println("Area of traingle=="+(a*b));
	}
	public void add(int a,int b,int c)
	{
		System.out.println("Addition=="+(a+b+c));
	}
	public static void main(String[] args) {
		overloading o=new overloading();
		o.area(10);
		o.area(18,17);
		o.add(24,24,28);
}
}
