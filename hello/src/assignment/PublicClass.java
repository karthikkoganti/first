package assignment;
class DefaultClass
{
	
	//the class which dont have any of the four modifiers name(private,default,protected,public)
	//is consider as default class
	int a=100;
	void method()
	{
		System.out.println("default class");
	}
	class Add
	{
		int a=10;
		void add()
		{
			System.out.println("ADDITION"+(a+10));
		}
		
	}
	private class PrivateClass
	{
		//we can declare a class as private  by using private 
		//only for nested classes but not for toplevel classes..
		
		int b=143;
		void method()
		{
			System.out.println("private class");
		}
		
	}
	private class PrivateClass2
	{
		//we can declare a class as private by using private 
		//only for nested classes but not for toplevel classes..
		int f=143;
		void privatemethod2()
		{
			System.out.println("private class");
		}
	}
	protected class ProtectedClass
	{
		//we can declare a class as protected by using protected  
		//only for nested classes but not for toplevel classes..
		int c=996;
		void method()
		{
			System.out.println("protected class");
		}
		class Subtraction
		{
			int a=10;
			int b=153;
			void sub()
			{
				System.out.println("default class inside protected class subtraction"+a+b);
			}
		}
		private class Hello
		{
			int a=20;
			void hello()
			{
			System.out.println("we can write private inside protected class");
		    }
		}
	}
	protected class ProtectedClass2
	{
		//we can declare a class as protected by using protected 
		//only for nested classes but not for toplevel classes..
		int d=1433;
		void method()
		{
			System.out.println("second protected class");
		}
	}
	protected class ProtectedClass3
	{
		int e=1434;
		void method()
		{
			System.out.println("third protected class");
		}
		public class Two
		{
			void method()
			{
				System.out.println("a protected class having inner public class");
			}
		}
	}
	public class One
	{
		void method()
		{
			System.out.println("a default class having inner public class");
		}
	}
}
class DefaultClass2
{
	int a=514;
	
}


public class PublicClass {
	class Hello
	{
		void method()
		{
			System.out.println("we can write default class inside public class");
		}
		
	}
	protected class Hi
	{
		void method()
		{
			System.out.println("we can write protected class inside public class");
		}
	}
	private class How
	{
		void method()
		{
			System.out.println("we can write private class inside public class");
		}
	}

	public static void main(String[] args) {
		System.out.println("for the top level classes we can declare \n as DefaultClass; only public, "
				+ "abstract & final are permitted \n a single java file can have multiple "
				+ "default classes ,\nbut can also have multiple nested classes as public/private ,default classes class as inner"
				+ " classes \n but there is one and only public class");
		
		DefaultClass df=new DefaultClass();
		System.out.println("variable value of default class=="+df.a);
		System.out.println("method of default class");
		df.method();
		DefaultClass.Add dfa=df.new Add();
		System.out.println("variable value of inner default class=="+dfa.a);
		System.out.println("method of inner default class");
		dfa.add();
		DefaultClass2 df2=new DefaultClass2();
		System.out.println("variable value of 2nddefault class=="+df2.a);
		
		
//		DefaultClass.PrivateClass dfpc=df.new PrivateClass();
//		DefaultClass.PrivateClass2 dfpc2=df.new PrivateClass2();
//		dfpc.method2();
        DefaultClass.ProtectedClass dfpro=df.new ProtectedClass();
        System.out.println("variable value of protected class=="+dfpro.c);
		System.out.println("method of protected class");
		dfpro.method();
        DefaultClass.ProtectedClass.Subtraction dfprosub=dfpro.new Subtraction();
        System.out.println("variable values of inner default class inside protected class a=="+dfprosub.a+"b=="+dfprosub.b);
		System.out.println("method of default class inside protected");
		dfprosub.sub();
		PublicClass pc=new PublicClass();
		PublicClass.Hello pch=pc.new Hello();
		pch.method();
		PublicClass.Hi pci=pc.new Hi();
		pci.method();
		PublicClass.How pco=pc.new How();
		pco.method();
		//DefaultClass.ProtectedClass.Hello dfprohello=dfpro.new Hello();
        DefaultClass.ProtectedClass2 dfpro2=df.new ProtectedClass2();
        System.out.println("variable value of protected class=="+dfpro2.d);
		System.out.println("method of protected class=2");
		dfpro2.method();
        DefaultClass.ProtectedClass3 dfpro3=df.new ProtectedClass3();
        //created object of inner class ProtectedClass using Outerclass default
        System.out.println("variable value of protected class"+dfpro3.e);
		System.out.println("method of protected class=3");
		dfpro3.method();
		DefaultClass.ProtectedClass3.Two dfprotwo=dfpro3.new Two();
		dfprotwo.method();
		DefaultClass.One dfone=df.new One();
		dfone.method();		
	}



}
