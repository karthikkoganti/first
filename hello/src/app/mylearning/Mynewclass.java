package app.mylearning;

public class Mynewclass extends Myclass {
	public void discuss()
	{
		System.out.println("Debate");
	}
	public static void main(String[] args) {
		Mynewclass m=new Mynewclass();
		System.out.println(m.add(18, 17));
		m.discuss();
	}
}
