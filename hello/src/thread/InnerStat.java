package thread;

public class InnerStat {
	static int id=0701;
	static float rating=4.5f;
	static class inner1{
		static void performance(){
			System.out.println("The performance is good"+" "+ rating);
		}
		static void per() {
			System.out.println("The performance is bad"+" "+id);
		}
		
	}
	public static void main(String args[]){  
		InnerStat.inner1.performance();
		InnerStat.inner1.per();
	}

}
