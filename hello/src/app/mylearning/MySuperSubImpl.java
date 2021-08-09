package app.mylearning;

class MysuperClass{
	public void printMsg() throws Exception {
		 System.out.println("This is a message from superclass");
	}
}
class MySubClass extends MysuperClass{
	public void printMsg() throws Exception {
		 System.out.println("This is a message from subclass");
	}
	
	
}

public class MySuperSubImpl {
	public static void main(String[] args) {
		MysuperClass msc=new MySubClass();
		try {
			msc.printMsg();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
