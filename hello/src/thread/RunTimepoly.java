package thread;
class Sports{
	void cricket(){
		System.out.println("He is an state level cricketer");
	}
	
}
class Sportsman extends Sports{
	void cricket() {
		System.out.println("Virat Kohli is current generation best batsman");
		
	}
}

public class RunTimepoly {
	public static void main(String args[]){ 
		Sports s=new Sportsman();
		s.cricket();
	}

}
