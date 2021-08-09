package thread;
import java.io.IOException;
import java.util.stream.Stream;
public class StreamLines1 {
	 public static void main(String[] args) throws IOException 
	    {
	        String s = "Karthik \n Mani \n Subbu \n Lokesh"; 
 
			Stream<String> lines1 = s.lines();
 
			lines1.forEach(System.out::println);
	    }

}
