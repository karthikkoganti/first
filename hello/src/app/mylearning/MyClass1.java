package app.mylearning;

public class MyClass1 {
	public static void main(String[] args) {
		MyClass1 MyObj= new MyClass1();
		MyObj=null;
		MyClass1 Obj1=new MyClass1();
		MyClass1 Obj2=new MyClass1();
		Obj2=Obj1;
		System.gc();
	}
	
	protected void finalize() throws Throwable{
		System.out.println("garrbage collection being performed by JVM");
	}

}
