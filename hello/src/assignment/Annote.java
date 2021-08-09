package assignment;
class Sport{
	 void meth() {
		System.out.println("He is a sportsperson");
		
	}
}
class Cricket extends Sport{
	@Override
	void meth() {
		System.out.println("India lift the worldcup in 2011");
		
	}
	
}

public class Annote {
	 public static void main(String[] args) {
		 Sport s=new Cricket();
		 Sport s1=new Sport();
		 s.meth();
		 s1.meth();
	 }

}
