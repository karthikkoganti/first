package thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketer{
	String role;
	int jerseyNo;
	  Cricketer(String role, int jerseyNo) {
		    this.role = role;
		    this.jerseyNo = jerseyNo;
		    
		  }
		  
		}

		class CricketerSortjerseyNo implements Comparator<Cricketer> {
		  
		  public int compare(Cricketer a, Cricketer b) {
		    return a.jerseyNo - b.jerseyNo;
		  }
		  
		  public int compareTo(Cricketer a, Cricketer b) {
		    return a.role.compareTo(b.role);
		  }
		  
		//  public int comparing(Cricketer a, Cricketer b) {
//		    return a.jerseyNo.comparing(b.jerseyNo);
		//  }
		  
		  
		  

}

public class CricketerImpl {
	public static void main() {
	 ArrayList<Cricketer> c = new ArrayList<Cricketer>();
	    c.add(new Cricketer("Batsmen",18));
	    c.add(new Cricketer("Bowler", 33));
	    c.add(new Cricketer("Allrounder", 3));
	    c.add(new Cricketer("Batsmen", 17));
	    c.add(new Cricketer("Batsmen", 10));
	    
	    System.out.println("Before Sorting");
	    for( Cricketer cu: c) {
	      System.out.print(cu.jerseyNo + " ");
	    }
	    
	    for(Cricketer cu: c) {
	      System.out.print(cu.role + " ");
	    }
	    
	    System.out.println("After Sorting");
	    
	    Collections.sort(c, new CricketerSortjerseyNo());
	    
	    for(Cricketer cu: c) {
	      System.out.print(cu.jerseyNo + " ");
	    }
	  

	  }

	}


