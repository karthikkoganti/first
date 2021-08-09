package app.mylearning;

public class StringBuilder {
	public static void main(String args[]){  
		long startTime=System.currentTimeMillis();
		StringBuffer strBffr=new StringBuffer("Hyderabad");
		for(int i=0;i<10000;i++) {
			strBffr.append("city of pearls");
		}
		System.out.println("time took by StringBuffer class::"+(System.currentTimeMillis()-startTime)+"ms");
		
		startTime=System.currentTimeMillis();
		StringBuilder strBldr=new Str

}
