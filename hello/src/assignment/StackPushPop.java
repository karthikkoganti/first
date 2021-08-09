package assignment;
import java.util.*; 

public class StackPushPop {
	public static void main(String args[])   
	{  
		Stack <Integer> s = new Stack<Integer>(); 
		pushelmnt(s,18);
		pushelmnt(s,17);
		pushelmnt(s,10);
		pushelmnt(s,3);
		pushelmnt(s,409);
		pushelmnt(s,20);
		
		popelmnt(s);
		popelmnt(s);
		popelmnt(s);
		popelmnt(s);
		popelmnt(s);
		popelmnt(s);
		
		
	}

	 static void pushelmnt(Stack<Integer> s, int i) {
		// TODO Auto-generated method stub
		 s.push(new Integer(i));
		 System.out.println("push"+i);
		 System.out.println("Stack"+s);
		
	}
	 static void popelmnt(Stack stk)   
	 {  
	 System.out.print("pop");  
	 Integer x = (Integer) stk.pop();  
	 System.out.println(x);    
	 System.out.println("stack: " + stk);  
	 }  

}
