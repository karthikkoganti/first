package interfac;

interface Myinterface{
	public void draw();
}
public class Myclass implements Myinterface{
	public void draw()
	{
		System.out.println("draw circle");
	}
}
	class Rectangle implements Myinterface{
		public void draw()
		{
			System.out.println("draw rectangle");
		}
	}
	class Square implements Myinterface{
		public void draw()
		{
			system.out.println("draw square");
		}
	}
	class Final{
		public static void main(String args[])
		{
			Myinterface m=new ();
			m.draw();
		}
	}


