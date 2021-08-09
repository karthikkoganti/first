package app.mylearning;

public class parrot extends bird {
	
	
	public void fly() {
		System.out.println("parrot is in green color");
	}
	public void features() {
		System.out.println("parrots can fly");
		fly();
		super.fly();
	}

}
