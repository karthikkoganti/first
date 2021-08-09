package assignment;

public class MyEnumTest2 {
	public enum Talent{
		SINGING,
		DANCING,
		SWIMMING,
		DRAWING
}
	public static void main(String[] args)
	{
		Talent myTalent= Talent.SINGING;
		
		switch(myTalent) {
		case SINGING:
			System.out.println("She has good singing talent");
			break; //if break is not there then it will goes to another case statement
		case DANCING:
			System.out.println("She is a best classical dancer");
			break;
		case SWIMMING:
			System.out.println("He is state level swimmimg champion");
			break;
		case DRAWING:
			System.out.println("His drawing very beautiful and peaceful to watch");
			break;
			default:
				System.out.println("No talents are there");
			
		}
	}

}
