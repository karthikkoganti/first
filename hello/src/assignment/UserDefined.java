package assignment;
import java.util.Scanner;
class PassException extends Exception
{
    public PassException(String s)
    {
       
        super(s);
    }
}


public class UserDefined {
	void pass(double i) throws PassException
	{
		if(i<35)
		{
			throw new PassException("You are failed and not promoted for next class");
		}
		else
		{
			throw new PassException("You are promoted to the next class");
		}
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		UserDefined promote = new UserDefined();
		System.out.println("enter your marks");
        double d=obj.nextDouble();
        try
        {
            promote.pass(d);
        }
        catch (PassException pe)
        {
        	System.out.println(pe.getMessage());
        }
        finally
        {
        	System.out.println("we wish u all the best");
        }

	}

}



