package thread;

import java.io.FileOutputStream;

public class MyFOSWriter {
	public static void main(String[] args){ 
		try {
			FileOutputStream fosObj = new FileOutputStream("G:\text1.txt");
			fosObj.write(78);
			fosObj.write(89);
			fosObj.close();
			System.out.println(" OutputStream wrote to file");
		}
		catch(Exception ex) {
			System.out.println(ex.printStackTrace());
		}
	}

}
