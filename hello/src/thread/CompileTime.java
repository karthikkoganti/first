package thread;

public class CompileTime {
	  void sum(int a,int b)
	  {
		  System.out.println("sum of two numbers"+(a+b));
	  }  
	  void sum(int a,int b,int c)
	  {
		  System.out.println("sum of three numbers"+(a+b+c));
		  }  
	  
	  public static void main(String args[]){ 
		  CompileTime ct=new CompileTime();
		  ct.sum(18, 17);
		  ct.sum(18, 17, 10);
	  }

}
