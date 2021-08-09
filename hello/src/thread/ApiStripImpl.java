package thread;

public class ApiStripImpl {
	public static void main(String [] args) {
		String k="  Karthik   ";
		System.out.println(k.strip());
		System.out.println(k.stripLeading());
		System.out.println(k.stripTrailing());
		System.out.println(k.trim());
	}

}
