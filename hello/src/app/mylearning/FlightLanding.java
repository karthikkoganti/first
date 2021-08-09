package app.mylearning;

public class FlightLanding extends Flight {
	int maxspeed=200;
	int minspeed=100;
	void print()
	{
		System.out.println("max-speed"+super.maxspeed);
		
	}
	void disp()
	{
		System.out.println("min-speed"+super.minspeed);
	}

}
