package app.mylearning;
public class Engine {
		private int horsePower;

		public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
		}

		public double getSpeedInMph(double timeInSeconds, int weightInPounds) {
		double speed = 2.0* this.horsePower * 746*timeInSeconds*32.17/weightInPounds;
		return Math.round(Math.sqrt(speed)*0.68);
		}
		}