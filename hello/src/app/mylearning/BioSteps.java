package app.mylearning;

public class BioSteps {
	int stepCounter=1;
	BioSteps(){
		stepCounter++;
		System.out.println("value"+stepCounter);
	}
	public static void main(String[] args) {
		BioSteps bs1=new BioSteps();
		BioSteps bs2=new BioSteps();
	}

}
