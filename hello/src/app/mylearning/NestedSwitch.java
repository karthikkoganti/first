package app.mylearning;

public class NestedSwitch {
	public static void main(String[] args)
	   {
		int Attendance= 65;
		int Year=4;
		switch(Year)
		{
		case 1:
	         System.out.println("First year students are not eligible for conducting extra-circular activities ");
	         break;
	         case 2:
	         System.out.println("Second year students are not eligible for conducting extra-circular activities");
	         break;
	         case 3:
	        	 switch(Attendance) {
	        	 case 4:
	        		 System.out.println("Not eligible for examinations");
	        		 break;
	        		 
	        	 }
	        	 break;
	        	 default:
	        		 System.out.println("remaining are eligible");
		}
	   }

}
