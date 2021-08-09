package thread;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	 public static void main(String[] args) {
		    try {
		      FileWriter myWriter = new FileWriter("H:\\creator.txt");
		      myWriter.write("My name is karthik and i am working at sagarsoft india");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } 
		    catch (IOException e)
		    {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }

}
