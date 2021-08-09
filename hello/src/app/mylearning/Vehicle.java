package app.mylearning;

public class Vehicle {
		private int weightInPounds;
		private Engine engine;

		public Vehicle(int weightInPounds,Engine engine) {
		this.weightInPounds = weightInPounds;
		this.engine = engine;

		}
		public double getSpeedInMph(double timeInSeconds) {
		return this.engine.getSpeedInMph(timeInSeconds, weightInPounds);
		}
		public static void main(String args[]) {
		double timeInSeconds = 20.0;
		int horsePower = 336;
		int vehicleWeight = 4500;
		Engine engine = new Engine();
		engine.setHorsePower(horsePower);
		Vehicle vehicle = new Vehicle(vehicleWeight,engine);
		System.out.println("Vehicle Speed(" +timeInSeconds+"sec)="+vehicle.getSpeedInMph(timeInSeconds)+ "Mph");
		}
}
