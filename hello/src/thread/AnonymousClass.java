package thread;

interface JobDescription
{  
	 void job();  
}  	  
public class AnonymousClass {
	public static void main(String[] args)
	{
		JobDescription j=new JobDescription()
	  {  
	    public void job()
	    {
		  System.out.println("Software Trainee");
	    }  
	  };  
	j.job();  
	}  

}
