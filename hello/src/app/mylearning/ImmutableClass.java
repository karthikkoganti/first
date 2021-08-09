package app.mylearning;

final class NotModified {
  
  final String name;
  final int age;
  final String designation;

  NotModified(String name, int age,String designation) {
    this.name = name;
    this.age = age;
    this.designation=designation;
    
  }
  
  void getDetails() {
    System.out.print("My name is " + this.name + " my age is " +  this.age+"my role is "+this.designation);
  }
}

public class ImmutableClass {
	public static void main(String[] args) {
		NotModified nm= new NotModified("karthik", 22,"software Trainee");
	    nm.getDetails();
	}


}
