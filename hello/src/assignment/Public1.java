package assignment;

class One{
	void car() {
		System.out.println("Mg hector");
		
	}
	private class Two{
		int a=4;
		void price() {
			System.out.println("The car is luxorious"+a);
		}
	}
	/*protected class Three{
		double b=4.5;
		 void Rating(float b) {
			 System.out.println(b);
		 }
	 }*/
	
}
public class Public1 {
	int a=10;
	void add() {
		System.out.println("Addition"+(a+a));
	}
	 private class Priv{
		 
		void meth() {
			System.out.println("Private class inside the public class ");
		}
	 }
		 class DefaultClass1{
			 void def() {
				 System.out.println("Default class inside the public class ");
			 }
			
		}
		 protected class ProtectedClass{
			 void prot() {
				 System.out.println("Protected class inside the Public class ");
			 }
			 protected class ProtectedClass1{
				 void prot1() {
					 System.out.println("Protected class inside the Protected class ");
				 }
			 
		 }
			 class Four{
				 void defc() {
					 System.out.println("default class inside the protected class");
				 }
			 }
		 }
		 
		


	public static void main(String[] args) {
		Public1 p=new Public1();
		Public1.Priv pr=p.new Priv();
		Public1.DefaultClass1 de=p.new DefaultClass1();
		Public1.ProtectedClass pc=p.new ProtectedClass();
		ProtectedClass.ProtectedClass1 pe=pc.new ProtectedClass1();
		One o=new One();
		ProtectedClass.Four f=pc.new Four();
		One.Two t=o.new Two();
		//Three th=new Three();
	
		p.add();
		pr.meth();
		de.def();
		pc.prot();
		o.car();
		pe.prot1();
		f.defc();
		
	}
	
}

