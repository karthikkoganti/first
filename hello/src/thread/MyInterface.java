package thread;

public interface MyInterface {
	public abstract int myAdd(int a,int b,int c);
	default void getInfo()
	{
		System.out.println("print msg");
		}

}
