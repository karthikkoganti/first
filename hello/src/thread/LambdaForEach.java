package thread;
import java.util.ArrayList;
import java.util.List;

public class LambdaForEach {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>(); 
		list.add("Karthik");
		list.add("subbu");
		list.add("lokesh");
		list.add("Manidar");
		list.add("Srikanth");
		list.add("priyanka");
		list.add("Madhu");
		list.add("Sai");
		list.forEach(
				(Team)-> System.out.println(Team)
				);
		}
	}


