package assignment;
import java.util.*;

public class WrapperClass1 {
	public static void main(String[] args) {
		int x=3;
		byte b=18;
		short s=17;
		float ff=49.3f;
		double d=10.0D;
		long l=100;
		char c='k';
		boolean bo=true;
		
		
		Integer intobj=x;
		Byte byteobj=b;
		Short shortobj=s;
		Float floatobj=ff;
		Double doubleobj=d;
		Long longobj=l;
	    Character charobj=c;
	    Boolean booleanobj=bo;
	    
	    
	    System.out.println("Integer object: "+intobj); 
	    System.out.println("Byte object: "+byteobj);  
	    System.out.println("Short object: "+shortobj);   
	    System.out.println("Float object: "+floatobj);  
	    System.out.println("Double object: "+doubleobj); 
	    System.out.println("Long object: "+longobj); 
	    System.out.println("Character object: "+charobj);  
	    System.out.println("Boolean object: "+booleanobj);  
	    
	    int intvalue=intobj;
	    byte bytevalue=byteobj;
	    short shortvalue=shortobj;
	    float floatvalue=floatobj;
	    double doublevalue=doubleobj;
	    long longvalue=longobj;
	    char charvalue=charobj;
	    boolean booleanvalue=booleanobj;
	    
	    System.out.println("Integer value: "+intvalue); 
	    System.out.println("Byte value: "+bytevalue);  
	    System.out.println("Short value: "+shortvalue);   
	    System.out.println("Float value: "+floatvalue);  
	    System.out.println("Double value: "+doublevalue); 
	    System.out.println("Long value: "+longvalue); 
	    System.out.println("Character value: "+charvalue);  
	    System.out.println("Boolean value: "+booleanvalue);  
  
	}
}
